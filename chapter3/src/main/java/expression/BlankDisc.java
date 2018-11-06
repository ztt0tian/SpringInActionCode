package expression;

/**
 * @author zhaotian
 * @date 2018/11/4 19:02
 */
public class BlankDisc {
    private String title;
    private String artist;

    @Override
    public String toString() {
        return "BlankDisc{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public BlankDisc(String title, String artist) {

        this.title = title;
        this.artist = artist;
    }
}
