import javax.sound.midi.Soundbank;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JVMDemo {

    public Connection getConnection(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","123123");
            //System.out.println(conn.toString());
            return conn;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private String name;

    private static int num;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println(name);
    }
    public static void main(String[] args){
        new JVMDemo().getConnection();
        //System.out.println("ok");
    }
}
