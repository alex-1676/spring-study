package hello.core.singleton;

import hello.core.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StatefulServiceTest {

    @Test
    void statefulServiceSingleton(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        int user1Price =statefulService1.order("userA",10000);

        int user2Price=statefulService2.order("userB",20000);

        //ThreadA: 사용사A 주문 금액 조회
//        int price = statefulService1.getPrice();
        System.out.println("price = " + user1Price);

//        assertThat(statefulService1.getPrice()).isEqualTo(20000);
    }


    static class TestConfig{

        @Bean
        public  StatefulService statefulService(){
            return new StatefulService();
        }
    }
}
