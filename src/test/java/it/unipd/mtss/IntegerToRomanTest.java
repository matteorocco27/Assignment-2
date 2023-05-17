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
	public void Convert3() throws ZeroException, BiggerThan100Exception, NegativeNumberException{

		int arabic=3;
		String roman="III";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}

	@Test
	public void Convert6() throws ZeroException, BiggerThan100Exception, NegativeNumberException{
		int arabic=6;
		String roman="VI";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}

	@Test
	public void Convert10() throws ZeroException, BiggerThan100Exception, NegativeNumberException{
		int arabic=10;
		String roman="X";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}


	@Test
	public void Convert20() throws ZeroException, BiggerThan100Exception, NegativeNumberException{
		int arabic=20;
		String roman="XX";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}

	@Test
	public void Convert50() throws ZeroException, BiggerThan100Exception, NegativeNumberException{
		int arabic=50;
		String roman="L";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}

	@Test
	public void Convert100() throws ZeroException, BiggerThan100Exception, NegativeNumberException{
		int arabic=100;
		String roman="C";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}

	//Testing exception
	@Test(expected = ZeroException.class)
	public void ConvertZero() throws ZeroException, BiggerThan100Exception, NegativeNumberException{
		int zero=0;

		IntegerToRoman.convert(zero);
	}

	@Test(expected = NegativeNumberException.class)
	public void NegativeNumber() throws ZeroException, BiggerThan100Exception, NegativeNumberException{
		int negative=-1;

		IntegerToRoman.convert(negative);
	}

	@Test(expected = BiggerThan100Exception.class)
	public void GreaterThan100() throws ZeroException, BiggerThan100Exception, NegativeNumberException{
		int bigger=130;

		IntegerToRoman.convert(bigger);
	}


	//Testing random numbers
	@Test
	public void Convert96() throws ZeroException, BiggerThan100Exception, NegativeNumberException{
		int arabic=96;
		String roman="XCVI";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}

	@Test
	public void Convert83() throws ZeroException, BiggerThan100Exception, NegativeNumberException{
		int arabic=83;
		String roman="LXXXIII";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}
	
}
