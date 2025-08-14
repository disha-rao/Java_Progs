package employee;

public class EmpMain {
	public static void main(String[] args) {
		//create new employees
	    Employee e1 = new Employee("Raj",101,10000.0d);
	    Employee e2=new Employee("Diva",102,20000.0d);
	    //display the initial details
	    System.out.println("Initial Employee Details:");
	    e1.display();
	    e2.display();
	    //increasing the salary
	    e1.inc_salary(5.0d);
	    e2.inc_salary(10.d);
	    //display the updated salary
	    System.out.println("Updated Employee Details:");
	    e1.display();
	    e2.display();
	    }
}
