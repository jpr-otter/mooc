public class Gauge {

    private int value = 0;

    public Gauge(){
        this.value = value;
    }

    public void increase(){
        if (this.value < 5){
            this.value++;
        }

    }

    public void decrease(){
        if (this.value > 0){
            this.value--;
        }
    }

    public int value(){
        return this.value;
    }

    public boolean full(){
        if (this.value == 5){
            return true;
        }
        return false;
    }
}
