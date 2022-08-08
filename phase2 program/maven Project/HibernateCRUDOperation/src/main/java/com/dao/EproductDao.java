package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Eproduct;



public class EproductDao {
	public int storeEproduct(Eproduct ep) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "Prateek#1974");
PreparedStatement pstmt = con.prepareStatement("insert into Eproduct values(?,?,?)");
pstmt.setInt(1, ep.getId());
pstmt.setString(2, ep.getName());
pstmt.setFloat(3, ep.getPrice());
        int res = pstmt.executeUpdate();
        return res;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
	  public List<Eproduct> getAllEproduct() {
	        List<Eproduct> listOfEp =new ArrayList<Eproduct>();
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "Prateek#1974");
	PreparedStatement pstmt = con.prepareStatement("select * from Eproduct");
	        ResultSet rs = pstmt.executeQuery();
	        while(rs.next()) {
	            Eproduct emp  = new Eproduct();
	            emp.setId(rs.getInt(1));
	            emp.setName(rs.getString(2));
	            emp.setPrice(rs.getFloat(3));
	            listOfEp.add(emp);
	        }
	        } catch (Exception e) {
	        
	        }
	        return listOfEp;
	    }




}
