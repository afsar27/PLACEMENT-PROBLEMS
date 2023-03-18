import java.util.*;

public class Main {
    public static void main(String[] args) {
      LinkedList list = new LinkedList();
      list.insertAtbeg(10);
      list.insertAtbeg(20);
      list.insertAtbeg(30);
      list.display();
      
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
  
}