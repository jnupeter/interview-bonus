package cai.peter.interview.bonus;

/**
 * Created by peter on 13/02/17.
 */
public class Main {

    /**
     * Let's assume the big night will last 3 hours (180mins), say 7:00pm to 10:00pm
     * Use a 2-D array to represent all the performance
     */

    public static void main(String[] args) {
        // 10 bands, and 180mins, at a particular minute, if the band is performing at the time, use the priority value
        // if not performing, use 0 (zero)
        // so the solution will be an array of 180 to indicate for a particular minute, which band to stay with.
        // for example, if the solution is
        // solution = {3,3,3,3,5,5,5,5,0,0,0,0,0,0..........}
        // means for the first 4 minutes stay with band 3, then spend another 4 minutes stay with band 5, then break for
        // 6 minutes.
        int[][] performances = new int[10][180];

        //init the performances
        // not actually parsing the start time and end time, just hard-coded
        Performance band1 = new Band1("7:01pm", "7:30pm", 5);
        Performance band2 = new Band2("7:16pm", "7:45pm", 4);
        Performance band3 = new Band3("7:46pm", "8:05pm", 6);
        Performance band4 = new Band4("8:06pm", "8:46pm", 5);
        Performance band5 = new Band5("8:30pm", "9:00pm", 2);
        Performance band6 = new Band6("9:16pm", "9:45pm", 7);
        Performance band7 = new Band7("9:20pm", "9:35pm", 8);
        Performance band8 = new Band8("8:20pm", "8:50pm", 9);
        Performance band9 = new Band9("9:30pm", "9:50pm", 10);
        Performance band10 = new Band10("7:31pm", "8:00pm", 3);

        performances[0] = band1.showInArray();
        performances[1] = band2.showInArray();
        performances[2] = band3.showInArray();
        performances[3] = band4.showInArray();
        performances[4] = band5.showInArray();
        performances[5] = band6.showInArray();
        performances[6] = band7.showInArray();
        performances[7] = band8.showInArray();
        performances[8] = band9.showInArray();
        performances[9] = band10.showInArray();

        //calculate the schedule
        int[] solution = new int[180];
        for(int i = 0; i < 180; i++) { //on minute basic
            int[] temp = new int[9];
            for(int j = 0; j < 9; j++) {
                temp[j] = performances[j][i];
            }
            solution[i] = maxAt(temp);  // i th minute is with this band, represented as 1,2,3,...10
        }

        //output
        for(int i = 0; i< 180; i++) {
            if(solution[i] == 0) {
                System.out.println("Minute " + (i + 1) +":Break");
            } else {
                System.out.println("Minute " + (i + 1) + ":Stay with band" + solution[i]);
            }
        }
    }

    /**
     * Find the index of the first maximum value
     * @param numbers
     * @return
     */
    private static int maxAt(int[] numbers) {
        int k = 0;
        int maxValue = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                k = i;
            }
        }
        if(numbers[k] == 0){ //no performance
            return 0;
        } else {
            return k+1;
        }
    }
}
