package logging;

import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;
import org.apache.log4j.spi.RootLogger;


import java.io.*;
import java.sql.SQLException;
import java.util.*;

public class log4jExample{


	//https://www.tutorialspoint.com/log4j/log4j_patternlayout.htm
   
   final static Logger logger = Logger.getLogger(log4jExample.class);
	
	public static void main(String[] args) throws IOException {
		
		Level l = Level.ALL;
		
		RootLogger rl=  new RootLogger(l);
		RollingFileAppender ra=		new RollingFileAppender();
		ra.setFile(System.getProperty("user.dir")+"\\test.log",true,true,50000);
		Layout la = new PatternLayout("%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n") ;
		ra.setLayout(la);	
		logger.addAppender(ra);	
		if(logger.isDebugEnabled()){
			logger.debug("OK now I am debugging" );
		}
		if(logger.isInfoEnabled()){
			logger.info("This is info : ");
		}		
		logger.info("This is Info : " );
		logger.warn("This is warn : " );
		logger.error("This is error : ");
		logger.fatal("This is fatal : ");
		
	}
}