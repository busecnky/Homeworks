package hw.november17;

public class HaberKanali extends Kanal{
	
	private String haberTuru;

	

	public HaberKanali(String kanalAdi, int kanalNo, String haberTuru) {
		super(kanalAdi, kanalNo);
		this.setHaberTuru(haberTuru);
	}




	public String getHaberTuru() {
		return haberTuru;
	}
	public void setHaberTuru(String haberTuru) {
		this.haberTuru = haberTuru;
	}



	
	
	
	
	
	
	
	
	
	
	
}
