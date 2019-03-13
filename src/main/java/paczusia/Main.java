package paczusia;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String []args){

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Information information =
                context.getBean("weatherInformation",Information.class);
        System.out.println(information.getInformation());

        System.out.println( ( (WeatherInformation) information).getBreakingNews() );

        Information musicinformation = context.getBean("musicInformation", Information.class);
        System.out.println(musicinformation.getInformation());
        System.out.println(((MusicInformation) musicinformation).getDescription());

        ClassPathXmlApplicationContext contextAdd =
                new ClassPathXmlApplicationContext("applicationContextAdd.xml");
        SportInformation si =
                contextAdd.getBean("sportInformation",SportInformation.class);
        System.out.println(si.getBreakingNews());
        System.out.println(si.getName());
        contextAdd.close();


        AnnotationConfigApplicationContext contextNoxml =
                new AnnotationConfigApplicationContext(InformationConfig.class);
        SportInformation si2 =
                contextNoxml.getBean("sportInformation",SportInformation.class);
        System.out.println("no xml breaking sport news : "+si2.getBreakingNews());
        System.out.println(si2.getName());
        contextNoxml.close();



    }

}
