/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7bifelse;

/**
 *
 * @author amg
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // membuat variabel dan Scanner
        int nilai;
        String grade;
        String nama;
        String lulus = null;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Nama: ");
        nama = scan.nextLine();
        System.out.print("Nilai: ");
        nilai = scan.nextInt();

        // hitung gradenya
        if ( nilai >= 90 ) {
            grade = "A";
            
        } else if ( nilai >= 80 ){
            grade = "B+";
            lulus = "Nilai Anda bagus";
        } else if ( nilai >= 70 ){
            grade = "B";
            lulus = "Cukup Bagus";
        } else if ( nilai >= 60 ){
            grade = "C+";
            lulus = "Cukup";
        } else if ( nilai >= 50 ){
            grade = "C";
            lulus = "banyak belajar";
        } else if ( nilai >= 40 ){
            grade = "D";
            lulus = "Perbaiki lagi";
        } else {
            grade = "E";
            lulus = "Anda Tidak Lulus";
        }
        
        System.out.println("=====================");
        System.out.println("Nama : " + nama);
        System.out.println("Nilai : " + grade);
        System.out.println("Nilai : " + lulus);
        
        
        
    }
    
}
