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
public class mahasiswa {
    // atribut
    String NIMMhs;
    String namaMhs;
    String tglLahirMhs;
    String genderMhs;
 
    // konstruktor
    mahasiswa(String NIM, String nama, String tglLahir, String gender){
        this.NIMMhs = NIM;
        this.namaMhs = nama;
        this.tglLahirMhs = tglLahir;
        this.genderMhs = gender;
    }
     
    // method untuk menampilkan object Barang 
    void print(){
        System.out.println("NIM: " + this.NIMMhs);
        System.out.println("Nama: " + this.namaMhs);
        System.out.println("TglLahir: " + this.tglLahirMhs);
        System.out.println("Gender: " + this.genderMhs);
    }
     
}
