package state;

import legacy.ShapeContainer;
import legacy.ShapeCrosshairDecorator;
import legacy.ShapeDecorator;

public class MarkState implements State {

	@Override
	public void handle(ShapeContainer shapeContainer) {
		shapeContainer.select(shapeContainer.getPoint());
		if(shapeContainer.getSelected() != null) {
			shapeContainer.getShapes().remove(shapeContainer.getSelected());
			shapeContainer.getShapes().add(new ShapeCrosshairDecorator(shapeContainer.getSelected()));
		}
	}

}
