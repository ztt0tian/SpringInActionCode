package thymeleaf.data;

import thymeleaf.pojo.Spitter;

public interface SpitterRepository {

    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);

}

