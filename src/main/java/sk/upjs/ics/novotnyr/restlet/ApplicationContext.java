package sk.upjs.ics.novotnyr.restlet;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving.AspectJWeaving;

@Configuration
@EnableLoadTimeWeaving
@ComponentScan("sk.upjs.ics.novotnyr.restlet")
public class ApplicationContext {

}
