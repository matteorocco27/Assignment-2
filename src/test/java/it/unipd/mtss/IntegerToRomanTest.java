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
	public static void StartConverter() {
		converter = new IntegerToRoman();
	}

	@Test
	public void Convert3() throws ZeroException, BiggerThan50Exception, NegativeNumberException{

		int arabic=3;
		String roman="III";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}

	@Test
	public void Convert6() throws ZeroException, BiggerThan50Exception, NegativeNumberException{
		int arabic=6;
		String roman="VI";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}

	@Test
	public void Convert10() throws ZeroException, BiggerThan50Exception, NegativeNumberException{
		int arabic=10;
		String roman="X";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}


	@Test
	public void Convert20() throws ZeroException, BiggerThan50Exception, NegativeNumberException{
		int arabic=20;
		String roman="XX";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}

	@Test
	public void Convert50() throws ZeroException, BiggerThan50Exception, NegativeNumberException{
		int arabic=50;
		String roman="L";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}

	//Testing exception
	@Test(expected = ZeroException.class)
	public void ConvertZero() throws ZeroException, BiggerThan50Exception, NegativeNumberException{
		int zero=0;

		IntegerToRoman.convert(zero);
	}

	@Test(expected = NegativeNumberException.class)
	public void NegativeNumber() throws ZeroException, BiggerThan50Exception, NegativeNumberException{
		int negative=-1;

		IntegerToRoman.convert(negative);
	}

	@Test(expected = BiggerThan50Exception.class)
	public void GreaterThan50() throws ZeroException, BiggerThan50Exception, NegativeNumberException{
		int bigger=60;

		IntegerToRoman.convert(bigger);
	}


	//Testing random numbers
	@Test
	public void Convert48() throws ZeroException, BiggerThan50Exception, NegativeNumberException{
		int arabic=48;
		String roman="XLVIII";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}

	@Test
	public void Convert34() throws ZeroException, BiggerThan50Exception, NegativeNumberException{
		int arabic=34;
		String roman="XXXIV";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}
	
}
