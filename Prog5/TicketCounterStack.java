package person;

//---- Main Class ----
import java.util.*;
public class TicketCounterStack {
	
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Stack st = null;

     System.out.println("Choose initialization:");
     System.out.println("1. Empty stack with size");
     System.out.println("2. Stack initialized with array of Persons");
     int choice = sc.nextInt();

     if (choice == 1) {
         System.out.print("Enter size: ");
         int size = sc.nextInt();
         st = new Stack(size);
     } else if (choice == 2) {
         System.out.print("Enter number of Persons: ");
         int n = sc.nextInt();
         Person arr[] = new Person[n];
         for (int i = 0; i < n; i++) {
             System.out.print("Enter name: ");
             String name = sc.next();
             System.out.print("Enter age: ");
             int age = sc.nextInt();
             System.out.print("Enter gender (MALE/FEMALE/OTHER): ");
             String g = sc.next().toUpperCase();
             Gender gender = Gender.valueOf(g);
             arr[i] = new Person(name, age, gender);
         }
         st = new Stack(arr);
     }

     int option;
     do {
         System.out.println("\n--- Menu ---");
         System.out.println("1. Push one Person");
         System.out.println("2. Push two Persons");
         System.out.println("3. Pop one Person");
         System.out.println("4. Pop multiple Persons");
         System.out.println("5. Display all Persons");
         System.out.println("6. Display top n Persons");
         System.out.println("7. Exit");
         System.out.print("Enter your choice: ");
         option = sc.nextInt();

         switch(option) {
             case 1:
                 System.out.print("Enter name: ");
                 String name1 = sc.next();
                 System.out.print("Enter age: ");
                 int age1 = sc.nextInt();
                 System.out.print("Enter gender (MALE/FEMALE/OTHER): ");
                 String g1 = sc.next().toUpperCase();
                 Gender gender1 = Gender.valueOf(g1);
                 st.push(new Person(name1, age1, gender1));
                 break;

             case 2:
                 System.out.println("Enter first Person details:");
                 System.out.print("Enter name: ");
                 String name2 = sc.next();
                 System.out.print("Enter age: ");
                 int age2 = sc.nextInt();
                 System.out.print("Enter gender (MALE/FEMALE/OTHER): ");
                 String g2 = sc.next().toUpperCase();
                 Gender gender2 = Gender.valueOf(g2);
                 Person p2 = new Person(name2, age2, gender2);

                 System.out.println("Enter second Person details:");
                 System.out.print("Enter name: ");
                 String name3 = sc.next();
                 System.out.print("Enter age: ");
                 int age3 = sc.nextInt();
                 System.out.print("Enter gender (MALE/FEMALE/OTHER): ");
                 String g3 = sc.next().toUpperCase();
                 Gender gender3 = Gender.valueOf(g3);
                 Person p3 = new Person(name3, age3, gender3);

                 st.push(p2, p3);
                 break;

             case 3:
                 Person popped = st.pop();
                 if (popped != null) {
                     System.out.print("Popped: ");
                     popped.displayPerson();
                 }
                 break;

             case 4:
                 System.out.print("Enter number of Persons to pop: ");
                 int n = sc.nextInt();
                 st.pop(n);
                 break;

             case 5:
                 st.display();
                 break;

             case 6:
                 System.out.print("Enter number of top Persons: ");
                 int topN = sc.nextInt();
                 st.display(topN);
                 break;

             case 7:
                 System.out.println("Exiting...");
                 break;

             default:
                 System.out.println("Invalid choice!");
         }
     } while(option != 7);

     sc.close();
}}
