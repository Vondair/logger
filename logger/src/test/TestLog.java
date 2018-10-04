package test;

import logger.Gravity;
import logger.Logger;

public class TestLog {

	public static void main(String[] args) {
		Logger logger = new Logger();
		logger.log("HEllO",Gravity.DEBUG);
		logger.log("HEllO",Gravity.WARN);
		logger.log("HEllO",Gravity.INFO);
		logger.log("HEllO",Gravity.ERROR);
	}

}
