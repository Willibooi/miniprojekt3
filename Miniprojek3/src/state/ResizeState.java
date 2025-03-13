package state;

import legacy.ShapeContainer;

public class ResizeState implements State {

	@Override
	public void handle(ShapeContainer shapeContainer) {
		shapeContainer.getSelected().resizeTo(shapeContainer.getPoint());
	}

}
