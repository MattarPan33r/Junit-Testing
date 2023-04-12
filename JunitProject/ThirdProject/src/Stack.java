import java.util.ArrayList;

public class Stack<T> {

   private ArrayList<T> items;

   public Stack() {
      items = new ArrayList<>();
   }

   public void push(T item) {
      items.add(item);
   }

   public T pop() {
      if (isEmpty()) {
         throw new IllegalStateException("Stack is empty");
      }
      return items.remove(items.size() - 1);
   }

   public T peek() {
      if (isEmpty()) {
         throw new IllegalStateException("Stack is empty");
      }
      return items.get(items.size() - 1);
   }

   public boolean isEmpty() {
      return items.isEmpty();
   }
}
