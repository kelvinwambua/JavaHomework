

import java.sql.Connection;
import java.sql.DriverManager;

public class connection_class {
    public static void main(String[] args) {

        Connection con=connect_to_db("databasename","postgres","password");

    }
    public static Connection connect_to_db(String dbname, String user, String pass)
    {
        Connection con_obj=null;
        String url="jdbc:postgresql://localhost:5432/";

        try
        {
            con_obj= DriverManager.getConnection(url+dbname,user,pass);
            if(con_obj!=null)
            {
                System.out.println("Connection established successfully !");
            }
            else
            {
                System.out.println("Connection failed !!");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return con_obj;
    }
}
