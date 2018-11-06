package expression;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zhaotian
 * @date 2018/11/4 19:05
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ExpressionConfig.class)
public class ExpressionConfigTest {
    @Autowired
    private BlankDisc disc;
    @Test
    public void CdShouldNotNull() {
        System.out.println(disc);
        Assert.assertNotNull(disc);
    }
}
