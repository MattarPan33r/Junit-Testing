import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    @Test
    public void testEnqueueAndDequeue() {
        Queue queue = new Queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
    }

    @Test
    public void testPeek() {
        Queue queue = new Queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1, queue.peek());
        assertEquals(1, queue.peek());
    }

    @Test
    public void testIsEmpty() {
        Queue queue = new Queue(5);
        assertTrue(queue.isEmpty());
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testIsFull() {
        Queue queue = new Queue(2);
        assertFalse(queue.isFull());
        queue.enqueue(1);
        queue.enqueue(2);
        assertTrue(queue.isFull());
        queue.dequeue();
        assertFalse(queue.isFull());
    }
}
