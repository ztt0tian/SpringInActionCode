package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhaotian
 * @date 2018/11/21 16:09
 */
@Controller
public class FileUploadController {
    @RequestMapping(value = "/upload")
    public String uploadForm() {
        System.out.println("upload");
        return "uploadForm";
    }
}
