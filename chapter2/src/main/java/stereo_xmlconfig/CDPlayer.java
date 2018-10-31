package stereo_xmlconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zhaotian
 * @date 2018/10/31 15:45
 */
@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cds) {
        this.cd = cds;
    }

    public void play() {
        cd.play();
    }

}
