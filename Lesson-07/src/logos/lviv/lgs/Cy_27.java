package logos.lviv.lgs;

import java.util.Random;

public class Cy_27 extends Plane implements Possibility{

	private Airplane_management Airplane_management = new Airplane_management();
	private int maxSpeed = 444;
	public String name;
	
	Cy_27(int lenght, int width, int weight, String name) {
		super(lenght, width, weight);
		
	}

	
	public void moveUp() {
		Airplane_management.up();
	}
	
	public void moveDown() {
		Airplane_management.down();
	}
	
	public void moveLeft() {
		Airplane_management.left();
	}
	
	public void moveRight() {
		Airplane_management.right();
	}
	
	@Override
	void engine_start() {
		
		super.engine_start();
	}

	@Override
	void plane_up() {
		
		super.plane_up();
	}

	@Override
	void plane_down() {
		
		super.plane_down();
	}

	@Override
	public void turbo() {
		Random rn = new Random();
		int min = maxSpeed;
		int max = maxSpeed*2;
		int range = max - min + 1;
		System.out.println(rn.nextInt(range) + min + " km/h");
		
	}

	@Override
	public void stels() {
		System.out.println("The plane is not visible " + (int) (Math.random() * 10 +1) + " sec");
		
	}

	@Override
	public void nuclear() {
		System.out.println("Number of nuclear missiles " + (int) (Math.random() * 10 + 1));
		
	}
	
	
	
	

	

	
	
	
}
