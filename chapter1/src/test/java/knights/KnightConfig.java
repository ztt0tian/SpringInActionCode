package knights;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pojos.BraveKnight;
import pojos.Knight;
import pojos.Quest;
import pojos.SlayDragonQuest;

/**
 * @author zhaotian
 * @date 2018/10/31 11:07
 */

@Configuration
public class KnightConfig {
    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
