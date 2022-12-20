package infra;

public abstract class ReportCreator{
  public void ReportCreator(){
    readFile();
    openFile();
    parseFile();
    
  }
  public abstract void readFile();
  public abstract void openFile();
  public abstract void parseFile();
  
}