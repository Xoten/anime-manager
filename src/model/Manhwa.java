package model;

public class Manhwa extends Comic{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean colorized;
	
	

	public Manhwa(String n,String t, int c, int v, String a, String g, String i, int s, boolean cl) {
		super(n,t, c, v, a, g, i,s);
   
		 colorized = cl;
		
	}
	
	public boolean isColorized() {
		return colorized;
	}

	public void setColorized(boolean colorized) {
		this.colorized = colorized;
	}
}
