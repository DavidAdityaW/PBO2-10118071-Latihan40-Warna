/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan40.warna;

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
public class Warna {
    private String RESET;
    private String MERAH;
    private String HIJAU;
    private String KUNING;
    private String BIRU;
    private String UNGU;
    private String CYAN;

    private String MERAHBG;
    private String HIJAUBG;
    private String KUNINGBG;
    private String BIRUBG;
    private String UNGUBG;

    private String nama;
    private String warna;

    public void set_nama(String nama) {
        this.nama = nama;
    }

    public void set_warna(String warna) {
        this.warna = warna;
    }
    
    public String get_nama() {
        return nama;
    }
    
    public String get_warna() {
        return warna;
    }

    public void set_warna(String merah, String hijau, String kuning, String biru, String ungu, String cyan) {
        this.MERAH = merah;
        this.HIJAU = hijau;
        this.KUNING = kuning;
        this.BIRU = biru;
        this.UNGU = ungu;
        this.CYAN = cyan;
    }

    public void set_bg(String merah, String hijau, String kuning, String biru, String ungu) {
        this.MERAHBG = merah;
        this.HIJAUBG = hijau;
        this.KUNINGBG = kuning;
        this.BIRUBG = biru;
        this.UNGUBG = ungu;
    }

    public void set_reset(String reset) {
        this.RESET = reset;
    }

    public String merah() {
        return MERAH;
    }

    public String hijau() {
        return HIJAU;
    }

    public String kuning() {
        return KUNING;
    }

    public String biru() {
        return BIRU;
    }

    public String ungu() {
        return UNGU;
    }

    public String cyan() {
        return CYAN;
    }
    
    public String merahbg() {
        return MERAHBG;
    }

    public String hijaubg() {
        return HIJAUBG;
    }

    public String kuningbg() {
        return KUNINGBG;
    }

    public String birubg() {
        return BIRUBG;
    }

    public String ungubg() {
        return UNGUBG;
    }

    public String reset() {
        return RESET;
    }

    public void tampil_merah() {
        System.out.println("===HASIL TEST KEPRIBADIAN " + nama + "===");
        System.out.println("Warna Favoritmu adalah " + MERAH + "MERAH");
        System.out.println("1. Periang,");
        System.out.println("2. Pemberani,");
        System.out.println("3. Berani mengambil resiko dalam setiap langkah,");
        System.out.println("4. Menyukai tantangan,");
        System.out.println("5. Kurang sabar,");
        System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,");
        System.out.println("7. Memiliki energi kehangatan dan cinta.");
    }

    public void tampil_hijau() {
        System.out.println("===HASIL TEST KEPRIBADIAN " + nama + "===");
        System.out.println("Warna Favoritmu adalah " + HIJAU + "HIJAU");
        System.out.println("1. Romantis,");
        System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
        System.out.println("3. Teguh pada prinsip,");
        System.out.println("4. Menginginkan kesempurnaan,");
        System.out.println("5. Mudah cemburu,");
        System.out.println("6. Mudah merasa iri,");
        System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
    }

    public void tampil_kuning() {
        System.out.println("===HASIL TEST KEPRIBADIAN " + nama + "===");
        System.out.println("Warna Favoritmu adalah " + KUNING + "KUNING");
        System.out.println("1. Optimis,");
        System.out.println("2. Suka bergaul,");
        System.out.println("3. Periang,");
        System.out.println("4. Senang menolong,");
        System.out.println("5. Lincah dan aktif,");
        System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
        System.out.println("7. Loyal,");
        System.out.println("8. Hangat,");
        System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,");
        System.out.println("10. Cenderung penakut.");
    }

    public void tampil_biru() {
        System.out.println("===HASIL TEST KEPRIBADIAN " + nama + "===");
        System.out.println("Warna Favoritmu adalah " + BIRU + "BIRU");
        System.out.println("1. Menyenangkan,");
        System.out.println("2. Bijaksana,");
        System.out.println("3. Pembawaan diri tenang saat menghadapi masalah");
        System.out.println("4. Dinamis,");
        System.out.println("5. Senang berbagi,");
        System.out.println("6. Bersahabat,");
        System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
        System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
    }

    public void tampil_ungu() {
        System.out.println("===HASIL TEST KEPRIBADIAN " + nama + "===");
        System.out.println("Warna Favoritmu adalah " + UNGU + "UNGU");
        System.out.println("1. Optimis,");
        System.out.println("2. Tidak pernah ragu,");
        System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
        System.out.println("4. Memiliki ambisi yang besar,");
        System.out.println("5. Memiliki empati yang besar,");
        System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,");
        System.out.println("7. Terkadang bersikap keras kepala dan angkuh.");
    }

    public void tampil_else() {
        System.out.println("===HASIL TEST KEPRIBADIAN " + nama + "===");
        System.out.println("Oops.. Belum teridentifikasi");
    }
    
}
