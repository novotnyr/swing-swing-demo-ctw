package sk.upjs.ics.novotnyr.restlet;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.SwingUtilities;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


@Component
@Configurable
public class MainFrame extends JFrame implements InitializingBean {
	@Autowired
	private ChocolateService chocolateService;
	
	private JList<Chocolate> chocolateList; 
	
	
	public MainFrame() {
	}

	public void initComponents() {
		chocolateList = new JList<Chocolate>();
		chocolateList.setListData(new Vector<Chocolate>(chocolateService.list()));
		add(chocolateList);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


	public void afterPropertiesSet() throws Exception {
		initComponents();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContext.class);
				MainFrame mainFrame = context.getBean(MainFrame.class);
				mainFrame.setVisible(true);
			}
		});
	}
}
