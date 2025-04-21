package hello.core;

import hello.core.member.MemberService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages= "hello.core.member", //탐색한 패키지의 시작 위치를 지정을 설정 이 패키지를 포함해서 하위 패키지를 모두 탐색한다.
        basePackageClasses= AutoAppConfig.class,//지정한 클래스의 패키지를 탑색 시작위로 지정한다.
        //만약 지정하지 않으면 @ComponentScan이 붙은 설정 정보 클래스의 패키지가 시작 위치가된다.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Configuration.class)
)
public class AutoAppConfig {



}
