
package jobsheet6dany;

import java.io.*;

public class Jobsheet6dany8 {
public static void main(String[] args) {
    BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
    String x = " ";
    int hitungluas=0;
    System.out.println("---Luas Persegi---");
    System.out.print("masukkan nilai sisi :");
    
    try {
        x = data.readLine();
        int angka = Integer.parseInt(x);
    
        
        
    }catch (IOException | NumberFormatException e){
        System.out.println("error");
        
        
    }
    System.out.println("luas persegi dengan sisi " + x + " + adalah " + hitungluas);
    
}    

    private static class hitung {

        public hitung() {
        }
    }
}
