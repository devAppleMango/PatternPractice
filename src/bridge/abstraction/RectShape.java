package bridge.abstraction;

public class RectShape extends Shape {

	@Override
	public void draw() {
		System.out.println("[R e c t]");
		drawingTool.drawLine();
		System.out.println("[R e c t]");
	}

}
