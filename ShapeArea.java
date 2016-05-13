
public class ShapeArea implements Shape{

	@Override
	public void SqureArea(int l) {
		// TODO Auto-generated method stub
		System.out.println("Area of Squre is " + (l*l));
	}

	@Override
	public void RectangleArea(int l, int b) {
		// TODO Auto-generated method stub
		System.out.println("Area of Rectangle is " + (l*b));
	}

	@Override
	public void TriangleArea(int l, int h) {
		// TODO Auto-generated method stub
		System.out.println("Area of Triangle is " + (0.5*l*h));
	}



	}

