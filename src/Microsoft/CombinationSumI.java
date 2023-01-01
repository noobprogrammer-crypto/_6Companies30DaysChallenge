package Microsoft;
import java.util.*;

public class CombinationSumI {
    public static void combinations(int arr[],List<Integer> ds, List<List<Integer>> ans, int index, int target){

        // if we reach the end of the array
        if(index == arr.length){
            // and find that the target is equal to zero
            if(target==0){
            // we will add the numbers stored in the data-structure to our ans arraylist
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        // if the index value is lesser or equal than the target
        if(arr[index]<=target){
            // we will add it in our data structure
            ds.add(arr[index]);
            // and further choose the same index by calling the recursive function
            combinations(arr,ds,ans,index,target-arr[index]);
            // if we do not require the value at that index and backtrack, remove the value last added to the
            // data structure
            ds.remove(ds.size()-1);
        }
        // otherwise increase the index as we did not stick to the same index
        combinations(arr,ds,ans,index+1,target);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        combinations(candidates,new ArrayList<>(),ans,0,target);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,7};
        System.out.println(combinationSum(arr,7));
    }
}
