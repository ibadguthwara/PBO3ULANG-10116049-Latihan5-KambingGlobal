/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3ulang.pkg10116049.latihan5.kambingglobal;

/**
 *
 * @author ibadguthwara
 * NAMA 	     : M. Ibad Guthwara
 * KELAS	     : PBO 3 ULANG
 * NIM		     : 10116049
 * DESKRIPSI PROGRAM : Program ini berisi program untuk mendeklarasikan variabel dalam kelas dapat diakses secara global
 */
public class PBO3ULANG10116049Latihan5KambingGlobal {

    /**
     * @param args the command line arguments
     */
    // Variabel jumlahkambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    // Method untuk menampilkan jumlah kambing
    public void getJumlahKambing(){
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        PBO3ULANG10116049Latihan5KambingGlobal kambingSusu = new PBO3ULANG10116049Latihan5KambingGlobal();
        
        // Menampilkan jumlah kambing yang ada saat program pertama kali berjalan
        kambingSusu.getJumlahKambing();
        
        // Menambah satu kambing
        kambingSusu.tambahKambing();
        
        // Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
