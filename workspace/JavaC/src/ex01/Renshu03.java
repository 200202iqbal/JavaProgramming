package ex01;

import java.util.Scanner;

class DB
{
	int id ;
	private String name;
	private String pw;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	DB(int id, String name, String pw)
	{
		this.id = id;
		this.name = name;
		this.pw = pw;
	}

	public void showName()
	{
		System.out.println(this.name);
	}
}
public class Renshu03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		DB[] mem = new DB[3];
		mem[0] = new DB ( 001, "Yama" , "aaa");
		mem[1] = new DB ( 002, "Tana" , "bbb");
		mem[2] = new DB (003, "Ao", "ccc");

		Scanner sc = new Scanner(System.in);

		while(true)
		{
			System.out.println("ID を入力してください");
			int num = sc.nextInt();

			if ( num == 999 )
			{
				System.out.println("\n\n...Close...");
				break;
			}


			for ( int i = 0 ; i < mem.length; i++ )
			{
				if ( num == mem[i].id )
				{
					System.out.println("Password を入力してください");
					String pwd = sc.next();


					System.out.println();
					if ( pwd.equals(mem[i].getPw()))
					{
						System.out.println("ID : " + +mem[i].id);
						System.out.println("Name : " + mem[i].getName());
					}
					else
					{
						System.out.println("Password が間違えました");
					}
					System.out.println();
				}
				else if ( num > mem.length || num <= 0)
				{
					System.out.println("ありません");
					break;
				}
			}
		}

	}

}
