//This is the Node calss 
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

//Bubble Sort Starts here. 

//Bubble Sort using Singly linked list
public class BubbleSort
{
  public static void main(String [] args) 
  {
    int a[]={6,5,3,1,2};
    int i=a.length-1;
    
    Node head=new Node(a[0],null);
    Node x=head;
    for(int k=1;k<=i;k++) 
    {
      x.next=new Node(a[k],null);
      x=x.next;
    }
    BSList(head,i);
    for(x=head;x!=null;x=x.next) 
    {
      System.out.println(x.elem);
    }
  }
  public static void BSList(Node n,int i) 
  {
    Node x=n;
    if(i==0) return;
    for(int j=0;j<i;j++) 
    {
      if(x.elem>x.next.elem) 
      {
        int key=x.elem;
        x.elem=x.next.elem;
        x.next.elem=key;
      }
      x=x.next;
    }
    BSList(n,i-1);
  }
}


//Bubble Sort Using array

public class BubbleSort
{
  public static void main(String [] args) 
  {
    int a[]={6,5,3,1,2};
    int i=a.length-1;
    BS(a,i);
    for(int k=0;k<a.length;k++)
    {
      System.out.println(a[k]);
    }
    
 public static void BS(int []a,int i) 
     {
        if(i==0) return;
         for(int j=0;j<i;j++) 
         {
               if(a[j]>a[j+1])
               {
                  int key=a[j];
                  a[j]=a[j+1];
                  a[j+1]=key;
               }
         }
         BS(a,i-1);
     }
