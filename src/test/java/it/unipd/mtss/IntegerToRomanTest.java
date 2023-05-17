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
	public void Convert3() throws ZeroException, BiggerThan3Exception, NegativeNumberException{

		int arabic=3;
		String roman="III";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}


	//Testing exception
	@Test(expected = ZeroException.class)
	public void ConvertZero() throws ZeroException, BiggerThan3Exception, NegativeNumberException{
		int zero=0;

		IntegerToRoman.convert(zero);
	}

	@Test(expected = NegativeNumberException.class)
	public void NegativeNumber() throws ZeroException, BiggerThan3Exception, NegativeNumberException{
		int negative=-1;

		IntegerToRoman.convert(negative);
	}

	@Test(expected = BiggerThan3Exception.class)
	public void GreaterThan3() throws ZeroException, BiggerThan3Exception, NegativeNumberException{
		int bigger=10;

		IntegerToRoman.convert(bigger);
	}


	//Testing random numbers
	@Test
	public void Convert1() throws ZeroException, BiggerThan3Exception, NegativeNumberException{
		int arabic=1;
		String roman="I";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}

	@Test
	public void Convert2() throws ZeroException, BiggerThan3Exception, NegativeNumberException{
		int arabic=2;
		String roman="II";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}
	
}