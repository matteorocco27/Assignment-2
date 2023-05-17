////////////////////////////////////////////////////////////////////
// [MATTEO ALBERTO] [ROCCO] [2042354]
// [ION] [BOUROSU] [2010006]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
public class IntegerToRoman {
public static String convert(int number) throws ZeroException, NegativeNumberException, BiggerThan50Exception{
    if(number==0) {throw new ZeroException(); }
    if(number<0) {throw new NegativeNumberException();}
    if(number>50) {throw new BiggerThan50Exception();}

    int[] values = {50, 40, 10, 9, 5, 4, 1};
    String[] romanLetters = {"L", "XL", "X", "IX", "V", "IV", "I"};
    StringBuilder roman = new StringBuilder();
    for (int i = 0; i < values.length; i++) {
    while (number >= values[i]) {
    number = number - values[i];
    roman.append(romanLetters[i]);
    }
    }
return roman.toString();
}
}
