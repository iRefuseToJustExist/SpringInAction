package com.springinaction;

import com.springinaction.knights.Knight;
import com.springinaction.knights.config.KnightConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);

        Knight knight = (Knight) context.getBean("knight");
        knight.embarkOnQuest();

        context.close();
    }
}
