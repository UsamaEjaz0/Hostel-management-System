package hms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


 






public class CareTakerData {
   //
    public void Add (String name,int phoneno,String  taddress,String gender,int salary,int nationalid,String paddress) throws SQLException {
        
        Connection con= MyConnection.getConnection();
        PreparedStatement ps;
       
            
                ps=con.prepareStatement("INSERT INTO caretaker(Name,phoneno,address,gender,salary, Nationalid,permanentaddress) VALUES (?,?,?,?,?,?,?)");
                ps.setString(1, name);
                
                ps.setInt(2, phoneno);
                ps.setString(3, taddress);
                ps.setString(4, gender);
                ps.setInt(5, salary);
                ps.setInt(6, nationalid);
                ps.setString(7, paddress);
                
               // ps.setString(8, Date);
              
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"New Caretaker Added");
                    
                }
        }
       
            public void Update (String name,int phoneno,String  taddress,String gender,int salary,int nationalid,String paddress) throws SQLException {
                Connection con= MyConnection.getConnection();
                PreparedStatement ps;
                ps=con.prepareStatement("UPDATE `caretaker` SET `name`=?,`phoneno`=?,`Address`=?,`gender`=?,`salary`=?,`permanentaddress`=? WHERE `nationalid`=?");
                ps.setString(1, name);
                
                ps.setInt(2, phoneno);
                ps.setString(3, taddress);
                ps.setString(4, gender);
                ps.setInt(5, salary);
                ps.setString(6, paddress);
                
                ps.setInt(7, nationalid);
                
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"Caretaker Updated");
                }
        }
             public void Delete (int nationalid) throws SQLException {
                Connection con= MyConnection.getConnection();
                PreparedStatement ps;
       
        
            
                ps=con.prepareStatement("DELETE FROM `caretaker` WHERE `nationalid`= ?");
                ps.setInt(1, nationalid);
                
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null," CareTaker removed");
                }
        }
        
        
    //unused in this case
             //usama...User another method...
    public static void fillTableCareTakers(JTable table,String valueToSearch) throws SQLException{
        Connection con= MyConnection.getConnection();
        PreparedStatement ps;
        
        ps=con.prepareStatement("SELECT * FROM `caretaker` WHERE CONCAT(`name`, `phoneno`,  `Address`,`gender`, `salary`, `nationalid`, `permanentaddress`) like ?");
        ps.setString(1,"%"+valueToSearch+"%");
        
        ResultSet rs=ps.executeQuery();
        DefaultTableModel model =(DefaultTableModel) table.getModel();
        Object[] row;
        
        while(rs.next()){
            row = new Object[7];
            row[0]=rs.getString(1);
            row[1]=rs.getInt(2);
            
            row[2]=rs.getString(3);
            row[3]=rs.getString(4);
            row[4]=rs.getInt(5);
            row[5]=rs.getInt(6);
            row[6]=rs.getString(7);
           
            model.addRow(row);
            
            
            
        }
    }
}
                
            

        
    

