package spittr.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import spittr.exception.DuplicateExecption;

@ControllerAdvice
public class AppWideExceptionHandler {
    @ExceptionHandler(DuplicateExecption.class)
    public String handleNofound() {
        return "redirect:/error/duplicate";
    }
}
