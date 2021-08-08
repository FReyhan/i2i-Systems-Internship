import java.util.ArrayList;
import java.util.List;

public class DummyData {

	public static List<Employee> getEmployeeDetails(){
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "Fatma", "fatma@gmail.com", 21));
		empList.add(new Employee(2, "Reyhan", "reyhan@gmail.com", 22));
		empList.add(new Employee(3, "Akin", "akin@gmail.com", 23));

		return empList;
	}
}
