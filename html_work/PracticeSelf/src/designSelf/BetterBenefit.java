package designSelf;

abstract class Ashape{
	public abstract double dArea();
}

class Pizza {
	private double _dPrice;
	private Ashape _shape;
	
	public double dPrice() {
		return 0;
	}
	public double dArea() {
		return 0;
	}

}


class Rectangle extends Ashape {
	private double _dHeight;
	private double _dWidth;
	private double _dArea;
	public Rectangle() {
	}
	public Rectangle(double _dHeight, double _dWidth){
		set_dHeight(_dHeight);
		set_dWidth(_dWidth);
	}
	
	public double get_dHeight() {
		return _dHeight;
	}
	public void set_dHeight(double _dHeight) {
		this._dHeight = _dHeight;
	}
	public double get_dWidth() {
		return _dWidth;
	}
	public void set_dWidth(double _dWidth) {
		this._dWidth = _dWidth;
	}
	public double dArea() {
		return 0;
	}
	public double get_dArea() {
		return _dArea;
	}
	public void set_dArea(double _dArea) {
		this._dArea = ((_dHeight) * (_dWidth));
	}
	
}

class Circle extends Ashape{
	private double _dRadius;
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	Circle(double _dRadius){
		set_dRadius(_dRadius);
	}
	public double get_dRadius() {
		return _dRadius;
	}
	public void set_dRadius(double _dRadius) {
		this._dRadius = _dRadius;
	}
	public double dArea() {
		return 0;
	}
	
}
public class BetterBenefit {
	Circle circle;
	public static void main(String[] args) {
		
//		Rectangle re = new Rectangle(4.0,5.0);
//		System.out.println(re.dArea());
//		
		
		BetterBenefit bobj = new BetterBenefit();
		
//		bobj.circle.set_dRadius(_dRadius);
		bobj.setCircle(124.2);
	}
	public BetterBenefit() {
		circle = new Circle();
	}

	void setCircle(double _dRadius) {
		circle.set_dRadius(_dRadius);
	}
}
