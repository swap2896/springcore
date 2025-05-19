package org.example;
import org.example.springcore.Mobile;
import org.example.springcore.Sim;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );

        /*

        ### LOGIC FOR READING beans.xml and Using ApplicationContext tom implement Spring IoC */
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("beans.xml");
        // Make sure the name should match the same as in beans.xml . It is case-sensitive.
        Sim sim =  applicationContext.getBean("sim", Sim.class);
        sim.calling();
        sim.data();


        /*
         Logic for reading application config from a configuration class i.e. AppConfig class in our case
         We need to change the returned object when required
         */
        ApplicationContext applicationContext1 =  new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Sim sim1 = applicationContext1.getBean("Sim", Sim.class);
        sim1.calling();
        sim1.data();

        /*
         Logic for reading application config from a configuration class i.e. AppConfig class in our case
         annotation-based configuration. In this case a new class Mobile is created to return the object type
         and we require component scan too to make it work
         */
        ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Mobile mobile = applicationContext2.getBean(Mobile.class);
        mobile.useSim();
    }
}
