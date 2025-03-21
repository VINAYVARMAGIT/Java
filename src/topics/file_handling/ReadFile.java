package topics.file_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
  public static void main(String[] args) throws IOException {
    File f = new File("C:\\Users\\LENOVO\\OneDrive\\Documents\\Read.txt");

    FileReader fr = new FileReader(f);
    BufferedReader bf = new BufferedReader(fr);

    String line = null;
    while ((line =bf.readLine())!=null) {
      System.out.println(line);
    }

  }
}
