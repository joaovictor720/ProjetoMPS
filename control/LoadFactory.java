package factory;

import command.*;

class LoadFactory extends CommandFactory{
  public Command createCommand(){
    return new LoadCommand();
  }
}