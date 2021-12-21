package ExeceptionTest;

import java.io.IOException;

class Bike{
	
	void run()throws IOException {
		System.out.println(" throws IOException ");
	}
	
	void info() throws IOException {
		run();
		System.out.println("rest of code");
	}

}

public class ExecptionPra3Throws {
	
	public static void main(String[] args) throws IOException {
		Bike B1 = new Bike();
		B1.info();
	}

}
