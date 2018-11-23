package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import spittr.exception.StingIsNullExecption;

import java.io.File;
import java.io.IOException;

/**
 * @author zhaotian
 * @date 2018/11/21 16:09
 */
@Controller
@RequestMapping("/error")
public class HandleErrorController {
    @RequestMapping("/null")
    public String handlenull() {
        return "error_null";
    }

    @RequestMapping("/duplicate")
    public String handleduplicate() {
        return "error_duplicate";
    }
}
