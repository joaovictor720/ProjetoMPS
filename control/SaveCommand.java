package control;

class SaveCommand extends Command{
  HashMap<String, User> users;

  public void execute(){
    receiver.saveUsers(this.users);
  }
  
}