package sk.upjs.ics.novotnyr.restlet;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Component;

@Component
public class ChocolateService  {
	private List<Chocolate> chocolates = new CopyOnWriteArrayList<Chocolate>();
	
	public ChocolateService() {
		chocolates.add(new Chocolate("Lindt Excellence 70%", 70));
		chocolates.add(new Chocolate("Milka Alpenmilch", 40));
		chocolates.add(new Chocolate("Christmas Angel Figure", 15));
	}
	
	public List<Chocolate> list() {
		return chocolates;
	}
}
