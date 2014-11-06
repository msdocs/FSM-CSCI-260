public class ArrayBoundStack<T> implements StackInterface<T> {
	protected final int defCap = 100;
	protected T[] stack;
	protected int topIndex =-1;

	public ArrayBoundStack()	{
		stack = (T[]) new Object[defCap];
		}
	public ArrayBoundStack(int maxSize){
		stack = (T[]) new Object[maxSize];
		}

	public T pop() {
		T temp = stack[topIndex];
		stack[topIndex] = null;
		topIndex--;
		return temp;
	}

	public T top() {
		T topOfStack = stack[topIndex];
		return topOfStack;
	}

	public void push(T element) {
		topIndex++;
		stack[topIndex] = element;
	}

	public boolean isEmpty() {
		if (topIndex ==-1){
			return true;
			}
		else{
			return false;
			}
	}
}
