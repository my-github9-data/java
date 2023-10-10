package q2;
import java.util.Scanner;

public class Point2d {
	int x;
	int y;

	public Point2d(int x, int y) {

		this.x = x;
		this.y = y;
	}
	
	
	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}

	public String getDetails()
	{
		return ("("+x+","+y+")");
	}
	public boolean isEqual(Point2d p2)
	{
		return (this.x == p2.getX() && this.y == p2.getY()) ; 
	}
	
	public double calculateDistance(Point2d p2)
	{
		return  Math.sqrt( Math.pow(this.x-p2.getX(), 2) + Math.pow(this.y-p2.getY(), 2)     );
	}
}
