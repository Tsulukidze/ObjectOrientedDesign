public class Tools implements Itools{
    @Override
    public void wait(int time) {
        try {
            Thread.sleep(time);
        }catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
}
