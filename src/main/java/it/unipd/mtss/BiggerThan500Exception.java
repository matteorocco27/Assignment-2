////////////////////////////////////////////////////////////////////
// [MATTEO ALBERTO] [ROCCO] [2042354]
// [ION] [BOUROSU] [2010006]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class BiggerThan500Exception  extends Exception{
    public BiggerThan500Exception(){
        super("Non sono supportati numeri maggiori di 500");
    }
}
