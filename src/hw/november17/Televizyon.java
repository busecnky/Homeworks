package hw.november17;

import java.util.ArrayList;
import java.util.Scanner;

public class Televizyon {
	
	static Scanner scanner = new Scanner(System.in);

	private String marka;
	private String boyut;
	private ArrayList<Kanal> kanallar;
	private int tvSes;
	private boolean tvKuruluMu;
	private boolean tvAcikMi;
	private int aktifKanal;
	private String[] turler;

	
	

	

	public Televizyon() {
		super();
		this.tvKuruluMu = false;
		this.tvAcikMi = false;
		this.tvSes = 20;
		this.aktifKanal = 1;
		kanallar = new ArrayList<Kanal>();
		
		
	}
	

	public void kanallariOlustur() {
		MuzikKanali kanal1 = new MuzikKanali("BuseMuzik", 1, "Rock");
		MuzikKanali kanal2 = new MuzikKanali("MelihMuzik", 2, "Arabesk");
		HaberKanali kanal3 = new HaberKanali("MertHaber", 3, "Borsa");
		HaberKanali kanal4 = new HaberKanali("AliHaber", 4, "Magazin");
		System.out.println("KANAL LİSTESİ");
		kanallar.add(kanal1);
		kanallar.add(kanal2);
		kanallar.add(kanal3);
		kanallar.add(kanal4);
		for(Kanal kanal : kanallar) {
		System.out.println(kanal.getKanalAdi());
		
		String[] turler = {kanal1.getmuzikTuru(), kanal2.getmuzikTuru(), kanal3.getHaberTuru(),  kanal4.getHaberTuru()};
		this.turler = turler;
		}
	}
	
	
	
	public void tvKur() {
		if(tvKuruluMu == false) {
			System.out.println("Lütfen TV markasını giriniz.");
		String marka = scanner.nextLine();
		System.out.println("Lütfen TV boyutunu giriniz.");
		String boyut = scanner.nextLine();
		
		System.out.println(marka + " markalı " + boyut + " boyutunda TV'niz kurulmuştur.");
		kanallariOlustur();
		this.tvKuruluMu = true;
		}
		else {
			System.out.println("Televizyon zaten kuruldu.");
		}
	}
	
	

	public void tvAc() {
		if (tvKuruluMu==true && tvAcikMi==false) {
			tvAcikMi = true;
			System.out.println("TV'yi açtınız");
		}else if (tvKuruluMu==true && tvAcikMi==true) {
			System.out.println("TV zaten açık.");
		}else if(tvKuruluMu==false) {
			System.out.println("Önce TV'nizi kurmanız gerekiyor");
		}
	}

	public void sesiniAc() {
		int maxSes = 40;
		if (tvKuruluMu==true && tvAcikMi==true && tvSes != maxSes) {
			setTvSes(getTvSes()+2);
			int guncelSes = getTvSes();
			System.out.println("Ses: " + guncelSes);
			
		}else if (tvKuruluMu==true && tvAcikMi==false) {
			System.out.println("TV nizi açmanız gerekiyor.");
		}else if(tvKuruluMu==false) {
			System.out.println("Önce TV'nizi kurmanız gerekiyor");
		}else if (tvSes == maxSes) {
			System.out.println("Ses maximumda. Ses: " + getTvSes());
		}
	}
		
	public void sesiniKis() {
		int minSes = 0;
		if (tvKuruluMu==true && tvAcikMi==true && tvSes != minSes) {
			setTvSes(getTvSes()-2);
			int guncelSes = getTvSes();
			System.out.println("Ses: " + guncelSes);
			
		}else if (tvKuruluMu==true && tvAcikMi==false) {
			System.out.println("TV nizi açmanız gerekiyor.");
		}else if(tvKuruluMu==false) {
			System.out.println("Önce TV'nizi kurmanız gerekiyor");
		}else if (tvSes == minSes) {
			System.out.println("Ses minimumda. Ses: " + getTvSes());
		}
		
	}

