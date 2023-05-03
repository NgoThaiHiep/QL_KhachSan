package DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Entity.KhachHang;
import Entity.Phong;
import connectDB.ConnectDB;

public class KhachHang_DAO {
	
	public ArrayList<KhachHang> getAlltbKhachHang(){
		ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		try {
			
			String sql = "select * from KhachHang";
			Statement state = con.createStatement();
			ResultSet rs = state.executeQuery(sql);
			while(rs.next()) {
				String maKh = rs.getString("IDKhachHang");
				String tenKh = rs.getString("TENKH");
				String cccd = rs.getString("CCCD");
				String quocTich = rs.getString("QUOCTICH");
				Boolean gioiTinh = rs.getBoolean("GIOITINH");
				int tuoi = rs.getInt("TUOI");
				String soDienThoai = rs.getString("SDT");
				
				Phong p = new Phong(rs.getString("IDPhong"));
				KhachHang kh = new KhachHang(maKh, tenKh, cccd, quocTich, gioiTinh, tuoi, soDienThoai, p);
				
				dsKH.add(kh);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return dsKH;
	}
//	public ArrayList<KhachHang> timKiemKH(int ID){
//		ArrayList<KhachHang> result = new ArrayList<KhachHang>();
//        String sql = "SELECT * FROM KhachHang WHERE  IDMaKhachHang = ? ?";
//        PreparedStatement ps = null;
//        try{
//        	ConnectDB .getInstance();
//        	Connection con = ConnectDB.getConnection();
//            ps = con.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery(sql);
// 
//            while(rs.next()){
//                KhachHang khachHang = new KhachHang();
//                khachHang.setMaKH(ID);
//                khachHang.setHoTen(rs.getString("name"));
//                khachHang.setCccd(rs.getString("CCCD"));
//                khachHang.setDiaChi(rs.getString("DiaChi"));
//                khachHang.setDienThoai(rs.getString("DienThoai"));
//                khachHang.setEmail(rs.getString("Email"));
//                result.add(khachHang);
//            }
//        }catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		finally {
//			try {
//				ps.close();
//			} catch (Exception e2) {
//				// TODO: handle exception
//				e2.printStackTrace();
//			}
//		}
//        return result;
//    }
//	
	public boolean addClient(KhachHang kh){
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement state = null;
		int n = 0;
        try{
        	state = con.prepareStatement("INSERT INTO [dbo].[KhachHang]([IDKhachHang],[TENKH],[CCCD],[QUOCTICH],[GIOITINH] ,[TUOI],[SDT] ,[IDPhong])"
        			+ "VALUES(?,?,?,?,?,?,?,?)");
        	
        	state.setString(1, kh.getMaKH());
        	state.setString(2, kh.getTenKH());
        	state.setString(3, kh.getCccd());
        	state.setString(4, kh.getQuocTich());
        	state.setBoolean(5, kh.isGioiTinh());
        	state.setInt(6, kh.getTuoi());
            state.setString(7, kh.getSoDienThoai());
            state.setString(8, kh.getPhong().getMaPhong());
            n = state.executeUpdate();
   
        }catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				state.close();
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return n > 0;
	}
	public boolean update(KhachHang kh) {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement state = null;
		int n =0;
		try {
			state = con.prepareStatement("UPDATE [KhachHang]"
					+ "   	SET [TENKH] = ?"
					+ "      ,[CCCD] = ?"
					+ "      ,[QUOCTICH] = ?"
					+ "      ,[GIOITINH] = ?"
					+ "      ,[TUOI] = ?"
					+ "      ,[SDT] = ?"
					+ "      ,[IDPhong] = ?"
					+ " WHERE [IDKhachHang] = ?");
			
            state.setString(1, kh.getTenKH());
            state.setString(2, kh.getCccd());
            state.setString(3, kh.getQuocTich());
            state.setBoolean(4, kh.isGioiTinh());
            state.setInt(5, kh.getTuoi());
            state.setString(6, kh.getSoDienThoai());
            state.setString(7, kh.getPhong().getMaPhong());
            state.setString(8, kh.getMaKH());
			n = state.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				state.close();
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return n>0;
	}
	
 public void DeleteNV(String ID) {
		ConnectDB.getInstance();
		PreparedStatement pst = null;
		 Connection con = ConnectDB.getConnection();
		
		 String sql ="DELETE FROM KhachHang WHERE IDKhachHang = ?";
		 try {
			 pst = con.prepareStatement(sql);
			pst.setString(1, ID);
			 pst.executeUpdate() ;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				pst.close();
			} catch (SQLException e2) {
				// TODO: handle exceptione2 
				e2.printStackTrace();
			}
		}
	}
}
