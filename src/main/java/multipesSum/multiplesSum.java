package multipesSum;

public class multiplesSum {

    private int sum;
    public multiplesSum(){
        this.sum = 0;
    }

    public int sumMultiplesOf3And5BelowNumber(int number) {
        for(int i = 3; i < number; i = i + 3){
            this.sum = this.sum + i;
        }
        for(int i = 5; i < number; i = i + 5){
            this.sum = this.sum + i;
        }
        for(int i = 15; i < number; i = i + 15){
            this.sum = this.sum - i;
        }
        return this.sum;
    }
}