	public void kanalDegistir() {
		if (tvKuruluMu==true && tvAcikMi==true) {
			System.out.println("Kanal numarası giriniz.");
			int kanalSecimi = scanner.nextInt();
			for(Kanal kanal : kanallar) {
				if(kanalSecimi <= kanallar.size()) {
					if(kanal.getKanalNo() == kanalSecimi && kanal.getKanalNo() != aktifKanal) {
						System.out.println("Kanal No: " + kanal.getKanalNo() + " Kanal Bilgisi: " + kanal.getKanalAdi());
						aktifKanal = kanal.getKanalNo();
						break;
					}else if(kanal.getKanalNo() == kanalSecimi && kanal.getKanalNo() == aktifKanal) {
						System.out.println("Zaten " + aktifKanal + " nolu kanaldasınız.");
						break;
					}
				}else {
					System.out.println("Kanallar " + kanallar.size() + " adettir. Lütfen bu kanallardan seçiniz.");
					break;
				} 
			}	
		}
		else if (tvKuruluMu==true && tvAcikMi==false) {
			System.out.println("TV nizi açmanız gerekiyor.");
		}else if(tvKuruluMu==false) {
			System.out.println("Önce TV'nizi kurmanız gerekiyor");
		}
		
	}

	
	public void kanalArttır() {
		int maxKanal = kanallar.size();
		if (tvKuruluMu==true && tvAcikMi==true && aktifKanal != maxKanal) {
			aktifKanal++;
			System.out.println("Kanal No: " + aktifKanal + " Kanal İsmi: " + kanallar.get(aktifKanal-1).getKanalAdi());
			
			
		}else if (tvKuruluMu==true && tvAcikMi==false) {
			System.out.println("TV nizi açmanız gerekiyor.");
		}else if(tvKuruluMu==false) {
			System.out.println("Önce TV'nizi kurmanız gerekiyor");
		}else if (aktifKanal == maxKanal) {
			System.out.println("Maximum kanaldasınız. Kanal No: " + (aktifKanal));
		}
	}


	public void kanalAzalt() {
		int minKanal =1;
		if (tvKuruluMu==true && tvAcikMi==true && aktifKanal != minKanal) {
			aktifKanal--;
			System.out.println("Kanal No: " + aktifKanal + " Kanal İsmi: " + kanallar.get(aktifKanal-1).getKanalAdi());
			
		}else if (tvKuruluMu==true && tvAcikMi==false) {
			System.out.println("TV nizi açmanız gerekiyor.");
		}else if(tvKuruluMu==false) {
			System.out.println("Önce TV'nizi kurmanız gerekiyor");
		}else if (aktifKanal == minKanal) {
			System.out.println("Minimum kanaldasınız. Kanal No: " + aktifKanal);
		}
		
	}

	
	
	
	
	public void kanalBilgisiGoster() {
		if (tvKuruluMu==true && tvAcikMi==true) {
		for(int i = 0; i < kanallar.size() ; i++) {
			if(aktifKanal == kanallar.get(i).getKanalNo()) {
				System.out.println("Kanal Adı : " + kanallar.get(i).getKanalAdi() 
									+ " Kanal No: " + kanallar.get(i).getKanalNo()
									+ " Kanal Türü: " + turler[i]);
					}
				}
			}
		else if (tvKuruluMu==true && tvAcikMi==false) {
			System.out.println("TV nizi açmanız gerekiyor.");
		}else if(tvKuruluMu==false) {
		System.out.println("Önce TV'nizi kurmanız gerekiyor");
		}
	}
	

	
		
		

	public void tvKapat() {
		if (tvAcikMi==true && tvKuruluMu==true) {
			tvAcikMi = false;
			System.out.println("TV'yi kapattınız");
			
		}else if (tvKuruluMu==false) {
			System.out.println("TV'yi kurmadan kapatamazsınız.");
		}else
			System.out.println("TV'yi açmadan kapatamazsınız.");
		
	}
	
	
	

	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getBoyut() {
		return boyut;
	}
	public void setBoyut(String boyut) {
		this.boyut = boyut;
	}
	public ArrayList<Kanal> getKanallar() {
		return kanallar;
	}
	public void setKanallar(ArrayList<Kanal> kanallar) {
		this.kanallar = kanallar;
	}

	public int getTvSes() {
		return tvSes;
	}

	public void setTvSes(int tvSes) {
		this.tvSes = tvSes;
	}


	public int getAktifKanal() {
		return aktifKanal;
	}


	public void setAktifKanal(int aktifKanal) {
		this.aktifKanal = aktifKanal;
	}


	

	

	
	
}
