package sg.edu.iss.orc.controller;

import java.util.Arrays;
import java.util.Collections;

public class Impl {
	
    public static final int LEN_MIN = 1;

    public static final int LEN_MAX = 100;

    private Impl() {
    }

    public static long[] getFibonacci(int len) throws IllegalArgumentException {
        final long[] rtn;
        // IF the desired length is LESS THAN then Minimum Length,
        // THEN throw a Runtime Exception;
        // ELSE IF the desired length is GREATER THAN the Maximum length,
        // THEN throw a Runtime Exception;
        // ELSE create the array to the desired length.
        if (len < Impl.LEN_MIN) {
            throw new IllegalArgumentException(String.format("Length was less than %d. [%d]", Impl.LEN_MIN, len));
        } else if (len > Impl.LEN_MAX) {
            throw new IllegalArgumentException(String.format("Length was greater than %d. [%d]", Impl.LEN_MAX, len));
        } else {
            rtn = new long[len];
        }

        // Initialize the first element.
        rtn[0] = 0;
        // IF there are at least two elements,
        // THEN initialize the second element.
        if (rtn.length > 1) {
            rtn[1] = 1;
        }
        // FOR EACH additional element,
        // add the value of the two previous elements to obtain the value of
        // the current element.
        for (int idx = 2; idx < len; idx++) {
            rtn[idx] = rtn[idx - 1] + rtn[idx - 2];
        }
        return rtn;
    }
    
    
    public static long[] getFibonacciSorted(int len) throws IllegalArgumentException {
        final long[] rtn;
        if (len < Impl.LEN_MIN) {
            throw new IllegalArgumentException(String.format("Length was less than %d. [%d]", Impl.LEN_MIN, len));
        } else if (len > Impl.LEN_MAX) {
            throw new IllegalArgumentException(String.format("Length was greater than %d. [%d]", Impl.LEN_MAX, len));
        } else {
            rtn = new long[len];
        }

        // Initialize the first element.
        rtn[0] = 0;
        // IF there are at least two elements,
        // THEN initialize the second element.
        if (rtn.length > 1) {
            rtn[1] = 1;
        }

        for (int idx = 2; idx < len; idx++) {
            rtn[idx] = rtn[idx - 1] + rtn[idx - 2];
        }

        int even = 0;
        for(int i=0;i<len;i++)
        {
        	if(rtn[i] %2 ==0)
        	{
        		even++;
        	}
        }
        int odd = len-even;
        int j = even-1;
        int k = odd-1;
      
        final long[] evenarr = new long[even];
        final long[] oddarr = new long[odd];
        
        for(int i=0;i<len;i++)
        {
        	if(rtn[i] %2 ==0)
        	{
        		evenarr[j] = rtn[i];
        		j -= 1;
        	} else {
        		oddarr[k] = rtn[i];
        		k -= 1;
        	}
        }
        
        final long[] sortedrtn = new long[len];
        
        for (int l = 0; l < len; l++) {
            
        	if(l<even) {
        	  	sortedrtn[l] = evenarr[l];
        	} else {
        		sortedrtn[l] = oddarr[l-even];
        	}
        }
        
        return sortedrtn;
    }

}
