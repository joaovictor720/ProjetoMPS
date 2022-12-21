package factory;

import command.*;
import model.*;

class SaveFactory extends CommandFactory{
  HashMap<String, User> usersParam;

  public void setParams(HashMap<String, User> users){
    this.usersParam = users;
  }
  
  public Command createCommand(){
    return new SaveCommand(usersParam);
  }
}