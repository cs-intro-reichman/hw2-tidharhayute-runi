// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		String mode = args[1];

		int steps = 1; 
		int currentValue = 0;
		int success = 0;

		for (int i = 0; i < seed; i++) {
			currentValue = i + 1;
			if (mode.equals("v")) System.out.print(currentValue + " ");
			currentValue = (currentValue % 2 == 0) ? (currentValue / 2) : ((currentValue * 3) + 1);
			
			steps = 2;
			while (currentValue != 1) {
				if (mode.equals("v")) System.out.print(currentValue + " ");
				currentValue = (currentValue % 2 == 0) ? (currentValue / 2) : ((currentValue * 3) + 1);
				steps++;
			} 

			if (currentValue == 1) {
				success++;

				if (mode.equals("v")) {
					System.out.print(currentValue + " ");
					System.out.print("(" + steps + ")");
					System.out.println("");
				}
			}

			
		}

		if (mode.equals("c")) {
			if (success == seed){
				System.out.println("Every one of the first " + success + " hailstone sequences reached 1.");
			}
		}
	}
}
