public class java {
	public static void main(String[] args) {
		int[] ints = new int[1];
		ints[0] = 0;
		for (int i=0; i < ints.length; i++) {
			int x = ints[i+1]; // true
			int y = ints[i+1]; // lgtm[java/index-out-of-bounds] false
			System.out.println(x);
			System.out.println(y);
		}
	}
}
