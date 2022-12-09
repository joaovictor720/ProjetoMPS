package control;

import java.util.ArrayList;
import java.util.HashMap;
import model.*;
import exceptions.*;

public class UserController{
  HashMap<String, User> users;
  HashMap<String, Driver> drivers;

  UserInvoker invoker;

  private static UserController instance;

  private UserController(){
    this.invoker = new UserInvoker();
  }

  public static UserController getInstance(){
    if (instance == null){
      instance = new UserController();
    }
    return instance;
  }

  private boolean validPassword(String password){
    // algorithm for counting how many numbers there are in password
    char[] chars = password.toCharArray();
    int digitCounter = 0;
    boolean containsLetter = false;
    for (char c : chars){
      if (Character.isDigit(c)){
        digitCounter++;
      }
      if (Character.isLetter(c)){
        containsLetter = true;
      }
    }
    // password must have more than 2 numbers and contain characters
    if (digitCounter >= 2 && containsLetter){
      return true;
    }else{
      return false;
    }
  }

  private boolean validLogin(String login){
    // algorithm for checking if login contains at least one number
    char[] chars = login.toCharArray();
    boolean containsDigit = false;
    for (char c : chars){
      if(Character.isDigit(c)){
        containsDigit = true;
      }
    }
    // login must not have more than 12 characters, be empty or
    // contain a number
    if (!containsDigit && login.length() <= 12 && login != ""){
      return true;
    }else{
      return false;
    }
  }

  public void addUser(String[] userInfo) throws UserDataException{
    if (!validLogin(userInfo[0])){
      throw new UserLoginException();
    }
    if (!validPassword(userInfo[1])){
      throw new UserPasswordException();
    }

    User user = new User();

    user.setLogin(userInfo[0]);
    user.setPassword(userInfo[1]);
    user.setCPF(userInfo[2]);
    
    users.put(user.getLogin(), user);
    invoker.executeCommand(new SaveCommand());
  }

  public void addDriver(String[] driverInfo) throws UserDataException{
    if (!validLogin(driverInfo[0])){
      throw new UserLoginException();
    }
    if (!validPassword(driverInfo[1])){
      throw new UserPasswordException();
    }

    Driver driver = new Driver();

    driver.setLogin(driverInfo[0]);
    driver.setPassword(driverInfo[1]);
    driver.setCPF(driverInfo[2]);
    
    drivers.put(driver.getLogin(), driver);
    invoker.executeCommand(new SaveCommand());
  }

  public ArrayList<User> getAllUsers(){
    invoker.executeCommand(new LoadCommand());
    return (ArrayList<User>) users.values();
  }

  public ArrayList<Driver> getAllDrivers(){
    invoker.executeCommand(new LoadCommand);
    return (ArrayList<Driver>) drivers.values();
  }

  public User getUser(String login){
    invoker.executeCommand(new LoadCommand());
    return users.get(login);
  }

  public Driver getDriver(String login){
    invoker.executeCommand(new LoadCommand());
    return drivers.get(login);
  }

  public void deleteUser(String login){
    users.remove(login);
    invoker.executeCommand(new SaveCommand());
  }

  public void deleteDriver(String login){
    drivers.remove(login);
    invoker.executeCommand(new SaveCommand());
  }
}