package exceptions;

public class UserLoginException extends UserDataException{
  
  public void warning(){
    System.out.println("Insert a valid login.");
    System.out.println("It must not contain numbers, be empty or have more than 12 characters");
  }
  
}