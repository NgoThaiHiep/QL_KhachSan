package Entity;

import java.util.Objects;



public class KhachHang {
    private String maKH;
    private String tenKH;
    private String cccd;
    private String quocTich;
    private boolean gioiTinh;
    private int tuoi;
    private String soDienThoai;
    private  Phong phong;
	
	public KhachHang(String maKH, String tenKH, String cccd, String quocTich, boolean gioiTinh, int tuoi,
			String soDienThoai, Phong phong) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.cccd = cccd;
		this.quocTich = quocTich;
		this.gioiTinh = gioiTinh;
		this.tuoi = tuoi;
		this.soDienThoai = soDienThoai;
		this.phong = phong;
	}
	public KhachHang(String maKH) {
		super();
		this.maKH = maKH;
	}
	public KhachHang() {
		super();
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getCccd() {
		return cccd;
	}
	public void setCccd(String cccd) {
		this.cccd = cccd;
	}
	public String getQuocTich() {
		return quocTich;
	}
	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public Phong getPhong() {
		return phong;
	}
	public void setPhong(Phong phong) {
		this.phong = phong;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(maKH);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KhachHang other = (KhachHang) obj;
		return maKH == other.maKH;
	}
	@Override
	public String toString() {
		return "KhachHang [maKH=" + maKH + ", tenKH=" + tenKH + ", cccd=" + cccd + ", quocTich=" + quocTich
				+ ", gioiTinh=" + gioiTinh + ", tuoi=" + tuoi + ", soDienThoai=" + soDienThoai + ", phong=" + phong
				+ "]";
	}


    
   
    
    

}
