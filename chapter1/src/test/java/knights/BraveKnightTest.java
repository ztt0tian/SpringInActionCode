package knights;

import org.junit.Test;
import pojos.BraveKnight;
import pojos.Quest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * @author zhaotian
 * @date 2018/10/31 10:47
 */
public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockquest = mock(Quest.class);
        BraveKnight braveKnight = new BraveKnight(mockquest);
        braveKnight.embarkOnQuest();
        verify(mockquest,times(1)).embark();
    }
}
