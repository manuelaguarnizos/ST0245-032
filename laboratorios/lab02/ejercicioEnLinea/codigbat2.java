//Array 2 condingBat
//Punto1 CountEvens
public int countEvens(int[] nums) {
  int cont=0;
  for(int i=0; i<=nums.length-1; i++)
  {
    if(nums[i]%2==0)
    {
      cont++;
    }
  }
  return cont;
}
// Punto2 bidDiff
public int bigDiff(int[] nums) {
  if(nums.length==1)
  {
    return 0;
  }else 
  {
    int min1= Math.min(nums[0],nums[1]);
    int max1= Math.max(nums[0],nums[1]);
    for(int i=0; i<=nums.length-1; i++)
    {
      min1= Math.min(min1,nums[i]);
      max1= Math.max(max1,nums[i]);
    }
    return max1-min1;
  }
    
}
// Punto 3 Sum13
public int sum13(int[] nums) {
  int suma=0;
  for(int i=0; i <= nums.length-1; i++)
  {
    if(nums[i]!=13) suma+=nums[i];
    else if(i<=nums.length-1) i++;
  }
  return suma;
}
// Punto 4 Sum67
public int sum67(int[] nums) {
  int sum=0;
  for(int i =0; i<=nums.length-1; i++)
  {
    if(nums[i]!=6) 
    {
      sum+=nums[i];
    }
    else
    {
      while(nums[i]!=7)
      i++;
      
    }
  }
  return sum;
}
//Punto 5 Has 22

public boolean has22(int[] nums) {
  for(int i=0; i<=nums.length-2; i++)
  
    if(nums[i]==2 && nums [i+1]==2) return true;
  return false;
}
//Array 3 condingBat
//Punto1 Fix34
public int[] fix34(int[] nums) {
  for (int i=0; i<= nums.length-2; i++)
  {
    if(nums[i]==3)
    {
      int s= nums[i+1];
      nums[i+1]=4;
      for(int j=i+2; j<=nums.length-1; j++)
      {
        if(nums[j]==4)
        {
          nums[j]=s;
          
        }
      }
    } 
  }
  return nums;
}
//Punto2
public int[] fix45(int[] nums) {
  for(int i=0; i<=nums.length-1; i++)
  {
    if(nums[i]==4)
    {
      int sus= nums [i+1];
      nums [i+1]= 5;
      if(nums[0]==5)
      {
        nums[0]=sus;
      }else{
        for(int j=1; j<=nums.length-1; j++)
        {
          if(nums[j]==5 && nums [j-1]!=4) 
          {
            nums[j]=sus;
          }
        }
      }
    }
    
  }
  return nums;
}