package Buoi_14.lec8.swingJDBC.controller;

import Buoi_14.lec8.swingJDBC.model.Student;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException; 
public class DAO {
    private Connection conn; 
    public DAO(){
         String urlMySQL = "jdbc:mysql://localhost/test"; 
        try {
            Class.forName("com.mysql.jdbc.Driver");// nap driver
        } 
        catch(ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
        }      
        try {
            conn = DriverManager.getConnection(urlMySQL,"root","root");//ket noi
        } catch(SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } 
    }    
    public boolean addStudent(Student s){
        String sql = "INSERT INTO  Student(ID, name, DateOfBirth, address, phone, email, mark) "
                + "VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getID());
            ps.setString(2, s.getName());
            ps.setDate(3, new Date(s.getDateOfBirth().getTime()));
            ps.setString(4, s.getAddress());
            ps.setString(5, s.getPhone());
            ps.setString(6, s.getEmail());
            ps.setFloat(7, s.getMark());
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    public ArrayList<Student> getListStudent(){
        ArrayList<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM  Student";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Student s = new Student();
                s.setID(rs.getString("ID"));
                s.setName(rs.getString("name"));
                s.setDateOfBirth(rs.getDate("DateOfBirth"));
                s.setAddress(rs.getString("address"));
                s.setPhone(rs.getString("phone"));
                s.setEmail(rs.getString("email"));
                s.setMark(rs.getFloat("mark"));
                
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    public static void main(String[] args) {
        new DAO();
    }
}
