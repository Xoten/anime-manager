package model;

public class LightNovel  extends Book{

	private boolean adaptation;
	private String adaptationN;


	public LightNovel(int c, int v, String a, String g, String i, boolean hA, String ad) {
		super(c, v, a, g, i);

		adaptation = hA;
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
