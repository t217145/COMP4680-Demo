package com.cyrus822.demo.web01.Utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import com.cyrus822.demo.web01.Models.CustomException;

@ControllerAdvice
public class CustomControllerAdvice {

    private static final Logger logger = LoggerFactory.getLogger(CustomControllerAdvice.class);

    @ExceptionHandler(Exception.class)
    public ModelAndView handleGeneral(Exception e){
        CustomException err = new CustomException("G001", e.getMessage(), "/index");
        logger.error(err.toString(), err);
        return new ModelAndView("error", "errObj", err);
    }

    @ExceptionHandler(CustomException.class)
    public ModelAndView handleCustom(CustomException e){
        logger.error(e.toString(), e);
        return new ModelAndView("error", "errObj", e);
    }
}