import java.util.*;
public class E_ActivitySelection {

    public static void ActivitySelection(int[] activities, int[] start, int[] finish){

        for(int i=0; i<activities.length; i++){
            for(int j=i+1; j<activities.length; j++){
                if(finish[i]>finish[j]){
                    int tempFinish=finish[i];
                    int tempStart=start[i];
                    int tempActivities=activities[i];

                    finish[i]=finish[j];
                    start[i]=start[j];
                    activities[i]=activities[j];

                    finish[j]=tempFinish;
                    start[j]=tempStart;
                    activities[j]=tempActivities;
                }
            }
        }
        for(int i=0; i<activities.length; i++) {
            System.out.print(activities[i] + "\t");
        }
        System.out.println("");
        for(int i=0; i<activities.length; i++) {
            System.out.print(finish[i] + "\t");
        }
        System.out.println("");

        int current=0;
        System.out.print(current+1 + "\t");
        for(int i=1; i<activities.length; i++){
            if(start[i]>=finish[current]){
                current=i;
                System.out.print(current+1 + "\t");
            }
        }


    }
    public static void main(String[] args) {

        int[] start = {0,3,5,6,1,3,5,12,8,2,8};
        int[] finish = {6,9,9,10,4,5,7,16,12,14,11};
        int[] activities={1,2,3,4,5,6,7,8,9,10,11};

        ActivitySelection(activities, start, finish);

    }
}
