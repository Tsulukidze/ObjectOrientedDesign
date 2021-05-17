import java.util.Random;

public class Detector implements IDetector{
    private int temperature;
    private Random random=new Random();
    private ICooler task;

    public Detector(){

    }

    @Override
    public void readTemperature() {
        temperature=Math.abs(random.nextInt()%100);
        task.Dowork();
        System.out.println("sicaklık : "+temperature+" derece");
    }

}
