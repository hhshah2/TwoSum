public class TwoSum {
    public int [] twoSum(int [] arr, int sum)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i; j < arr.length; j++)
            {
                if(arr[i] + arr[j] == sum)
                {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }

    public static void main(String [] args)
    {
        TwoSum object = new TwoSum();
        int nums[] = {12,2,15,6,9};
        System.out.println(object.twoSum(nums, 8));
        
    }
}