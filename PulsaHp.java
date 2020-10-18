package mesinKasir;

public class PulsaHp {
	private String idProvider, provider;
	private int nominalPulsa1,
				nominalPulsa2,
				nominalPulsa3,
    			nominalPulsa4,
    			nominalPulsa5;

	public PulsaHp (String idProvider ,String provider , int nominalPulsa1, int nominalPulsa2, int nominalPulsa3, int nominalPulsa4, int nominalPulsa5) {
		this.idProvider = idProvider;
        this.provider = provider;
		this.nominalPulsa1 = nominalPulsa1;
        this.nominalPulsa2 = nominalPulsa2;
        this.nominalPulsa3 = nominalPulsa3;
        this.nominalPulsa4 = nominalPulsa4;
        this.nominalPulsa5 = nominalPulsa5;
	}
        
	public void setIdProvider(String idProvider){
		this.idProvider = idProvider;
	}
    
	public String getIdProvider(){
		return idProvider;
    }
    
	public void setProvider(String provider){
        this.provider = provider;
    }
    
	public String getProvider(){
        return provider;
    }
    
	public int getNominalPulsa1() {
        return nominalPulsa1;
	}
    
	public int getNominalPulsa2() {
        return nominalPulsa2;
    }
    
	public int getNominalPulsa3() {
        return nominalPulsa3;
	}
    
	public int getNominalPulsa4() {
        return nominalPulsa4;
    }
    
	public int getNominalPulsa5() {
        return nominalPulsa5;
    }
}

