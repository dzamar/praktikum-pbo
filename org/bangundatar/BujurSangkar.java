package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
	private double panjangSisi;
	
	public BujurSangkar(double panjangSisi,int jumlahSisi){
		this.panjangSisi = panjangSisi;
		this.jumlahSisi = jumlahSisi;
	}
	
	public double hitungLuas(){
		return panjangSisi * panjangSisi;
	}
	
	public void printInfo(){
		System.out.println("Jumlah sisi Bujur Sangkar bersisi : "+this.getJumlahSisi());
	}
}