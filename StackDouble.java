import java.util.ArrayList;


public class StackDouble {

   ArrayList<Double> tinggibadan = new ArrayList<Double>();
   int top = -1;
   
   public void push(Double value){
	   tinggibadan.add(value);
	   top = top + 1;
   }
   
   public double pop(){
	   double value = tinggibadan.get(top);
	   tinggibadan.remove(top);
	   top = top - 1;
	   return value;
   }

   public void cetak(){
	   System.out.println(tinggibadan.toString());
   }
}
