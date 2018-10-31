package stereo_autoconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhaotian
 * @date 2018/10/31 15:29
 */
@Configuration
//@ComponentScan(basePackages = {"stereo_autoconfig"})/*开启扫描*/
@ComponentScan(basePackageClasses = {CompactDisc.class,MediaPlayer.class})
public class CDPlayerConfig {
}
