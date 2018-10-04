package logger;

public class Logger {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	
	
	public void log(String log, Gravity gravity) {
		
		if (!log.equals("")) {
			switch(gravity) {
			case DEBUG :
				System.out.println(ANSI_GREEN+" DEBUG : "+log+ANSI_RESET);
				break; 
			case INFO :
				System.out.println(ANSI_BLUE+" INFO : "+log+ANSI_RESET);
				break;
			case WARN :
				System.out.println(ANSI_YELLOW+" WARN : "+log+ANSI_RESET);
				break;
			default :
				System.err.println(log);
				break;			
			}
		}
	}
	
}
