package bankdemo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankDemo{
	
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			Account acc = new Account(777,"John",1000.0);
			
			while(true) {
			try {
			
				System.out.println("--Bank Menu--");
				System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Show Balance");
	            System.out.println("4. Exit");
	            System.out.print("Select an option: ");
	           int choice = sc.nextInt();
	            switch(choice) {
	            case 1: System.out.println("enter amount to deposit:");
	            		acc.deposit(sc.nextDouble());
	            		break;
	            case 2: System.out.println("enter amount to withdraw");
	            		acc.withdraw(sc.nextDouble());
	            		break;
	            case 3: acc.showBalance();
	            		break;
	            case 4:System.out.println("Thank You....exiting!!");
	            		sc.close();
	            		System.exit(0);
	            default : System.out.println("invalid");	  
	            }
			}
			catch(InputMismatchException e) {
				System.out.println("Please enter only numbers");
				sc.nextLine();
			}
	        catch (InsufficientBalanceException e) {
	            	System.out.println("error"+e.getMessage());
	            }
			catch (ArithmeticException e) {
				System.out.println("error"+e.getMessage());
			}
			catch(Exception e) {
				System.out.println("unexpected error"+e);	
			}
			}
	        }
}
	            		
	            
	            	
	            	
	            
	


