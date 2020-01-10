
public class MathClassApp {

	public static void main(String[] args) {
		double d1 = 11.54447;
		// round d1 to 3 decimal places
		double rounded = (double)Math.round(d1*1000) / 1000;
		System.out.println(rounded);

		// dice roll - generate a random # between 1 and 6
		int die = (int) (Math.random()*6)+1;
		System.out.println("die = "+die);
	}

}
