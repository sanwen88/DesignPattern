package seven.principle.LoDP.demo02;

import java.util.ArrayList;
import java.util.List;

import seven.principle.LoDP.demo01.CollegeEmployee;

public class CollegeManager {
	
	public List<CollegeEmployee> getAllEmployee() {
		List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
		for (int i = 0; i < 10; i++) {
			CollegeEmployee emp = new CollegeEmployee();
			emp.setId("学院员工id= " + i);
			list.add(emp);
		}
		return list;
	}
	
	/**
	 * 
	 * @date 2019年8月28日 下午5:38:58
	 * @Description: 将demo01中SchoolManager类中违反迪米特法则的代码挪到这里
	 * @param
	 * @return void
	 *
	 */
	public void printEmployee() {
		List<CollegeEmployee> list1 = this.getAllEmployee();
		System.out.println("------------学院员工------------");
		for (CollegeEmployee e : list1) {
			System.out.println(e.getId());
		}
	}

}
