import java.sql.*;

public class ConnectDB implements  IDatabase{
    private static ConnectDB instance;

    private ConnectDB(){

    }
    public static ConnectDB getInstance(){
        if(instance==null){
            instance=new ConnectDB();
        }
        return instance;
    }

    @Override
    public boolean check(String name, int pass) {

        try{
            Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/nyat",
                    "postgres","1257");
            if(conn!=null)
                System.out.println("veritabanı  bağlanma işlemi gerçekleşti");
            else
                System.out.println("veritabanı bağlanamadı , HATA");


            String sql= "SELECT * FROM public.\"Smartuser\" WHERE \"Sname\"="+"'"+name+"'"+"AND \"Spassword\"="+"'"+pass+"'";

            Statement obj1 = conn.createStatement();
            ResultSet obj2 = obj1.executeQuery(sql);

            conn.close();

            if(!obj2.next()){
                return false;
            }
            else{
                System.out.println("Kullanıcı bilgileri doğru girilmiştir..!");
                return true;
            }

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
