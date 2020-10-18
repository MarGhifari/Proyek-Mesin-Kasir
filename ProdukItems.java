package mesinKasir;

public class ProdukItems {   
	private String namaProduk, idProduk;
	private int stokProduk;
	private CharSequence expProduk;
	
	public ProdukItems (String namaProduk, String idProduk, int stokProduk, CharSequence expProduk) {
		this.namaProduk = namaProduk;
		this.idProduk = idProduk;
		this.stokProduk = stokProduk;
		this.expProduk = expProduk;
	}
     
	public void setNamaProduk(String namaProduk){
		this.namaProduk = namaProduk;
	}
    
	public String getNamaProduk(){
        return namaProduk;
    }
    
	public void setIdProduk(String idProduk){
        this.idProduk = idProduk;
    }
    
	public String getIdProduk(){
        return idProduk;
    }
    
	public void setStokProduk(int stokProduk){
        this.stokProduk = stokProduk;
    }
    
	public int getStokProduk(){
        return stokProduk;
    }
    
	public void setExpProduk(CharSequence expProduk){
        this.expProduk = expProduk;
    }
    
	public CharSequence getExpProduk(){
        return expProduk;
    }
}
