package sk.upjs.ics.novotnyr.restlet;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Component;

@Component
public class ChocolateService  {
	private List<Chocolate> chocolates = new CopyOnWriteArrayList<Chocolate>();
	
	public ChocolateService() {
		chocolates.add(new Chocolate(1L, "Lindt Excellence 70%", 70));
		chocolates.add(new Chocolate(2L, "Milka Alpenmilch", 40));
		chocolates.add(new Chocolate(3L, "Christmas Angel Figure", 15));
	}
	
	public List<Chocolate> list() {
		return chocolates;
	}
	
	public void add(Chocolate chocolate) {
		System.out.println(chocolate);
		this.chocolates.add(chocolate);
	}
}
