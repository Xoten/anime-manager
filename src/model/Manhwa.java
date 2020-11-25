package model;

public class Manhwa extends Comic{

	private boolean colorized;
	
	

	public Manhwa(int c, int v, String a, String g, String i, boolean cl) {
		super(c, v, a, g, i);
   
		 colorized = cl;
		
	}
	
	public boolean isColorized() {
		return colorized;
	}

	public void setColorized(boolean colorized) {
		this.colorized = colorized;
	}
}
