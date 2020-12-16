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
import java.util.Scanner;

public class CreateDiary {
	public static void main(String[] args) {
		// 今までの日記を表示しながら最後まで読む
		try {
			Path path = Paths.get("C:\\Users\\200202\\Desktop\\Diary.txt");
			Files.createFile(path);
			BufferedReader br = Files.newBufferedReader(path, Charset.forName("UTF8"));
			String line;
			while ((line = br.readLine()) != null) {
					System.out.println(line);// 処理の中身を書くところ
			}
			// 終了処理　必ず必要
			br.close();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	    // ここから日記を書く
		try {
			Path path = Paths.get("C:\\Users\\200202\\Desktop\\Diary.txt");

			BufferedWriter bw = Files.newBufferedWriter(path,
					    Charset.forName("UTF-8"), StandardOpenOption.APPEND);
			PrintWriter pw = new PrintWriter(bw); // printlnが使えるようになる
			//スキャナを準備する
			Scanner sc = new Scanner(System.in);
			System.out.print("日付を入力 : ");
			String date = sc.nextLine();
			//日付をファイルに書き出す
			pw.println(date);
			// スキャナーで入力した内容を書いてゆく　Eまたはeが入力されるまで
			System.out.println("日記(にっき)を入力（終了:Eまたはe");
			String line = sc.nextLine();
			while(!(line.equals("E") || line.equals("e")) ){
				pw.println(line);
				line = sc.nextLine();
			}
			pw.close(); // 終了処理
			System.out.println("出力が完了しました");
		}catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}