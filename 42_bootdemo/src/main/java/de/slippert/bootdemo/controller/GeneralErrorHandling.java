package de.slippert.bootdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import de.slippert.bootdemo.controller.dto.ErrorDto;

@ControllerAdvice
public class GeneralErrorHandling extends ResponseEntityExceptionHandler {

	public static final Logger LOGGER = LoggerFactory.getLogger(GeneralErrorHandling.class);

	@ExceptionHandler({ Exception.class })
	public ResponseEntity<Object> handleException1(Exception e, WebRequest webRequest) throws Exception {
		LOGGER.error(webRequest.toString());
		LOGGER.error("Oh shit", e);

		ErrorDto dto = new ErrorDto();
		dto.setErrorCode("1234");
		dto.setMessage(e.getMessage());

		return handleException(e, webRequest);
	}
}
