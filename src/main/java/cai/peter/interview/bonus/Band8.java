package cai.peter.interview.bonus;

/**
 * Created by peter on 14/02/17.
 */
public class Band8 extends Performance {

    public Band8(String start, String end, int priority){
        super("band8", start, end, priority);
    }

    @Override
    public int[] showInArray() {
        int[] result = new int[180];
        for (int i = 80; i < 110; i++) { //"8:20pm", "8:50pm"
            result[i] = this.getPriority();
        }
        return result;
    }
}
