package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Entity.DichVu;
import connectDB.ConnectDB;


public class DichVu_DAO {
	public DichVu_DAO () {
		
	}
	public ArrayList<DichVu> getAlltbDichVu(){
		ArrayList<DichVu> dsSP = new ArrayList<DichVu>();
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		try {
			
			String sql = "select * from DichVu";
			Statement state = con.createStatement();
			ResultSet rs = state.executeQuery(sql);
			while(rs.next()) {
				int maSP = rs.getInt("IDDichVu");
				String tenSP = rs.getString("TenDichVu");
				float donGia = rs.getFloat("DonGia");
				DichVu sp = new DichVu(maSP, tenSP, donGia);
				dsSP.add(sp);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return dsSP;
	}
	 public boolean create( DichVu dv) {

			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			PreparedStatement state = null;
			int n = 0;
	        try {
	            // Tạo một đối tượng để thực hiện công việc
	            state = con.prepareStatement("INSERT INTO DichVu(IDDichVu,TenDichVu,DonGia) VALUES(?,?,?)");
	            state.setInt(1, dv.getMaDichVu());
	            state.setString(2, dv.getTenDichVu());
	            state.setFloat(3, dv.getDonGia());
	            n = state.executeUpdate();

	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }finally {
				try {
					state.close();
				} catch (SQLException e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
	        return n>0;
	    }//GEN-LAST:event_them2ActionPerformed
   
	 public boolean update(DichVu dv) {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			PreparedStatement state = null;
			int n =0;
			try {
				state = con.prepareStatement("update DichVu set TenDichVu = ?, DonGia = ? where IDDichVu = ?");
				
	            state.setString(1, dv.getTenDichVu());
	            state.setFloat(2, dv.getDonGia());
	            state.setInt(3, dv.getMaDichVu());
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
			
			 String sql ="DELETE FROM DichVu WHERE IDDichVu = ?";
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
