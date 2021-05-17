import java.util.Scanner;
import java.util.Random;


public class Network implements  INetwork {
    private Scanner read=new Scanner(System.in);
    private ISmartsystem merkeziIslemBirimi;

    public Network(){
        merkeziIslemBirimi=new Smartsystem();
    }

    @Override
    public void SicaklikGonder() {
        merkeziIslemBirimi.sendtoDetector();
    }

    @Override
    public void Showmesaj(String mesaj) {
        System.out.println(mesaj);
    }
}
