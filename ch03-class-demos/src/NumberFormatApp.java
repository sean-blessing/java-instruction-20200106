import java.text.NumberFormat;

public class NumberFormatApp {

	public static void main(String[] args) {
		// use number format to format percents and currencies
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMinimumFractionDigits(2);

		double price = 45672.33567;
		double pct = .0765;
		
		System.out.println(price);
		System.out.println(pct);
		System.out.println(currency.format(price));
		System.out.println(percent.format(pct));
		
		
		
		
		
	}

}
