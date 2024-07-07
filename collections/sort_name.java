import java.util.*;

class Employee implements Comparable<Employee>{

	public String emp_id , emp_name;
	public double salary;
	
	public Employee(String emp_id, String emp_name, double salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.salary = salary;
	}
	
	
	public int compareTo(Employee emp) {
		

		return emp_name.compareTo(emp.emp_name);
	}
	
}

public class sort_name {
    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Employee> emp_list = new ArrayList<>();

        Employee emp2 = new Employee("emp2","def",3200.00);
        Employee emp1 = new Employee("emp1","abc",3500.00);
        Employee emp3 = new Employee("emp3","ghi",3000.00);


        emp_list.add(emp2);
        emp_list.add(emp3);
        emp_list.add(emp1);

        Collections.sort(emp_list);

        Iterator<Employee> emp_ite = emp_list.iterator();
        
        while (emp_ite.hasNext()) {
            Employee emp = emp_ite.next();
            System.out.println("Employee ID : "+ emp.emp_id);
            System.out.println("Employee Name : "+ emp.emp_name);
            System.out.println("Employee Salary : "+ emp.salary);
            System.out.println("\n------------------X-----------------\n");
        }
    }
}
