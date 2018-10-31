public class MainStackGeneric {

	public static void main(String[] args) {
		StackGeneric tumpuk = new StackGeneric();
	
		
		tumpuk.push("kaco");tumpuk.cetak();
		tumpuk.push("lina");tumpuk.cetak();
		tumpuk.push("nadra");tumpuk.cetak();
		tumpuk.push("nur");tumpuk.cetak();
		
	
		tumpuk.pop();tumpuk.cetak();

	}

}