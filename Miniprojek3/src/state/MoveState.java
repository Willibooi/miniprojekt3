package state;

import legacy.ShapeContainer;

public class MoveState implements State {

	@Override
	public void handle(ShapeContainer shapeContainer) {
		shapeContainer.select(shapeContainer.getPoint());
		shapeContainer.getSelected().moveTo(shapeContainer.getPoint());

	}

}
