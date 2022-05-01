public class ByIncrement implements Series {
    private int increment;
    private int start;
    private int val;

    public ByTwos(){
        start = 0;
        val = 0;
        inrement=p;
    }

    public int getNext() {
        val += increment;
        return val;
    }

    public void reset() {
        val = start;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }

}