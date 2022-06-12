package digitalRoot;

public class digitalRoot {
    private byte sum;
    public digitalRoot(){
       // this.sum = 0;
    }
    public byte countDigitalRoot(int number) {
        String digits = Integer.toString(number);
        byte sum = 0;
        for(int i = 0; i < digits.length(); i++){
            sum += Character.getNumericValue(digits.charAt(i));
        }
        if(sum > 9){
            sum = this.countDigitalRoot(sum);
        }
        return sum;
    }
}
