package com.springinaction;

import com.springinaction.knights.Knight;
import com.springinaction.knights.config.KnightConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext classContext = new AnnotationConfigApplicationContext(KnightConfig.class);

        Knight knight = (Knight) classContext.getBean(Knight.class);
        knight.embarkOnQuest();

        classContext.close();

        ClassPathXmlApplicationContext xmlContext = new ClassPathXmlApplicationContext("knights.xml");

        Knight otherKnight = (Knight) xmlContext.getBean(Knight.class);
        otherKnight.embarkOnQuest();

        xmlContext.close();
    }
}
