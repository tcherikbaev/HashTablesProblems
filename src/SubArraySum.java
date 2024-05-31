import java.util.HashMap;
import java.util.Map;

public class SubArraySum {

    public static void main(String [] args)
    {
        int [] arr={1,1,1};
        int k=2;
        int result=subarraySum(arr,k);
        System.out.println("Amount of subarray K: "+result);

    }
    public static int subarraySum(int[] nums, int k) {
        int sum=0;
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;

    }
}
