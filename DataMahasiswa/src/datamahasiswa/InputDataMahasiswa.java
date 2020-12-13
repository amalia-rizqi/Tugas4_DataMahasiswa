/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;

import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class InputDataMahasiswa {
    // atribut
    ArrayList<mahasiswa> dataMahasiswa = new ArrayList<mahasiswa>();
     
    // menambah data baru ke dalam array list
    void tambahData(mahasiswa data){
       this.dataMahasiswa.add(data);
        }
    
    // menghapus data mahasiswa dengan NIM tertentu dari array list
    void hapusData(String NIM){
        this.dataMahasiswa.removeIf(item -> item.NIMMhs == NIM);
    }
     
    // mencari data mahasiswa dengan NIM tertentu dari array list
    void cariData(String NIM){
        // status ditemukan, awalnya false (dianggap tidak ketemu)
        boolean ditemukan = false;
        // nilai awal index
        int index = -1;
        // proses pengecekan kesamaan NIMMHs dg NIM
        for(int i=0; i<this.dataMahasiswa.size(); i++){
            if (this.dataMahasiswa.get(i).NIMMhs == NIM){
            // jika match, maka catat index datanya
            index = i;
            // ubah status ditemukan jadi true
            ditemukan = true;
            }
        }
     
        // jika status ditemukan true, maka tampilkan data mahasiswanya
        // berdasarkan index hasil pencarian    
        if (ditemukan == true){
            this.dataMahasiswa.get(index).print();
        } else {
        // jika tidak ditemukan
        System.out.println("Data mahasiswa tidak ditemukan");
        }
    }
    
     
    // menampilkan seluruh data yang tersimpan dalam array list
    void tampilData(){
        System.out.println("---------------");
        System.out.println("Data Mahasiswa");
        System.out.println("---------------");
        for(mahasiswa item: this.dataMahasiswa){
            item.print();
        }
    }
    
}