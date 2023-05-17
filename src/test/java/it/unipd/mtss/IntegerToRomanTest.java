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
	public void Convert3() throws ZeroException, BiggerThan10Exception, NegativeNumberException{

		int arabic=3;
		String roman="III";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}

	@Test
	public void Convert6() throws ZeroException, BiggerThan10Exception, NegativeNumberException{
		int arabic=6;
		String roman="VI";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}

	@Test
	public void Convert10() throws ZeroException, BiggerThan10Exception, NegativeNumberException{
		int arabic=10;
		String roman="X";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}


	//Testing exception
	@Test(expected = ZeroException.class)
	public void ConvertZero() throws ZeroException, BiggerThan10Exception, NegativeNumberException{
		int zero=0;

		IntegerToRoman.convert(zero);
	}

	@Test(expected = NegativeNumberException.class)
	public void NegativeNumber() throws ZeroException, BiggerThan10Exception, NegativeNumberException{
		int negative=-1;

		IntegerToRoman.convert(negative);
	}

	@Test(expected = BiggerThan10Exception.class)
	public void GreaterThan10() throws ZeroException, BiggerThan10Exception, NegativeNumberException{
		int bigger=40;

		IntegerToRoman.convert(bigger);
	}


	//Testing random numbers
	@Test
	public void Convert9() throws ZeroException, BiggerThan10Exception, NegativeNumberException{
		int arabic=9;
		String roman="IX";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}

	@Test
	public void Convert7() throws ZeroException, BiggerThan10Exception, NegativeNumberException{
		int arabic=7;
		String roman="VII";

		assertEquals(IntegerToRoman.convert(arabic), roman);
	}
	
}