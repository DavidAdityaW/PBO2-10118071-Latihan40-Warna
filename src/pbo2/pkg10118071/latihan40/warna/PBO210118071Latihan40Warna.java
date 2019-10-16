/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan40.warna;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menentukkan
 *                     kepribadian menurut warna favorit
 * 
 */
public class PBO210118071Latihan40Warna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        Warna wrn = new Warna();
        
        wrn.set_warna("\u001b[31m", "\u001b[32m", "\u001b[33m", "\u001b[34m", "\u001b[35m", "\u001b[36m");
        wrn.set_bg("\u001b[41m", "\u001b[42m", "\u001b[43m", "\u001b[44m", "\u001b[45m");
        wrn.set_reset("\u001b[0m");
        
        System.out.println(wrn.merah() + "YUK" + wrn.hijau() + " CEK " + wrn.kuning() + "KEPRIBADIANMU " + wrn.cyan() + "DARI " + wrn.ungu() + "WARNA " + wrn.biru() + "FAVORITMU" + wrn.reset());
        System.out.println(wrn.merahbg() + "\tMERAH\t\t" + wrn.reset());
        System.out.println(wrn.hijaubg() + "\tHIJAU\t\t" + wrn.reset());
        System.out.println(wrn.kuningbg() + "\tKUNING\t\t" + wrn.reset());
        System.out.println(wrn.birubg() + "\tBIRU\t\t" + wrn.reset());
        System.out.println(wrn.ungubg() + "\tUNGU\t\t" + wrn.reset());
        
        System.out.print("\nPILIH WARNA FAVORITMU : ");
        wrn.set_warna((input.next()).toUpperCase());
        System.out.print("NAMA KAMU : ");
        wrn.set_nama((input.next()).toUpperCase());
        
        switch (wrn.get_warna()) {
            case "MERAH":
                wrn.tampil_merah();
                break;
            case "HIJAU":
                wrn.tampil_hijau();
                break;
            case "KUNING":
                wrn.tampil_kuning();
                break;
            case "BIRU":
                wrn.tampil_biru();
                break;
            case "UNGU":
                wrn.tampil_biru();
                break;
            default:
                wrn.tampil_else();
                break;
        }
    }
    
}
