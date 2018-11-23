package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import spittr.exception.DuplicateExecption;
import spittr.exception.StingIsNullExecption;
import spittr.pojo.User;

import java.io.File;
import java.io.IOException;

/**
 * @author zhaotian
 * @date 2018/11/21 16:09
 */
@Controller
@RequestMapping("/fileupload")
public class FileUploadController {

    @RequestMapping(method= RequestMethod.GET)
    public String uploadForm() {
        return "uploadForm";
    }
    @RequestMapping(value = "/file",method=RequestMethod.POST)
    public String processUpload(@RequestPart("file") MultipartFile file, Model model) {
        System.out.println(file.getSize());
        System.out.println("---->  " + file.getName() + "  ::  "  + file.getSize());
        model.addAttribute("username", "ztt");
        return "redirect:/{username}";
    }

    @RequestMapping(value="/picture",method = RequestMethod.POST)
    public String processRegistration(@RequestPart("picture") MultipartFile picture,@RequestParam("tstring") String tstring,@RequestParam("tstring2")String tsring2,Model model) throws IOException {
       if(tstring.equals("")){
            throw new StingIsNullExecption();
        }
        if(tsring2.equals("")){
            throw new DuplicateExecption();
        }
        picture.transferTo(new File("D:/likui/temp/"+picture.getOriginalFilename()));
        System.out.println("传入文件");
        model.addAttribute("username", "ztt");
        return "redirect:/test/{username}";
    }
    @RequestMapping(value="/picture2",method = RequestMethod.POST)
    public String processRegistration2(@RequestPart("picture") MultipartFile picture, @RequestParam("tstring") String tstring, @RequestParam("tstring2")String tsring2, RedirectAttributes model) throws IOException {
        if(tstring.equals("")){
            throw new StingIsNullExecption();
        }
        if(tsring2.equals("")){
            throw new DuplicateExecption();
        }
        picture.transferTo(new File("D:/likui/temp/"+picture.getOriginalFilename()));
        System.out.println("传入文件");
        model.addAttribute("username", "ztt");
        model.addFlashAttribute("user", new User("ztt的账户","账户密码123"));
        return "redirect:/test2/{username}";
    }
    @ExceptionHandler(StingIsNullExecption.class)
    public String handleTstringIsNull() {
        return "redirect:/error/null";
    }

}
