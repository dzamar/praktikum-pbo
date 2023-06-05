/**
* File : HAshMapMain.java
*/

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
    public static void main(String[] args) {
        Map<String, String> mahasiswa = new HashMap<>();
        mahasiswa.put("24060119120033", "Dzamar");
        mahasiswa.put("24060119130022", "Maulana");

        mahasiswa.forEach((nim, nama) -> System.out.println("NIM : " + nim + ", Nama : " + nama));
    }
}