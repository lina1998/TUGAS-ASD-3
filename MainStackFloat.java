
public class MainStackFloat {

	public static void main(String[] args) {
		StackFloat berat = new StackFloat();
		berat.cetak();
		
		berat.push((float)45);
		berat.cetak();
		berat.push((float)50);
		berat.cetak();
		berat.push((float)50);
		berat.cetak();
		berat.push((float)55);
		berat.cetak();
		
		Float keluaran1 = berat.pop();berat.cetak();
		System.out.println(keluaran1);
        Float keluaran2 = berat.pop();berat.cetak();
		System.out.println(keluaran2);
        Float keluaran3 = berat.pop();berat.cetak();
		System.out.println(keluaran3);
		Float keluaran4 = berat.pop();berat.cetak();
		System.out.println(keluaran4);
		
	}

}
