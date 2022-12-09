package control;

class CommandCaretaker{
  UserInvoker originator;
  Command backup;

  public undo(){
    originator.executeCommand(backup);
  }
  
}
