package com.revature.springAOP.util.aspects;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.revature.springAOP.exceptions.AmTeapotException;
import com.revature.springAOP.exceptions.AuthenticationException;
import com.revature.springAOP.exceptions.InvalidRequestException;
import com.revature.springAOP.exceptions.ResourcePersistenceException;
import com.revature.springAOP.web.dtos.ErrorExceptionResponse;

@RestControllerAdvice
public class ErrorExceptionReponseAspect {

	@ExceptionHandler
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ErrorExceptionResponse handleRuntimeException(RuntimeException e) {
		return new ErrorExceptionResponse(500, e);
	}
	
	@ExceptionHandler(ResourcePersistenceException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ErrorExceptionResponse handleResourcePersistanceException(RuntimeException e) {
		return new ErrorExceptionResponse(500, e);
	}
	
	@ExceptionHandler(InvalidRequestException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorExceptionResponse handleInvalidRequestException(RuntimeException e) {
		return new ErrorExceptionResponse(400, e);
	}
	
	@ExceptionHandler(AuthenticationException.class)
	@ResponseStatus(HttpStatus.UNAUTHORIZED)
	public ErrorExceptionResponse handleAuthenticationException(RuntimeException e) {
		return new ErrorExceptionResponse(401, e);
	}
	
	@ExceptionHandler(AmTeapotException.class)
	@ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
	public ErrorExceptionResponse handleTeaException(RuntimeException e) {
		return new ErrorExceptionResponse(418, e.getMessage(), e);
	}
	
	@ExceptionHandler
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ErrorExceptionResponse handleException(Exception e) {
		return new ErrorExceptionResponse(500, e);
	}
}
