//Main class

public static void main(String[] args) {
    
    int [] arr={9,2,4,3,1,10,5,7,2,4,154};
    
    forMergeSort m=new forMergeSort();
    
    System.out.println("MergeSort Outputs-");
    
    int []temp=m.mergesort(arr,0,arr.length-1);
   
    for(int i=0;i<temp.length;i++)
      {System.out.println(temp[i]);}
      
    }  
    
    
//Merge Sort
    
import java.util.*;
public class forMergeSort {
   
  public  int[] mergesort(int []a,int l,int r){
    
    if(l<r){
      
      int  m=(l+r)/2;
      
      
      int [] m1=mergesort(a,l,m);
      int [] m2=mergesort(a,m+1,r);
      int [] m3=merge(a,l,m,r);
      return m3;
      
    }
    return a;
  }
  public  int[] merge(int[]a,int l,int m,int r){
    
    int n1=m-l+1;
    int n2=r-m;
    int []L=new int [n1+1];
    int []R=new int[n2+1];
    int inf=(int) (Math.pow(2,31)-1);
    for(int i=0;i<n1;i++){
      L[i]=a[l+i];
    }
    for(int j=0;j<n2;j++){
      R[j]=a[m+j+1];
    }
    L[n1]=R[n2]=inf;
    
    int i = 0,j=0;
    for(int k=l;k<=r;k++){
      if(L[i]<R[j]){
        a[k]=L[i];
        i++;
      }
      else{
        a[k]=R[j];
        j++;
      }
      
    }
    return a;
   }
  }
