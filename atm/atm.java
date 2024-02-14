

import java.util.Scanner;


/*
Projede atm ve Kullanıcı olacak.
Kullanıcılar sisteme T.C. ve şifre ile giriş yapacak.
Şifre içerisinde doğum tarihi olmayacak.
Kullanıcılar birbirine para transfer yapabilecek.
kullanicilarin Sifre degistirme islemi yapilabilecek
Kullanılması gereken teknikler:
Veritabanı kullanılmayacaktır
Proje sınıflar kullanılarak yapılmalıdır
 */
public class atm{
    public static void main(String[] args) {
    System.out.println("ILAYDA C ONLİNE BANKACILIK");
    System.out.println("Yapmak İstediğiniz İşlemi Seçiniz:");
    while(true){
        System.out.println("1-)KULLANİCİ GİRİSİ 2-)PARA CİKİSİ \\n" + 
                " 3-)Para Girişi 4-)SİFRE DEGİSTİRME 5-)CIKIS \\n");
    Scanner scanner=new Scanner(System.in);
    Kullanici k=new Kullanici("1234567","123e",200);
    int secenek=scanner.nextInt();
    switch (secenek){
        case 1:
        k.kullanicigiris();
        break;
        case 2: k.paraCikis(); break;
        case 3:k.paraGiris(); break;
        case 4:k.sifredegisikligi(); break;
         case 5:System.out.println("CIKIS YAPILIYOR------");
        System.exit(0);
        break;
        default:
        System.out.println("Gecersiz secim.Tekrar sec.");
    } 
    }
    
    }

    }
 


class Kullanici{
    Scanner scanner=new Scanner(System.in);
    private double bakiye;
    private String tc;
    private String sifre;
    public Kullanici(String tc,String sifre,double bakiye){
        this.bakiye=bakiye;
        this.tc=tc;
        this.sifre=sifre;
    }
    public void kullanicigiris(){
        boolean girisBasarili=false;
        while(!girisBasarili){
            System.out.println("sifreyi gir:");
            String girilensifre=scanner.nextLine();
            System.out.println("Doğum yılını gir:");
            String dogumyili=scanner.nextLine();
            System.out.println("tc kimliginizi giriniz");
            String girilentc=scanner.nextLine();
          
     
            if(girilensifre.equals(sifre)&& !dogumyili.equals(girilensifre)&&girilentc.equals(tc)){
             System.out.println("ŞİFRE/TC KONTROL EDİLDİ.ŞİFRENİZ DOĞRUDUR");
             girisBasarili=true;
            }
     else{
         System.out.println("ŞİFRENİZ VEYA TCNİZ YANLIŞTIR LUTFEN TEKRAR DENEYİNİZ.");
     }
     
        }
       

    }
    public double bakiyesorgula(double bakiye){
        System.out.println("BAKİYENİZ: " + bakiye);
        return bakiye;
    }
   public void paraCikis(){
  System.out.println("ANLIK BAKİYENİZ:"+this.bakiye);
    System.out.println("Göndermek istediğiniz miktarı giriniz:");
    int miktar=scanner.nextInt();
    this.bakiye=this.bakiye-miktar;
    System.out.println("Şuanki bakiyeniz:"+this.bakiye);
   }    
   public void paraGiris(){
    System.out.println("ANLIK BAKİYENİZ:"+this.bakiye);
    System.out.println("Eklemek istediginiz para miktarını gir:");
    int miktar=scanner.nextInt();
    this.bakiye=this.bakiye+miktar;
    System.out.println("Şuanki bakiyeniz:"+this.bakiye);
   }
    public String sifredegisikligi(){
System.out.println("Yeni şifreyi giriniz:");
String yeniSifre=scanner.nextLine();
sifre=yeniSifre;
System.out.println("Şifreniz değiltirildi yeni şifreniz:"+this.sifre);
return sifre;
    }
}