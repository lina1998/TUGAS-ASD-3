import java.util.ArrayList;


public class QueueDouble {
	ArrayList<Double> beratbadan= new ArrayList<Double>();
	int back = -1;
	
	public void insert(double value){
		beratbadan.add(value);
	}
	
	public double get(){
		double value = beratbadan.get(0);
		beratbadan.remove(0);
		return value;
	}
	
	public void cetak(){
		System.out.println("Data Berat Badan "+beratbadan);
	}

}