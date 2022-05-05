import java.io.*;
class RevLinkedList{ 

	SinglyLLNode{
		int data;
		
		SinglyLLNode head ;
		SinglyLLNode next;
	
	}


	static SinglyLLNode reverse(SinglyLLNode head){
	SinglyLLNode next = null;
	SinglyLLNodecurrent = head;
	SinglyLLNode previous =null;
	while(current!=null){
		next = current.next;
		current.next=previous;
		previous=current;
		current=next;
	}
	SinglyLLNode singlylinkedlistnode=previous;
	return singlylinkedlistnode;
}

class LinkedList{
	public static void main(String args[]){
	
	Res r = new(Res);
	
	
	}
	
	
}