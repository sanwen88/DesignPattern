package multitonPattern.demo5;

import java.text.NumberFormat;
import java.util.Locale;

public class PercentFormat {

	public static void main(String[] args) {
		displayPercent(1234567.89, new Locale("en", "US"));
		displayPercent(1234567.89, new Locale("de", "DE"));
		displayPercent(1234567.89, new Locale("fr", "FR"));
		displayPercent(1234567.89, new Locale("zh", "CN"));
	}
	
	public static void displayPercent(Double amount, Locale currentLocal){
		NumberFormat formatter ;
		String amountOut;
		
		formatter = NumberFormat.getPercentInstance(currentLocal);
		amountOut = formatter.format(amount);
		System.out.println(amountOut + " " + currentLocal.toString());
	}

}
