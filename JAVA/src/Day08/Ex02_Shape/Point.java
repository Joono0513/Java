package Day08.Ex02_Shape;

public class Point {
	
	// 멤버변수 x, y
	public int x, y = 0;
	
	// alt + shift + s → Generate Contstructor Using Fields...
	// 기본 생성자
	public Point() {
		
	}

	// 매개변수가 있는 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}
