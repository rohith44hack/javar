public class Box {
    double width;
    double height;
    double depth;

    // Constructor to initialize the box dimensions
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Optional: getters for the dimensions
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    // Optional: method to calculate volume
    public double volume() {
        return width * height * depth;
    }
}

