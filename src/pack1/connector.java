/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack1;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author azjed
 */
public class connector {
    public static Connection getConnection() throws Exception
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("hii");
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/edulink","root","kishan@20");        
        System.out.println(cn);
        return cn;
            
        }catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
        
    }
    
}
