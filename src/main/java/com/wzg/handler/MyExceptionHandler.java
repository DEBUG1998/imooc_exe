package com.wzg.handler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {
    public static final String ERROR_VIEW = "error";

   /* @ResponseBody
    @ExceptionHandler(Exception.class)
    public Map<String,Object> handleException(Exception e){
        Map<String,Object> map = new HashMap<>();
        map.put("url","request.getRequestURI()");
        map.put("message",e.getMessage());
        return map;
    }*/
    @ExceptionHandler(value = Exception.class)
    public Object errorHandler(HttpServletRequest request,
                               Model model, Exception e){
        //e.printStackTrace();
        System.out.println("---------------MyExceptionHandler--------------------");
        model.addAttribute("exception",e);
        model.addAttribute("url",request.getRequestURI());
        return ERROR_VIEW;
    }

}
