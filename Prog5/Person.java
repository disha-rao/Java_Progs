package person;

public class Person {
	private String name;
    private int age;
    private Gender gender;

    Person(String name, int age, Gender gender) {
    	this.name = name;
    	this.age = age;
    	this.gender=gender;
    	
    }

    void displayPerson() {
        System.out.println("Person details are"+"name="+name+"Age="+age+"gender="+gender);
    }
}
