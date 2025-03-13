package state;

import legacy.ShapeContainer;

public class MoveState implements State {

	@Override
	public void handle(ShapeContainer shapeContainer) {
		shapeContainer.getSelected().moveTo(shapeContainer.getPoint());

	}

}
