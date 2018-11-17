package spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author zhaotian
 * @date 2018/11/12 10:51
 */
@Configuration
@ComponentScan(basePackages = {"spittr"},excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class)
})
public class RootConfig {
}
