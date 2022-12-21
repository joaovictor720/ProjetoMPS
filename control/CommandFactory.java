package factory;

import command.*;

abstract class CommandFactory{
  abstract public Command createCommand();
}