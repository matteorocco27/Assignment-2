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
			BiggerThan500Exception {
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
	public void Print5() throws NegativeNumberException, ZeroException, BiggerThan500Exception  {
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


	@Test
	public void Print10() throws NegativeNumberException, ZeroException, BiggerThan500Exception {
		int number= 10;
		String ascii= RomanPrinter.print(number);
		String X =(" __   __  \n"+
				" \\ \\ / /  \n"+
				"  \\ V /   \n"+
				"   > <    \n"+
				"  / . \\   \n"+
				" /_/ \\_\\  \n"
		);

		assertEquals(X , ascii);
	}


	@Test
	public void Print50() throws NegativeNumberException, ZeroException, BiggerThan500Exception {
		int number= 50;
		String ascii= RomanPrinter.print(number);
		String L =(
				"  _       \n"+
						" | |      \n"+
						" | |      \n"+
						" | |      \n"+
						" | |____  \n"+
						" |______| \n"
		);

		assertEquals(L , ascii);
	}


	@Test
	public void Print100() throws NegativeNumberException, ZeroException, BiggerThan500Exception {
		int number= 100;
		String ascii= RomanPrinter.print(number);
		String C =(
				"   _____   \n"+
						"  / ____|  \n"+
						" | |       \n"+
						" | |       \n"+
						" | |____   \n"+
						"  \\_____|  \n"
		);

		assertEquals(C , ascii);
	}

	@Test
	public void Print500() throws NegativeNumberException, ZeroException, BiggerThan500Exception {
		int number= 500;
		String ascii= RomanPrinter.print(number);
		String D =(
				"  ____    \n"+
						" |  __ \\  \n"+
						" | |  | | \n"+
						" | |  | | \n"+
						" | |__| | \n"+
						" |_____/  \n"
		);

		assertEquals(D , ascii);
	}
}
