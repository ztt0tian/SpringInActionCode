package sound_auto;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import stereo_autoconfig.CDPlayerConfig;
import stereo_autoconfig.CompactDisc;
import stereo_autoconfig.MediaPlayer;

import javax.inject.Inject;

/**
 * @author zhaotian
 * @date 2018/10/31 15:33
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();
    @Inject
    private CompactDisc compactDisc;

    @Autowired
    private MediaPlayer mediaPlayer;
    @Test
    public void CdShouldNotNull() {
        Assert.assertNotNull(compactDisc);
    }

    @Test
    public void PlayTest() {
        mediaPlayer.play();
        Assert.assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles",
                log.getLog());
    }
}
