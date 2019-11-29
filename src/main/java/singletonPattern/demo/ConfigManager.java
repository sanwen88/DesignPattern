package singletonPattern.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {

	/**
	 * 属性文件全路径名
	 */
	private static final String PFILE = System.getProperty("user.dir")
			+ File.separator + "Singleton.properties";
	/**
	 * 对应于属性文件的文件对象
	 */
	private File file = null;
	/**
	 * 属性文件最后修改日期
	 */
	private long lastModifiedTime = 0;
	/**
	 * 对应于属性文件的属性对象
	 */
	private Properties props = null;
	/**
	 * 本类可能存在的唯一的一个实例
	 */
	private static ConfigManager instance = new ConfigManager();
	/**
	 * 私有构造子，保证外界无法直接实例化
	 */
	private ConfigManager(){
		file = new File(PFILE);
		lastModifiedTime = file.lastModified();
		if(lastModifiedTime ==0){//API文档中表示，该值为0就是文件不存在或者发生I/O错误
			System.err.println(PFILE+" 文件不存在！");
		}
		props = new Properties();
		try {
			props.load(new FileInputStream(PFILE));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 静态工厂方法
	 * @return 返还ConfigManager类的单一实例
	 */
	public static  ConfigManager getInstance(){
		return instance;
	}
	/**
	 * 获取一个特定的属性项
	 * @param name 属性项的项名
	 * @param defaultVal 属性项的默认值
	 * @return 属性项的值，如果存在此项，不存在就返回默认值
	 */
	public final Object getConfigItem(String name, Object defaultVal){
		long newTime = file.lastModified();
		//检查属性文件是否被其他程序(多数情况是程序员手动)修改过，如果是，重新读取此文件
		if(newTime ==0){//执行getConfigItem()方法就去检查一遍file对象的最新修改时间，=0表示I/O异常或者文件不存在了
			//属性文件不存在
			if(lastModifiedTime ==0){
				System.err.println(PFILE+" 文件不存在！");
			}else{
				System.err.println(PFILE+" 文件被删除");
			}
			return defaultVal;
		}else if(newTime > lastModifiedTime){
			props.clear();
			try {
				props.load(new FileInputStream(PFILE));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		lastModifiedTime = newTime;
		Object val = props.getProperty(name);
		if(val ==null){
			return defaultVal;
		}else{
			return val;
		}
	}

}
