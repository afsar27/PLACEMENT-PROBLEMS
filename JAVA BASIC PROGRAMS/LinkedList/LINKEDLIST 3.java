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
       System.out.println();
      System.out.println();
      // list.deleteAtFirst();
      list.display();
      list.deleteAtEnd();
       System.out.println();
       list.getElement(0);
       System.out.println();
      list.display();
      list.insertAtEnd(7);
      list.insertAtEnd(1);
      list.insertAtEnd(49);
      System.out.println();
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
  
  //INSERT AT BEGINNING
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
  
  //DISPLAY FUNCTION
  public void display(){
    Node temp=head;
    while(temp!=null){
      System.out.print(temp.data+"->");
      temp = temp.next;
    }
  }
  
  //INSERT AT PARTICULAR POSITIONS
  public void insertAtpos(int pos,int val){
    Node temp = head;
    Node node = new Node(val);
    for(int i=1;i<pos;i++){
      temp = temp.next;
    }
    node.next = temp.next;
    temp.next = node;
  }
  
  //DELETE AT PARTICULAR POSITIONS
  public void deleteAtPos(int pos){
  
    if(head == null){
      throw new IndexOutOfBoundsException("List is empty");
    }
    
    Node temp = head;
    Node prev = null;
    for(int i=1;i<=pos;i++){
      prev = temp;
      temp = temp.next;
    }
    prev.next = prev.next.next;
  }
 
 //DELETE AT FIRST
 public void deleteAtFirst(){
   if(head == null){
      throw new IndexOutOfBoundsException("List is empty");
    }
   head = head.next;
 }
 
 //DELETE ELEMENT AT END
 public void deleteAtEnd(){
   Node temp = head;
   while(temp.next!=null){
     temp = temp.next;
   }
   temp.next = null;
 }
 
 //GET ELEMENT FOR LINKEDLST
 public void getElement(int pos){
   if(head == null){
     throw new IndexOutOfBoundsException("List is empty");
   }
   
  // if(pos == 0){
  //   System.out.print(head.data+" ");
  // }
   
   Node temp = head;
   for(int i=1;i<=pos;i++){
     temp = temp.next;
   }
   System.out.print(temp.data+" ");
 }
 
 //INSERT AT INSERT AT END
 public void insertAtEnd(int val){
   Node n = new Node(val);
   Node temp = head;
   Node prev = null;
   while(temp!=null){
    prev = temp;
    temp = temp.next;
   }
   prev.next = n;
   n.next = null;
 }
 
 
}