package methodoverloading;

class Math {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Math math = new Math();
        System.out.println("add(int, int): " + math.add(5, 10));
        System.out.println("add(double, double): " + math.add(5.5, 3.2));
        System.out.println("add(int, int, int): " + math.add(1, 2, 3));
    }
}
