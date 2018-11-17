package spittr.data;

import org.springframework.stereotype.Component;
import spittr.pojo.Spittle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author zhaotian
 * @date 2018/11/12 12:32
 */
@Component("spittleRepository")
public class SpittleRepositoryImpl implements SpittleRepository {
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> spittles = new ArrayList<Spittle>();
        for (int i=0; i < count; i++) {
            spittles.add(new Spittle("Spittle " + i, new Date()));
        }
        return spittles;
    }

    public Spittle findOne(long id) {
        Spittle spittle=new Spittle("Spittle " + id, new Date());
        return spittle;
    }
}
