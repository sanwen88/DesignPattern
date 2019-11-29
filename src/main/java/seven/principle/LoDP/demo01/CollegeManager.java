package seven.principle.LoDP.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sanwen88  
 * @date 2019年8月28日 下午5:11:26 
 *
 * @Description: 学院员工管理类
 *
 * @version V1.0
 */
public class CollegeManager {

	/**
	 * @date 2019年8月28日 下午5:11:52
	 * @Description: 返回学院所有员工 
	 * @param
	 * @return List<CollegeEmployee>
	 */
	
	public List<CollegeEmployee> getAllEmployee() {
		List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
		for (int i = 0; i < 10; i++) {
			CollegeEmployee emp = new CollegeEmployee();
			emp.setId("学院员工id= " + i);
			list.add(emp);
		}
		return list;
	}
}
