package bridge;

import bridge.abstraction.RectShape;
import bridge.abstraction.Shape;
import bridge.abstraction.TriangleShape;
import bridge.imp.DottedDrawingTool;
import bridge.imp.DrawingTool;
import bridge.imp.SolidDrawingTool;

public class Main {
	public static void main(String[] args) {
		DrawingTool solid = new SolidDrawingTool();
		DrawingTool dotted = new DottedDrawingTool();		

		Shape shape = new RectShape();
		
		shape.setDrawingTool(solid);
		shape.draw();
		
		shape.setDrawingTool(dotted);
		shape.draw();
		
		shape = new TriangleShape();
		
		shape.setDrawingTool(solid);
		shape.draw();
		
		shape.setDrawingTool(dotted);
		shape.draw();
	}
}
