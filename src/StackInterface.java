public interface StackInterface<T> {
	T pop();
	T top();
	public void push(T element);
	boolean isEmpty();
}
