package felix;

import java.math.*;

public class Kaka {

	public static void main(String[] args) {
		
		ExceptionHandling ex_handle = new ExceptionHandling();
		
		try {
			ex_handle.EOF_handle(args);
		} catch (Exception e) {
			System.out.println("End of file reached");
		}
		
		System.out.println("End of main()");
	}

}
