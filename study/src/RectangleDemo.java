class Rectangle {
	private double height;
	private double width;
	private String SchoolNumbername;
	
	Rectangle(double height, double width, String SchoolNumbername){
		this.height = height;
		this.width = width;
		this.SchoolNumbername = SchoolNumbername;
	}
	
	double findArea() {
		return height * width;
	}
	
	void setHeight(double height) {
		this.height = height;
	}
	
	double getHeight() {
		return height;
	}
	
	void setWidth(double width) {
		this.width = width;
	}
	
	double getWidth() {
		return width;
	}
	
	String getSchoolNumbername() {
		return SchoolNumbername;
	}
	
	void setSchoolNumbername(String SchoolNumbername) {
		this.SchoolNumbername = SchoolNumbername;
	}
	
}

public class RectangleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle t2 = new Rectangle(2, 9, "20232529 이세민");
		System.out.println(t2.getHeight()  + " , " + t2.getWidth());
		System.out.println(t2.findArea() + " , " + t2.getSchoolNumbername());

	}

}
