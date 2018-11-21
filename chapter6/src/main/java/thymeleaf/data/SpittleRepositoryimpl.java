package thymeleaf.data;

import org.springframework.stereotype.Component;
import thymeleaf.pojo.Spittle;

import java.util.List;

@Component("spittleRepository")
public class SpittleRepositoryimpl implements SpittleRepository {
    public List<Spittle> findRecentSpittles() {
        return null;
    }

    public List<Spittle> findSpittles(long max, int count) {
        return null;
    }

    public Spittle findOne(long id) {
        return null;
    }

    public void save(Spittle spittle) {
        System.out.println(spittle);
    }
}
