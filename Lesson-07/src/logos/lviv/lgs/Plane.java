package logos.lviv.lgs;

import java.util.Random;

public abstract class Plane {
	
	public int lenght;
	public int width;
	public int weight;
	
	Plane (int lenght, int width, int weight){
		this.lenght = lenght;
		this.weight = width;
		this.width = weight;
	}
	
	void engine_start() {
		Random rn = new Random();
		int min = 20;
		int max = 88;
		int range = max - min + 1;
		System.out.println(rn.nextInt(range) + min + " sec");
	}
	
	void plane_up() {
		Random rn = new Random();
		int min = 0;
		int max = 1000;
		int range = max - min + 1;
		System.out.println(rn.nextInt(range) + min + " kilometer");
	}
	
	void plane_down() {
		
		System.out.println("The plane is approaching");
	}

	
	
}
