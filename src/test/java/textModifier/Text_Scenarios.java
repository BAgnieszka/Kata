package textModifier;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

final class Text_Scenarios {

    @Test
    void ThirdLetterInTextChangedFromAToB() {
        //Given
        String text = "brawura";
        //When
        char oldValue = 'a';
        char newValue = 'b';
        int charPosition = 3;
        //Then
        String newText = "brbwura";
        assertEquals(newText, new textModifier(text).changeNthCharInText(charPosition, oldValue, newValue));
    }

    @Test
    void ThirdLetterInTextNotChangedFromAToB() {
        //Given
        String text = "brzdęk";
        //When
        char oldValue = 'a';
        char newValue = 'b';
        int charPosition = 3;
        //Then
        String newText = "brzdęk";
        assertEquals(newText, new textModifier(text).changeNthCharInText(charPosition, oldValue, newValue));
    }

    @Test
    void ThirdLetterInTextChangedFromZToB() {
        //Given
        String text = "brzdęk";
        //When
        char oldValue = 'z';
        char newValue = 'b';
        int charPosition = 3;
        //Then
        String newText = "brbdęk";
        assertEquals(newText, new textModifier(text).changeNthCharInText(charPosition, oldValue, newValue));
    }

    @Test
    void EveryThirdLetterInTextChangedFromAToB() {
        //Given
        String text = "blablabla";
        //When
        char oldValue = 'a';
        char newValue = 'b';
        int charPosition = 3;
        //Then
        String newText = "blbblbblb";
        assertEquals(newText, new textModifier(text).changeEveryNthCharInText(charPosition, oldValue, newValue));
    }

    @Test
    void EveryFourthLetterInTextChangedFromAToO() {
        //Given
        String text = "Vader said: No, I am your father!";
        //When
        char oldValue = 'a';
        char newValue = 'o';
        int charPosition = 4;
        //Then
        String newText = "Vader soid: No, I am your fother!";
        assertEquals(newText, new textModifier(text).changeEveryNthCharInText(charPosition, oldValue, newValue));
    }

    @Test
    void EverySecondLetterInTextChangedFromAToO() {
        //Given
        String text = "Vader said: No, I am your father!";
        //When
        char oldValue = 'a';
        char newValue = 'o';
        int charPosition = 2;
        //Then
        String newText = "Voder soid: No, I am your fother!";
        assertEquals(newText, new textModifier(text).changeEveryNthCharInText(charPosition, oldValue, newValue));
    }

    @Test
    public void basicTests() {
        assertEquals("Vader soid: No, I am your fother!", new textModifier("Vader said: No, I am your father!").replaceNth(2, 'a', 'o'));
        assertEquals("Vader said: No, I am your fother!", new textModifier("Vader said: No, I am your father!").replaceNth(4, 'a', 'o'));
        assertEquals("Vader said: No, I am your father!", new textModifier("Vader said: No, I am your father!").replaceNth(6, 'a', 'o'));
        assertEquals("Vader said: No, I am your father!", new textModifier("Vader said: No, I am your father!").replaceNth(0, 'a', 'o'));
        assertEquals("Vader said: No, I am your father!", new textModifier("Vader said: No, I am your father!").replaceNth(-2, 'a', 'o'));
        assertEquals("Vader sayd: No, I am your father!", new textModifier("Vader said: No, I am your father!").replaceNth(1, 'i', 'y'));
        assertEquals("Luke cries: Noooooioooooioooo!", new textModifier("Luke cries: Noooooooooooooooo!").replaceNth(6, 'o', 'i'));
    }
}
