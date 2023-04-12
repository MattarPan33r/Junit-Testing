import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTest {

   private Stack<Integer> stack;

   @BeforeEach
   public void setUp() {
      stack = new Stack<>();
   }

   @Test
   public void testPush() {
      stack.push(1);
      stack.push(2);
      Assertions.assertEquals(2, stack.peek());
   }

   @Test
   public void testPop() {
      stack.push(1);
      stack.push(2);
      int poppedItem = stack.pop();
      Assertions.assertEquals(2, poppedItem);
      Assertions.assertEquals(1, stack.peek());
   }

   @Test
   public void testPeek() {
      stack.push(1);
      stack.push(2);
      Assertions.assertEquals(2, stack.peek());
   }

   @Test
   public void testIsEmpty() {
      Assertions.assertTrue(stack.isEmpty());
      stack.push(1);
      Assertions.assertFalse(stack.isEmpty());
   }
}
