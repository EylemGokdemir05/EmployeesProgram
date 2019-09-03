import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("�al��anlar program�na ho�geldiniz!");
		String islemler="��lemler:\n"
				+"1.Yaz�l�mc� ��lemleri\n"
				+"2.Y�netici ��lemleri\n"
				+"��k�� yapmak i�in x'e bas�n.";
		System.out.println(islemler);
		while(true) {
			System.out.print("��lem se�in:");
			String islem=scanner.nextLine();
			if(islem.equals("x")) {
				System.out.println("Programdan ��k�l�yor..");
				break;
			}
			else if(islem.equals("1")) {
				Yazilimci yazilimci=new Yazilimci("Eylem","G�KDEM�R",7,"C,Java");
				String yazilimci_islemleri="1.Format at\n"
						+"2.Bilgileri g�ster\n"
						+"��k�� yapmak i�in x'e bas�n.";
				System.out.println(yazilimci_islemleri);
				while(true) {
					System.out.print("��lem se�in:");
					String y_islemleri=scanner.nextLine();
					if(y_islemleri.equals("x")) {
						System.out.println("Yaz�l�mc� i�lemlerinden ��k�l�yor..");
						break;
					}
					else if(y_islemleri.equals("1")) {
						System.out.print("��letim sistemi:");
						String isletim_sistemi=scanner.nextLine();
						yazilimci.formatat(isletim_sistemi); 
					}
					else if(y_islemleri.equals("2")) {
						yazilimci.bilgilergoster();
					}
					else {
						System.out.println("Ge�ersiz i�lem!");
					}
				}
			}
			else if(islem.equals("2")) {
				Yonetici yonetici=new Yonetici("T�lay","G�KDEM�R TAMER",17,12);
				String yonetici_islemleri="1.Bilgileri g�ster\n"
						+"2.Zam yap\n"
						+"��k�� yapmak i�in x'e bas�n.";
				System.out.println(yonetici_islemleri);
				while(true) {
					System.out.print("��lem se�in:");
					String yon_islemleri=scanner.nextLine();
					if(yon_islemleri.equals("x")) {
						System.out.println("Y�netici i�lemlerinden ��k�l�yor..");
						break;
					}
					else if(yon_islemleri.equals("1")) {
						yonetici.bilgilergoster();
					}
					else if(yon_islemleri.equals("2")) {
						System.out.print("Zam miktar�n� girin:");
						int miktar=scanner.nextInt();
						scanner.nextLine();
						yonetici.zam_yap(miktar);
					}
					else {
						System.out.println("Ge�ersiz i�lem!");
					}
				}
			}
			else {
				System.out.println("Ge�ersiz i�lem!");
			}
		}

	}

}
