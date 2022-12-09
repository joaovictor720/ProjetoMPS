package control;

class UserInvoker{
  Command command;

  public void setCommand(Command command){
    this.command = command;
  }

  public void executeCommand(){
    this.command.execute();
  }
  
}