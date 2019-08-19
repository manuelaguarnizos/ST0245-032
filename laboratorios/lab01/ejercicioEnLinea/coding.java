
/**
 * Write a description of class coding here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class coding
{
// 1 recursion1
public int factorial(int n) {
  if(n==1)return 1;
  else return n*factorial(n-1);
}
// 2 recursion1
public int bunnyEars(int bunnies) {
  if(bunnies==0)return 0;
  else return 2+bunnyEars(bunnies-1);
}
// 3 recursion1
public int fibonacci(int n) {
  if (n==0) return 0;
  if(n==1) return 1;
  
  else return  fibonacci(n-1)+fibonacci(n-2);
    
}
// 4 recursion1
public int bunnyEars2(int bunnies) {
  if(bunnies==0) return 0;
  if(bunnies%2==0) return 3+ bunnyEars2(bunnies-1);
  else return 2+ bunnyEars2(bunnies-1);
}
// 5 recursion1
public int triangle(int rows) {
  if(rows==0)return 0;
  if (rows==1) return 1;
  else return  rows + triangle(rows-1);
  
}
// 1 recursion2
public boolean groupSum6(int start, int[] nums, int target) {
  if(nums.length<=start) return target==0;
  
  if(groupSum6(start+1, nums, target-nums[start])) return true;
  if((nums[start]>6 || nums [start]<6 )&& groupSum6(start+1, nums, target)) return true;
  else return false;
  
}
// 2 recursion2
public boolean groupNoAdj(int start, int[] nums, int target) {
  if(nums.length<=start) return target==0;
  if(groupNoAdj(start+1, nums, target)) return true;
  if(groupNoAdj(start+2, nums, target- nums[start])) return true;
  else return false;
}
//3 recursion2
public boolean splitArray(int[] nums) {
  int sgrupo1=0;
  int sgrupo2=0;
  int start=0;
  return met2(start, nums, sgrupo1, sgrupo2);
}
public boolean met2(int start, int [] nums, int sgrupo1, int sgrupo2)
{
  if(nums.length<=start) return sgrupo1==sgrupo2;
  else return(met2(start+1, nums, sgrupo1 + nums[start], sgrupo2) || met2(start+1, nums, sgrupo1, sgrupo2+ nums[start]));
}
// 4 recursion2
public boolean split53(int[] nums) {
  int sgrupo1=0;
  int sgrupo2=0;
  int start=0;
  return met2(start, nums, sgrupo1, sgrupo2);
}
public boolean met2u(int start, int [] nums, int sgrupo1, int sgrupo2)
{
  if(nums.length<=start) return sgrupo1==sgrupo2;
  if(nums[start]%5==0) return met2(start+1, nums, sgrupo1 + nums[start], sgrupo2);
  else if(nums[start]%3==0) return  met2(start+1, nums, sgrupo1, sgrupo2+ nums[start]);
  else return met2(start+1, nums, sgrupo1 + nums[start], sgrupo2) || met2(start+1, nums, sgrupo1, sgrupo2+ nums[start]);
}
//5 recursion2

public boolean splitOdd10(int[] nums) {
  int sgrupo1=0;
  int sgrupo2=0;
  int start=0;
  return met2(start, nums, sgrupo1, sgrupo2);
}
public boolean met2p(int start, int [] nums, int sgrupo1, int sgrupo2)
{
  if(nums.length<=start) return (sgrupo1%10==0 && sgrupo2%2 !=0) || (sgrupo2%10==0 && sgrupo1%2 !=0) ;
  else return(met2(start+1, nums, sgrupo1 + nums[start], sgrupo2) || met2(start+1, nums, sgrupo1, sgrupo2+ nums[start]));
}
}
