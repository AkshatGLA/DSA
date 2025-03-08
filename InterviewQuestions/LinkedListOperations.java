package LinkedList.InterviewQuestions;

public class LinkedListOperations {
    public static Node dltNthLast(Node head,int n){
        Node temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        for(int i=0;i<size-n;i++){

        }
        return temp;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(13);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(12);
        Node f=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        System.out.println(e);
    }
}
