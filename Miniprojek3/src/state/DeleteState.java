package state;

import legacy.ShapeContainer;

public class DeleteState implements State {

	@Override
	public void handle(ShapeContainer shapeContainer) {

		if(shapeContainer.getSelected() != null) {
			shapeContainer.getShapes().remove(shapeContainer.getSelected());
		}
		
	}

}
