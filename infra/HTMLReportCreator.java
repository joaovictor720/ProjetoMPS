package infra;

public class HTMLReportCreator extends ReportCreator {

  public void openFile() {
    File HTMLfile = new File(args[0]);
  }

  public void readFile() {
    BufferedReader br = new BufferedReader(new FileReader(file));
  }

  public void parseFile() {
    HTMLFile = br.parseToHTML();
  }

}