package lol;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class l4j {
	public static Logger log=Logger.getLogger(l4j.class.getName());
	public static void main(String[] args) {
		String log4jConfPath = "C:\\Users\\Avni\\eclipse-workspace3\\mavenl\\src\\main\\java\\lol\\log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		
		log.debug("That is debuging");
	log.error("error");
	log.info("Information");
	log.info("Finnally");
	log.info("Finnally");
	}
}
