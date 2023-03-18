import java.util.*;

public class Main {
    public static void main(String[] args) {
      LinkedList list = new LinkedList();
      list.insertAtbeg(10);
      list.insertAtbeg(20);
      list.insertAtbeg(30);
      list.display();
      System.out.println();
      list.insertAtpos(3,50);
      list.insertAtpos(4,100);
      list.display();
      list.insert(10);
  }
}

public class LinkedList
{
  Node head;
  
  class Node{
    int data;
    Node next;
    Node(int val){
      data = val;
      next = null;
    }
  }
  
  LinkedList(){
    head = null;
  }
  
  public void insertAtbeg(int val){
    Node newNode = new Node(val);
    if(head == null){
      head = newNode;
    }
    else{
      newNode.next = head;
      head = newNode;
    }
  }
  
  public void display(){
    Node temp=head;
    while(temp!=null){
      System.out.print(temp.data+"->");
      temp = temp.next;
    }
  }
  
  public void insertAtpos(int pos,int val){
    Node temp = head;
    Node node = new Node(val);
    for(int i=1;i<pos;i++){
      temp = temp.next;
    }
    node.next = temp.next;
    temp.next = node;
  }
  
  public class insert(int val){
  Node n = new Node(val);
  Node head;
  if(head == null){
    head = n;
  }
  else{
    head.next = n;
    n = n.next;
  }
  }
}