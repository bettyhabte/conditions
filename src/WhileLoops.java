import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhileLoops {
    public static void main(String[] args){
        int[] nums = {1,0,1,2,5,6,8,9,10,12};
        Arrays.sort(nums);//[1,2,3,4,100,200]
        System.out.println(Arrays.toString(nums));
        System.out.println(nums.length);

        List<Integer> consecutiveNumbers = new ArrayList<>();
        int count = 0;

        int i = 0;
        while(i < nums.length && (i+1) < nums.length){
            System.out.println("the value of i is  "+ i);
            if(nums[i]==nums[i+1]-1){
                System.out.println(nums[i]+ " " +(nums[i+1]-1));
                count++;
                System.out.println("count is"+ " "+ count);
            }else{
                count=0;
            }
            i++;
        }

        System.out.println(count);
    }

    //Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

    //You must write an algorithm that runs in O(n) time.
//    Example 1:
//
//    Input: nums = [100,4,200,1,3,2]
//    Output: 4
//    Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.




}
