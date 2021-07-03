package sg.edu.iss.orc.controller;

public class Request {
	
	private int fibonacci;

    public Request() {
    	fibonacci = 0;
    }

    public Request(final int i) {
    	fibonacci = i;
    }

    public int getValue() {
        return fibonacci;
    }

    public void setValue(final int i) {
    	fibonacci = i;
        }
}
