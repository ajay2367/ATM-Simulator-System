package ASimulatorSystem;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql://root@localhost:3306/accountinfo","root","123456789");    
            s =c.createStatement(); 
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
