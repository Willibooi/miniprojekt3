package shapeState;


import legacy.Point;
import legacy.Shape;


public class RectState implements ShapeState {

	@Override
	public Shape getShape(Point point) {
		return new Rectangle(point, Math.random() * 50.0, Math.random() * 50.0);
	}

}
