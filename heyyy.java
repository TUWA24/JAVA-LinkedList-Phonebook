import java.util.LinkedList;
import java.util.Scanner;
public class heyyy {

	public static void main(String[] args) {
		
		boolean exit = false;
		
		LinkedList<String>names = new LinkedList<String>();
		while(exit!=true) {
		Scanner tuwa = new Scanner(System.in);
		System.out.println("Option"+"\n"+"1.Name"+"\n"+"2.Remove"+"\n"+"3.Gender"+"\n"+"4.Add");
		int se = tuwa.nextInt();
		
		
		switch(se) {
		case 1:
			Scanner th = new Scanner(System.in);
			System.out.println("Input name: ");
			String se1 = th.nextLine();
			names.add(se1);
			break;
			
		case 2:
			for (int i = 0; i < names.size(); i++) {
                System.out.println( i  + names.get(i));
            }
			Scanner the = new Scanner(System.in);
			System.out.println("Remove ");
			int see = the.nextInt();
			System.out.println(names.remove(see)+"is removed");
			break;
			
		case 3:
			
			System.out.println("Enter Display: ");
			for(int i = 0; i<names.size(); i++)
				System.out.println(i+names.get(i));
			
			
			break;
			
		case 4: 
			Scanner there = new Scanner(System.in);
			System.out.println("Enter add: ");
			int sees = there.nextInt();
			break;
			
	
			
			
		}
		
		

	}
		exit=true;
	}
}
