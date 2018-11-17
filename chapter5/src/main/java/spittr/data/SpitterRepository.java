package spittr.data;

import spittr.pojo.Spitter;

/**
 * @author zhaotian
 * @date 2018/11/13 13:13
 */
public interface SpitterRepository {
    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);
}
