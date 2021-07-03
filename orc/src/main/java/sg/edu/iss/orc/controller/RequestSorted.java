package sg.edu.iss.orc.controller;

public class RequestSorted {
	
	private int sorted;

    public RequestSorted() {
    	sorted = 0;
    }

    public RequestSorted(final int i) {
    	sorted = i;
    }

    public int getValue() {
        return sorted;
    }

    public void setValue(final int i) {
    	sorted = i;
        }

}
