package algorithms;

import java.util.Arrays;

public class Bonetrousle {
			
	public static long[] calc (long n, long k, int b) {
	
		long [] result;
        long total = 0;

        if (b == 1 && n <= k) {
            result = new long[]{n};
            return result;    
        } else if (b == 2 && n < k) {
            result = new long[]{n -1, 1};
            return result;
        } else {
            long min, max;
            if (b % 2 == 0 ) 
                min = ((long)b/2) * ((long)b + 1);
            else 
                min = (long)b * (((long)b + 1)/2);
            
            long temp1 = k - b + 1;
            long temp2;
            if (b % 2 ==0 )
                temp2 = (((long)b/2) * (  (long)b-1) );
            else 
                temp2 = ((((long)b-1)/2) * (long)b);
            
            if (temp1 * (long)b < 0) 
                max = Long.MAX_VALUE - 1;
            else 
                max = (temp1 * (long)b) + temp2;
             
                
            if (min > n || (min < n && b == k) || max < n){
	                result = new long[]{-1};
	                return result;
	            }
	            result = new long [b];
	            for (int i = 0; i < b; i++) {
	                    result[i] = b - i;
	                    total += b - i;
	                }
	                for (int i = 0; i < b; i++) {           
	                    
	                    if (total == n)
	                        break; 
	                    
	                    long diff = n - total; 
	                    if (diff + result [i] >= k) {                    
	                    
	                        total = total - result[i] + k;  
	                        result[i] = k;
	                    } else { 
	                        total = total + diff; 
	                        result[i] += diff;
	                    }
	                    k--;
	                    //System.out.println(Arrays.toString(result) + total);
	                }
	                return result;
	            }
	}

	public static void main(String[] args) {

		    long [] result =calc(12, 8, 3);
	      System.out.println(Arrays.toString(result));
          
	      long [][] testcase = {
	        	{5000049999L, 1000000000000000000L, 100000},		
	        	{14676081967275007L, 231570371282875296L, 42162},
	        	{481697232136273674L, 725632705667629956L, 65468},
	        	{407031495590502812L, 463991901154311356L, 72434},
	        	{815653456170184724L, 42520218825590152L, 97792},
	        	{50117566026110503L, 331006754650934081L, 71170},
	        	{899792562017433582L, 449648193987628347L, 31447},
	        	{849786664259864312L,720117013019040630L, 32811},
	        	{291810954265001399L, 913298107697124445L, 47787},	        	
	        	{457803539447232157L, 21312686522251688L, 63398},
	        	{537271879809585866L, 714618856006023134L, 84282},
	        	{735643023461269080L, 673948977711382102L, 86761},
	        	{619198986442806087L, 917048212250176085L, 48661},
	        	{324382978890815912L, 708972207903112363L, 63332},
	        	{974704319195890491L, 451675318457946155L, 2538},
	        	{467837510026946090L, 968619395673150889L, 94331},
	        	{999999995000049999L, 10000000000000L, 100000},
	        	{999999995000050001L, 10000000000000L, 100000},
	        	{999999995000050000L, 10000000000000L, 100000},
	        	{5000050000L, 1000000000000000000L, 100000}};
	        
	        
	        int x =0;
	        result =calc(testcase[x][0],testcase[x][1] , (int)testcase[x][2]);
	        System.out.println(Arrays.toString(result));
	   }
}
