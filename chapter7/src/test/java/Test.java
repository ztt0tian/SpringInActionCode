import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import spittr.web.FileUploadController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * @author zhaotian
 * @date 2018/11/21 16:16
 */
public class Test {

    @org.junit.Test
    public void testUpload() throws Exception {
        FileUploadController controller = new FileUploadController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(get("/fileupload")).andExpect(view().name("uploadForm"));
    }
}
