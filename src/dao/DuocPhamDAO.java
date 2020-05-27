/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import model.DuocPham;

/**
 *
 * @author nguyenha
 */
public class DuocPhamDAO implements DAO<DuocPham>{
    
    private final static String TABLE = "DuocPham";
    private final static String TABLE_ID = "id";    
    private final static String  TEN = "ten";
    private final static String TINH_CHAT = "tinh_chat";
    private final static String DINH_TINH = "dinh_tinh";
    private final static String DINH_LUONG = "dinh_luong";
    private final static String TAP_CHAT = "tap_chat_lien_quan";
    private final static String BAO_QUAN = "bao_quan";


    @Override
    public Optional<DuocPham> get(int id) {
        String sql = "SELECT * FROM " + TABLE + " where id = ?";
        DuocPham dp = new DuocPham();
        try {
            Connection conn = ConnectionUtils.getInstance().getConnection();
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setInt(1, id);
            ResultSet rs = psmt.executeQuery();
            if(rs.next()) {
                dp.setId(rs.getInt(TABLE_ID));
                dp.setTen(rs.getString(TEN));
                dp.setDinhtinh(rs.getString(DINH_TINH));
                dp.setDinhluong(rs.getString(DINH_LUONG));
                dp.setTichchat(rs.getString(TINH_CHAT));
                dp.setTapchat(rs.getString(TAP_CHAT));
                dp.setBaoquan(rs.getString(BAO_QUAN));
                
            }
           
            
        } catch (Exception e) {
        }
         return Optional.of(dp);
    }



    @Override
    public void save(DuocPham t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(DuocPham t, String[] params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DuocPham> getAll(String keyword) {
        
        String sql = "SELECT * FROM " + TABLE + " WHERE " + TEN + " LIKE ? " ;
        List<DuocPham> list = new ArrayList<>();
        try {
            Connection conn = ConnectionUtils.getInstance().getConnection();
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setString(1, '%'+keyword+'%');
            ResultSet rs = psmt.executeQuery();
            
            while(rs.next()) {
                DuocPham dp = new DuocPham();
                dp.setId(rs.getInt(TABLE_ID));
                dp.setTen(rs.getString(TEN));
                dp.setDinhtinh(rs.getString(DINH_TINH));
                dp.setDinhluong(rs.getString(DINH_LUONG));
                dp.setTichchat(rs.getString(TINH_CHAT));
                dp.setTapchat(rs.getString(TAP_CHAT));
                dp.setBaoquan(rs.getString(BAO_QUAN));
                list.add(dp);
            }
           
            
        } catch (Exception e) {
        }
        return list;

    }
    
}
