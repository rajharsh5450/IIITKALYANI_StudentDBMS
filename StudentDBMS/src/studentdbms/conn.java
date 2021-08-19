
package studentdbms;

//Package responsible for all interfaces and classes for sql
import java.sql.*;

public class conn {
    Connection con;
    Statement st;
    public conn()
    {
        if(con== null)
        {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                this.con= (Connection)DriverManager.getConnection("jdbc:mysql://localhost/stdb", "root", "");
                this.st= this.con.createStatement(); 
            }
            catch(Exception e)
            {
                System.out.println(e);
            }   
        }
    }
}
