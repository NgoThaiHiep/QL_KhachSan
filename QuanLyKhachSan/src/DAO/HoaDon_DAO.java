package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Entity.HoaDon;
import Entity.KhachHang;
import Entity.Phong;
import connectDB.ConnectDB;

public class HoaDon_DAO {
    public HoaDon_DAO() {
    	
    }
    public ArrayList<HoaDon> getAlltbHoaDon() {
    	ArrayList<HoaDon> dsHD = new ArrayList<HoaDon>();
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		
        try {
        	String sql = "select * from HoaDon";
			Statement state = con.createStatement();
			ResultSet rs = state.executeQuery(sql);
			
			while(rs.next()) {
				String maHoaDon = rs.getString("IDHoaDon");
				Phong p = new Phong( rs.getString("IDPhong"));
				int soNgay = rs.getInt("soNgayO");
				float donGia = rs.getFloat("GiaHoaDon");
				
				HoaDon hd = new HoaDon(maHoaDon, p, soNgay, donGia);
				dsHD.add(hd);
			}
           
            }catch (Exception ex) {
                ex.printStackTrace();

            }
            return dsHD;
    }
    public boolean addClient(HoaDon hd){
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement state = null;
		int n = 0;
        try{
        	state = con.prepareStatement("INSERT INTO [dbo].[HoaDon]([IDHoaDon],[IDPhong] ,[soNgayO],[GiaHoaDon])VALUES(?,?,?,?)");
        	
        	  state.setString(1,hd.getMaHoaDon());
        	  state.setString(2, hd.getMaPhong().getMaPhong());
              state.setInt(3, hd.getSoNgayO());
              state.setFloat(4,  hd.getGIAHD());
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
    public boolean update(HoaDon hd){
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement state = null;
		int n = 0;
        try{
        	state = con.prepareStatement(
        			"UPDATE [dbo].[HoaDon]"
        			+ "   	SET [IDPhong] = ?"
        			+ "      ,[soNgayO] = ?"
        			+ "      ,[GiaHoaDon] = ?"
        			+ " WHERE [IDHoaDon] = ?");
            
            state.setString(1, hd.getMaPhong().getMaPhong());
            state.setInt(2, hd.getSoNgayO());
            state.setFloat(3,  hd.getGIAHD());
            state.setString(4,hd.getMaHoaDon());
            
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

    public void DeleteNV(String ID) {
   		ConnectDB.getInstance();
   		PreparedStatement pst = null;
   		 Connection con = ConnectDB.getConnection();
   		
   		 String sql ="DELETE FROM HoaDon WHERE IDHoaDon = ?";
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


