package hms;



import java.sql.*;
import javax.swing.JOptionPane;
public class Checker {
    
int phoneno,salary,nationalid;
String name,address,gender,padrs;
   
    public static boolean CareTakerchecking(String name, int phoneNo, String address, String gender, int nationalId,int salarY,String padrs ) {
        boolean b = false;
        String phoneno = ""+phoneNo;
        String nationalid = ""+nationalId;
        String salary = ""+salarY;
        if (name.toLowerCase().matches(".*[a-z].*")) {
            if (!(address.equals(""))) {
                if (phoneno.matches(".*\\d.*") && phoneno.length() == 13 ) {
                    if (salary.matches("\\d+") && salary.length() >0) {

                                        if (nationalid.matches("\\d+") && nationalid.length() >0) {
						 if (!(padrs.equals(""))){
						     if (!(gender.equals(""))){ 
                                                         b=true;
}

                                                 
                     else {
                        JOptionPane.showMessageDialog(null, "permanent address cannot be empty");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid identification number");
                }
            } else {
                JOptionPane.showMessageDialog(null, "specify salary!..");
            
        }} else {
            JOptionPane.showMessageDialog(null, "Invalid phoneno..contains 13 numbers");
        }}else {
            JOptionPane.showMessageDialog(null, "invalid address");
        }}
            else {
            JOptionPane.showMessageDialog(null, "Name cannot be empty and It does not contain numbers");
        }}

        return b;
    }
    public static boolean StudentCheck(int Id,String fname,String lname,  String gender, String address,int agE, int nationaliD,int salarY,String padrs,int roomnO,int phonenumbeR ) {
        boolean bool = false;
        String id = ""+Id;
        String age = ""+agE;
        String nationalid = ""+nationaliD;
        String salary = ""+salarY;
        String roomno = ""+roomnO;
        String phonenumber = ""+phonenumbeR;
         if (id.matches("\\d+") && nationalid.length() >0) {
	    if (fname.toLowerCase().matches(".*[a-z].*")) {
              if (lname.toLowerCase().matches(".*[a-z].*")) {
                if (!(gender.equals(""))) {
                 if (!(address.equals(""))) {
                 
                   if (age.matches("\\d+") && age.length() >0) {


                    
                           if(roomno.matches("\\d+") && nationalid.length() >0) {
                               if (phonenumber.matches("\\d+") && phonenumber.length() >12) {
                                          bool=true;
                                        } 
                     else {
                        JOptionPane.showMessageDialog(null, "room no cannot be empty");
                    }
                }  else {
                    JOptionPane.showMessageDialog(null, "Invalid age");
                }
            }else {
                    JOptionPane.showMessageDialog(null, "Invalid address");
                }
            } else {
                JOptionPane.showMessageDialog(null, "specify salary!..");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid identification number");
        }}else {
            JOptionPane.showMessageDialog(null, "name cannot be empty");
        }}
else {
            JOptionPane.showMessageDialog(null,"id cannot be empty" );
        }}

    return bool;};

}