/*
Nama File			: MPoligon.java
*/

package org.main;

import org.bangundatar.*;
import org.bangunruang.*;

public class MPoligon{
	public static void main(String[] args){
	    BujurSangkar bujursangkar = new BujurSangkar(20,4);
		bujursangkar.printInfo();
		System.out.println("Luas Bujur Sangkar : "+bujursangkar.hitungLuas());
		
		Kubus kubus = new Kubus(20);
		//kubus.printInfo();
		System.out.println("Volume Kubus : "+kubus.hitungVolume());
	
	}
}
