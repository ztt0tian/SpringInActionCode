package spittr.data;

import spittr.pojo.Spittle;

import java.util.List;

/**
 * @author zhaotian
 * @date 2018/11/12 11:22
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
    Spittle findOne(long id);
}
