
import com.mycompany.qlbanvexe.Booking;
import com.mycompany.qlbanvexe.pojo.KhachHang;
import com.mycompany.qlbanvexe.services.KhachHangServices;
import com.mycompany.qlbanvexe.services.Utils;
import com.mysql.cj.xdevapi.Result;
import java.net.JarURLConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class KhachHangListTester {
    private static Connection conn;
    
    @BeforeClass
    public static void setUp() {
        conn = Utils.getConn();
    }
    
    @AfterClass
    public static void tearDown() {
        try {
            Utils.getConn().close();
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangListTester.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Test
    public void testNoFilters() {
        try {
            List<KhachHang> kq1 = KhachHangServices.getKhachHang("  ");
            List<KhachHang> kq2 = KhachHangServices.getKhachHang(null);
            
            Assert.assertEquals(kq1.size(), kq2.size());
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangListTester.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Test
    public void testFilter() {
        try {
            String kw = " o   ";
            List<KhachHang> kq1 = KhachHangServices.getKhachHang(kw);
            
            Assert.assertEquals(2, kq1.size());
            for (KhachHang q: kq1)
                Assert.assertTrue(q.getAddress().contains(kw.trim()));
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangListTester.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @Test
    public void testDeleteSuccessful() {
        String khachhangId = "24cd4383-ea97-4396-bb44-f7466b89e30b";
        int id = 123;
        try {
            boolean kq = KhachHangServices.deletekhachhang(khachhangId);
            Assert.assertTrue(kq);
            
            KhachHang k = KhachHangServices.getKhachHangById(id);
            Assert.assertNull(k);
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangListTester.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
