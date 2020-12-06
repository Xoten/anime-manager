package thread;

import ui.AnimeManagerGUI;
import model.Progressitem;
import javafx.application.Platform;


public class ProgressLoadingThread extends Thread{

	
	private Progressitem progi;
	private AnimeManagerGUI gui;

	
	public ProgressLoadingThread(Progressitem bar, AnimeManagerGUI anime) {
		progi = bar;
		gui= anime;
	}
	
	public void run() {
		while (progi.isLoading()) {
			progi.advance();
			Platform.runLater(new Thread() {
				public void run() {
					gui.updateBar();
				}
			});
			try {
				Thread.sleep(9);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
				
	}
}
