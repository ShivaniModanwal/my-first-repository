public class UseSeries
{
    public static void printSeries(Series a, int howmany){
        for (int i=0;i<howmany;i++){
            System.out.println("Next number in Series: "+a.getNext());
        }
    }
    
    public static void main(String[] args){
        ByTwos bt = new ByTwos();
        ByThrees bth = new ByThrees();
        Series s1 = bt;
        
        bth.setStart(30);
        //printSeries(bt,10);
        //printSeries(bth, 20);
        ByIncrement o= new ByIncrement(100);
        s1=o;
        printSeries(s1,10);
    }
}