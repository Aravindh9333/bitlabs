
import java.util.*;

public class AddressBook {
	HashMap<String , Long> m=new HashMap<>();
	Scanner s=new Scanner(System.in);
	public void deleteContact()
	{
		System.out.println("enter the name");
		String name=s.next();
		if(m.containsKey(name))
		{
			m.remove(name);
		}
		else
			System.out.println("the name is not in the list");
	}
	public void editContact()
	{
		System.out.println("enter the name");
		String name=s.next();
		if(m.containsKey(name))
		{
		System.out.println("enter new contact number");
		Long number=s.nextLong();
		m.replace(name, number);
		}
		else
			System.out.println("provided name is not in the list");
		
	}
	public void addContact()
	{
		System.out.println("enter the name");
		String name=s.next();
		System.out.println("enter the contact number");
		Long contact=s.nextLong();
		m.put(name, contact);
	}
	public static void main(String args[]) {
		
		AddressBook AD=new AddressBook();
	int option=0;
	do {
		System.out.println("1. Add contact");
		System.out.println("2.Edit contact");
		System.out.println("3.Delete contact");
		System.out.println("4.Exit");
		option=AD.s.nextInt();
		
		if (option==1)
		{
			AD.addContact();
		}
		if (option==2)
		{
			AD.editContact();
		}
		if (option==3)
		{
			AD.deleteContact();
		}
	}while(option!=4);
	
	}
}
