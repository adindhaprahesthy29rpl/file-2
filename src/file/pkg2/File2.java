/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.pkg2;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class File2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           String namaKereta[] = {"","Dhoho Penataran", "Kertajaya", "Kahuripan", "Majapahit"};
        String ruteTujuan[] = {"","Malang-Surabaya", "Surabaya-Semarang-Jakarta", "Kediri-Bandung", "Malang-Jakarta"};
        double hargaTiket[] = {0, 15000, 275000, 84000, 295000};
        String namaPemesan, lainnya;
        double jumlahPembayaran, totalPembayaran, kembalian;
        int jumlahTiket;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("======================================");
        System.out.println("<<<<<<SELAMAT DATANG DI KA ACCES>>>>>>");
        System.out.println("<<<   PEMESANAN TIKET KERETA API   >>>");
        System.out.println("-----Daftar Harga Tiket Kereta Api----");
        System.out.println("======================================");
        
        
        for (int i=1; i<namaKereta.length; i++){
            System.out.println("No. " +i+namaKereta[i]+" Tujuan "+ruteTujuan[i] +" Harga Tiket sebesar Rp. "+hargaTiket[i]);
        }
    
        System.out.println("--Melakukan Pemesanan Tiket Kereta Api--");
        System.out.print("Masukkan Nama Anda : ");
        namaPemesan = input.nextLine();
        System.out.println("Masukkan No Tiket Yang Anda Pesan : ");
        int pilihan = input.nextInt();
 
        switch (pilihan){
    
        case 1: 
            System.out.println("Pesanan Anda DHOHO PENATARAN ke MALANG-SURABAYA     Rp. 15.000.-");
            System.out.print("Masukan Jumlah Tiket Yang Ingin Anda Pesan :");
            jumlahTiket = input.nextInt();
            jumlahPembayaran = 15000*jumlahTiket;
            System.out.println("Total Yang Harus Dibayarkan = Rp. "+jumlahPembayaran);
            System.out.println("Masukkan Nominal Uang Anda : ");
            totalPembayaran = input.nextDouble();
            kembalian = totalPembayaran-jumlahPembayaran;
            System.out.println("kembalian Anda Rp." +kembalian);
            System.out.println("-TERIMA KASIH-");
        break;                     
                   
        case 2: 
            System.out.println("Pesanan Anda KERTAJAYA ke SURABAYA-SEMARANG-JAKARTA     Rp. 275.000.-");
            System.out.print("Masukan Jumlah Tiket Yang Ingin Anda Pesan :");
            jumlahTiket = input.nextInt();
            jumlahPembayaran = 275000*jumlahTiket;
            System.out.println("Total Yang Harus Dibayarkan = Rp. "+jumlahPembayaran);
            System.out.println("Masukkan Nominal Uang Anda : ");
            totalPembayaran = input.nextDouble();
            kembalian = totalPembayaran-jumlahPembayaran;
            System.out.println("kembalian Anda Rp." +kembalian);
            System.out.println("-TERIMA KASIH-");
        break;                  
        
        case 3: 
            System.out.println("Pesanan Anda KAHURIPAN ke KEDIRI-BANDUNG     Rp. 84.000.-");
            System.out.print("Masukan Jumlah Tiket Yang Ingin Anda Pesan :");
            jumlahTiket = input.nextInt();
            jumlahPembayaran = 84000*jumlahTiket;
            System.out.println("Total Yang Harus Dibayarkan = Rp. "+jumlahPembayaran);
            System.out.println("Masukkan Nominal Uang Anda : ");
            totalPembayaran = input.nextDouble();
            kembalian = totalPembayaran-jumlahPembayaran;
            System.out.println("kembalian Anda Rp." +kembalian);
            System.out.println("-TERIMA KASIH-");
        break;     
        
        case 4: 
            System.out.println("Pesanan Anda MAJAPAHIT ke MALANG-JAKARTA     Rp. 295.000.-");
            System.out.print("Masukan Jumlah Tiket Yang Ingin Anda Pesan :");
            jumlahTiket = input.nextInt();
            jumlahPembayaran = 295000*jumlahTiket;
            System.out.println("Total Yang Harus Dibayarkan = Rp. "+jumlahPembayaran);
            System.out.println("Masukkan Nominal Uang Anda : ");
            totalPembayaran = input.nextDouble();
            kembalian = totalPembayaran-jumlahPembayaran;
            System.out.println("kembalian Anda Rp." +kembalian);
            System.out.println("-TERIMA KASIH-");
        break;       
        
        default :
            lainnya = "Maaf Anda Salah Memasukkan Kode";
              System.out.println(""+lainnya);
        break;
        }
    }
    
}
