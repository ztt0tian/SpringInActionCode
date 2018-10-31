package stereo_xmlconfig;

import org.springframework.stereotype.Component;


/**
 * @author zhaotian
 * @date 2018/10/31 15:27
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.print("Playing " + title + " by " + artist);
    }

}
