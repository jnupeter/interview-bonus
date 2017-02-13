package cai.peter.interview.bonus;

/**
 * Created by peter on 13/02/17.
 */
public abstract class Performance {
    private String band;
    private String start;
    private String end;
    private int priority;

    Performance(final String band, final String start, final String end, final int priority) {
        this.band = band;
        this.start = start;
        this.end = end;
        this.priority = priority;
    }

    protected int getPriority(){
        return this.priority;
    }

    public abstract int[] showInArray();
}
