/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qlbanvexe.services;

import com.mycompany.qlbanvexe.pojo.KhachHang;
import com.mycompany.qlbanvexe.pojo.Ve;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author asus
 */
public class DatVeServices {
    private static Connection conn = Utils.getConn();
    
    public static Ve getVeById(int id) throws SQLException {
        String sql = "SELECT * FROM datve WHERE id=?";
        
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setInt(1, id);
        
        ResultSet rs = stm.executeQuery();
        while (rs.next())
            return new Ve(rs.getInt("idVe"), rs.getString("tên Tuyến"), rs.getInt("Ghế"), rs.getString("Loaixe"),rs.getDate("gioKhoiHanh"));
        
        return null;
    }
    public static  List<Ve> getVe(String v) throws SQLException {
        
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM datve");
        
        List<Ve> kq = new ArrayList<>();
        while (rs.next()) {
            int idVe = rs.getInt("id");
            String Tuyen = rs.getString("Tuyen");
            int Ghe = rs.getInt("Ghe");
            String loaiXe = rs.getString("loai xe");
            Date gioKhoiHanh = rs.getDate("gioKhoiHanh");
            
           Ve c = new Ve( idVe, Tuyen, Ghe, loaiXe, gioKhoiHanh);
            kq.add(c);
        }
        return kq;
    }
    
}
