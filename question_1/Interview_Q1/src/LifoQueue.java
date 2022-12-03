
public class LifoQueue implements IQueuable{
	
	int top, sum;   
    String[] stack;
    String remove, front;
    
	public LifoQueue(int s){			
		top = -1;  
		sum = s;
		stack = new String[sum];
	}
	
	//add item and display stack
	public String[] enqueue(String x) {
		
		if(top == sum-1)  
        {  
            System.out.println("Stack is full");
         
        }  
        else   
        {  
            top++;  
            stack[top]=x;      
        }
		return stack;  
	}

	//delete item and display deleted item
	public String dequeue() {
		
		if (!isEmpty()) {
            int returnedTop = top;
            top--;
            remove = stack[returnedTop];
 
        } else {
            System.out.println("Stack is empty");
        }
		
		return remove;
	}
	
	//to check if stack is empty
	public boolean isEmpty() {
        return (top == -1);
    }

	//display the stack
	public String[] getQueue() {
		
		 return stack; 
	}

	//check the stack size
	public int size() {
		
		return sum;
	}
	
	//Q1c
	public String peek() {
		
		if(this.isEmpty())
			System.out.println("Stack is empty");
		
		front = stack[top];
		return front;  
	    
	}
	
	public static void main(String[] args) 
	{
		
		//set the size of the stack
		LifoQueue test = new LifoQueue(4);
		
		String[] stack, displayStack;
		String deletedItem, frontItem;
		
		//Add item into stack 1 by 1
		stack = test.enqueue("Daisy");
		stack = test.enqueue("Ken");
		stack = test.enqueue("Lisa");
		stack = test.enqueue("Peyton");
		
		System.out.println("Add Items into Stack");
		System.out.println("The size of stack after adding all items: " + test.size());
		
		//show the list of items after adding using enqueue()
		for(int k = 0; k < stack.length; k++) {
					
			System.out.print(stack[k] + " ");
		}
		
		System.out.println("\n");
		
		//display the list of items in stack using getQueue()
		System.out.println("Display all Items in Stack");
		displayStack = test.getQueue();
		
		for(int k = 0; k < displayStack.length; k++) {
			
			System.out.print(displayStack[k] + " ");
		}
		
		System.out.println("\n");
		
		//delete an item using dequeue and display the deleted item
		System.out.println("Delete Item from Stack");
		deletedItem = test.dequeue();
		
		System.out.print("Deleted item from stack: " + deletedItem);
		System.out.println("\n");
		
		//test again if it is able to add new item
		System.out.println("Add New Item into Stack");
		stack = test.enqueue("Cameron");
		stack = test.enqueue("Khalid");
	
		for(int k = 0; k < stack.length; k++) {
					
			System.out.print(stack[k] + " ");
		}
		
		System.out.println("\n");
		
		//check peek function
		System.out.println("Display the First Item of Stack");
		frontItem = test.peek();
		System.out.print("The top item in stack: " + frontItem);
		
	}
}
