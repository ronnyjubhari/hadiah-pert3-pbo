import java.util.Scanner; 

public class identitas {
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in); 
		String nama,alamat;
		int umur;
		
		System.out.println("### Identitas ###");
		System.out.print("Nama   : ");
		nama = input.nextLine();
		
		System.out.print("Alamat : ");
		alamat = input.nextLine();
		
		System.out.print("Umur   : ");
		umur = input.nextInt();
		
		System.out.println(); 
		System.out.println();
		System.out.println("Saudara    : " + nama); 
		System.out.println("Tinggal di : " + alamat); 
		System.out.println("Berumur    : " + umur + " tahun ");
	}
}