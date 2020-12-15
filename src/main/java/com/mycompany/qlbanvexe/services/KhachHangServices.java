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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class KhachHangServices {
    private static Connection conn = Utils.getConn();
    
    public static KhachHang getKhachHangById(int id) throws SQLException {
        String sql = "SELECT * FROM KhachHang WHERE id=?";
        
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setInt(1, id);
        
        ResultSet rs = stm.executeQuery();
        while (rs.next())
        {
            return new KhachHang(rs.getInt(0),
                    rs.getString("TênKH"),rs.getInt("SDT"), rs.getString("DiaChi"), rs.getInt("cmnd"),
                    DatVeServices.getVeById(rs.getInt("idVe")));
        }
            return null;
        
    }
    public static List<KhachHang> getKhachHang(String kw) throws SQLException {
        String sql = "SELECT * FROM khachhang";
        if (kw != null && !kw.trim().isEmpty())
            sql += " WHERE content like ?";
        
        PreparedStatement stm = conn.prepareStatement(sql);
        if (kw != null && !kw.trim().isEmpty())
            stm.setString(1, String.format("%%%s%%", kw.trim()));
        
        ResultSet rs = stm.executeQuery();
        
        List<KhachHang> KH = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("TênKH");
            int idVe= rs.getInt("idVe");
            int number = rs.getInt("SDt");
            String address = rs.getString("DiaChi");
            int cmnd = rs.getInt("CMND");
            String Tuyen = rs.getString("Tuyến");
            int Ghe = rs.getInt("Ghe");
            String loaiXe = rs.getString("loai xe");
            Date gioKhoiHanh = rs.getDate("gioKhoiHanh");
            
            KhachHang q = new KhachHang(id,name, number,address,cmnd,
                    new Ve( idVe,  Tuyen, Ghe,loaiXe,gioKhoiHanh));
            KH.add(q);
        }
        
        return KH;
    }
    
    public static boolean deletekhachhang(String Id) throws SQLException {
        String sql = "DELETE FROM khachhang WHERE id=?";
        
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setString(1, Id);
        
        int kq = stm.executeUpdate();
        
        return kq > 0;
    }
    
    public static boolean addKhachHang(KhachHang q, Ve k) {
        try {
            conn.setAutoCommit(false);
            String sql = "INSERT INTO KhachHang(id,idVe,TenKH,SDT,DicChi,CMND,Tuyen,Ghe,LoaiXe,GioKhoiHanh )"
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, q.getId());
            stm.setInt(2, q.getNumber());
            stm.setString(3, q.getName());
            stm.setString(4, q.getAddress());
            stm.setInt(5, k.getIdVe());
            
            if (stm.executeUpdate() > 0) {
                for (KhachHang KH: getKhachHang(sql)) {
                    sql = "INSERT INTO KhachHang(id,idVe,TenKH,SDT,DicChi,CMND,Tuyen,Ghe,LoaiXe,GioKhoiHanh )"
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?,?, ?,)";
                    
                    stm.executeUpdate();
                }
                
                conn.commit();
            }
            
            return true;
        } catch (SQLException ex) {
            try {
                conn.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(KhachHangServices.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        return false;
    }
}
