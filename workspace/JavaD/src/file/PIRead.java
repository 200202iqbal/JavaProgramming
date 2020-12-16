package file;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PIRead {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
		Path path = Paths.get(".\\src\\file\\personal_information.txt");
		//System.out.println(Files.exists(path));ファイルがあったかどうか
		BufferedReader br = Files.newBufferedReader(path, Charset.forName("UTF8"));

		String line;
		int count = 0;
		while((line = br.readLine()) != null)
		{
			//System.out.println(++count + "行目 : " + line);
			String[] input = line.split("\t");
			if (count++ == 0) continue;
			else if(Integer.parseInt(input[5]) >= 30 )
			{
				System.out.println(input[2] + " 様こんにちは");
			}
			else
			{
				System.out.println(input[2] + " さんこんにちは");
			}
		}
		br.close();
		}

		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
