package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class WriteFile1 {

	public static void main (String[] args)
	{
		try {
			File file = new File("C:\\Users\\200202\\Desktop\\testout.txt");
			//file.createNewFile(); //membuat file baru
			
			Path path = Paths.get("C:\\Users\\200202\\Desktop\\testout2.txt");
			Files.createFile(path);//membuat file baru
			BufferedWriter wr = Files.newBufferedWriter(path, Charset.forName("MS932"), StandardOpenOption.APPEND);
			PrintWriter pw = new PrintWriter(wr);


		pw.println("あいうえおaiueo");
		pw.println("かきくけこkakikukeko");
		pw.println("さしすせそsasisuseso");
		pw.close();
		//Files.delete(path);
		System.out.println("出力が完了しました");
	}catch (IOException ex)
	{
		ex.printStackTrace();
	}
	}}