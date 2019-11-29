package multitonPattern.demo3;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * 格式化数字
 * @author sann
 *
 */
public class NumberFormatTest {

	public static void main(String[] args) {
		displayNumber(new Double(1234567.89), new Locale("en", "US"));
		displayNumber(new Double(1234567.89), new Locale("de", "DE"));
		displayNumber(new Double(1234567.89), new Locale("fr", "FR"));
	}
	
	
	
	public  static void displayNumber(Double amount ,Locale currentLocal){
		NumberFormat formatter;
		String amountOut;
		formatter = NumberFormat.getNumberInstance(currentLocal);
		amountOut = formatter.format(amount);
		System.out.println(amountOut + " " + currentLocal.toString());
	}

}
