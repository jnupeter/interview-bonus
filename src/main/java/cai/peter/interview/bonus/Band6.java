package cai.peter.interview.bonus;

/**
 * Created by peter on 14/02/17.
 */
public class Band6 extends Performance {

    public Band6(String start, String end, int priority){
        super("band6", start, end, priority);
    }

    @Override
    public int[] showInArray() {
        int[] result = new int[180];
        for (int i = 136; i < 165; i++) { //"9:16pm", "9:45pm"
            result[i] = this.getPriority();
        }
        return result;
    }
}
