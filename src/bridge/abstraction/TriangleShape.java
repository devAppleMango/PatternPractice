package bridge.abstraction;

public class TriangleShape extends Shape {

	@Override
	public void draw() {
		System.out.println("/Triangle\\");
		drawingTool.drawLine();
		System.out.println("\\Triangle/");
	}

}
