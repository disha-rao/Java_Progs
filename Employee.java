package employee;
// create employee class
public class Employee {
String name;
int id;
double salary;

Employee(String n,int d,double sal){
	name = n;
	id=d;
	salary=sal;
}
//displaying the details
void display(){
	System.out.println("Employee details are:");
	System.out.println("Employee ID:"+id);
	System.out.println("Name:"+name);
	System.out.println("Salary:"+salary);
	
}
// function to increase the salary
void inc_salary(double percentage) {
	double increment = (salary*percentage)/100;
	salary = salary+increment;
	System.out.println("Emp salary increased by"+increment);
}
}
