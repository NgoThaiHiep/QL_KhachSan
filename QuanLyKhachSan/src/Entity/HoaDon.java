/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;
import java.util.Objects;

import UI.phongform;

public class HoaDon {
    private String maHoaDon;
    private Phong maPhong;
    private int soNgayO;
    private float GIAHD;
    
    
	public HoaDon() {
		super();
	}


	public HoaDon(String maHoaDon) {
		super();
		this.maHoaDon = maHoaDon;
	}


	

	public HoaDon(String maHoaDon, Phong maPhong, int soNgayO, float gIAHD) {
		super();
		this.maHoaDon = maHoaDon;
		this.maPhong = maPhong;
		this.soNgayO = soNgayO;
		GIAHD = gIAHD;
	}


	public String getMaHoaDon() {
		return maHoaDon;
	}


	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}




	public Phong getMaPhong() {
		return maPhong;
	}


	public void setMaPhong(Phong maPhong) {
		this.maPhong = maPhong;
	}


	public int getSoNgayO() {
		return soNgayO;
	}


	public void setSoNgayO(int soNgayO) {
		this.soNgayO = soNgayO;
	}


	public float getGIAHD() {
		return GIAHD;
	}


	public void setGIAHD(float gIAHD) {
		GIAHD = gIAHD;
	}


	@Override
	public int hashCode() {
		return Objects.hash(maHoaDon);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoaDon other = (HoaDon) obj;
		return Objects.equals(maHoaDon, other.maHoaDon);
	}


	@Override
	public String toString() {
		return "HoaDon [maHoaDon=" + maHoaDon + ", maPhong=" + maPhong + ", soNgayO=" + soNgayO + ", GIAHD=" + GIAHD
				+ "]";
	}


	
	
 
    
}
