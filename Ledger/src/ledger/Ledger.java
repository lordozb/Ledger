/**
 * THIS CLASS CONTAINS ALL THE NECESSRY FUNCTIONS TO EXECUTE SQL QUERIES.
 */
package ledger;
import java.sql.*;


public class Ledger  {
   public Connection c = null;
   public Statement stmt = null;
   
   private String name_db = "";
   private String tm_db = "";
   private String item_db = "";
   private int quantity_db = 0;
   private int price_db = 0;
   
    
    // Connecting to the database.
    public void connectDb(){        
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:Ledger.db");
            
        } 
        catch ( ClassNotFoundException | SQLException e ){        
        }    
    }
    
    // Query
    public void insertToDb(String n, String t, String i, int q, int p){
        name_db = n;
        tm_db = t;
        item_db = i;
        quantity_db = q;
        price_db = p;
        
        try{
            connectDb();
            stmt = c.createStatement();
            String query = "INSERT INTO ledger_table (Name, Trade Mark, Item, Quantity, Price) VALUES (name_db, tm_db, item_db, quantity_db, price_db)";
            stmt.executeUpdate(query);            
            stmt.close();
            c.commit();
            c.close();           
            
        }
        catch(Exception e){            
        }             
    }
    
    public void searchName(String n){
        name_db = n;
        try{
            connectDb();
            stmt = c.createStatement();
            String query = "SELECT * FROM ledger_table WHERE Name = name_db";
            stmt.executeUpdate(query);
            stmt.close();
            c.commit();
            c.close();
        }
        catch(Exception e){
            
        }
    }
    
    public void searchTM(String t){
        tm_db = t;
        try{
            connectDb();
            stmt = c.createStatement();
            String query = "SELECT * FROM ledger_table WHERE Trade Mark = tm_db";
            stmt.executeUpdate(query);
            stmt.close();
            c.commit();
            c.close();
        }
        catch(Exception e){
            
        }
    }
    
    public void searchItem(String i){
        item_db = i;
        try{
            connectDb();
            stmt = c.createStatement();
            String query = "SELECT * FROM ledger_table WHERE Item = item_db";
            stmt.executeUpdate(query);
            stmt.close();
            c.commit();
            c.close();
        }
        catch(Exception e){
            
        }
    }
     
}

