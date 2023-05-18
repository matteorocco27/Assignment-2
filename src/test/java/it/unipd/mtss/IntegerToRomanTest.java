////////////////////////////////////////////////////////////////////
// [MATTEO ALBERTO] [ROCCO] [2042354]
// [ION] [BOUROSU] [2010006]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;

public class IntegerToRomanTest {
	static IntegerToRoman converter;

	@BeforeClass
	public static void startConverter() {
		converter = new IntegerToRoman();
	}

	@Test
	public void convert3() throws ZeroException, BiggerThan1000Exception, NegativeNumberException{

		int arabic=3;
		String roman="III";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}

	@Test
	public void convert6() throws ZeroException, BiggerThan1000Exception, NegativeNumberException{
		int arabic=6;
		String roman="VI";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}

	@Test
	public void convert10() throws ZeroException, BiggerThan1000Exception, NegativeNumberException{
		int arabic=10;
		String roman="X";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}


	@Test
	public void convert20() throws ZeroException, BiggerThan1000Exception, NegativeNumberException{
		int arabic=20;
		String roman="XX";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}

	@Test
	public void convert50() throws ZeroException, BiggerThan1000Exception, NegativeNumberException{
		int arabic=50;
		String roman="L";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}

	@Test
	public void convert100() throws ZeroException, BiggerThan1000Exception, NegativeNumberException{
		int arabic=100;
		String roman="C";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}

	@Test
	public void convert200() throws ZeroException, BiggerThan1000Exception, NegativeNumberException{
		int arabic=200;
		String roman="CC";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}

	@Test
	public void convert500() throws ZeroException, BiggerThan1000Exception, NegativeNumberException{
		int arabic=500;
		String roman="D";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}

	@Test
	public void convert1000() throws ZeroException, BiggerThan1000Exception, NegativeNumberException{
		int arabic=1000;
		String roman="M";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}

	//Testing exception
	@Test(expected = ZeroException.class)
	public void convertZero() throws ZeroException, BiggerThan1000Exception, NegativeNumberException{
		int zero=0;

		IntegerToRoman.convert(zero);
	}

	@Test(expected = NegativeNumberException.class)
	public void negativeNumber() throws ZeroException, BiggerThan1000Exception, NegativeNumberException{
		int negative=-1;

		IntegerToRoman.convert(negative);
	}

	@Test(expected = BiggerThan1000Exception.class)
	public void greaterThan1000() throws ZeroException, BiggerThan1000Exception, NegativeNumberException{
		int bigger=4000;

		IntegerToRoman.convert(bigger);
	}


	//Testing random numbers
	@Test
	public void convert185() throws ZeroException, BiggerThan1000Exception, NegativeNumberException{
		int arabic=185;
		String roman="CLXXXV";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}

	@Test
	public void convert889() throws ZeroException, BiggerThan1000Exception, NegativeNumberException{
		int arabic=889;
		String roman="DCCCLXXXIX";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}
	
}