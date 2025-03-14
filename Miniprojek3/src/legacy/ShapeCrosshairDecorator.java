package legacy;

import java.awt.Graphics;

public class ShapeCrosshairDecorator implements Shape {
	private Shape decoratee;

	public ShapeCrosshairDecorator(Shape decoratee) {
		this.decoratee = decoratee;
	}

	@Override
	public void draw(Graphics g) {
		decoratee.draw(g);
		Point position = decoratee.getPosition();
		int x = (int) (position.getX() + 0.5);
		int y = (int) (position.getY() + 0.5);
		g.fillRect(x - 5, y - 1, 10, 2);
		g.fillRect(x - 1, y - 5, 2, 10);
	}

	@Override
	public Point getPosition() {
		return decoratee.getPosition();
	}

	@Override
	public double getWidth() {
		return decoratee.getWidth();
	}

	@Override
	public double getHeight() {
		return decoratee.getHeight();
	}

	@Override
	public boolean intersects(Point point) {
		return decoratee.intersects(point);
	}

	@Override
	public void moveTo(Point point) {
		decoratee.moveTo(point);
	}

	@Override
	public void move(double dx, double dy) {
		decoratee.move(dx, dy);
	}

	@Override
	public void resizeTo(Point point) {
		decoratee.resizeTo(point);
	}

	@Override
	public Shape peel() {
		return decoratee;
	}
}