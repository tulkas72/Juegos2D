package juego2D;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Principal
{
    public static void main(String[] args)
    {
        int myArray[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sumFila=IntStream.of(myArray[0]).sum() ;
        int sumaCol= Arrays.stream(myArray).mapToInt(row -> row[0]).sum();
        int diag1=IntStream.range(0,myArray.length).map(i -> myArray[i][i]).sum();
        int diag2 IntStream.range(0,myArray.length).map(i -> myArray[i][myArray.length-1-i]).sum();
    }
}
