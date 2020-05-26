/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import dao.DuocPhamDAO;
import java.util.List;
import java.util.Optional;
import model.DuocPham;

/**
 *
 * @author tuan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DuocPhamDAO dpdao = new DuocPhamDAO();
//        Optional<DuocPham> dp = dpdao.get(1);
//        System.out.println(dp.get().getTen());
        
        List<DuocPham> list = dpdao.getAll("");
        for(DuocPham dp: list) {
            System.out.println(dp.getTen());
        }
        // TODO code application logic here
        MainWindown mw = new MainWindown();
        mw.show();
    }
    
}
