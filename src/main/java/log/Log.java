package log;

import java.io.IOException;
import java.util.logging.Logger;

public class Log {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public Log(){
		try {
		    MyLogger.setup();
	    } catch (IOException e) {
	        e.printStackTrace();
	        throw new RuntimeException("Problems with creating the log files");
	    }
	}
    public static void info(String txt) throws IOException {
    	LOGGER.info(txt);
    }
}