
public class MyMain {

	public static void main(String[] args) {
		Boring boring = new Boring();
		boring.setBoring("So boring");
		System.err.println(boring);
		
		Boring b = new Boring("This is sooooooooooooooo boring");
		System.err.println(b);
	}

}
