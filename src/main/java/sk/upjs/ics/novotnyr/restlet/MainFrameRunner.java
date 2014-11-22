package sk.upjs.ics.novotnyr.restlet;

import javax.swing.SwingUtilities;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainFrameRunner {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				AnnotationConfigApplicationContext context 
					= new AnnotationConfigApplicationContext(SpringApplicationContext.class);

				MainFrame mainFrame = new MainFrame();
				mainFrame.setVisible(true);
			}
		});
	}
}
