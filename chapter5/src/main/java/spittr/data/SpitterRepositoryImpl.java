package spittr.data;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import spittr.pojo.Spitter;

/**
 * @author zhaotian
 * @date 2018/11/13 13:29
 */
@Component("spitterRepository")
public class SpitterRepositoryImpl implements SpitterRepository {

    public Spitter save(Spitter spitter) {
        System.out.println("保存spitter");
        return spitter;
    }

    public Spitter findByUsername( @PathVariable String username) {
        return new Spitter( username, "24hours", "Jack", "Bauer", "jbauer@ctu.gov");
    }
}
