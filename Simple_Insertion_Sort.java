//Node class
public class Node {
  int elem;
  Node next,prev;
  Node(int elem,Node next) {
    this.elem=elem;
    this.next=next;
  }
  Node(int elem,Node next,Node prev) {
    this.elem=elem;
    this.next=next;
    this.prev=prev;
  }
}

//Insertion Sort With List

public class InsertionSort {
  public static void main(String[] args) {
    int a[]={54,69,32,20,1,45,89};
    int c=a.length;
    Node head=new Node(a[0],null,null);
    Node x=head;
    for(int k=1;k<c;k++) {
      x.next=new Node(a[k],null,x);
      x=x.next;
    }
    ISList(head);
    for(x=head;x!=null;x=x.next) {
      System.out.println(x.elem);
    }
  }
  public static void ISList(Node n) {
    Node x=n.next;
    if(x==null) return;
    for(;x.prev!=null;x=x.prev) {
      if(x.elem<x.prev.elem) {
        int temp=x.elem;
        x.elem=x.prev.elem;
        x.prev.elem=temp;
      }
      else break;
    }
    ISList(n.next);
  }
}

//Insertion Sort with array

public class InsertionSort
{
  public static void main(String[] args) 
  {
    int a[] ={16,55,24,3,22,11};
    int i=1;
    IS(a,i);
    for(int k=0;k<a.length;k++)
    {
      System.out.println(a[k]);
    }
  }
  public static void IS(int[] a,int i)
  {
    if(i==a.length) return;
    for(int j=i;j>0;j--) 
    {
      if(a[j]<a[j-1])
      {
        int temp=a[j-1];
        a[j-1]=a[j];
        a[j]=temp;
      }
      else break;
    }
    IS(a,i+1);
  }
}
