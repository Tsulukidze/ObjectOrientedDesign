public class Work implements  Iwork{
    private static Work instance;
    private ICooler obj;

    public Work(ICooler inst){
        obj = inst;
    }

    @Override
    public void openCooler() {
        obj.Dowork();
    }

    @Override
    public void closeCooler() {
        obj.Dowork();
    }
}
