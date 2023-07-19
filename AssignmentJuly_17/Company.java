

import java.util.ArrayList;
import java.util.Scanner;

class InvalidSalaryException extends Exception {
  public InvalidSalaryException(String e) {
    super(e);
  }
}

public class Company {
  ArrayList<Employee1> emp = new ArrayList<Employee1>();
  Scanner s = new Scanner(System.in);

  public static void main(String args[]) {
    Company c = new Company();
    int option = 0;
    do {
      System.out.println("1.add employee");
      System.out.println("2.remove employee");
      System.out.println("3.display employees");
      System.out.println("4.Exit");
      option = c.s.nextInt();
      if (option == 1) {
        try {
          c.addEmployee();
        } catch (InvalidSalaryException e) {
          System.out.println(e);
        }

      } else if (option == 2) {
        c.removeEmployee();
      } else if (option == 3) {
        c.display_Employees();
      }

    } while (option != 4);
  }

  public void display_Employees() {
    s.nextLine();
    System.out.println("enter the employee id");
    int id = s.nextInt();
    boolean flag = false;
    for (int i = 0; i < emp.size(); i++) {
      if (id == emp.get(i).getid()) {
        flag = true;
        System.out.println("employee name : " + emp.get(i).getname());
        System.out.println("employee salary : " + emp.get(i).getsalary());
      }
      if (flag == false) {
        System.out.println("entered id is not valid");
      }
    }
  }

  public void removeEmployee() {
    s.nextLine();
    System.out.println("enter the employee id");
    int id = s.nextInt();
    boolean flag = false;
    for (int i = 0; i < emp.size(); i++) {
      if (id == emp.get(i).getid()) {
        flag = true;
        emp.remove(i);
        System.out.println("Successfully deleted");
      }
    }
    if (flag == false) {
      System.out.println("Provided Employee Id is not exit");
    }
  }

  private void addEmployee() throws InvalidSalaryException {
    s.nextLine();
    Employee1 obj = new Employee1();
    System.out.println("enter the employee id");
    int id = s.nextInt();
    boolean flag = false;
    for (int i = 0; i < emp.size(); i++) {
      if (id == emp.get(i).getid()) {
        flag = true;
        System.out.println("employee id already exist");
        break;
      }
    }
    if (flag == false) {
      System.out.println("enter the employee name");
      String name = s.next();
      System.out.println("enter the employee salary");
      double salary = s.nextDouble();
      if (salary < 10000) {
        throw new InvalidSalaryException("the salary is not valid");
      } else {
        obj.setid(id);
        obj.setname(name);
        obj.setsalary(salary);
        emp.add(obj);
        System.out.println("succesfully added");
      }
    }
  }

}
