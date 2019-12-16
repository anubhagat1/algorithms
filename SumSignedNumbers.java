package algorithms;

import java.text.DecimalFormat;

public class Summation {

	public static void main(String[] args) {
		int[] arr1 = {1, 4, 7, -9, -7, -1, 0, 0};
		int N = arr1.length;
		
		int posVal = 0;
        int negVal = 0;
        int zeroVal =0;

        for (int i=0; i< arr1.length; i++) {

            if (arr1[i] >0)
                posVal++;
            else if (arr1[i] < 0)
                negVal++;
            else
                zeroVal++;        
        }

        DecimalFormat df = new DecimalFormat("#.000000");
        double temp = (double) posVal/N;
        System.out.println(df.format(temp));

        temp = (double) negVal/N;
        System.out.println(df.format(temp));

        temp = (double) zeroVal/N;
        System.out.println(df.format(temp));
		

	}

}
