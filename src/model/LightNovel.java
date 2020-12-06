package model;

public class LightNovel  extends Book{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean adaptation;
	private String adaptationN;


	public LightNovel(String n, int c, int v, String a, String g, String i, String ad) {
		super(n,c, v, a, g, i);

		
		adaptationN = ad;

	}

	public boolean isAdaptation() {
		return adaptation;
	}



	public void setAdaptation(boolean hasAdaptation) {
		this.adaptation = hasAdaptation;
	}



	public String getAdaptationN() {
		return adaptationN;
	}



	public void setAdaptationN(String adaptationN) {
		this.adaptationN = adaptationN;
	}


}
