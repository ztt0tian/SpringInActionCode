package stereo_mixedconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author zhaotian
 * @date 2018/10/31 16:54
 */
@Configuration
@Import({CDPlayerConfig.class})
@ImportResource(locations = "classpath:spring/cd-config.xml")
public class SoundSystemConfig {
}
