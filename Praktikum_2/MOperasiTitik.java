/*
Nama : Dzamar Maulana
NIM	 : 24060119120033
PBO Lab B 
*/
class MOperasiTitik {
	public static void main (String[] args){
		Titik t1 = new Titik(5.0, 3.0);
		OperasiTitik op = new OperasiTitik();
		
		System.out.println("Titik("+t1.getAbsis()+","+t1.getOrdinat()+")");
		
		op.refleksiSumbuX(t1);
		System.out.println("\nTitik setelah refleksi Sumbu X");
		System.out.println("Titik("+t1.getAbsis()+","+t1.getOrdinat()+")");
		
		op.refleksiSumbuY(t1);
		System.out.println("\nTitik setelah sumbu Y");
		System.out.println("Titik("+t1.getAbsis()+","+t1.getOrdinat()+")");
		
	}
}