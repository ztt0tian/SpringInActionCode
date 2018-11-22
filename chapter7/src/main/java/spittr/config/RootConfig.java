package spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.type.filter.RegexPatternTypeFilter;

import java.util.regex.Pattern;

/**
 * @author zhaotian
 * @date 2018/11/21 16:07
 */
@Configuration
@ComponentScan(basePackages={"spittr"},
        excludeFilters={
                @ComponentScan.Filter(type= FilterType.CUSTOM, value=RootConfig.WebPackage.class)
        })
public class RootConfig {
    public static class WebPackage extends RegexPatternTypeFilter {
        public WebPackage() {
            super(Pattern.compile("spittr\\.web"));
        }
    }
}

