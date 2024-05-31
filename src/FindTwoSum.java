import java.util.HashMap;
import java.util.Map;

public class FindTwoSum {

    public static void main(String [] args)
    {
        int []arr={2,7,11,15};
        int target=26;
        int [] result=twoSum(arr,target);
        assert result != null;
        System.out.println("The indexes of two numbers: "+ result[0]+" "+result[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int temp=target-nums[i];
            if(map.containsKey(temp))
            {
                return new int[] {map.get(temp),i};
            }
            map.put(nums[i],i);
        }
        return null;

    }
}
