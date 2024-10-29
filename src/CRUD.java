public class CRUD extends connection_class {
    public CRUD(String dbname, String user, String pass) {
        super(dbname, user, pass);
    }

    public CRUD() {
        super();
    }

    public void Register(String tableName, String name,String AdmissionNo , String Course,String Password) {


        super.Register(tableName, name, AdmissionNo, Course,Password);
    }


}
