import java.util.ArrayList;

public class ArrayListInteger {

	public static void main(String[] args) {
		ArrayList<Integer> nilaimahasiswa = new ArrayList<Integer>();
		nilaimahasiswa.add(90);
		nilaimahasiswa.add(80);
		nilaimahasiswa.add(85);
		nilaimahasiswa.add(70);
		nilaimahasiswa.add(80);
		
		System.out.println(nilaimahasiswa.isEmpty());
		System.out.println("Nilai Mahasiswa" + nilaimahasiswa);
		System.out.println("Ada berapa yang mempunyai nilai 80 : " + nilaimahasiswa.indexOf(80));
		
		ArrayList<Integer> nilaimahasiswa1 = nilaimahasiswa;
		System.out.println("1" + nilaimahasiswa);
		System.out.println("2" + nilaimahasiswa1);
		nilaimahasiswa1.remove(3);
		System.out.println("1" + nilaimahasiswa);
		System.out.println("2" + nilaimahasiswa1);
	}

}

