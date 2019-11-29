package multitonPattern.demo2;

public class LingualResourceClient {

	public static void main(String[] args) {
		LingualResource ling = LingualResource.getInstance("en", "US");
		String usDollar = ling.getLocaleString("USD");
		System.out.println("USD="+usDollar);
		
		LingualResource ling2 = LingualResource.getInstance("en", "US");
		usDollar = ling2.getLocaleString("USD");
		System.out.println("USD="+usDollar);
		
		
		System.out.println("=====================多例模式：LingualResource的两个不同对象=====================");
		LingualResource lingZh = LingualResource.getInstance("zh", "CH");
		String usDollarZh = lingZh.getLocaleString("USD");
		System.out.println("USD="+usDollarZh);
		
		LingualResource lingZh2 = LingualResource.getInstance("zh", "CH");
		usDollarZh = lingZh2.getLocaleString("USD");
		System.out.println("USD="+usDollarZh);
	}

}
