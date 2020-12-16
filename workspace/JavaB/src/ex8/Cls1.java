package ex8;
class Room {
	String roomNo; // 教室の名前（きょうしうのなまえ）
	int capacity;  // 生徒数（せいとすう）
}
public class Cls1 {
	public static void main(String[] args) {
		// 以下にクラスroomを使って２つの教室のインスタンスを作成してください。
		// ①r1 B33   25人  ②r2 B31  32人
		Room r1 = new Room();
		r1.roomNo = "B33";
		r1.capacity = 25;
		
		Room r2  = new Room();
		r2.roomNo = "B31";
		r2.capacity = 32;
		
		

		//2つの教室の合計（ごうけい）の生徒数を表示してください
		System.out.println("Room : " + r1.roomNo + "\n Capacity : " + r1.capacity + " " + "\n\nRoom : " + r2.roomNo + "\n Capacity : " +  r2.capacity);
		System.out.println("合計は  " + (r1.capacity + r2.capacity));
	}

}
