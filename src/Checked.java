import java.io.*;
import java.util.Scanner;

public class Checked {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // int n = 0;
        // int y = 4;

        // int res = y / n;
           // System.out.println(res);
            try {
                readFile("clas3s.txt");
            }
            catch (FileNotFoundException f){
                System.out.println("The is not present in the directory");
            } catch (Exception e) {
                System.out.println(e);
            } 
            
        // try {
        //     int res = y / n;
        //     System.out.println(res);
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
    }
        public static void readFile(String fileName) throws IOException {
            FileReader file = new FileReader(fileName);
            BufferedReader fileInput = new BufferedReader(file);
            // read the file
            fileInput.close();
        }
    
        
    
}
