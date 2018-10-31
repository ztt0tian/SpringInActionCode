package pojos;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhaotian
 * @date 2018/10/31 11:10
 */
public class KnightMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/knight.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
