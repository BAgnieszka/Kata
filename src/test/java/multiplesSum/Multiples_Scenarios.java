package multiplesSum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import multipesSum.multiplesSum;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

final class Multiples_Scenarios {

    @Test
    void Sum3And5MultiplesBelow10(){
        //Given
        int number = 10;
        //When

        //Then
        int expectedSum = 23;
        assertEquals(expectedSum, new multiplesSum().sumMultiplesOf3And5BelowNumber(number));
    }

    @Test
    void Sum3And5MultiplesBelow16(){
        //Given
        int number = 16;
        //When

        //Then
        int expectedSum = 60;
        assertEquals(expectedSum, new multiplesSum().sumMultiplesOf3And5BelowNumber(number));
    }

    @Test
    void SumOf3And5MultiplesBelowNegativeNumberIs0(){
        //Given
        int number = -1;
        //When

        //Then
        int expectedSum = 0;
        assertEquals(expectedSum, new multiplesSum().sumMultiplesOf3And5BelowNumber(number));
    }
}
