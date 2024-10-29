import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class connection_class {
    protected Connection connection;
    protected String dbname;
    protected String user;
    protected String pass;


    public connection_class(String dbname, String user, String pass) {
        this.dbname = dbname;
        this.user = user;
        this.pass = pass;
        this.connection = connect_to_db(dbname, user, pass);
    }


    public connection_class() {
        this("databasename", "postgres", "password");
    }

    protected Connection connect_to_db(String dbname, String user, String pass) {
        Connection con_obj = null;
        String url = "jdbc:postgresql://localhost:5432/";

        try {
            con_obj = DriverManager.getConnection(url + dbname, user, pass);
            if(con_obj != null) {
                System.out.println("Connection established successfully!");
            } else {
                System.out.println("Connection failed!!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con_obj;
    }
    protected void Register(String tName, String name, String AdmissionNo,String Course,String Password) {
        Statement stmt;
        try {
            String query = String.format("insert into %s(name,\"AdmissionNo\",\"Course\",\"Password\") values('%s','%s','%s','%s');",
                tName, name, AdmissionNo, Course,Password);
            stmt = connection.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Inserted successfully!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
