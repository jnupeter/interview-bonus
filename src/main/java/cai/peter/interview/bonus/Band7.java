package cai.peter.interview.bonus;

/**
 * Created by peter on 14/02/17.
 */
public class Band7 extends Performance {

    public Band7(String start, String end, int priority){
        super("band7", start, end, priority);
    }

    @Override
    public int[] showInArray() {
        int[] result = new int[180];
        for (int i = 140; i < 155; i++) { //"9:20pm", "9:35pm"
            result[i] = this.getPriority();
        }
        return result;
    }
}
