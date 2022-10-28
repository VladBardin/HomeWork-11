package Task4;

public class MyRandom {
    private final long a;
    private final int c;
    private final double m;

    private long seed;

    public MyRandom seed(long seed) {
        this.seed = seed;
        return this;
    }
    public MyRandom(long a, int c, double m) {
        this.a = a;
        this.c = c;
        this.m = m;
    }

    public long next() {
        return (long) ((a * seed + c) % m);
    }
}
