package Point2D.com.app.geometry;

public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

	public void setX (double x) {
		this.x = x;
	}

	public void setY (double y) {
		this.y = y;
	}

	public String getDetails() {
        return "Point(x: " + x + ", y: " + y + ")";
    }

    public boolean isEqual(Point2D other) {
        return this.x == other.x && this.y == other.y;
    }

    public double calculateDistance(Point2D other) {
        return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2));
    }
}