
package admin;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Admin {
    private static final String admin_table = "create table admin ( "
      + "   id VARCHAR(20) PRIMARY KEY, password VARCHAR(50) )";
       private static final String customer_table = "create table customer ( "
      + "   id  VARCHAR(20) PRIMARY KEY, fName VARCHAR(50), lName VARCHAR(50), "
      + "   address VARCHAR(20), postcode VARCHAR(50), password VARCHAR(50) )";
         private static final String rent_table = "create table rent ( "
      + "   carname VARCHAR(50) PRIMARY KEY, rentdate VARCHAR(20), returndate VARCHAR(20), "
      + "   id VARCHAR(20) references customer(id), status VARCHAR(20) )";
     

    public static void main(String[] args) {
       connectionDB.DBconnection();
       Connection conn = null;
       Statement stmt = null;
    
      conn =  connectionDB.DBconnection();
           try {
               stmt = conn.createStatement();
           } catch (SQLException ex) {
               Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
           }
           try {
               stmt.executeUpdate(admin_table);
               stmt.executeUpdate(customer_table);
               stmt.executeUpdate(rent_table);

           } catch (SQLException ex) {
               Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
           }
           try {
               stmt.executeUpdate("insert into admin(id, password) values('A001', '1141')");
           } catch (SQLException ex) {
               Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
           }
           try {
   stmt.executeUpdate("insert into customer(id, fName,lName,address,postcode,password) values('C001', 'Ahmed', 'Sheikh', 'bukit beruang', 'P001', '5522')");
   stmt.executeUpdate("insert into customer(id, fName,lName,address,postcode,password) values('C002', 'Wassil', 'Yassin', 'bukit beruang', 'P002', '5533')");
   stmt.executeUpdate("insert into customer(id, fName,lName,address,postcode,password) values('C003', 'Mohammed', 'Mulla', 'bukit beruang', 'P003', '5544')");
   stmt.executeUpdate("insert into customer(id, fName,lName,address,postcode,password) values('C004', 'Ridwan', 'Ahmed', 'bukit beruang', 'P004', '5555')");
   stmt.executeUpdate("insert into customer(id, fName,lName,address,postcode,password) values('C005', 'Ahmed', 'Abbas', 'bukit beruang', 'P005', '5566')");
           } catch (SQLException ex) {
               Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
           }
            try {
   stmt.executeUpdate("insert into rent(carname, rentdate,returndate,id,status) values('Wiera', '1/6/2016', '1/6/2016', 'C001', 'RENTED')");
   stmt.executeUpdate("insert into rent(carname, rentdate,returndate,id,status) values('Saga', '', '', '', 'available')");
   stmt.executeUpdate("insert into rent(carname, rentdate,returndate,id,status) values('Myvi', '', '', '', 'available')");
   stmt.executeUpdate("insert into rent(carname, rentdate,returndate,id,status) values('Proton', '', '', '', 'available')");
   stmt.executeUpdate("insert into rent(carname, rentdate,returndate,id,status) values('Alza', '6/6/2016', '8/6/2016', 'C005', 'RENTED')");
           } catch (SQLException ex) {
               Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
           }
      System.out.println("CreateEmployeeTableMySQL: main(): table created.");
   
    }
  }
    
    

