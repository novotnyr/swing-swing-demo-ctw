package sk.upjs.ics.novotnyr.restlet;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;


@Configurable(preConstruction = true, dependencyCheck = true)
public class MainFrame extends JFrame {
	@Autowired
	private ChocolateService chocolateService;
	
	private JList<Chocolate> chocolateList; 
	
	public MainFrame() {
		chocolateList = new JList<Chocolate>();
		chocolateList.setListData(new Vector<Chocolate>(chocolateService.list()));
		add(chocolateList);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pack();
	}



}
