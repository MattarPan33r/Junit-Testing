package trianglePackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TriangleTest {
    
    @Test
    public void testBoundaryValue() {
        assertEquals("Invalid", Triangle.determineType(0, 2, 3)); // Lower bound
        assertEquals("Invalid", Triangle.determineType(2, 0, 3)); // Lower bound
        assertEquals("Invalid", Triangle.determineType(2, 3, 0)); // Lower bound
        assertEquals("Invalid", Triangle.determineType(1, 2, 3)); // Normal value
        assertEquals("Invalid", Triangle.determineType(100, 100, 201)); // Upper bound
        assertEquals("Invalid", Triangle.determineType(100, 201, 100)); // Upper bound
        assertEquals("Invalid", Triangle.determineType(201, 100, 100)); // Upper bound
    }
    
    @Test
    public void testWorstCase() {
        assertEquals("Invalid", Triangle.determineType(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)); // Worst case input
    }
    
    @Test
    public void testRobustness() {
        assertEquals("Invalid", Triangle.determineType(-1, 2, 3)); // Negative value
        assertEquals("Invalid", Triangle.determineType(2, -1, 3)); // Negative value
        assertEquals("Invalid", Triangle.determineType(2, 3, -1)); // Negative value
        assertEquals("Invalid", Triangle.determineType(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE + 1)); // Input outside domain
    }
    
    @Test
    public void testWorstCaseRobustness() {
        assertEquals("Invalid", Triangle.determineType(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE)); // Worst case input outside domain
    }
    
    @Test
    public void testEquivalence() {
        assertEquals("Invalid", Triangle.determineType(1, 2, 3)); // Not a triangle
        assertEquals("Invalid", Triangle.determineType(2, 3, 1)); // Not a triangle
        assertEquals("Invalid", Triangle.determineType(3, 1, 2)); // Not a triangle
        assertEquals("Equilateral", Triangle.determineType(1, 1, 1)); // Equilateral
        assertEquals("Isosceles", Triangle.determineType(2, 2, 3)); // Isosceles
        assertEquals("Scalene", Triangle.determineType(3, 4, 5)); // Scalene
    }
}
