package stereo_xmlconfig.collections;

import stereo_xmlconfig.CompactDisc;

import java.util.List;

/**
 * @author zhaotian
 * @date 2018/10/31 16:34
 */
public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }

}
