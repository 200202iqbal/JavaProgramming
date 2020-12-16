package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
class PCapital {
	String pref;
	String pcap;
	int pop;
	double area;
	double pdense;
	PCapital(String pref, String pcap, int pop, double area, double pdense){
		this.pref = pref; this.pcap = pcap; this.pop = pop; this.area = area; this.pdense = pdense;
	}
	public String toString(){
		return String.format("%s\t%s\t%d\t%7.2f\t%7.2f\n",pref, pcap, pop, area, pdense);
	}
}
class PopDensity {
	public static void main(String[] args) {
		List<PCapital> pcapitals = new ArrayList<PCapital>();

	//pop.txtの読み込み
		try {
//			Path path = Paths.get("C:\\Users\\masakazu_yamamoto\\Desktop\\test.txt");
			Path path = Paths.get(".\\src\\file\\pop.txt"); // 	相対パス指定

			BufferedReader br = Files.newBufferedReader(path, Charset.forName("MS932"));
//			BufferedReader br = Files.newBufferedReader(path, Charset.forName("UTF8"));
//			BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8);

			String line;
			int count = 0;  //一行目は読み飛ばす
			while ((line = br.readLine()) != null) {
				if(count++ > 0) {
					String[] input = line.split("\t");
//					System.out.println(Arrays.toString(input));
					PCapital pc = new PCapital("", "", 0, 0.0, 0.0);
					pc.pref = input[1]; 	//県
					pc.pcap = input[2]; // 県庁所在地
					pc.pop = Integer.parseInt(input[3]);
					pcapitals.add(pc);
				}
 			}
			// 終了処理　必ず必要
			br.close();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	//area.txtの読み込み
		try {
			Path path = Paths.get(".\\src\\file\\area.txt"); // 	相対パス指定

			BufferedReader br = Files.newBufferedReader(path, Charset.forName("MS932"));
			String line;
			int count = 0;   //一行目は読み飛ばす
			while ((line = br.readLine()) != null) {
				if(count++ > 0) {
					String[] input = line.split("\t");
					for(PCapital pc : pcapitals) {
						if( input[1].equals(pc.pref)){
							pc.area = Double.parseDouble(input[3]);
							pc.pdense = pc.pop / pc.area;
							break;
						}
					}
				}
 			}
			// 終了処理　必ず必要
			br.close();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		// 人口密度最大の県庁所在地を求める
		String maxPCap= pcapitals.get(0).pcap;
		double maxpdense =pcapitals.get(0).pdense;

		try {
			Path path = Paths.get(".\\src\\file\\pdense.txt");
			if(!Files.exists(path)){
				Files.createFile(path);
			}
			BufferedWriter bw = Files.newBufferedWriter(path, Charset.forName("MS932"), StandardOpenOption.TRUNCATE_EXISTING);
			PrintWriter pw = new PrintWriter(bw);
			pw.println("#\t県名\t県庁所在地\t人口\t面積\t人口密度");
			for(int i = 0; i < pcapitals.size(); i++) {
				pw.println((i +1) + "\t" +pcapitals.get(i).toString()) ;
				if(maxpdense < pcapitals.get(i).pdense) {
					maxPCap = pcapitals.get(i).pcap;
				}
			}
			pw.close();
			System.out.printf("人口密度が最大の県庁所在地は %s  人口密度は %7.1f 人/km2　です", maxPCap, maxpdense);
			System.out.println("出力が完了しました");
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
