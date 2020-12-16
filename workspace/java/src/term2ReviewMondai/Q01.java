package term2ReviewMondai;

	class Test
	{
		String name ;
		int point;
		//コンストラクタ オーバーロード
		Test ( String name , int point )
		{
			this.name = name;
			this.point = point * 10;
		}
		Test ( int point , String name )
		{
			this.point = point /10 ;
			this.name = name;
		}

		Test() {
			this.point = 0;
			this.name = "Test";
		}

		public void showTest()
		{
			System.out.println("Name = " + name + " Point = " + point);
		}
	}
	public class Q01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Test test1 = new Test ( 100, "Yamamoto");
		test1.showTest();

	}

}
