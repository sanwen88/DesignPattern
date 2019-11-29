package multitonPattern.demo2;

import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 
 * @author sann
 *
 * 多例模式类，根据传递的“语言-地区”返回某个键对应的是中文显示还是英文显示。
 * 内部采用静态工厂方式创建多例
 */
public class LingualResource {

	private String language = "en";
	private String region = "US";
	private String localeCode = "en_US";
	private static final String FILE_NAME="res";
	private static HashMap instances = new HashMap(10);
	private Locale locale = null;
	private ResourceBundle resourceBundle = null;
	private LingualResource lnkLingualResource;
	
	private LingualResource(){}
	
	private LingualResource(String language, String region){
		this.localeCode = language;
		this.region=region;
		localeCode = makeLocaleCode(language, region);
		locale = new Locale(language, region);
		resourceBundle = ResourceBundle.getBundle(FILE_NAME, locale);
		instances.put(localeCode, this);
	}
	public static synchronized LingualResource getInstance(String language, String region){
		if (instances.containsKey(makeLocaleCode(language, region))){//多例模式关键所在
			LingualResource inst = (LingualResource)instances.get(makeLocaleCode(language, region));
			System.out.println(inst);
			return  inst;
		}else{
			return new LingualResource(language, region);
		}
	}
	
	private static String makeLocaleCode(String language, String region){
		return language + "_" +region;
	}
	public String getLocaleString(String code){
		return resourceBundle.getString(code);
	}
	

}
