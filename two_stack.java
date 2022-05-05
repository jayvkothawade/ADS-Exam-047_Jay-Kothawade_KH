import java.util.*;
class two_stack{
	int size;
	int [] a;
	int top1, top2;
	
	two_stack(int n){
		size=n;
		a=new int[n];
		top1=n/2+1;
		top2=n/2;
		
	}
	
	void push1(int x){
		if(top1>0){
			top1--;
			a[top1]=x;
		}
		else{
			System.out.print("Stack Overflow"+"by element"+ x +"\n");
			return;
		}
	}
	
	
	void push2(int x){
	if(top2<size-1){
		top2++;
		a[top2]=x;
	}
	else{
		System.out.print("Stack Overflow"+"by element"+ x +"\n");
		return;
	}
	
	}
	
	int pop1(){
	if(top1 <= size/2){
		int x= a[top1];
		top1++;
		return x;
	}
	else{
		System.out.println("Stack underflow");
	}
	return 0;
	}
	
	int pop2(){
	
	if(top2>=size/2+1){
		int z=a[top2];
		top2=top2-1;
		return z;
	}
	else{
		System.out.println("Stack underflow");
	}
	return 1;
	}
}

class stack
{
	public static void main(String args[]){
		
		two_stack t=new two_stack(5);
		t.push1(5);
		t.push2(10);
		t.push1(15);
		t.push2(11);
		t.push2(7);
		
		
		System.out.print(" Popped element from stack1 is "+ t.pop1() +"\n");
		t.push2(40);
		System.out.print(" Popped element from stack2 is "+ t.pop1() +"\n");
		
		
		
	}
}