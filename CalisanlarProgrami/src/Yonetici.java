
public class Yonetici extends Calisan {
	private int sorumlu_kisi;

	public Yonetici(String ad, String soyad, int id,int sorumlu_kisi) {
		super(ad, soyad, id);
		this.sorumlu_kisi=sorumlu_kisi;
	}

	public int getSorumlu_kisi() {
		return sorumlu_kisi;
	}

	public void setSorumlu_kisi(int sorumlu_kisi) {
		this.sorumlu_kisi = sorumlu_kisi;
	}

	@Override
	public void bilgilergoster() {
		super.bilgilergoster();
		System.out.println("Yöneticinin sorumlu olduðu kiþi sayýsý:"+sorumlu_kisi);
	}
	public void zam_yap(int miktar) {
		System.out.println(getAd()+" çalýþanlara "+miktar+" tl zam yapýyor..");
	}

}
