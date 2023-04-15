import java.time.Clock;

public class Timer {

    private ClockHand secondsDividedHundred;
    private ClockHand seconds;
    private int value;
    //private int limit;

    public Timer(){

        this.secondsDividedHundred = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance(){
        this.secondsDividedHundred.advance();
        if (this.secondsDividedHundred.value() == 0){
            this.seconds.advance();
        }
    }

    public int value() {
        return this.value;
    }

    public String toString(){
        return seconds + ":" + secondsDividedHundred;
    }


}
