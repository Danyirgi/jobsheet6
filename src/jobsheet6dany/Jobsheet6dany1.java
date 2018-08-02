package jobsheet6dany;

import java.util.Scanner;
public class Jobsheet6dany1 {
public static void main(String[] args) {
//Deklarasi
    String nama, alamat;
    int usia, absen;
    //membuat scanner baru
    Scanner keyboard = new Scanner (System.in);
 //tampilkan output ke user
    System.out.println("###DATA SISWA SMK TELKOM MALANG###");
    System.out.print("Nama Siswa:");
    nama = keyboard.next();
    System.out.print("alamat: ");
    alamat = keyboard.next();
    System.out.print("absen: ");
    usia = keyboard.nextInt();
    System.out.print("usia: ");
    absen = keyboard.nextInt();
    System.out.println("-----------");
    System.out.println("Nama Siswa:"+ nama);
    System.out.println("alamat: "+ alamat);
    System.out.println("absen: "+ usia);
    System.out.println("Usia: "+ absen+"tahun");
    
    
    
            
    }
    
}

