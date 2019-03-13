package paczusia;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@PropertySource("information.properties")
@ComponentScan("paczusia")
public class InformationConfig {

    //sport breaking new service bean
    @Bean
    public SportBreakingNewsService sportBreakingNewsService(){
        return new SportBreakingNewsService();
    }
    //sport information bean
    @Bean
    public SportInformation sportInformation(){
        return new SportInformation(sportBreakingNewsService());
    }

}
