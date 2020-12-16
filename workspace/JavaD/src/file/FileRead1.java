package file;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileRead1 {
	public static void main (String[] args)
	{
		try
		{	//membuat file baru dengan direktori di Desktop dan nama file test2.txt
			//File file = new File("C:\\Users\\200202\\Desktop\\test2.txt");
			//if (file.createNewFile()) System.out.println("Success");
			//else System.out.println("File already exists");

			//membaca direktori file di Desktop dengan nama file test.txt
			//Path path = Paths.get("C:\\Users\\200202\\Desktop\\test.txt");
			Path path = Paths.get("C:\\Users\\200202\\Desktop\\testout2.txt"); //.\\ lokasi skg berada di JavaD

			//BufferedReader br = Files.newBufferedReader(path, Charset.forName("MS932"));
			BufferedReader br = Files.newBufferedReader(path, Charset.forName("UTF8"));//jika didalamnya file terdapat karakter huruf Jepang, gunakan charset UTF8
			//BufferedReader br = Files.newBufferedReader(path); // untuk default MS932&UTF8
			String line;
			int count = 0;
			while((line = br.readLine()) != null)
			{
				System.out.println(++count + "行目 : " + line);

			}
			br.close();
		}catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}

}