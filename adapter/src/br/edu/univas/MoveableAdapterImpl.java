package br.edu.univas;

public class MoveableAdapterImpl implements MoveableAdapter {

	private Moveable moveable;
	
	public MoveableAdapterImpl(Moveable movable) {
		this.moveable = movable;
	}
	
	@Override
	public double getSpeed() {
		return convertMphToKmh();
	}
	
	private double convertMphToKmh() {
		return moveable.getSpeed() * 1.60934;
	}

}
