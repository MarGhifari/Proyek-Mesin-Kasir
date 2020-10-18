package mesinKasir;

public class OlShop {
	private String kodeBayar, namaOlShop, noHp, namaPembeli;
    private int totalHarga;

    public OlShop(String kodeBayar, String namaOlshop, String namaPembeli, String noHp, int totalHarga) {
    	this.kodeBayar = kodeBayar;
		this.namaOlShop = namaOlshop;
		this.namaPembeli = namaPembeli;
        this.noHp = noHp;
		this.totalHarga = totalHarga;
    }
    
    public void setKodeBayar(String kodeBayar){
    	this.kodeBayar = kodeBayar;
    }
    
    public String getKodeBayar() {
    	return kodeBayar;
    }
    
    public void setNamaOlShop(String kodeBayar){
    	//this.namaOlShop = namaOlShop;
    }
       
    public String getNamaOlShop() {
    	return namaOlShop;
    }
    
    public void setNamaPembeli(String namaPembeli) {
    	this.namaPembeli = namaPembeli;
    }
    
    public String getNamaPembeli() {
    	return namaPembeli;
    }
    
    public void setNoHp(String kodeBayar){
        //this.noHp = noHp;
    }
    
    public String getNoHp() {
        return noHp;
    }
    
    public void setTotalHarga(int totalHarga){
        this.totalHarga = totalHarga;
    }
    
    public int getTotalHarga() {
        return totalHarga;
    }
}
