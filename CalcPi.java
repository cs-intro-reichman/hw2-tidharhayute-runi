// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int numberOfTerms = Integer.parseInt(args[0]);

		double sum = 1;

		for (int i = 1; i < numberOfTerms; i++) {
			sum = i % 2 == 1 ? (sum - (1 / (double) (1 + (i * 2)))) : (sum + (1 / (double) (1 + (i * 2))));
		}

		System.out.println("pi according to Java: " + Math.PI );
        System.out.printf("pi, approximated:\t", sum * 4);
	}
}
