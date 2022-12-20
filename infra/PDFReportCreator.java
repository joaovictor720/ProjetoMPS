package infra;

public class PDFReportCreator extends ReportCreator {

  public void openFile() {
    File PDFfile = new File(args[0]);
  }

  public void readFile() {
    BufferedReader br = new BufferedReader(new FileReader(file));
  }

  public void parseFile() {
    PDFFile = br.parseToPDF();
  }
}