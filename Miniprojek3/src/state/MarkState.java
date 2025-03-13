package state;

import legacy.ShapeContainer;
import legacy.ShapeDecorator;

public class MarkState implements State {

	@Override
	public void handle(ShapeContainer shapeContainer) {
		shapeContainer.getShapes().remove(shapeContainer.getSelected());
		shapeContainer.getShapes().add(new ShapeDecorator(shapeContainer.getSelected()));
	}

}
