
public class MainStackString {

	public static void main(String[] args) {
		StackString nama = new StackString();
		nama.cetak();
		
		nama.push("Nur");
		nama.push("linah");
		nama.push("kur");
		nama.push("nia");
		nama.push("arni");
		
		nama.cetak();
		nama.cetak();
		nama.cetak();
		nama.cetak();
		nama.cetak();
		
		String nm = nama.pop();
		nama.cetak();
		System.out.println(nm);
		String nm1 = nama.pop();
		nama.cetak();
		System.out.println(nm1);
		String nm2 = nama.pop();
		nama.cetak();
		System.out.println(nm2);
		String nm3 = nama.pop();
		nama.cetak();
		System.out.println(nm3);
		
		
		
		
		
	}

}
