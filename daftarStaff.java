package mesinKasir;
        
public class daftarStaff {    
	private String namaStaffs, idStaffs;
	private CharSequence bornDates;
    
    public daftarStaff (String namaStaffs, String idStaffs, CharSequence bornDates) {
    	this.namaStaffs = namaStaffs;
		this.idStaffs = idStaffs;
		this.bornDates = bornDates;
	}
        
    public void setNamaStaffs(String namaStaffs){
    	this.namaStaffs = namaStaffs;
    }
    
    public String getNamaStaffs(){
    	return namaStaffs;
    }
    
    public void setIdStaffs(String idStaffs){
    	this.idStaffs = idStaffs;
    }
    
    public String getIdStaffs(){
        return idStaffs;
    }
    
    public void setBornDates(CharSequence bornDates){
        this.bornDates = bornDates;
    }
    
    public CharSequence getBornDates(){
        return bornDates;
    }

static class Manajer extends daftarStaff{
	private String shiftStart;
	private String shiftEnd;
	private String loket;

	public Manajer (String namaStaffs, String idStaffs, CharSequence bornDates, String shiftStart, String shiftEnd, String loket){
		super (namaStaffs, idStaffs, bornDates);
        this.shiftStart = shiftStart;
        this.shiftEnd = shiftEnd;
        this.loket = loket;
    }
            
	public String getShiftStart() {
		return shiftStart;
	}
    
	public void setShiftStart(String shiftStart) {
        this.shiftStart = shiftStart;
	}
    
	public String getShiftEnd() {
        return shiftEnd;
    }
    
	public void setShiftEnd(String shiftEnd) {
        this.shiftEnd = shiftEnd;
    }
	
    public void setLoket(String loket){
        this.loket = loket;
    }

    public String getLoket(){
        return loket;
    }
}
}
