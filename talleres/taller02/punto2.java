
/**
 * Write a description of class punto2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class punto2 
{
    public static boolean sum(int start, int[] nums, int target) 
{
    if(start>=nums.length) return target==0;
    return sum(start+1,nums,target-nums[start]) || sum(start + 1, nums, target);
}

}