import java.util.Scanner;
public class BankSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your namae = ");
		String name = input.nextLine();
		
		System.out.println("Enter your ID = ");
		String id = input.nextLine();
		
		BankAccount obj1 = new BankAccount(name, id);
		obj1.ShowMenu();
	}
	
}
		class BankAccount{
			int balance;
			int prevTransaction;
			String customerName;
			String customerId;
			
			BankAccount(String cname, String cid){
				customerName = cname;
				customerId = cid;
				
				
			}
			
			void deposit(int amount) {
				if(amount != 0) {
					balance = balance + amount;
					prevTransaction = amount;
				}
			}
			
			void withdraw(int amount) {
				
				if (balance <= 0) {
					System.out.println("not enough balance");
				}
				else if(amount != 0) {
					balance = balance-amount;
					prevTransaction = -amount;
				}
			
				
			}
			void getprevTransaction() {
				if(prevTransaction > 0) {
					System.out.println("Deposited : "+prevTransaction);
				}
					else if(prevTransaction<0)
					{
						System.out.println("Withdraw: "+Math.abs(prevTransaction));

					}
					else
					{
						System.out.println("No transaction occured");
					}
				}
			
			void ShowMenu()
			{
				char option = '\0';
				Scanner sc = new Scanner(System.in);
				System.out.println("WElcome "+customerName);
				System.out.println("your ID is : "+customerId);
				System.out.println("\n");
				System.out.println("A check balance ");
				System.out.println("B Deposit");
				System.out.println("C Withdraw ");
				System.out.println("D previous transction");
				System.out.println("E Exit");
				
				do {
					System.out.println("=====================================================================");
					System.out.println("Enter an option =");
					System.out.println("======================================================================");
					option = sc.next().charAt(0);
					System.out.println("\n");
					
					switch(option)
					{
					case 'A':
						System.out.println("-------------------------------------");
						System.out.println("Balance "+balance);
						System.out.println("--------------------------------------");
						System.out.println("\n");
						break;
					case 'B':
						System.out.println("---------------------------------------");
						System.out.println("Enter an amount to deposit");
						System.out.println("--------------------------------------- ");
						int amount = sc.nextInt();
						deposit(amount);
						System.out.println("\n");
						break;
					case 'C':
						System.out.println("----------------------------------------");
						System.out.println("Enter an amount to withdraw");
						System.out.println("------------------------------------------");
						int amount2 = sc.nextInt();
						withdraw(amount2);
						System.out.println("\n");
						break;
					case 'D':
						System.out.println("-------------------------------------------");
						getprevTransaction();
						System.out.println("---------------------------------------------");
						System.out.println("\n");
						break;
					case 'E':
						System.out.println("**********************************************");
						break;
					default:
						System.out.println("invalid Option!!. Please enter again");
						break;
						
						
					}
				}while(option != 'E');
				
				System.out.println("thank you for using a services");
				}
					

	}


