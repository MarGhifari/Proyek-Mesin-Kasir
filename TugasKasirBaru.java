package mesinKasir;
    
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

import mesinKasir.daftarStaff.Manajer;

public class TugasKasirBaru{
	
	// ClearScreen (not work on Eclipse, only work on ANSI escape supported console)
	public static void clearScreen() {
		System.out.println("\033[H\033[2J");   
	    System.out.flush(); 	
	}
	
    public static void searchItem() {
        Scanner scanner = new Scanner(System.in);
            
        // List Produk
		Vector<ProdukItems> produk = new Vector<ProdukItems>();
		produk.add(new ProdukItems("Ayam Goyeng", "101010", 10, "2021-02-11"));
		produk.add(new ProdukItems("Buwong Puyoh Goreng", "202020", 10, "2021-02-11"));
		produk.add(new ProdukItems("Odading Mang Oleh", "303030", 10, "2020-02-11"));
		produk.add(new ProdukItems("Biskuat", "404040", 10, "2021-02-11"));
		produk.add(new ProdukItems("Bakso Supreme", "505050", 10, "2021-02-11"));

        // Bagian scanner keyword produk
		// User input karakter
		System.out.println();
        System.out.println("CARI PRODUK");
		System.out.print("Masukkan kata pencarian: ");
		String keyword = scanner.next();
		int countProd = 1;
		
		// Sistem cek keyword ke array produk
		for(ProdukItems j : produk) {
			if (j.getNamaProduk().toLowerCase().contains(keyword.toLowerCase())) {
				System.out.println();
				System.out.println(	j.getNamaProduk() + 
									"\nID		: " + j.getIdProduk() +
									"\nExpire Date	: " + j.getExpProduk());
				break;
			}
			
			if (!(j.getNamaProduk().toLowerCase().contains(keyword.toLowerCase())) && countProd == produk.size()) {
				System.out.println();
				System.out.println("Maaf, produk tidak ditemukan atau tidak ada");
			}
			countProd++;
		}
		System.out.println();     
    } // Akhir fungsi searchItem

    
    // MAIN PROGRAM
    public static void main(String[] args){
    	
    	//Untuk kembali ke menu awal
    	String ulg = "y"; 
        while (ulg.equals("y")){
        
        	System.out.println("Hello, Welcome to Cashier V0.3");
        	
        	DateTimeFormatter jamFormat = DateTimeFormatter.ofPattern("hh:mm:ss a"); // mem-format semua method LocalTime
        	System.out.println("Waktu sekarang adalah " + LocalTime.now().format(jamFormat));
        	
        	System.out.println();
        	Scanner scanner = new Scanner(System.in);

        	//List Staff
        	Vector<Manajer> staff = new Vector<Manajer>();
    		staff.add(new Manajer("Abdul", "1111", "2001-11-08", "09:00:00", "14:00:00", "1" ));
    		staff.add(new Manajer("Rahman", "2222", "2000-08-26", "09:00:00", "14:00:00", "2" ));
    		staff.add(new Manajer("Ahmad" , "3333", "2003-03-12", "14:00:00", "19:00:00","3"));
    		staff.add(new Manajer("Jovan", "4444", "2006-05-12", "14:00:00", "19:00:00","4"));
    		staff.add(new Manajer("Oleh", "5555", "1990-09-09", "19:00:00", "22:00:00","5"));
    		
    		// List Produk
    		Vector<ProdukItems> produk = new Vector<ProdukItems>();
    		produk.add(new ProdukItems("Ayam Goyeng", "101010", 10, "2021-02-11"));
    		produk.add(new ProdukItems("Buwong Puyoh Goreng", "202020", 10, "2021-02-11"));
    		produk.add(new ProdukItems("Odading Mang Oleh", "303030", 10, "2020-02-11"));
    		produk.add(new ProdukItems("Biskuat", "404040", 10, "2021-02-11"));
    		produk.add(new ProdukItems("Bakso Supreme", "505050", 10, "2021-02-11"));

            //PulsaHp
            Vector<PulsaHp> pulsa= new Vector<PulsaHp>();
            pulsa.add(new PulsaHp("1","Telkomsel",5000,10000,20000,50000,100000));
            pulsa.add(new PulsaHp("2","Indosat",5000,10000,20000,50000,100000));
            pulsa.add(new PulsaHp("3","Axis",5000,10000,20000,50000,100000));
            pulsa.add(new PulsaHp("4","XL",5000,10000,20000,50000,100000));
            pulsa.add(new PulsaHp("5","Tri",5000,10000,20000,50000,100000));

            //Data Olshop
            Vector<OlShop> pembeli = new Vector<OlShop>();
            pembeli.add(new OlShop("12121212","Lazada","Mawar","085298121345",120000));
            pembeli.add(new OlShop("13131313","Shoope","Anton","081395624335",300000));
            pembeli.add(new OlShop("14141414","Tokopedia","Donni","08525812125",230000));
            pembeli.add(new OlShop("15151515","BliBli","Boby","082193568748",100000));
            pembeli.add(new OlShop("16161616","Zalora","Nani","085245161769",230000));

            //Input pilihan menu
            System.out.println(	"Menu : " + 
            					"\n1. Info Staff"  +
							    "\n2. Info Shift Staff" +
							    "\n3. Info Kasir "+
							    "\n4. Info Produk "+
							    "\n5. Cari Produk "+
							    "\n6. Isi Pulsa "+
							    "\n7. Bayar Online Shopping "+
							    "\n========================");
            System.out.print("Masukkan pilihan menu : ");
            int pil = scanner.nextInt();
                
            // Method switch sebagai menu utama
            switch (pil){

//Case 1 Info Staff
            case 1:{ 
            	int count = 1;
			        
                // User input untuk staff
			    System.out.println("INFO STAFF");
			    System.out.print("Masukkan ID Staff : ");
			    String value = scanner.next();
			    System.out.println();
		
			    for (daftarStaff i : staff) {
			    	if (value.equals(i.getIdStaffs())) {

			    		// Mendapatkan data hari ini
			        	LocalDate tglSekarang = LocalDate.now();
				
			        	//Mencari selisih umur 
                        LocalDate Age = LocalDate.parse(i.getBornDates());
		    	
                        // hasil selisih umur
                        Period selisih = Period.between(Age, tglSekarang);

                        // Convert dari parse period ke string (KUNCI!!!)
                        String tanggal = String.format("%d tahun, %d bulan, %d hari", selisih.getYears(), selisih.getMonths(), selisih.getDays());
                        System.out.println(i.getNamaStaffs() + " dengan ID " + i.getIdStaffs() + " berumur " + tanggal + " terverifikasi untuk melayani anda");
                        break;
			    	}

					if (!(value.equals(i.getIdStaffs())) && count == ((Vector<Manajer>) staff).size()) {
						System.out.println("Staff tidak terverifikasi");
					}
					count++;
			    }
                        break;
                } // Akhir dari case 1
                
          
//Case 2 Info Shift Staffs            
            case 2:{ 
            	System.out.println();		
                int count4 = 1;
            	// User input untuk id staff
                System.out.println("INFO SHIFT STAFFS");
                System.out.print("Masukkan Kode Staffs : ");
                String value3 = scanner.next();
                System.out.println();
		
                for (Manajer k : staff) {
                	if (value3.equals(k.getIdStaffs())) {
                		
                		//Menampilkan Nama dan Id Staff
                        System.out.println("Nama Staff = " + k.getNamaStaffs() + "\nId Staff = " + k.getIdStaffs());
				
                        // Memasukkan jam kerja karyawan (String -> time)
						System.out.println("Bekerja dari jam " + LocalTime.parse(k.getShiftStart()).format(jamFormat)  + " sampai dengan jam " + LocalTime.parse(k.getShiftEnd()).format(jamFormat));
						
						// Ambil current time
						LocalTime jamSkrg = LocalTime.now();
						
						// selisihkan shift selesai dengan jam sekarang
						Duration durasi = Duration.between(jamSkrg, LocalTime.parse(k.getShiftEnd()));
						
						// print sisa waktu
						String shift = String.format("Shift selesai dalam %d menit", durasi.toMinutes());
						System.out.println(shift);
						break;
                	}
					if (! (value3.equals(k.getIdStaffs())) && count4 == staff.size()) {
						System.out.println("Staff tidak terverifikasi");
						}
					count4++;
                }
                break;
            } // Akhir dari case 2
			
			
//Case 3 Info Kasir
			case 3:{
				int count5 = 1;
                System.out.println();		
                    // User input untuk id loket
                    System.out.println("INFO KASIR");
                    System.out.print("Masukkan Id Loket(1-5) : ");
                    String value7 = scanner.next();
                    System.out.println();
		
				for (Manajer k : staff) {
					if (value7.equals(k.getLoket())) {
						//Menampilkan Nama dan Id Satff
						System.out.println("Nama Kasir = " + k.getNamaStaffs() + "\nId Staff = " + k.getIdStaffs() + "\nId Kasir = "+k.getLoket());
						
						// Memasukkan jam kerja karyawan (String -> time)
						System.out.println("Bekerja dari jam " + LocalTime.parse(k.getShiftStart()).format(jamFormat)  + " sampai dengan jam " + LocalTime.parse(k.getShiftEnd()).format(jamFormat));
						
						// Ambil current time
						LocalTime jamSkrg = LocalTime.now();
						
						// selisihkan shift selesai dengan jam sekarang
						Duration durasi = Duration.between(jamSkrg, LocalTime.parse(k.getShiftEnd()));
						
						// print sisa waktu
						String shift = String.format("Shift selesai dalam %d menit", durasi.toMinutes());
						System.out.println(shift);
						break;
					}

                    if (! (value7.equals(k.getLoket())) && count5 == staff.size()) {
						System.out.println("Kasir tidak terverifikasi");
					}
						count5++;
                }
					break;
			} //Akhir dari case 3
			
			
//Case 4 Info Produk
            case 4:{
            	System.out.println();		
                
            	// User input untuk makanan
                System.out.println("INFO PRODUK");
                System.out.print("Masukkan Kode Makanan : ");
                String value1 = scanner.next();
                System.out.println();
                int count1 = 1;
		
                for (ProdukItems j : produk) {
                	if (value1.equals(j.getIdProduk())) {
								
                		// Mendapatkan data hari ini
                		LocalDate tglSekarang = LocalDate.now();
				
                		//Mencari selisih tanggal
                        LocalDate expired = LocalDate.parse(j.getExpProduk());

                        // hasil selisih tanggal
                        Period expiredate = Period.between(tglSekarang, expired);

                        // Convert dari parse period ke string (KUNCI!!!)
                        String tanggal = String.format("%d bulan dan %d hari", expiredate.getMonths(),expiredate.getDays());			
		    	
                        // memberi peringatan batas konsumsi produk
                        if (tglSekarang.compareTo(expired) < 0) {
				    		System.out.println(j.getNamaProduk() + " dengan ID " + j.getIdProduk() + " memiliki masa expired " + tanggal);
				    	} else if (tglSekarang.compareTo(expired) == 0) {
				    		System.out.println("Produk " + j.getNamaProduk() + " sudah memasuki batas hari untuk dikonsumsi");
				    	} else {
				    		System.out.println("Produk " + j.getNamaProduk() + " sudah kadaluarsa");
				    	}
                        break;
                	}
						
                	if (!(value1.equals(j.getIdProduk())) && count1 == produk.size()) {
							System.out.println("Produk tidak terdaftar");
                	} 
                	count1++;
                }
                break;
                } // Akhir dari case 3

// Case 5 Search Item    
            case 5 :{ 
            	searchItem();
                break;
            } // Akhir dari case 4

//Case 6 Isi Pulsa
            case 6 :{
            	System.out.println();		
                
            	// User input untuk Provider
                System.out.println("ISI PULSA");
                System.out.print(	"Pilihan Provider : " + 
                           			"\n1. Telkomsel"  +
                           			"\n2. Indosat"+
                           			"\n3. Axis"+
                           			"\n4. XL"+
                           			"\n5. Tri"+
                           		"\n========================\n");
                System.out.print("Masukkan Kode Provider : ");
                String value2 = scanner.next();
                System.out.println();
                
                int count2 = 1;
                
                for (PulsaHp m : pulsa){
                	if (value2.equals(m.getIdProvider())){
                		
                		// User input untuk Nominal
                        System.out.print("Masukkan Nominal : ");
                        int value4 = scanner.nextInt();
                        System.out.println();
                        
                        //Perhitungan total bayar
                        int total = value4 + 2000;
                        
                        // User input untuk NomorHp
                        System.out.print("Masukkan Nomor : ");
                        String value5 = scanner.next();
                        System.out.println();
                        System.out.print("========================" + 
                        					"\nProvider     = " + m.getProvider() + 
                        					"\nNominal      = " + value4 +
                        					"\nNomor        = " + value5 +
                        					"\nTotal Bayar  = " + total +
                        					"\nIsi Pulsa Berhasil" + 
                        				"\n========================\n");
						break;
                	}
					if (!(value2.equals(m.getIdProvider())) && count2 == pulsa.size()) {
						System.out.println("Provider tidak terdaftar");
					}
                	count2++;
                }
            break;
            }  


// Case 7 Bayar Online Shopping 
            case 7 :{ 
            	System.out.println();		
                
            	// User input untuk kode bayar
                System.out.println("BAYAR ONLINE SHOPPING");
                System.out.print("Masukkan Kode Bayar : ");
                String value6 = scanner.next();
                System.out.println();
                
                int count3 = 1;
		
                for (OlShop n : pembeli){
	                if (value6.equals(n.getKodeBayar())){
	                	System.out.print("========================" + 
		                					"\nNama         = " + n.getNamaOlShop() + 
							                "\nNomor Hp     = " + n.getNoHp() +
							                "\nTotal Bayar  = " + n.getTotalHarga() + 
		                				"\n========================\n");
						break;
	                }
					if (!(value6.equals(n.getKodeBayar())) && count3 == pembeli.size()) {
						System.out.println("Kode Bayar Salah");
					}
                        count3++;
                }
                break;
            } // Akhir dari case 6


            //jika inputan tidak ada di dalam menu    
            default :
            	System.out.print("Menu Tidak Tersedia ");
            }

                System.out.println("=====================================");
                System.out.print("Kembali ke menu awal (y/t)? ");
                ulg = scanner.next();
                clearScreen();
        }

        System.out.println("Terima Kasih Telah Berbelanja");
    }
}
