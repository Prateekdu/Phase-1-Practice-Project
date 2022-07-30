package VirtualKeyFotYourRepositories;
import java.io.IOException;
import java.util.Scanner;
public class VirtualDemo
{
	Scanner scan = new Scanner(System.in);
	Operations p = new Operations();
	
	public void introScreen() 
	{
		System.out.println();
		System.out.println("*     WELCOME TO THE LOCKEDME APPLICATION      *");
		System.out.println();
		System.out.println("*      PRATEEK DUBEY      *");
		System.out.println();
		System.out.println("*   Directory: " + Main.path +"    *");
		System.out.println("\n\n");
	}
	public void exitScreen()
	{
		System.out.println("*    THANK YOU FOR VISITING        *");
		System.out.println("\n\n");
	}
	public void mainMenuOptions() {
		System.out.println("-------------------------------------");
		System.out.println("|            MAIN MENU              |");
		System.out.println("- - - - - - - - - - - - - - - - - - -");
		System.out.println("| Select any one of the following:  |");
	    System.out.println("|   1 - List All Files              |");
	    System.out.println("|   2 - More Options                |");
	    System.out.println("|   3 - Exit                        |");
	    System.out.println("-------------------------------------");
	    System.out.println("Enter your choice : ");
	}
	
	public void subMenuOptions() {
		
		System.out.println("-------------------------------------");
		System.out.println("|            SUB MENU               |");
		System.out.println("-------------------------------------");
		System.out.println("| Select any one of the following:  |");
	    System.out.println("|   1 - Add a file                  |");
	    System.out.println("|   2 - Delete a file               |");
	    System.out.println("|   3 - Search a file               |");
	    System.out.println("|   4 - Go Back                     |");
	    System.out.println("-------------------------------------");
	    System.out.println("Enter your choice : ");
		
	}
	
	public void mainMenu() {
		
		int choice = 0;
		char decision = 0;
		do
		{
			mainMenuOptions();
			try 
			{
				choice = Integer.parseInt(scan.nextLine());
			}
			catch (Exception e) 
			{
				System.out.println(e);
				mainMenu();
			}
			switch (choice)
			{
					case 1:
					System.out.println();
					try 
					{
						p.listAllFiles(Main.path);
					}
					catch(Exception e) 
					{
						System.out.println(e.getMessage());
					}
					System.out.println("\n***********************************\n");
					break;
					
			case 2: 
					System.out.println();
					subMenu();
					break;
					
			case 3: 
					System.out.println("\n Are you sure you want to exit ? ");
					System.out.println("  (Y) ==> Yes    (N) ==> No        ");
					decision =  scan.nextLine().toUpperCase().charAt(0);
					if(decision == 'Y') {
						System.out.println("\n");
						exitScreen();
						System.exit(1);
					}else if(decision == 'N') {
						System.out.println("\n");
						mainMenu();
					}else {
						System.out.println("\nInvalid Input \nValid Inputs :(Y/N)\n");
						mainMenu();
					}
					
					
			default:
					System.out.println("\nInvalid Input \nValid Input Integers:(1-3)\n");
					mainMenu();
				
			}
			
			
		}while(true);
		
	}
	
	
	public void subMenu() {
		String file = null;
		String fileName = null;
		int choice = 0;
		
		do {
			
			subMenuOptions();
			
			try {
				choice = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid Input \nValid Input Integers:(1-4)");
				subMenu();
			}
			
			
			switch (choice) {
			case 1: 
					System.out.println("\n==> Adding a File...");
					System.out.println("Please enter a file name : ");
					file = scan.nextLine();
					fileName = file.trim();
					try {
						p.createNewFile(Main.path, fileName);
					}
					catch(Exception e) {
						System.out.println(e);
						
					}
					System.out.println("\n**********************************\n");
					break;
					
			case 2: 
					System.out.println("\n==> Deleting a File...");
					System.out.println("Please enter a file name to Delete : ");
					file = scan.nextLine();
					fileName = file.trim();
					try {
						p.deleteFile(Main.path, fileName);
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
					System.out.println("\n***********************************\n");
					break;
					
			case 3: 
					System.out.println("\n==> Searching a File...");
					System.out.println("Please enter a file name to Search : ");
					file = scan.nextLine();
					fileName = file.trim();
					try {
						p.searchFile(Main.path, fileName);
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
					System.out.println("\n***********************************\n");
					break;
			case 4: mainMenu();
					break;
					
			default:
				System.out.println("Invalid Input \nValid Input Integers:(1-4)");
				subMenu();
				
			}
			
		file = null;
		fileName = null;
			
		}while(true);
		
	}
	
}
