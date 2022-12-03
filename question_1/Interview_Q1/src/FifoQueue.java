public class FifoQueue implements IQueuable{
	
	String[] queue;
	int head, tail, sum;
	String remove, front;

	
	public FifoQueue(int s){	
		
		head = 0;
		tail = 0;
		sum = s;
		queue = new String[sum];
	}
	

	//add item and display queue
	public String[] enqueue(String x)
	{
		
		if(sum == tail){
			
			System.out.println("Queue is full.");
			
		}
		
		else {
			
			queue[tail] = x;
			tail++;
		}
	  
	    return queue;
	}
	
	//delete item and display deleted item
	public String dequeue()
	{
		if(head == tail) {
			
			System.out.println("Queue is empty.");
			
		}
		
		else {
			
			remove = queue[head];
			
			for(int i = 0; i < tail - 1; i++) {
				
				queue[i] = queue[i + 1];
				
			}
			
			if(tail < sum)
				queue[tail] = " ";
				
			
			tail--;	
				
		}
	
		return remove;
	}
	
	//display the queue
	public String[] getQueue()
	{
		
		if(head == tail) {
			
			System.out.println("Queue is empty.");
		}
		
			return queue;
		
	}
	
	//check the queue size
	public int size()
	{	
		return sum;
	}
	
	//Q1c
	public String peek() {
		
		if (head == tail) {

			System.out.println("Queue is Empty");
        }

        front = queue[head];

        return front;

	}
	
	public static void main(String[] args) 
	{
		
		//set the size of the queue
		FifoQueue test = new FifoQueue(4);
		
		String[] queue, displayQueue;
		String deletedItem, frontItem;
		
		//Add item into queue 1 by 1
		queue = test.enqueue("Daisy");
		queue = test.enqueue("Ken");
		queue = test.enqueue("Lisa");
		queue = test.enqueue("Peyton");
		
		System.out.println("Add Items into Queue");
		System.out.println("The size of queue after adding all items: " + test.size());
		
		//show the list of items after adding using enqueue()
		for(int k = 0; k < queue.length; k++) {
					
			System.out.print(queue[k] + " ");
		}
		
		System.out.println("\n");
		
		//display the list of items in queue using getQueue()
		System.out.println("Display all Items in Queue");
		displayQueue = test.getQueue();
		
		for(int k = 0; k < displayQueue.length; k++) {
			
			System.out.print(displayQueue[k] + " ");
		}
		
		System.out.println("\n");
		
		//delete an item using dequeue and display the deleted item
		System.out.println("Delete Item from Queue");
		deletedItem = test.dequeue();
		
		System.out.print("Deleted item from queue: " + deletedItem);
		System.out.println("\n");
		
		//test again if it is able to add new item
		System.out.println("Add New Item into Queue");
		queue = test.enqueue("Cameron");
		queue = test.enqueue("Khalid");
	
		for(int k = 0; k < queue.length; k++) {
					
			System.out.print(queue[k] + " ");
		}
		
		System.out.println("\n");
		
		//check peek function
		System.out.println("Display the First Item of Queue");
		frontItem = test.peek();
		System.out.print("The first item in queue: " + frontItem);
	}
	
}
