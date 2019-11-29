package multitonPattern.demo4;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * 格式化数字货币
 * @author sann
 *
 */
public class CurrencyFormat {
	
	public static void main(String[] args) {
		CurrencyFormat.displayCurrency(1234567.89,  new Locale("en", "US"));
		CurrencyFormat.displayCurrency(new Double(1234567.89), new Locale("de", "DE"));
		CurrencyFormat.displayCurrency(new Double(1234567.89), new Locale("fr", "FR"));
		CurrencyFormat.displayCurrency(new Double(1234567.89), new Locale("zh", "CN"));
	}
	
	public static void displayCurrency(Double amount, Locale currentLocal){
		NumberFormat formatter ;
		String amountOut;
		
		formatter = NumberFormat.getCurrencyInstance(currentLocal);
		amountOut = formatter.format(amount);
		System.out.println(amountOut + " " + currentLocal.toString());
	}

}
