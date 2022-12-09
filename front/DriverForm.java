package front;

import control.*;
//import model.*;
import java.util.Scanner;
import exceptions.*;

public class DriverForm {
  private UserController userController = UserController.getInstance();
  // private Driver driver = new Driver();
  private String string;
  private Scanner read = new Scanner(System.in);

  public void registrationMenu(){
    String[] userInfo = new String[4];
    System.out.println("Login: ");
    //string = read.nextLine();
    //driver.setLogin(string);
    userInfo[0] = read.nextLine();
    
    System.out.println("Password: ");
    //string = read.nextLine();
    //driver.setPassword(string);
    userInfo[1] = read.nextLine();
    
    System.out.println("CPF: ");
    //string = read.nextLine();
    //driver.setCPF(string);
    userInfo[2] = read.nextLine();
      
    System.out.println("CNH: ");
    //string = read.nextLine();
    //driver.setCNH(string);
    userInfo[3] = read.nextLine();

    try{
      //userController.addUser(driver);
      userController.addUser(userInfo);
    }catch (UserDataException exc){
      exc.warning();
    }
    
  }

  public void deleteMenu() {
    System.out.println("Login: ");
    // driver.setLogin(read.nextLine());
    // userController.deleteDriver(driver.getLogin());
  }

  public void menu() {
    int action;

    System.out.println("1 - Add driver");
    System.out.println("2 - Delete driver");

    action = read.nextInt();

    switch (action) {
      case 1:
        registrationMenu();
        break;

      case 2:
        deleteMenu();
        break;
    }
  }

}
