
import com.mycompany.qlbanvexe.Booking;
import com.mycompany.qlbanvexe.pojo.Ve;
import com.mycompany.qlbanvexe.services.DatVeServices;
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
public class VeListTester {
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
            Logger.getLogger(VeListTester.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Test
    public void testNoFilters() {
        try {
            List<Ve> kq1 = DatVeServices.getVe(" ");
            List<Ve> kq2 = DatVeServices.getVe(null);
            
            Assert.assertEquals(kq1.size(), kq2.size());
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangListTester.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Test
    public void testFilter() {
        try {
            String kw = " o   ";
            List<Ve> kq1 = DatVeServices.getVe(kw);
            
            Assert.assertEquals(2, kq1.size());
            for (Ve q: kq1)
                Assert.assertTrue(q.getTuyen().contains(kw.trim()));
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangListTester.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @Test
    public void testDeleteSuccessful() {
        int idVe = 123;
        try {
            Ve k = DatVeServices.getVeById(idVe);
            Assert.assertNull(k);
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangListTester.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
    

