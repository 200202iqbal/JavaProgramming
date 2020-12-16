package file;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;




public class PDate {
	public static void main (String[] args)
	{
		try
		{
		Path path = Paths.get("personal_information.txt");
		Files.createFile(path);
		Scanner scn = new Scanner(System.in);
		BufferedWriter wr = Files.newBufferedWriter(path, Charset.forName("UTF8"), StandardOpenOption.APPEND);
		
		
		if(Files.exists(path))
		{
			System.out.print("File exists. Delete ? y/n ");
			String option = scn.next();
			if (option.contains("y")) Files.delete(path);
			
		}
		scn.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
