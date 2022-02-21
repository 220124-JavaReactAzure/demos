package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // simple hello world bean:
        ApplicationContext contextXML = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) contextXML.getBean("helloWorld");
        obj.getMessage();

        // constructor based injection (we can refer to the xml file to confirm)
        Pokemon pokemon1 = (Pokemon) contextXML.getBean("pikachu");
        System.out.println(pokemon1);

        // setter/property based injection
        Pokemon pokemon2 = (Pokemon) contextXML.getBean("poochyena");
        System.out.println(pokemon2);

        // Trainer, injecting non-primitive values:
        Trainer ash = (Trainer) contextXML.getBean("ash");
        System.out.println(ash);


        // Annotations:
        // we create a new contect that uses annotations, instead of XML:
        ApplicationContext contextAnnotations = new AnnotationConfigApplicationContext(PokemonConfig.class);

        // initialize beans:
        Pokemon pokemon3 = contextAnnotations.getBean(Pokemon.class);
        Pokemon pokemon4 = contextAnnotations.getBean(Pokemon.class);

        // print them out:
        System.out.println(pokemon3);
        System.out.println(pokemon4);

        // clean up the beans:
        pokemon3.cleanup();
        pokemon4.cleanup();

        // we can use the same context to get beans, because of imports:
        Berry berry = contextAnnotations.getBean(Berry.class);
        System.out.println(berry);

    }
}
