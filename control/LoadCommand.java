package control;

class LoadCommand extends Command{

  public void execute(){
    receiver.loadUsers();
  }
  
}