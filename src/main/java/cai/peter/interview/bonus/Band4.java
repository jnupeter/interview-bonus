package cai.peter.interview.bonus;

/**
 * Created by peter on 14/02/17.
 */
public class Band4 extends Performance {

    public Band4(String start, String end, int priority){
        super("band4", start, end, priority);
    }

    @Override
    public int[] showInArray() {
        int[] result = new int[180];
        for (int i = 66; i < 106; i++) { //"8:06pm", "8:46pm"
            result[i] = this.getPriority();
        }
        return result;
    }
}
