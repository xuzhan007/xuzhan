package range;

/**
 * Created by iss on 17/11/21.
 */
public class QuickSort {

    public static void main(String[] args) {
        float[] nums = {2,4,1,3,0,7, (float) 1.5, (float) -2.7,5};

        quickSort(nums,0,nums.length-1);

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }

    }



    private static void quickSort(float[] a ,int low , int high){
        int start = low;
        int end = high;
        float key = a[low];


        while(end>start){
            while(end>start&&a[end]>=key)
                end--;
            if(a[end]<=key){
                float temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }

            while(end>start&&a[start]<=key)
                start++;
            if(a[start]>=key){
                float temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }

        }
        //递归
        if(start>low) quickSort(a,low,start-1);
        if(end<high) quickSort(a,end+1,high);
    }
}
