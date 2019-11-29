package seven.principle.LoDP.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sanwen88  
 * @date 2019年8月28日 下午5:15:07 
 *
 * @Description: 学校管理类
 * 
 * @version V1.0
 */
public class SchoolManager {

	/**
	 * 
	 * @date 2019年8月28日 下午5:18:17
	 * @Description: 返回总部员工 
	 * @param
	 * @return List<Employee>
	 *
	 */
	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<Employee>();

		for (int i = 0; i < 5; i++) {
			Employee emp = new Employee();
			emp.setId("学校总部员工id= " + i);
			list.add(emp);
		}
		return list;
	}

	/**
	 * 
	 * @date 2019年8月28日 下午5:18:37
	 * @Description: 输出学校总部和各个学院员工信息 
	 * @param
	 * @return void
	 *
	 */
	public void printAllEmployee(CollegeManager sub) {

		List<CollegeEmployee> list1 = sub.getAllEmployee();
		System.out.println("------------学院员工------------");
		for (CollegeEmployee e : list1) {
			System.out.println(e.getId());
		}
		List<Employee> list2 = this.getAllEmployee();
		System.out.println("------------学校总部员工------------");
		for (Employee e : list2) {
			System.out.println(e.getId());
		}
	}

}
