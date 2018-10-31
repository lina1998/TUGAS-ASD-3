
public class MainStackDouble {
	public static void main(String[] args) {
		
		StackDouble tinggi = new StackDouble();
		tinggi.cetak();
		
		tinggi.push(123.67);
		tinggi.cetak();
		
		tinggi.push(100.00);
		tinggi.cetak();
		
		tinggi.push(155.15);
		tinggi.cetak();
		
		Double tg = tinggi.pop();
		tinggi.cetak();
		System.out.println(tg);
		Double tg1 = tinggi.pop();
		tinggi.cetak();
		System.out.println(tg1);
		Double tg2 = tinggi.pop();
		tinggi.cetak();
		System.out.println(tg2);


		
	}

}
