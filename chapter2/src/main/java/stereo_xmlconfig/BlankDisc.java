package stereo_xmlconfig;

/**
 * @author zhaotian
 * @date 2018/10/31 16:25
 */
public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

}
