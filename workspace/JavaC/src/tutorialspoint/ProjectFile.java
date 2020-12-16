package tutorialspoint;
import java.io.File;
import java.io.IOException;

class CreateFile
{
	private String nameFile = null;
	public void setCreateFile(String name)
	{
		this.nameFile = name;

		try
		{
			File file = new File (this.nameFile);
			if (file.createNewFile()) System.out.println("Success");
			else System.out.println("Error,file already exist.");
		}catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
public class ProjectFile {
	public static void main (String[] args)
	{
		System.out.println("##############################");
		System.out.println("######## PROJECT FILE ########");
		System.out.println("##############################");
		
		

		CreateFile createFile = new CreateFile();
		createFile.setCreateFile("virus.txt");
	}

}
