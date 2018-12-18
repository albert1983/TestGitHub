
public class TestTryCatchFinally {

	public static void main(String[] args) {

		try {
			System.out.println("aaaaaaaaa");
			System.out.println(1 / 0);
		} catch (Exception e) {
			System.out.println("fffffffff");
		} finally {
			System.out.println("ddddddddddddddddd");
		}
	}

}
