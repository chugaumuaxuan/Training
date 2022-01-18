package ThuTuChayTrongClass;

public class Example {
	  static {
	        System.out.print("This is static block\n");
	    }
	 
	    {
	        System.out.print("This is instance block\n");
	    }
	 
	    public Example() {
	        System.out.print("This is constructor\n");
	    }
	 
	    public static void main(String[] args) {
	        Example e = new Example();
	    }
}
