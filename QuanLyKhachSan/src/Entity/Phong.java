package Entity;

import java.util.Objects;

public class Phong {
	  private String maPhong;
	  private String tenPhong;
	  private String loaiPhong;
	  private float giaPhong;
	  private String tinhTrang;
	  private DichVu maDichVu;
	  private String chuThich;
	  
	  
	public Phong() {
		super();
	}


	public Phong(String maPhong) {
		super();
		this.maPhong = maPhong;
	}


	

	public Phong(String maPhong, String tenPhong, String loaiPhong, float giaPhong, String tinhTrang, DichVu maDichVu,
			String chuThich) {
		super();
		this.maPhong = maPhong;
		this.tenPhong = tenPhong;
		this.loaiPhong = loaiPhong;
		this.giaPhong = giaPhong;
		this.tinhTrang = tinhTrang;
		this.maDichVu = maDichVu;
		this.chuThich = chuThich;
	}


	public String getMaPhong() {
		return maPhong;
	}


	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}


	public String getTenPhong() {
		return tenPhong;
	}


	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}


	public String getLoaiPhong() {
		return loaiPhong;
	}


	public void setLoaiPhong(String loaiPhong) {
		this.loaiPhong = loaiPhong;
	}


	public float getGiaPhong() {
		return giaPhong;
	}


	public void setGiaPhong(float giaPhong) {
		this.giaPhong = giaPhong;
	}


	public String getTinhTrang() {
		return tinhTrang;
	}


	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}


	


	public DichVu getMaDichVu() {
		return maDichVu;
	}


	public void setMaDichVu(DichVu maDichVu) {
		this.maDichVu = maDichVu;
	}


	public String getChuThich() {
		return chuThich;
	}


	public void setChuThich(String chuThich) {
		this.chuThich = chuThich;
	}


	@Override
	public int hashCode() {
		return Objects.hash(maDichVu);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phong other = (Phong) obj;
		return Objects.equals(maDichVu, other.maDichVu);
	}


	@Override
	public String toString() {
		return "Phong [maPhong=" + maPhong + ", tenPhong=" + tenPhong + ", loaiPhong=" + loaiPhong + ", giaPhong="
				+ giaPhong + ", tinhTrang=" + tinhTrang + ", maDichVu=" + maDichVu + ", chuThich=" + chuThich + "]";
	}


	
	  
	  
	




}
