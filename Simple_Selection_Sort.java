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

//Selection Sort Starts here
public class SelectionSort {
  public static void main(String[] args) {
    int a[]={8,58,12,54,02,641,20,4};
    int i=a.length-1;
    Node head=new Node(a[0],null);
    Node x=head;
    for(int k=1;k<=i;k++) {
      x.next=new Node(a[k],null);
      x=x.next;
    }
    SS(head,i);
    for(x=head;x!=null;x=x.next) {
      System.out.println(x.elem);
    }
  }
  public static void SS(Node n,int i) {
    Node x=n;
    if(i==0) return;
    int max=x.elem;
    Node z=x;
    for(int j=1;j<=i;j++) {
      x=x.next;
      if(x.elem>max) {
        max=x.elem;
        z=x;
      }
    }
    int temp=x.elem;
    x.elem=max;
    z.elem=temp;
    SS(n,i-1);
  }
}
