package ex9;

class Access2 {
	
	
	private int pri = 30; // private なフィールド変数
	private String name = "Yama";
	
	void printAccess() {
		System.out.println("private = " + pri);
		System.out.println(name);
	}
	public int getPri() {
		return pri;
	}
	public void setPri(int pri) {
		this.pri = pri;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}