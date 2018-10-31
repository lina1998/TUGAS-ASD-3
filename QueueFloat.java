import java.util.ArrayList;


public class QueueFloat {
	ArrayList<Float> tinggibadan = new ArrayList<Float>();
	int back = -1;
	
	public void insert(float value){
		tinggibadan.add(value);
	}
	
	public float get(){
		float value = tinggibadan.get(0);
		tinggibadan.remove(0);
		return value;
	}
	
	public void cetak(){
		System.out.println("Daftar tinggi badan "+tinggibadan);
	}

}