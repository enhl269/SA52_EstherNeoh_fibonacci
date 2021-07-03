package sg.edu.iss.orc.controller;

public class ResponseArray {
	
    private long[] fibonacci;
    private long[] sorted;

    private String error;

    public ResponseArray(final long id) {
        this(new long[0], new long[0]);
    }

    public ResponseArray(final long[] aL, final long[] bL) {
        if (aL == null || aL.length == 0) {
        	fibonacci = new long[0];
        	sorted = new long[0];
        } else {
        	fibonacci = new long[aL.length];
        	sorted = new long[aL.length];
            System.arraycopy(aL, 0, fibonacci, 0, fibonacci.length);
            System.arraycopy(aL, 0, sorted, 0, sorted.length);
            
        }
        //error = err;
    }

    public long[] getFibonacci() {
        final long[] rtn;
        if (fibonacci == null || fibonacci.length == 0) {
            rtn = new long[0];
        } else {
            rtn = new long[fibonacci.length];
            System.arraycopy(fibonacci, 0, rtn, 0, rtn.length);
        }
        return rtn;
    }

    public void setFibonacci(final long[] aL) {
        if (aL == null || aL.length == 0) {
        	fibonacci = new long[0];
        } else {
        	fibonacci = new long[aL.length];
            System.arraycopy(aL, 0, fibonacci, 0, fibonacci.length);
        }
    }
    
    public long[] getSorted() {
        final long[] rtn;
        if (sorted == null || sorted.length == 0) {
            rtn = new long[0];
        } else {
            rtn = new long[sorted.length];
            System.arraycopy(sorted, 0, rtn, 0, rtn.length);
        }
        return rtn;
    }

    public void setSorted(final long[] aL) {
        if (aL == null || aL.length == 0) {
        	sorted = new long[0];
        } else {
        	sorted = new long[aL.length];
            System.arraycopy(aL, 0, sorted, 0, sorted.length);
        }
    }

    //public String getError() {
      //  return error;
   // }

    //public void setError(final String err) {
     //   error = err;
   // }

}
