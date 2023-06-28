import java.util.Scanner;

public class validation {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    String sid, name, email, mobile, pwd, uname;
    System.out.println("enter sid");
    sid = s.nextLine();// reading student id from user
    System.out.println("enter name");
    name = s.nextLine();// reading student name from user
    System.out.println("enter email");
    email = s.nextLine();// reading student email from user
    System.out.println("enter mobile");
    mobile = s.nextLine();// reading student mobile from user
    System.out.println("enter pwd");
    pwd = s.nextLine();// reading student password from user
    System.out.println("enter uname");
    uname = s.nextLine();// reading student username from user
    if (sid.startsWith("std") && sid.length() >= 6 && sid.length() <= 10 && sid.charAt(sid.length() - 1) >= '0'
        && sid.charAt(sid.length() - 1) <= '9') {
      System.out.println("student id is valid");
    } else {
      System.out.println("student id is not valid");
    }
    if (name.length() >= 5 && name.length() <= 15 && name.charAt(0) >= 'A' && name.charAt(0) <= 'Z'
        && !name.contains(" ")) {
      int count = 0;
      for (int i = 1; i < name.length(); i++) {
        if (name.charAt(i) >= 'a' && name.charAt(i) <= 'z')
          count++;
      }
      if (count == name.length() - 1) {
        System.out.println("name is valid");
      } else {
        System.out.println("name is not valid");
      }
    } else {
      System.out.println("name is not valid");
    }
    if (mobile.length() == 10) {
      int count = 0;
      for (int i = 0; i < mobile.length(); i++)

      {
        if (mobile.charAt(i) >= '0' && mobile.charAt(i) <= '9')
          count++;
      }
      if (count == 10) {
        System.out.println("mobile number is valid");

      } else {
        System.out.println("mobile number is not valid");
      }
    } else {
      System.out.println("mobile number is not valid");
    }

  }
}
