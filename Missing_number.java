import java.util.*;
public class Missing_number {
 static void usingNegativeMarker(ArrayList<Integer> arr){
        ArrayList<Integer> missing = new ArrayList<>();
        for(int i = 0; i < arr.size(); i++){
            int val = arr.get(i);
            if(val<0) val = val*-1;
            if(val>0 && val < arr.size())
                arr.set(val-1,-1*arr.get(val-1));
        }
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) > 0){
                missing.add(i+1);
            }
        }
        System.out.println(missing);
    }
    public static void main(String[] args){
        List<Integer> input = Arrays.asList(4,2,8,3,1);
        ArrayList<Integer> arr = new ArrayList<>(input);   
        usingNegativeMarker(arr);
    }
}