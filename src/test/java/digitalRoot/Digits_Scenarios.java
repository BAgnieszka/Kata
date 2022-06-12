package digitalRoot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

final class Digits_Scenarios {
    @Test
    void SumDigitsOf12Is3(){
        //Given
        int number = 12;
        //When

        //Then
        byte expectedSum = 3;
        assertEquals(expectedSum, new digitalRoot().countDigitalRoot(number));
    }

    @Test
    void SumDigitsOf9999Is9(){
        //Given
        int number = 9999;
        //When

        //Then
        byte expectedSum = 9;
        assertEquals(expectedSum, new digitalRoot().countDigitalRoot(number));
    }
}
