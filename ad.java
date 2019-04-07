import java.math.BigDecimal;
import java.math.BigInteger;
 
public class ad {
 
	public static void main(String[] args) {
		BigInteger a = BigInteger.valueOf(100);
		BigInteger b = BigInteger.valueOf(30);
		BigInteger c = a.add(b);
		System.out.println(c);
		BigInteger d = a.multiply(c);
		System.out.println(d);
 
		BigDecimal x = BigDecimal.valueOf(0.001);
		BigDecimal y = BigDecimal.valueOf(1.223);
		System.out.println(x.multiply(y));
		
		
		String s = "123,45,56.7,89";
		String[] s1 = s.split(",");
		double num = 0;
		num = Double.valueOf(s1[0]);
		System.out.println(s1[0]);
		System.out.println(num);
		
		int[]a2 ={1,3,4,5};
		//int []aFor =a2;
		//aFor = a2;
		
		int []aFor = new int[a2.length];
		System.arraycopy(a2,0,aFor,0,a2.length); 
		
		aFor[2] = 10;
		for(int i:a2){
			System.out.print(i+",");
		}
		for(int i:aFor){
			System.out.print("\n"+i+",");
		}
	}
 
}

