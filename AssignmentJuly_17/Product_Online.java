
import java.util.Scanner;

class ProductNotFoundException extends Exception {

  public ProductNotFoundException(String e) {
    super(e);
  }
}

public class Product_Online {
  Scanner s = new Scanner(System.in);
  ProductPj[] p = new ProductPj[100];
  int count = 0;

  public void Add_Product() {
    System.out.println("enter the product id");
    int Pid = s.nextInt();
    int check = 0;
    for (int i = 0; i < count; i++) {
      if (Pid == p[i].getPid()) {
        check = 1;
        System.out.println("product already exist");

      }
    }
    if (check == 0) {
      s.nextLine();
      System.out.println("enter the product name");
      String Pname = s.nextLine();
      System.out.println("Enter the product price");
      Double price = s.nextDouble();
      System.out.println("Enter the product Quantity");
      int qty = s.nextInt();
      ProductPj p_obj = new ProductPj();
      p_obj.setPid(Pid);
      p_obj.setPname(Pname);
      p_obj.setPprice(price);
      p_obj.setPqty(qty);
      p[count] = p_obj;
      count++;
      System.out.println("Successfully added");
    }

  }

  public void Remove_Product() throws ProductNotFoundException {
    s.nextLine();
    System.out.println("enter the product id");
    int Pid = s.nextInt();
    int check = 0;
    for (int i = 0; i < count; i++) {
      if (Pid == p[i].getPid()) {
        for (int j = i; j < count; j++) {
          p[j] = p[j + 1];
        }
        System.out.println("Deleted Successfully");
        count--;
        check = 1;
      }
    }
    if (check == 0) {
      throw new ProductNotFoundException(" product is not found with the given id");
    }
  }

  public void display_Product() throws ProductNotFoundException {
    s.nextLine();
    System.out.println("enter the product id");
    int Pid = s.nextInt();
    int check = 0;
    for (int i = 0; i < count; i++) {
      if (Pid == p[i].getPid()) {
        System.out.println("The product name " + p[i].getPname());
        System.out.println("The Product Quantity " + p[i].getPqty());
        System.out.println("Th eproduct price is  : " + p[i].getPprice());
        check = 1;
      }
    }
    if (check == 0) {
      throw new ProductNotFoundException(" product is not found with the given id");
    }
  }

  public static void main(String args[]) {
    Product_Online PO = new Product_Online();
    int option = 0;
    do {
      System.out.println("1.add product");
      System.out.println("2.remove product");
      System.out.println("3.Display product");
      System.out.println("4.Exit");
      option = PO.s.nextInt();
      if (option == 1) {
        PO.Add_Product();
      }
      if (option == 2) {
        try {
          PO.Remove_Product();
        } catch (ProductNotFoundException e) {
          System.out.println(e);
        }
      }
      if (option == 3) {
        try {
          PO.display_Product();
        } catch (ProductNotFoundException e) {
          System.out.println(e);
        }
      }
      if (option == 4) {
        System.out.println("Thankyou");
      }
    } while (option != 4);

  }

}
