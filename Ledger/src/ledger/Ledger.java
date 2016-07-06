/**
 * THIS CLASS CONTAINS ALL THE NECESSRY FUNCTIONS TO EXECUTE SQL QUERIES.
 */
package ledger;
import java.sql.*;


public class Ledger  {
   public Connection c = null;
   public PreparedStatement statement = null;
   
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
    public void insertToDb(String name_entry, String tmark_entry, String item_entry, int quantity_entry, int price_entry){
        name_db = name_entry;
        tm_db = tmark_entry;
        item_db = item_entry;
        quantity_db = quantity_entry;
        price_db = price_entry;
        
        try{
            connectDb();            
            String query = "INSERT INTO ledger_table (Name, Trade_Mark, Item, Quantity, Price) VALUES (?, ?, ?, ?, ?)";
            statement = c.prepareStatement(query);
            statement.setString(1, name_db);
            statement.setString(2, tm_db);
            statement.setString(3, item_db);
            statement.setInt(4, quantity_db);
            statement.setInt(5, price_db);
            statement.executeUpdate();            
            
            c.commit();
            c.close();           
            
        }
        catch(Exception e){            
        }             
    }
    
    public void searchName(String name_entry){
        name_db = name_entry;
        try{
            connectDb();
            
            String query = "SELECT * FROM ledger_table WHERE Name = ?";
            statement = c.prepareStatement(query);
            statement.setString(1, name_db);
            statement.executeQuery();
            
            c.commit();
            c.close();
        }
        catch(Exception e){
            
        }
    }
    
    public void searchTM(String tmark_entry){
        tm_db = tmark_entry;
        try{
            connectDb();
            
            String query = "SELECT * FROM ledger_table WHERE [Trade Mark] = ?";
            statement = c.prepareStatement(query);
            statement.setString(1, tm_db);
            statement.executeQuery();
            
            c.commit();
            c.close();
        }
        catch(Exception e){
            
        }
    }
    
    public void searchItem(String item_entry){
        item_db = item_entry;
        try{
            connectDb();
            
            String query = "SELECT * FROM ledger_table WHERE Item = ?";
            statement = c.prepareStatement(query);
            statement.setString(1, item_db);
            statement.executeQuery();
            
            c.commit();
            c.close();
        }
        catch(Exception e){
            
        }
    }
     
}

