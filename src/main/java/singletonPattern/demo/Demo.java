package singletonPattern.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


import com.sun.org.apache.bcel.internal.classfile.Field;

/**
 * @author sanwen88  
 * @date 2019年8月30日 下午12:48:42 
 *	Singleton.properties
 *	name=zhoujiawen
 *	age=25
 *	sex=man
 *	salary=10000
 * @Description: 输入输入文件Singleton.properties中key，可以得到key对应的value
 *
 * @version V1.0
 */
public class Demo {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedReader reader = new BufferedReader(new InputStreamReader(
//				new FileInputStream("E:\\ws_sts\\ws2020\\DesignPattern\\txt")));
		
		System.out.println("输入想要看到的属性值对应的key，如果键入quit则退出");
		do{
			System.out.print("Property item to read:");
			String line = reader.readLine();
			if(line.equals("quit")){
				break;
			}
			System.out.println((String)ConfigManager.getInstance().getConfigItem(line, "Not found"));
		}while(true);
		
	}
	
	
	//junit依赖范围test,可见引入的依赖包是灰色的图标,含义是依赖项目仅仅参与测试相关的工作,包括测试代码的编译,执行,
	//不能在src/main/java包下面使用,只能在src/test/java下使用。
	@org.junit.Test
	public void testCase() throws IOException{
		String f = System.getProperty("user.dir") + File.separator + "Singleton.properties";
		System.out.println(f);
	}
}
