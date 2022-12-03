
public interface IQueuable {

	public String[] enqueue(String x);
	public String dequeue();
	public String[] getQueue();
	public int size();
	
	//Q1c
	//add a new function called peek() to return the head/top element
	public String peek();
}
