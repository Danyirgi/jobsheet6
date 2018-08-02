
package jobsheet6dany;
import java.util.Scanner;


public class Jobsheet6dany7 {
   public static void main(String[] args) {
       Scanner masukkan = new Scanner(System.in);
       int nilai;
       System.out.print("masukkan nilai akhir PBO:");
       nilai = masukkan.nextInt();
       if (nilai < 70)
           System.out.println("siswa tidak lulus");
       if (nilai > 70)
           System.out.println("siswa lulus");
       
 
    }
    
}
