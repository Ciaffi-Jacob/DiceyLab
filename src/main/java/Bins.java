
public class Bins {
    int min;
    int max;
    int [] bins;
    public  Bins(int min, int max){
        this.min = min;
        this.max = max;
        bins = new int[max + 1 - min];
    }

        public int getBins(int bin){
        return bins[bin - min];
        }
        public void increment(int bin){
        bins[bin - min]+= 1;
        }
}
