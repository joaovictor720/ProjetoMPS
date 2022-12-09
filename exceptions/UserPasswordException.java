package exceptions;

public class UserPasswordException extends UserDataException{
  
  public void warning(){
    System.out.println("Insert a valid password.");
    System.out.println("It must have from 8 to 20 characters, including letters and at least 2 numbers.");
  }
  
}