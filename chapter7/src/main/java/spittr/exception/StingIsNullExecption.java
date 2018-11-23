package spittr.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/*@ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "the length of tstring is zero")*/
public class StingIsNullExecption extends RuntimeException {
}
