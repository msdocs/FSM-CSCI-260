
public class ArrayBoundQueue<T> implements QInteface<T> {

	protected final int DEFCAP = 100;
	protected T[] queue;
	protected int numElements = 0;
	protected int front = 0;
	protected int rear;

	public ArrayBoundQueue(){
		queue = (T[]) new Object[DEFCAP];
		rear = DEFCAP-1;
	}

	public ArrayBoundQueue(int maxSize){
		queue = (T[]) new Object[maxSize];
		rear = maxSize-1;
		}

	public T noqueue(){
		T toReturn = queue[front];
		queue[front] = null;
		front = (front + 1) % queue.length;
		numElements = numElements-1;
		return toReturn;
		}

	public void queue(T element){
		rear = (rear + 1) % queue.length;
		queue[rear] = element;
		numElements = numElements + 1;
		}

	public boolean isEmpty(){
		if (numElements == 0){
			return true;
		}
		else return false;
		}
	public T front(){
		return queue[front];
	}


}
