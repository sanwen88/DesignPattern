package template_method.demo03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author sanwen88
 * @date 2019年9月26日 下午3:07:16
 *
 * @Description: 需求变更：客户提出H1型号的悍马喇叭想让它响才响，H2型号的喇叭不要响，如何重构？
 *
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {
		HummerH1Model h1 = new HummerH1Model();
		String type = null;
		try {
			type = new BufferedReader(new InputStreamReader(System.in)).readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if("1".equals(type)) {//根据客户需求，生产H1模型是否需要带喇叭响的
			h1.setAlarm(true);
		}
		h1.run();
		
		HummerModel h2 = new HummerH2Model();
		h2.run();
	}

}
