package Entity;

import java.util.Objects;

public class DichVu {
private int maDichVu;
private String tenDichVu;
private float donGia;

public DichVu() {
	super();
}


public DichVu(int maDichVu) {
	super();
	this.maDichVu = maDichVu;
}


public DichVu(int maDichVu, String tenDichVu, float donGia) {
	super();
	this.maDichVu = maDichVu;
	this.tenDichVu = tenDichVu;
	this.donGia = donGia;
}


public int getMaDichVu() {
	return maDichVu;
}


public void setMaDichVu(int maDichVu) {
	this.maDichVu = maDichVu;
}


public String getTenDichVu() {
	return tenDichVu;
}


public void setTenDichVu(String tenDichVu) {
	this.tenDichVu = tenDichVu;
}


public float getDonGia() {
	return donGia;
}


public void setDonGia(float donGia) {
	this.donGia = donGia;
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
	DichVu other = (DichVu) obj;
	return maDichVu == other.maDichVu;
}


@Override
public String toString() {
	return "DichVu [maDichVu=" + maDichVu + ", tenDichVu=" + tenDichVu + ", donGia=" + donGia + "]";
}












}
