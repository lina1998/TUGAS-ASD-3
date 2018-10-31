import java.util.ArrayList;


public class StackFloat {
	ArrayList<Float> beratbadan = new ArrayList<Float>();
	int top = - 1;
	
public void push(Float value){
	beratbadan.add(value);
	top = top + 1;
	
}

public float pop(){
	float value = beratbadan.get(top);
	beratbadan.remove(top);
	top = top -1;
	return value;
}

public void cetak(){
	System.out.println(beratbadan.toString());
}
	

}
