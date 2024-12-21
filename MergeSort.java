import java.util.*;
class MergeSort{
    public static void main(String[] args){
        int[] arr={8,7,6,5,4,3,2,1,9,0};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        }
    public static void mergeSort(int[] arr, int low,int high){
         int mid = low+(high-low)/2;
         if(low>=high)
            return;
         mergeSort(arr,low,mid);
         mergeSort(arr,mid+1,high);
         merge(arr,low,mid,high);
    }
    static void merge(int[] arr, int low, int mid, int high){
        int i,j,k;
        i=low;
        j=mid+1;
        k=0;
        int[] a=new int[high-low+1];
        while(i<=mid & j<=high){
            if(arr[i]<arr[j]){
                a[k++]=arr[i++];
            }else{
                a[k++]=arr[j++];
            }
        }
        while(i<=mid)
            a[k++]=arr[i++];
        while(j<=high)
            a[k++]=arr[j++];
        for(int m=low;m<=high;m++)
            arr[m]=a[m-low];
        
    }
}