package state;

import legacy.ShapeContainer;

public class UnmarkState implements State {

	@Override
	public void handle(ShapeContainer shapeContainer) {
		shapeContainer.getShapes().remove(shapeContainer.getSelected());
		shapeContainer.getShapes().add(shapeContainer.getSelected().peel());
	}

}
