/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;

/**
 *
 * @author acer
 */
public class DataMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputDataMahasiswa a = new InputDataMahasiswa();
        
        a.tambahData(new mahasiswa("K01", "Dadang", "1 Januari 1998", "Pria"));
        a.tambahData(new mahasiswa("K02", "Dudung", "2 Februari 1999", "Pria"));
        a.tambahData(new mahasiswa("K03", "Lala", "3 Maret 2000", "Wanita"));
        a.tambahData(new mahasiswa("K04", "Lili", "4 April 2001", "Wanita"));
        
        // menampilkan semua data barang dari array list
        a.tampilData();
 
        // mencari data mahasiswa dengan NIM 'K03'
        a.cariData("K03");
  
        // menghapus mahasiswa dengan 'K02'
        a.hapusData("K02");
 
        // tampilkan data lagi untuk melihat perubahannya
        a.tampilData();
    }
}
    
