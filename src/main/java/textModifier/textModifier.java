package textModifier;

public class textModifier {
    private String text;
    public textModifier(){
        this.text = "to jest tekst do zmiany";
    }

    public textModifier(String text){
        this.text = text;
    }

    public String giveMeText(){
        return this.text;
    }

    public String changeNthCharInText(int charPosition, char oldValue, char newValue){
        char actualValue = this.text.charAt(charPosition-1);
        if(actualValue == oldValue){
            this.text = this.text.substring(0, charPosition-1)
                    + newValue
                    + this.text.substring(charPosition);
        }
        return this.text;
    }

    public String changeEveryNthCharInText(int n, char oldValue, char newValue){
        String newText = this.text;
        for(int i = n-1; i < newText.length(); i = i+n){
            char actualValue = newText.charAt(i);
            if(actualValue == oldValue){
                newText = newText.substring(0, i)
                        + newValue
                        + newText.substring(i+1);
            }
        }
        this.text = newText;
        return this.text;
    }

    public String replaceNth(int n, char oldValue, char newValue){
        String newText = this.text;
        int charOccurrenceCounter = 0;
        char actualValue;
        for(int i = 0; i < newText.length(); i++){
            actualValue = newText.charAt(i);
            if(actualValue == oldValue){
                charOccurrenceCounter++;
                if(charOccurrenceCounter == n) {
                    newText = newText.substring(0, i)
                            + newValue
                            + newText.substring(i + 1);
                    charOccurrenceCounter = 0;
                }
            }
        }
        this.text = newText;
        return this.text;
    }
}
