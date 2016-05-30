package org.works.skm.exception;

@SuppressWarnings("serial")
public class SplitZeroSizeException extends Exception{
		public SplitZeroSizeException()
		{
		}
	
		public SplitZeroSizeException(String message)
		{
			super(message);
		}
	
		public SplitZeroSizeException(Throwable cause)
		{
			super(cause);
		}
	
		public SplitZeroSizeException(String message, Throwable cause)
		{
			super(message, cause);
		}
	
		public SplitZeroSizeException(String message, Throwable cause, 
	                                       boolean enableSuppression, boolean writableStackTrace)
		{
			super(message, cause, enableSuppression, writableStackTrace);
		}
}
