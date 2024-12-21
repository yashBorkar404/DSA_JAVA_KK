import java.util.*;
public class QuickSort {
    public static void main(String[] args) {
    int[] a={9,8,6,5};
    sort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));

        
    }
    public static void sort(int[] arr,int low, int high){
        if(low >=high){
            return;
        }
        int i=low;
        int j=high;
        int mid= low+(high-low)/2;
        int pivot=arr[mid];
        while(i<=j){
            while(arr[i]<pivot){
                i++;
            }  
            while(arr[j]>pivot){
                j--;
            }
            if(i<=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }  
        }
      sort(arr,low,j-1 );
      sort(arr,i+1,high);
    }
}