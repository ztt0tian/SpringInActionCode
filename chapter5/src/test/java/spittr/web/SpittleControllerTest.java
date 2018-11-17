package spittr.web;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceView;
import spittr.data.SpittleRepository;
import spittr.pojo.Spittle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author zhaotian
 * @date 2018/11/12 11:57
 */
public class SpittleControllerTest {
    @Test
    public void houldShowRecentSpittles() throws Exception {
        List<Spittle> spittles = createSpittleList(20);
        SpittleRepository mockRepository = mock(SpittleRepository.class);
        when(mockRepository.findSpittles(Long.MAX_VALUE, 20)).thenReturn(spittles);
        SpittleController controller = new SpittleController(mockRepository);
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp")).build();
        mockMvc.perform(get("/spittles")).andExpect(view().name("spittles"))
                .andExpect(model().attributeExists("spittleList"))
                .andExpect(model().attribute("spittleList", hasItems(spittles.toArray())));
    }
    @Test
    public void shouldShowPagedSpittles() throws Exception {
        List<Spittle> spittles = createSpittleList(50);
        SpittleRepository repository = mock(SpittleRepository.class);
        when(repository.findSpittles(238900, 50)).thenReturn(spittles);
        SpittleController controller = new SpittleController(repository);
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp")).build();
        mockMvc.perform(get("/spittles?max=238900&count=50"))
                .andExpect(view().name("spittles"))
                .andExpect(model().attributeExists("spittleList"))
                .andExpect(model().attribute("spittleList",
                        hasItems(spittles.toArray())));
    }

    @Test
    public void testSpittle() throws Exception {
        Spittle spittle = new Spittle("hello", new Date());
        SpittleRepository repository = mock(SpittleRepository.class);
        when(repository.findOne(12345)).thenReturn(spittle);
        SpittleController controller = new SpittleController(repository);
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(get("/spittles/12345")).andExpect(view().name("spittle"))
                .andExpect(model().attributeExists("spittle"))
                .andExpect(model().attribute("spittle", spittle));
    }

    @Test
    public void testRegistForm() throws Exception {
        SpittleController controller = new SpittleController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(get("/spittles/register")).andExpect(view().name("registerForm"));
    }
    private List<Spittle> createSpittleList(int count) {
        List<Spittle> spittles = new ArrayList<Spittle>();
        for (int i=0; i < count; i++) {
            spittles.add(new Spittle("Spittle " + i, new Date()));
        }
        return spittles;
    }
}
