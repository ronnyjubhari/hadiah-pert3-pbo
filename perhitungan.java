public class perhitungan {
	public static void main (String[] args)
	{
		System.out.println("Operasi Aritmatika");
		System.out.println();
		
		int aa = 5;
		int bb = 6;
		double cc = 0.5;
		int hasil;
		
		System.out.println("aa + bb = " + (aa + bb));		
		
		hasil = (int) (aa * bb * cc);
		System.out.println("aa x bb x cc = " + hasil);
		
		hasil = (int) (bb / cc);
		System.out.println("bb / cc = " + hasil);
	}
}