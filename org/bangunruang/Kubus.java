package org.bangunruang;

//import org.poligon.Poligon;

public class Kubus{
	private double panjangSisi;
	
	public Kubus(double panjangSisi){
		this.panjangSisi = panjangSisi;
	}
	
	public double hitungVolume(){
		return panjangSisi * panjangSisi * panjangSisi;
	}
	
	public double hitungLuasAtas(){
		return panjangSisi * panjangSisi;
	}
	
	//public void printInfo(){
	//	System.out.println("Bangun Segitiga bersisi "+this.getJumlahSisi());
	//}
}