package bridge.abstraction;

import bridge.imp.DrawingTool;

public abstract class Shape {
	protected DrawingTool drawingTool;
	
	public void setDrawingTool(DrawingTool drawingTool) {
		this.drawingTool = drawingTool;
	}
	
	public abstract void draw();
}
