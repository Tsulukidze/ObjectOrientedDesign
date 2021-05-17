public class Smartsystem implements ISmartsystem{
    private Iwork eyleyici;
    private IDetector sicaklikAlgilayici;
    private ICooler islem;
    public Smartsystem() {
        sicaklikAlgilayici=new Detector();
    }

    @Override
    public void sendtoWork(int sec) {
        if(sec==1) {
            islem=new OpenCooler();
            eyleyici=new Work(islem);
            eyleyici.openCooler();

        }
        if(sec==2) {
            islem=new CloseCooler();
            eyleyici=new Work(islem);
            eyleyici.closeCooler();

        }
    }

    @Override
    public void sendtoDetector() {
        sicaklikAlgilayici.readTemperature();
    }
}
