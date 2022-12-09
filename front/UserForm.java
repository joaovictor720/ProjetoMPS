package front;

import control.*;
import model.*;
import java.util.Scanner;
import exceptions.*;

public class UserForm {
  private UserController userController = UserController.getInstance();
  private User user = new User();
  private String string;
  private Scanner read = new Scanner(System.in);

  public void registrationMenu() {
    System.out.println("Login: ");
    string = read.nextLine();
    user.setLogin(string);

    System.out.println("Senha: ");
    string = read.nextLine();
    user.setPassword(string);

    System.out.println("CPF: ");
    string = read.nextLine();
    user.setCPF(string);

    try {
      userController.addUser(user);
    } catch (UserDataException exc) {
      exc.warning();
    }

  }

  public void deleteMenu() {
    System.out.println("Login: ");
    string = read.nextLine();
    userController.deleteUser(string);
  }

  public void menu() {
    int action;

    System.out.println("1 - Add user");
    System.out.println("2 - Delete user");

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
