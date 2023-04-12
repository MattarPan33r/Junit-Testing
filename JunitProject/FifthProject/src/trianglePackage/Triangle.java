package trianglePackage;

public class Triangle {
    
    public static String determineType(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Invalid";
        }
        if (a + b <= c || b + c <= a || c + a <= b) {
            return "Invalid";
        }
        if (a == b && b == c) {
            return "Equilateral";
        }
        if (a == b || b == c || c == a) {
            return "Isosceles";
        }
        return "Scalene";
    }
    
}
