public class Device {

    private INetwork agArayuzu;
    private IDatabase veriTabani;
    private Itools araclar;

    private final int sogutucuAc=1;
    private final int sogutucuKapat=2;
    private final int sicaklikOlc=3;


    public Device(IDatabase db){
        agArayuzu=new Network();
        araclar=new Tools();
        veriTabani=db;
    }

    public void basla(){
        agArayuzu.Showmesaj("cihaz başlatılıyor");
        agArayuzu.Showmesaj("kullanıcı adı ve şifre giriniz");

        String name="";
        int password=0;

        agArayuzu.Showmesaj("kullanıcı adı giriniz : ");
        //name=isimAl();
        agArayuzu.Showmesaj("parola giriniz : ");
        //password=parolaAl();

        araclar.wait(200);

        if(veriTabani.check(name,password))
            menuGetir();
        else
            agArayuzu.Showmesaj("kullanıcı doğrulanamadı");
    }


    public void menuGetir(){
        System.out.println();
        agArayuzu.Showmesaj("1-Sıcaklık Görüntüle");
        agArayuzu.Showmesaj("2-Soğutucu Aç");
        agArayuzu.Showmesaj("3-Soğutucu Kapat");

        System.out.println();
    }
}
