package control;

import infra.*;

abstract class Command{
  public UserPersistence receiver;
  public UserInvoker invoker;

  public abstract void execute();
  
}
