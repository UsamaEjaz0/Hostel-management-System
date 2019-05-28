
package hms;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;


public class studentData {
    public void AddUpdateDelete (char operation,Integer id,String fname, String lname,String gender,String Address,String room,String phone,Integer age,String Fee,String mess) throws SQLException {
        
        Connection con= MyConnection.getConnection();
        PreparedStatement ps;
        if(operation=='a'){
            
                ps=con.prepareStatement("INSERT INTO students(ID,Fname, Lname,gender,Address, Room, phone,age,Fee) VALUES (?,?,?,?,?,?,?,?,?)");
                ps.setInt(1, id);
                ps.setString(2, fname);
                ps.setString(3, lname);
                ps.setString(4, gender);
                ps.setString(5, Address);
                ps.setString(6, room);
                ps.setString(7, phone);
                ps.setInt(8, age);
                ps.setString(9,Fee);
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"New Student Added");
                }
        }
        if(operation=='u'){
            
                ps=con.prepareStatement("UPDATE `students` SET `Fname`=?,`Lname`=?,`gender`=?,`Address`=?,`Room`=?,`phone`=?,`age`=? WHERE `ID`=?");
                ps.setInt(8, id);
                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, gender);
                ps.setString(4, Address);
                ps.setString(5, room);
                ps.setString(6, phone);
                ps.setInt(7, age);
                
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"Student Updated");
                }
        }
        if(operation=='f'){
            
                ps=con.prepareStatement("UPDATE `students` SET `Fee`= ? WHERE `ID`=?");
                ps.setString(1, Fee);
                ps.setInt(2, id);
                
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"Updated");
                }
        }
        if(operation=='m'){
            
                ps=con.prepareStatement("UPDATE `students` SET `mess`= ? WHERE `ID`=?");
                ps.setString(1, mess);
                ps.setInt(2, id);
                
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"Updated");
                }
        }
        if(operation=='d'){
            
                ps=con.prepareStatement("DELETE FROM `students` WHERE `ID`= ?");
                ps.setInt(1, id);
                
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null," Student deleted");
                }
        }
        
        
    }
    public static void fillTable(JTable table,String valueToSearch) throws SQLException{
        Connection con= MyConnection.getConnection();
        PreparedStatement ps;
        
        ps=con.prepareStatement("SELECT * FROM `students` WHERE CONCAT(`ID`, `Fname`, `Lname`, `gender`, `Address`, `Room`, `phone`, `age`) like ?");
        ps.setString(1,"%"+valueToSearch+"%");
        
        ResultSet rs=ps.executeQuery();
        DefaultTableModel model =(DefaultTableModel) table.getModel();
        Object[] row;
        
        while(rs.next()){
            row=new Object[8];
            row[0]=rs.getInt(1);
            row[1]=rs.getString(2);
            row[2]=rs.getString(3);
            row[3]=rs.getString(4);
            row[4]=rs.getString(5);
            row[5]=rs.getString(6);
            row[6]=rs.getString(7);
            row[7]=rs.getInt(8);
            model.addRow(row);
            
            
            
        }
    }
}
                
            

        
    

