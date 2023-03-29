/*
Nama File			: MPoligon.java
*/

package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;

public class MKubus{
	public static void main(String[] args){
	    BujurSangkar bujurSangkar = new BujurSangkar(4);
		Kubus kubus = new Kubus(bujurSangkar);
		
		//kubus.printInfo();
		System.out.println("Volume Kubus : "+kubus.hitungVolume());
		System.out.println("Luas Alas Kubus : "+kubus.hitungLuasAlas());
	
	}
}
