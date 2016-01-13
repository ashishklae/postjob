package postjob.model;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RestExceptionProcessor {
	@Autowired
	private MessageSource messageSource;
	
	@ExceptionHandler(PostJobNotFoundException.class)
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	@ResponseBody
	public ErrorInfo PostJobNotFoundException(HttpServletRequest req, PostJobNotFoundException ex) {
		
		String errorMessage = localizeErrorMessage("error.no.user.id");
		
		errorMessage += ex.getId();
		String errorURL = req.getRequestURL().toString();
		
		return new ErrorInfo(errorURL, errorMessage);
	}
	
	public String localizeErrorMessage(String errorCode) {
		Locale locale = LocaleContextHolder.getLocale();
		String errorMessage = messageSource.getMessage(errorCode, null, locale);
		return errorMessage;
	}
}
