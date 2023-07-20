import java.util.*;


public class InventoryManagement {
	HashMap<String , Products> m=new HashMap<>();
	Scanner s=new Scanner(System.in);
	public void addProduct()
	{
		System.out.println("enter the product name");
		String name=s.next();
		if(m.containsKey(name))
		{
			System.out.println("the product already exist");
		}
		else
		{
			System.out.println("enter the price");
			double price=s.nextDouble();
			System.out.println("enter the quantity");
			int quantity=s.nextInt();
			Products p=new Products();
			p.setPrice(price);
			p.setQuantity(quantity);
			m.put(name, p);
		}
	}
	public void editProduct()
	{
		System.out.println("enter the product name");
		String name=s.next();
		if(m.containsKey(name))
		{
			System.out.println("enter the product price");
			double price=s.nextDouble();
			System.out.println("enter the product quantity");
			int quantity=s.nextInt();
			Products p=m.get(name);
			p.setPrice(price);
			p.setQuantity(quantity);
			m.replace(name, p);
			
		}
		else
			System.out.println("the product doenot exist");
	}
	public void deleteProduct()
	{
		System.out.println("enter the product name");
		String name=s.next();
		if(m.containsKey(name))
		{
			m.remove(name);
		}
		else
			System.out.println("enter the existing product name");
		
	}
	public void displayProducts()
	{
		for(Map.Entry<String, Products> map:m.entrySet()) {
			System.out.println("product name: "+map.getKey());
			System.out.println("product price: "+map.getValue().getPrice());
			System.out.println("product quantity: "+map.getValue().getQuantity());
		}
		
	}
	public void nonStack()
	{
		for(Map.Entry<String, Products> map:m.entrySet())
		{
			if(map.getValue().getQuantity()==0)
			{
				System.out.println("product name: "+map.getKey());
			}
		}
	}
	
	public static void main(String args[])
	{
		InventoryManagement obj=new InventoryManagement();
		while(true)
		{
			System.out.println("1. Add Product");
			System.out.println("2.Edit Product");
			System.out.println("3.Delete Product");
			System.out.println("4.Display Products");
			System.out.println("5.Display Out of Stock Product");
			System.out.println("6.Exit");
			int option=obj.s.nextInt();
			if(option==1)
			{
				obj.addProduct();
			}
			else if(option==2)
			{
				obj.editProduct();
			}
			else if(option==3)
			{
				obj.deleteProduct();
			}
			else if(option==4)
			{
				obj.displayProducts();
			}
			else if(option==5)
			{
				obj.nonStack();
			}
			else {
				System.out.println("Thankyou");
				break;
			}
		}
	}

}