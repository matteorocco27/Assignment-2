////////////////////////////////////////////////////////////////////
// [MATTEO ALBERTO] [ROCCO] [2042354]
// [ION] [BOUROSU] [2010006]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class RomanPrinterTest {
	static RomanPrinter printer;


	@BeforeClass
	public static void startPrinter() {
		printer = new RomanPrinter();
	}

	@Test
	public void Print1() throws NegativeNumberException, ZeroException,
			BiggerThan6Exception {
		int number= 1;
		String ascii= RomanPrinter.print(number);
		String I =(
				"  _____  \n"+
						" |_   _| \n"+
						"   | |   \n"+
						"   | |   \n"+
						"  _| |_  \n"+
						" |_____| \n");

		assertEquals(I , ascii);
	}


	@Test
	public void Print5() throws NegativeNumberException, ZeroException, BiggerThan6Exception  {
		int number= 5;
		String ascii= RomanPrinter.print(number);
		String V =(
				" __      __ \n"+
						" \\ \\    / / \n"+
						"  \\ \\  / /  \n"+
						"   \\ \\/ /   \n"+
						"    \\  /    \n"+
						"     \\/     \n");

		assertEquals(V , ascii);
	}

}
