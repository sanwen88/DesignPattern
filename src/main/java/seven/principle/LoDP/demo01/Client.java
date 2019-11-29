package seven.principle.LoDP.demo01;

/**
 * 
 * @author sanwen88  
 * @date 2019年8月28日 下午5:08:30 
 *
 * @Description: 学校下属有各个学院和总部，要求打印学校总部员工ID和学院员工ID
 * 
 *	SchoolManager类的直接朋友类有： Employee、CollegeManager
 *	CollegeEmployee类不是直接朋友，对于SchoolManager来说它是陌生的，这就违背了迪米特法则.
 *	按照迪米特法则，应该避免类中出现这样非直接朋友关系的耦合。因此，只需要将违反迪米特法则的printAllEmployee()方法改写下即可。
 *	详见demo02
 *
 * @version V1.0
 */
public class Client {
	public static void main(String[] args) {
		SchoolManager schoolManager = new SchoolManager();
		schoolManager.printAllEmployee(new CollegeManager());
	}
}
