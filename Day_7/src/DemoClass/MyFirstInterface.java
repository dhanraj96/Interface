package DemoClass;

public class MyFirstInterface implements Interface1, Showable {

	@Override
	public void show() {
		System.out.println("Welcome");

	}

	@Override
	public void print() {
		System.out.println("To Interface Class");

	}

	public static void main(String[] args) {
		MyFirstInterface obj = new MyFirstInterface();
		obj.show();
		obj.print();

	}

}
