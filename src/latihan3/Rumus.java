/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;
// NAMA : MUHAMMAD ROHID
//NPM : 2310010347
// KELAS : 4C Reguler Banjarbaru
public class Rumus {
    int sisi, panjang, lebar, hasil;
    
    public Rumus(){
        sisi = 0;
        panjang = 0;
        lebar = 0;
        hasil = 0;
    }
    
    public void hitungLuasPersegi(){
        hasil = sisi * sisi; 
    }
    
    public void hitungLuasPersegiPanjang(){
        hasil = panjang * lebar;
        
        
    }
    public int getHasil(){
            return hasil;
        }
}
