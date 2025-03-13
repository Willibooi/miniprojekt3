package state;

import legacy.Circle;
import legacy.ShapeContainer;

public class InsertState implements State {

	@Override
	public void handle(ShapeContainer shapeContainer) {
		shapeContainer.addShape(shapeContainer.shapeState.handle());
		shapes.add();
		repaint(); // uppmanar swing att måla om
	}

}
