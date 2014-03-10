package SackCastellon.camouflage.helper;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogHelper {

	public static void log(String mod, Level level, String message) {
		Logger.getLogger(mod).log(level, message);
	}
	
	public static void info(String mod, String message)
	{    	
		Logger.getLogger(mod).info(message);
	}
	
	public static void error(String mod, String message) {
		Logger.getLogger(mod).severe(message);
	}
	
	public static void warning(String mod, String message) {
		Logger.getLogger(mod).warning(message);
	}

}
