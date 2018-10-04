package logger;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe Logger
 * 
 * @author metzgegu	et carriean
 *
 */
public class Logger {
	
	/**
	 * Imprime dans la console le log
	 * 
	 * @param log : le message a imprimer dans la console
	 * @param gravity : le type de message a imprimer Gravity.DEBUG, Gravity.ERROR, Gravity.INFO ou Gravity.WARN
	 */
	public void log(String log, Gravity gravity) {
		
		if (!log.equals("")) {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date date = new Date();  
		    String dateString = "["+formatter.format(date)+"]";
			switch(gravity) {
			case DEBUG :
				System.out.println(dateString+" DEBUG : "+log);
				break; 
			case INFO :
				System.out.println(dateString+" INFO : "+log);
				break;
			case WARN :
				System.out.println(dateString+" WARN : "+log);
				break;
			default :
				System.err.println(dateString+" ERROR : "+log);
				break;			
			}
		}
	}
	
}
