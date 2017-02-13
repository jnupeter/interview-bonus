package cai.peter.interview.bonus;

/**
 * Created by peter on 14/02/17.
 */
public class Band2 extends Performance {

    public Band2(String start, String end, int priority){
        super("band2", start, end, priority);
    }

    @Override
    public int[] showInArray() {
        int[] result = new int[180];
        for (int i = 15; i< 45; i++) { //from "7:16pm" to "7:45pm"
            result[i] = this.getPriority();
        }
        return result;
    }
}
