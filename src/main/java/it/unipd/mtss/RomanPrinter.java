////////////////////////////////////////////////////////////////////
// [MATTEO ALBERTO] [ROCCO] [2042354]
// [ION] [BOUROSU] [2010006]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;


public class RomanPrinter {
    public static String print(int number) throws ZeroException, NegativeNumberException, BiggerThan3Exception {
        return printAsciiArt(IntegerToRoman.convert(number));
    }

    private static String printAsciiArt(String romanNumber) {
        String[] I = {
                "  _____  ",
                " |_   _| ",
                "   | |   ",
                "   | |   ",
                "  _| |_  ",
                " |_____| "};


        String result = "";


        for (int j = 0; j < 6; j++) {

            for (char c : romanNumber.toCharArray()) {
                if (c == 'I') {
                    result += I[j];
                }

            }

            result += "\n";
        }

        return result;
    }
}