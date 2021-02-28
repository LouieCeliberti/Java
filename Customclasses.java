package Basic;

import java.util.Random;

public class Customclasses {


	private int hits;
		private int  pitches;
		private int batters;
		private Random generator;

public Customclasses(int pitcher){
	this.pitches = pitcher;
	generator = new Random();
}
public Customclasses(int pitcher, int seed){
	this.batters = pitcher;
	generator = new Random(seed);
}
public int pitch(){
	this.hits = this.generator.nextInt(this.pitches);
	return this.hits;
}
}