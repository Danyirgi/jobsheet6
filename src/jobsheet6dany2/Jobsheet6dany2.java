
package jobsheet6dany2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;               
public class Jobsheet6dany {

    
    public static void main(String[] args) throws IOException {
        String nama;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("inputkan nama");
        nama= br.readLine();
        System.out.println("Nama kamu adalah" + nama);
        
        
        
        
    }
    
}
