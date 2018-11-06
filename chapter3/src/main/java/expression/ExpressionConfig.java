package expression;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @author zhaotian
 * @date 2018/11/4 18:59
 */
@Configuration
@PropertySource("classpath:/app.properties")
public class ExpressionConfig {
    @Autowired
    Environment environment;

    @Bean
    public BlankDisc disc() {
        return new BlankDisc(environment.getProperty("disc.title"), environment.getProperty("disc.artist"));
    }
}
