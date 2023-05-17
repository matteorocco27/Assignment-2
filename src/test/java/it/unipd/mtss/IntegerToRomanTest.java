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
	public void Convert3() throws ZeroException, BiggerThan6Exception, NegativeNumberException{

		int arabic=3;
		String roman="III";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}

	@Test
	public void Convert6() throws ZeroException, BiggerThan6Exception, NegativeNumberException{
		int arabic=6;
		String roman="VI";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}


	//Testing exception
	@Test(expected = ZeroException.class)
	public void ConvertZero() throws ZeroException, BiggerThan6Exception, NegativeNumberException{
		int zero=0;

		IntegerToRoman.convert(zero);
	}

	@Test(expected = NegativeNumberException.class)
	public void NegativeNumber() throws ZeroException, BiggerThan6Exception, NegativeNumberException{
		int negative=-1;

		IntegerToRoman.convert(negative);
	}

	@Test(expected = BiggerThan6Exception.class)
	public void GreaterThan6() throws ZeroException, BiggerThan6Exception, NegativeNumberException{
		int bigger=10;

		IntegerToRoman.convert(bigger);
	}


	//Testing random numbers
	@Test
	public void Convert4() throws ZeroException, BiggerThan6Exception, NegativeNumberException{
		int arabic=4;
		String roman="IV";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}

	@Test
	public void Convert() throws ZeroException, BiggerThan6Exception, NegativeNumberException{
		int arabic=5;
		String roman="V";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}
	
}