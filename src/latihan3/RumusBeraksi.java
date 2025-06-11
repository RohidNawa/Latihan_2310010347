
package latihan3;

public class RumusBeraksi {
    public static void main(String[] args) {
        Rumus hitung = new Rumus();
        
        hitung.sisi = 5;
        hitung.panjang = 4;
        hitung.lebar= 6;
        
        hitung.hitungLuasPersegi();
        System.out.println("Luas Persegi : " + hitung.getHasil());
        
        hitung.hitungLuasPersegiPanjang();
        System.out.println("Luas Persegi panjang : " + hitung.getHasil());
    }
}
