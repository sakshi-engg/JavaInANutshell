package Java8_Features;

interface DB_Driver{// SUN Microsystems

    default void getDriverClass() {
    
    System.out.println("sun.jdbc.odbc.JdbcOdbcDriver");
    
    }
    
    default void getDriverURL() {
    
    System.out.println("jdbc:odbc:nag");
    
    }
    
    }
    
    class OracleDriver implements DB_Driver{// Oracle
    
    public void getDriverClass() {
    
    System.out.println("oracle.jdbc.OracleDriver");
    
    }
    
    public void getDriverURL() {
    
    System.out.println("jdbc:oracle:thin:@localhost:1521:xe");
    
    }
    
    }
    
    class MySQLDriver implements DB_Driver{// MySQL
    
    public void getDriverClass() {
    
    System.out.println("com.mysql.jdbc.Driver");
    
    }
    
    public void getDriverURL() {
    
    System.out.println("jdbc:mysql://localhost:3306/durgadb");
    
    }
    
    }
    
    
    
    class MSAccessDriver implements DB_Driver{// MS Access
    
    }public class Default {
    
    public static void main(String[] args) {
    
    DB_Driver oracleDriver = new OracleDriver();
    
    oracleDriver.getDriverClass();
    
    oracleDriver.getDriverURL();
    
    System.out.println();
    
    DB_Driver mysqlDriver = new MySQLDriver();
    
    mysqlDriver.getDriverClass();
    
    mysqlDriver.getDriverURL();
    
    System.out.println();
    
    DB_Driver msaccessDriver = new MSAccessDriver();
    
    msaccessDriver.getDriverClass();
    
    msaccessDriver.getDriverURL();
    
    }
    
    }