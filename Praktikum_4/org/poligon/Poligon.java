/**
* Nama File			: Poligon.java
* Tanggal Pembuatan	: 08/03/2023
*/

package org.poligon;

public class Poligon{
	protected int jumlahSisi;
	
    public Poligon(){
        this.jumlahSisi = 0;
    }

    public void setJumlahSisi(int sisi){
        this.jumlahSisi = sisi;
    }

    public int getJumlahSisi(){
        return this.jumlahSisi;
    }
}