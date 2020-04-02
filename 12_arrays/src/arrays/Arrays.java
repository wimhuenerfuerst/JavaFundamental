package arrays;

public class Arrays {

	public static void main(String[] args) {
		int[] a1;

		a1 = new int[10];

		System.out.println(a1);
		System.out.println(java.util.Arrays.toString(a1));

		int[] a2 = new int[10];

		int[] a3 = { 1, 2, 3 };

		// a3 = { 1, 2, 3 };

		System.out.println(a3);
		System.out.println(java.util.Arrays.toString(a3));

		int[] a4 = new int[] { 1, 2, 3, 4 };

		System.out.println(a4);
		System.out.println(java.util.Arrays.toString(a4));

		int a5[]; // not so nice

		a1[1] = 123;

		System.out.println(java.util.Arrays.toString(a1));
		System.out.println(a1[2]);

		// System.out.println(a1[-1]);
		// System.out.println(a1[10]);
		// int[] a10 = new int[-1];

		int[][] m1 = new int[10][10];

		System.out.println(java.util.Arrays.toString(m1));

		int[][] m2 = new int[10][];

		m2[1] = new int[] { 1, 2, 3 };
		m2[3] = new int[4];

		System.out.println(java.util.Arrays.deepToString(m2));

		int[][] m3 = { { 1, 2, 3 }, { 4, 5, 6 } };

		System.out.println(java.util.Arrays.deepToString(m3));
	}

}
