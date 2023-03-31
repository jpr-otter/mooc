

public class Statistics {
    private int count = 0;
    private int sum = 0;
    private double average = 0;
    private int even = 0;
    private int odd = 0;

    public Statistics(){
        this.count = count;
        this.sum = sum;
    }

    public void addNumber(int input){
        this.sum += input;
        this.count++;
    }

    public int getCount (){
        return this.count;
    }

    public int sum(){
        return this.sum;
    }

    public double average(){
        assert this.count != 0 : "count is 0";
        this.average = (double) this.sum / this.count;
        return this.average;
    }

    public int even(int input){
        if (input % 2 == 0){
            this.even +=input;
        } return this.even;
    }

    public int getEven(){ return this.even;}

    public int odd(int input){
        if (input % 2 != 0){
            this.odd += input;
        } return this.odd;
    }

    public int getOdd(){ return this.odd;}

}
