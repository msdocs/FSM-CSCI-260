public interface QInteface<T>

{
  T noqueue() throws QUnderflowException;
  // Throws QueueUnderflowException if this queue is empty;
  // otherwise, removes front element from this queue and returns it.

  boolean isEmpty();
  // Returns true if this queue is empty; otherwise, returns false.
}
