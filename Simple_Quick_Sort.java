//Main Class
public class QuickSMain {
    
  public static void main(String[] args) {
    
    System.out.println("\nQuickSort Outputs-");
    int[]a={3,4,1,2,4,2,22,33,75,44};
    forQuickSort q=new forQuickSort();
    int []temp2=q.quicksort(a,0,a.length-1);
    for(int i=0;i<temp2.length;i++)
      System.out.println(temp2[i]);
    
  }
}

//Quick Sort


import java.util.*;
public class forQuickSort {
  
  public int[] quicksort(int []a,int start,int end){
    if(start<end){
      int p=partition(a,start,end);
      int []q1=quicksort(a,start,p-1);
      int []q2=quicksort(a,p+1,end);
    }
    return a;
  }
  
  public int partition(int []a,int start,int end){
    int pivot=a[end];
    int pindx=start;
    for(int i=start;i<end;i++){
      if(a[i]<=pivot){
        int temp=a[i];
        a[i]=a[pindx];
        a[pindx]=temp;
        pindx++;
      }
    }
    int t=a[end];
    a[end]=a[pindx];
    a[pindx]=t;
    return pindx;         
  }
  
  
  
}


