package s.decorator;

public class Garland extends TreeDecorator {

	public Garland(ChristmasTree tree) {
		super(tree);
	}

	public String decorate() {
		return super.decorate() + decorateWithBubbleLights();
	}

	public String decorateWithBubbleLights() {
		return " with Garland";
	}

}
