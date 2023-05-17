////////////////////////////////////////////////////////////////////
// [MATTEO ALBERTO] [ROCCO] [2042354]
// [ION] [BOUROSU] [2010006]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NegativeNumberException  extends Exception{
    public NegativeNumberException(){
        super("Non esistono numeri negativi in notazione romana");
    }
}
