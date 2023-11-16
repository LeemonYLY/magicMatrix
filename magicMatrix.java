package magicMatrix;

/*
 * This is a magic output of a third-order matrix, 
 * which will randomly perform different operations on the matrix 
 * according to the will of the third-order matrix and the program, 
 * and output different values.
 */
public class magicMatrix {
	public static void main(String[] args) {
		double a11 = Double.parseDouble(args[0]);
		double a12 = Double.parseDouble(args[1]);
		double a13 = Double.parseDouble(args[2]);
		double a21 = Double.parseDouble(args[3]);
		double a22 = Double.parseDouble(args[4]);
		double a23 = Double.parseDouble(args[5]);
		double a31 = Double.parseDouble(args[6]);
		double a32 = Double.parseDouble(args[7]);
		double a33 = Double.parseDouble(args[8]);

		double probability = 0.65;

		double random = Math.random(); // Generate a random number between 0 and 1

		double a[][] = { { a11, a12, a13 }, { a21, a22, a23 }, { a31, a32, a33 } };
		if (random < probability) {
			double result1 = determine(a);
			result1 = (double) (Math.round(result1 * 100) / 100);
			System.out.println(result1);
		} else {
			double result2 = magicOutput(a);
			result2 = (double) (Math.round(result2 * 100) / 100);
			System.out.println(result2);
		}
	}

	// Calculate the determine of a matrix
	public static double determine(double[][] a) {
		double item1 = a[0][0] * a[1][1] * a[2][2];
		double item2 = a[0][1] * a[1][2] * a[2][0];
		double item3 = a[0][2] * a[1][0] * a[2][1];

		double item4 = a[0][2] * a[1][1] * a[2][0];
		double item5 = a[0][0] * a[1][2] * a[2][1];
		double item6 = a[0][1] * a[1][0] * a[2][2];

		double result = item1 + item2 + item3 - item4 - item5 - item6;
		return result;
	}

	// This is an operation on a matrix that outputs a mana
	// The main diagonal and secondary diagonal elements are added and the rest of
	// the elements are subtracted.
	public static double magicOutput(double[][] a) {
		return a[0][0] + a[1][1] * 2 + a[2][2] + a[0][2] + a[2][0] - a[0][1] - a[1][0] - a[1][2] - a[2][1];
	}
}
