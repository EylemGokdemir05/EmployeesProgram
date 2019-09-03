
public class Yazilimci extends Calisan {
	private String diller;

	public Yazilimci(String ad, String soyad, int id,String diller) {
		super(ad, soyad, id);
		this.diller=diller;
	}

	public String getDiller() {
		return diller;
	}

	public void setDiller(String diller) {
		this.diller = diller;
	}
	public void formatat(String isletim_sistemi) {
		System.out.println(getAd()+" "+isletim_sistemi+" iþletim sistemini yüklüyor..");
	}

	@Override
	public void bilgilergoster() {
		super.bilgilergoster();
		System.out.println("Yazýlýmcýnýn bildiði diller:"+diller);
	}
	

}
