import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Çalýþanlar programýna hoþgeldiniz!");
		String islemler="Ýþlemler:\n"
				+"1.Yazýlýmcý Ýþlemleri\n"
				+"2.Yönetici Ýþlemleri\n"
				+"Çýkýþ yapmak için x'e basýn.";
		System.out.println(islemler);
		while(true) {
			System.out.print("Ýþlem seçin:");
			String islem=scanner.nextLine();
			if(islem.equals("x")) {
				System.out.println("Programdan çýkýlýyor..");
				break;
			}
			else if(islem.equals("1")) {
				Yazilimci yazilimci=new Yazilimci("Eylem","GÖKDEMÝR",7,"C,Java");
				String yazilimci_islemleri="1.Format at\n"
						+"2.Bilgileri göster\n"
						+"Çýkýþ yapmak için x'e basýn.";
				System.out.println(yazilimci_islemleri);
				while(true) {
					System.out.print("Ýþlem seçin:");
					String y_islemleri=scanner.nextLine();
					if(y_islemleri.equals("x")) {
						System.out.println("Yazýlýmcý iþlemlerinden çýkýlýyor..");
						break;
					}
					else if(y_islemleri.equals("1")) {
						System.out.print("Ýþletim sistemi:");
						String isletim_sistemi=scanner.nextLine();
						yazilimci.formatat(isletim_sistemi); 
					}
					else if(y_islemleri.equals("2")) {
						yazilimci.bilgilergoster();
					}
					else {
						System.out.println("Geçersiz iþlem!");
					}
				}
			}
			else if(islem.equals("2")) {
				Yonetici yonetici=new Yonetici("Tülay","GÖKDEMÝR TAMER",17,12);
				String yonetici_islemleri="1.Bilgileri göster\n"
						+"2.Zam yap\n"
						+"Çýkýþ yapmak için x'e basýn.";
				System.out.println(yonetici_islemleri);
				while(true) {
					System.out.print("Ýþlem seçin:");
					String yon_islemleri=scanner.nextLine();
					if(yon_islemleri.equals("x")) {
						System.out.println("Yönetici iþlemlerinden çýkýlýyor..");
						break;
					}
					else if(yon_islemleri.equals("1")) {
						yonetici.bilgilergoster();
					}
					else if(yon_islemleri.equals("2")) {
						System.out.print("Zam miktarýný girin:");
						int miktar=scanner.nextInt();
						scanner.nextLine();
						yonetici.zam_yap(miktar);
					}
					else {
						System.out.println("Geçersiz iþlem!");
					}
				}
			}
			else {
				System.out.println("Geçersiz iþlem!");
			}
		}

	}

}
