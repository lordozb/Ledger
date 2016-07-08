/**
 * THIS CLASS CONTAINS ALL THE NECESSRY FUNCTIONS TO EXECUTE SQL QUERIES.
 */
package ledger;
import java.sql.*;
import javax.swing.JOptionPane;


public class Ledger  {
   public Connection c = null;
   public PreparedStatement statement = null;
   
   private String name_db = "";
   private String tm_db = "";
   private String item_db = "";
   private int quantity_db = 0;
   private int price_db = 0;
   int ID = 0;
   
    
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
    /**
     * THIS METHOD IS USED TO GET EVERYTHING FROM THE DATABASE AND STORE IT IN THE ARRAY.
     * DUE TO MY ZERO KNOWLEDGE OF GENERICS I HAVE USED A VERBOSE APPROACH TO FETCH ALL THE DATA.
     * FIRST I GO TO THE LAST ROW AND GET ITS COUNT THEN I ALLOCATE ENOUGH MEMORY TO STRING OBJECTS
     * AND THEN GO BACK TO BEFOREFIRST ROW AND START ITERATING AND FILLING UP THE VALUES. 
     * @return 
     */
    public String[][] getAll(){
        
        String[][] data = null;
        int i = 0;
        try{
            connectDb();
            String query = "SELECT * FROM ledger_table";
            statement = c.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                i++;
            }
            
            rs = statement.executeQuery();
            data = new String[i][6];
            int j = 0;          
            while(rs.next()){                
                    
                    data[j][0] = Integer.toString(rs.getInt("ID"));
                    data[j][1] = rs.getString("Name");
                    data[j][2] = rs.getString("Trade_Mark");
                    data[j][3] = rs.getString("Item");
                    data[j][4] = Integer.toString(rs.getInt("Quantity"));
                    data[j][5] = Integer.toString(rs.getInt("Price"));
                    j++;              
                            
            }
            c.close();
            
        }
        catch(Exception e){            
        }
        return data;
    }
    
    
    public String[][] searchName(String name_entry){
        name_db = name_entry;
        String[][] data = null;
        int i = 0;
        try{
            connectDb();
            
            String query = "SELECT * FROM ledger_table WHERE Name = ?";
            statement = c.prepareStatement(query);
            statement.setString(1, name_db);
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                i++;
            }
            
            rs = statement.executeQuery();
            data = new String[i][6];
            int j = 0;          
            while(rs.next()){                
                    
                    data[j][0] = Integer.toString(rs.getInt("ID"));
                    data[j][1] = rs.getString("Name");
                    data[j][2] = rs.getString("Trade_Mark");
                    data[j][3] = rs.getString("Item");
                    data[j][4] = Integer.toString(rs.getInt("Quantity"));
                    data[j][5] = Integer.toString(rs.getInt("Price"));
                    j++;              
                            
            }
            c.close();            
            
        }
        catch(Exception e){
            
        }
        return data;
    }
    
   
    public String[][] searchTM(String tmark_entry){
        tm_db = tmark_entry;
        String[][] data = null;
        int i = 0;
        try{
            connectDb();
            
            String query = "SELECT * FROM ledger_table WHERE Trade_Mark = ?";
            statement = c.prepareStatement(query);
            statement.setString(1, tm_db);
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                i++;
            }
            
            rs = statement.executeQuery();
            data = new String[i][6];
            int j = 0;          
            while(rs.next()){                
                    
                    data[j][0] = Integer.toString(rs.getInt("ID"));
                    data[j][1] = rs.getString("Name");
                    data[j][2] = rs.getString("Trade_Mark");
                    data[j][3] = rs.getString("Item");
                    data[j][4] = Integer.toString(rs.getInt("Quantity"));
                    data[j][5] = Integer.toString(rs.getInt("Price"));
                    j++;              
                            
            }
            c.close();           
            
        }
        catch(Exception e){
            
        }
        return data;
        
    }
    
    public String[][] searchItem(String item_entry){
        item_db = item_entry;
        String[][] data = null;
        int i = 0;
        
        try{
            connectDb();
            
            String query = "SELECT * FROM ledger_table WHERE Item = ?";
            statement = c.prepareStatement(query);
            statement.setString(1, item_db);
            ResultSet rs = statement.executeQuery();                       
            
             while(rs.next()){
                i++;
            }
            
            rs = statement.executeQuery();
            data = new String[i][6];
            int j = 0;          
            while(rs.next()){                
                    
                    data[j][0] = Integer.toString(rs.getInt("ID"));
                    data[j][1] = rs.getString("Name");
                    data[j][2] = rs.getString("Trade_Mark");
                    data[j][3] = rs.getString("Item");
                    data[j][4] = Integer.toString(rs.getInt("Quantity"));
                    data[j][5] = Integer.toString(rs.getInt("Price"));
                    j++;              
                            
            }
            c.close();
        }
        catch(Exception e){
            
        }
        return data;
    }
    
    public String[] editItem(String item_entry){
        item_db = item_entry;
        String[] data = null;
        int i = 0;
        
        try{
            connectDb();
            
            String query = "SELECT * FROM ledger_table WHERE ID = ?";
            
            statement = c.prepareStatement(query);
            statement.setString(1, item_db);
            ResultSet rs = statement.executeQuery();                     
            
            data = new String[5];
            int j = 0;          
            while(rs.next()){                
                    
                    
                    data[0] = rs.getString("Name");
                    data[1] = rs.getString("Trade_Mark");
                    data[2] = rs.getString("Item");
                    data[3] = Integer.toString(rs.getInt("Quantity"));
                    data[4] = Integer.toString(rs.getInt("Price"));
                    j++;              
                            
            }
            c.close();
        }
        catch(Exception e){
            
        }
        return data;
    }
    
    public void updateDb(String name_entry, String tmark_entry, String item_entry, int quantity_entry, int price_entry, int id){
        name_db = name_entry;
        tm_db = tmark_entry;
        item_db = item_entry;
        quantity_db = quantity_entry;
        price_db = price_entry;
        ID = id;
        
        
        try{
            connectDb();            
            String query = "UPDATE ledger_table SET Name = ?, Trade_Mark = ?, Item = ?, Quantity = ?, Price = ? WHERE ID = ?";
            statement = c.prepareStatement(query);
            statement.setString(1, name_db);
            statement.setString(2, tm_db);
            statement.setString(3, item_db);
            statement.setInt(4, quantity_db);
            statement.setInt(5, price_db);
            statement.setInt(6, ID);
            statement.executeUpdate();            
            
            c.commit();
            c.close();           
            
        }
        catch(Exception e){            
        }             
    }
    
    public void deleteFromDb(int id){
        ID = id;
        try{
            connectDb();
            String query = "DELETE FROM ledger_table WHERE ID = ?";
            statement = c.prepareStatement(query);
            statement.setInt(1, ID);
            statement.executeUpdate();
            c.commit();
            c.close();            
        }
        catch(Exception e){
            
        }
    }
     
}

