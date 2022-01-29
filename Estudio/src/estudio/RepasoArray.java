package estudio;

import java.util.ArrayList;

public class RepasoArray {

	public static void main(String[] args) {
		 int suma = 0;
		 int count = 0;
		 int promedio = 0;
			int[] sueldos = { 400000, 760000, 1100000, 650000, 654980, 987300, 700450, 442300};
			 for(int i = 0; i < sueldos.length; i++) {
				if(sueldos[i] > 500000) {
					suma = suma + sueldos[i];
					count++;
					promedio = suma/count;
				}
			 }
			 System.out.println(promedio);

			 
			 int i;
			 int[] a = {1,2,3,4,5};
			 int n = a.length;
			 for(i=0;i<n;i++){
			 System.out.printf("%d\n",a[i]);
			 }
			 
			 ArrayList <String> b = new ArrayList <String> ();
			 b.add("1");
			 b.add("2");
			 b.add("3");
			 System.out.println(b);
			 
			 
			 
	}                                               

}
	