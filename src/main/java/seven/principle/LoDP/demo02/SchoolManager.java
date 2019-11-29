package seven.principle.LoDP.demo02;

import java.util.ArrayList;
import java.util.List;

import seven.principle.LoDP.demo01.Employee;

public class SchoolManager {

	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<Employee>();

		for (int i = 0; i < 5; i++) {
			Employee emp = new Employee();
			emp.setId("学校总部员工id= " + i);
			list.add(emp);
		}
		return list;
	}
	
	public void printAllEmployee(CollegeManager sub) {
		sub.printEmployee();
		
		List<Employee> list = this.getAllEmployee();
		System.out.println("------------学校总部员工------------");
		for (Employee e : list) {
			System.out.println(e.getId());
		}
	}

}
