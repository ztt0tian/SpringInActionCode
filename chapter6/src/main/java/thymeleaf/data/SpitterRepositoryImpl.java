package thymeleaf.data;

import org.springframework.stereotype.Component;
import thymeleaf.pojo.Spitter;

@Component("spitterRepository")
public class SpitterRepositoryImpl implements thymeleaf.data.SpitterRepository {
    public Spitter save(Spitter spitter) {
        return spitter;
    }

    public Spitter findByUsername(String username) {
        return null;
    }
}
