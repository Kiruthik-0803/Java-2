import java.util.*;

public class Missing_number {

    static void usingNegativeMarker(ArrayList<Integer> arr){
        //assuming all are positive numbers
        //make all positive numbers
        ArrayList<Integer> missing = new ArrayList<>();
        for(int i = 0; i < arr.size(); i++){
            int val = arr.get(i);
            if(val<0) val = val*-1;
            if(val>0 && val < arr.size())
                arr.set(val-1,-1*arr.get(val-1));
        }
//        System.out.println(arr);
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) > 0){
                missing.add(i+1);
            }
        }
        System.out.println(missing);
    }
