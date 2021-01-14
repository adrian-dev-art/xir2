/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

/**
 *
 * @author amg
 */
import java.util.Scanner;
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String lampu;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Inputkan nama warna[Merah | kuning | hijau]: ");
        lampu = scan.nextLine();
        
        switch(lampu){
            case "merah":
                System.out.println("lampu merah, tolong berhenti");
                break;
            case "kuning":
                System.out.println("lampu merah, tolong bersiap-siap");
                break;
            case "hijau":
                System.out.println("lampu hijau, tolong jalan dan hati-hati");
                break;
        }
    }
}

