package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Entity.DichVu;

import Entity.Phong;
import connectDB.ConnectDB;


public class Phong_DAO {
	public  Phong_DAO() {
		
	}
	public ArrayList<Phong> getAlltbPhong() {
        ArrayList<Phong> dsPhong = new ArrayList<Phong>();
        ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
        try {
        	String sql = "select * from Phong";
			Statement state = con.createStatement();
			ResultSet rs = state.executeQuery(sql);
            while (rs.next()) {
             String  phong =  rs.getString("IDPhong");
            	String ten = rs.getString("TenPhong");
            		String loai =  rs.getString("LoaiPhong");
            		float gia = rs.getFloat("GiaPhong");
            		String tinhtrang = rs.getString("TinhTrang");
            		  DichVu dv =  new DichVu(rs.getInt(6));
            		  String chuThich = rs.getString("ChuThich");
            		  
            		  Phong p = new Phong(phong, ten ,loai, gia, tinhtrang, dv, chuThich);

                //Thêm vào danh sách
            		  dsPhong.add(p);
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return dsPhong;
    }
	 public boolean create( Phong p) {

			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			PreparedStatement state = null;
			int n = 0;
	        try {
	            // Tạo một đối tượng để thực hiện công việc
	            state = con.prepareStatement("INSERT INTO Phong ([IDPhong],[TenPhong],[LoaiPhong],[GiaPhong],[TinhTrang],[IDDichVu],[ChuThich])"
	            		+ "VALUES (?,?,?,?,?,?,?)");
	            state.setString(1, p.getMaPhong());
	            state.setString(2, p.getTenPhong());
	            state.setString(3, p.getLoaiPhong());
	            state.setFloat(4, p.getGiaPhong());
	            state.setString(5, p.getTinhTrang());
	            state.setInt(6, p.getMaDichVu().getMaDichVu());
	            state.setString(7, p.getChuThich());
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
	 
	 public boolean update(Phong p) {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			PreparedStatement state = null;
			int n =0;
			try {
				state = con.prepareStatement("update Phong set TenPhong = ?, LoaiPhong = ? ,GiaPhong = ?, TinhTrang = ?, IDDichVu = ? ,ChuThich = ? where IDPhong = ?");
		            state.setString(1, p.getTenPhong());
		            state.setString(2, p.getLoaiPhong());
		            state.setFloat(3, p.getGiaPhong());
		            state.setString(4, p.getTinhTrang());
		            state.setInt(5, p.getMaDichVu().getMaDichVu());
		            state.setString(6, p.getChuThich());
		            state.setString(7, p.getMaPhong());
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
	 public boolean updateTinhTrang(String tinhTrang, String ma) {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			PreparedStatement state = null;
			int n =0;
			try {
				state = con.prepareStatement("update Phong set TinhTrang = ? where IDPhong = ?");
		            state.setString(1,tinhTrang);
		            state.setString(2,ma);
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
			
			 String sql ="DELETE FROM Phong WHERE IDPhong = ?";
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
