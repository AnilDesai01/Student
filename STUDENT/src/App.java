import java.util.Scanner;


public class App {

	
	public static void main(String[] args) 
	{
		int type;
		Scanner sc  = new Scanner(System.in);
		
		DBcon db = new DBcon();
		do{
			System.out.println("1 insert");
			System.out.println("2  display");
			System.out.println("3 total marks");
			System.out.println("4 percentage");
			System.out.println("5 delete");
			System.out.println("exit");
			
			type =sc.nextInt();
			switch(type)
			{
			case 1 : db.insert();
				break;
				
			case 2 :db.display();
				break;
			case 3:db.result();
				break;
			case 4: db.result1();
				break;
			case 5 :db.delete();
			break;
			default:
				break;
			}
		}while(type != 6);
			
		
		
	}

}
