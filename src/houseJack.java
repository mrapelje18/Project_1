
public class houseJack {
	public static void main(String[] args) {
		
	}
	public static void malt() {
		System.out.println("That lay in the house that Jack built");
	}
	public static void rat() {
		System.out.println("That ate the malt");
		malt();
	}
	public static void cat() {
		System.out.println("That killed the rat");
		rat();
	}
}
