
package hitung;
public class matematika {
    //membuat variable
    private double bill, bill2;
    
    //membuat konstruktor
    public matematika(double bill, double bill2){
        this.bill = bill;
        this.bill2 = bill2;
    }
    
    public double setPenjumlahan(){
        return bill + bill2;
    }
    
    public double setPengurangan(){
        return bill - bill2;
    }
    
    public double setPerkalian(){
        return bill * bill2;
    }
    
    public double setPembagian(){
        return bill / bill2;
    }
}
