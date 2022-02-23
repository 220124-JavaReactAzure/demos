package com.revature;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// this class is a source of bean definitions:
@Configuration
// import the berry class, so we can use them in the same context:
@Import(BerryConfig.class)
public class PokemonConfig {


    @Bean(initMethod = "init", destroyMethod = "cleanup")
    // we need the prototype if we want the object to be stateful,
    // otherwise, we will get the same Pokemon every time.
    @Scope("prototype")
    public Pokemon getRandomPokemon() {
        List<String> names = new ArrayList<String>();
        names.add("Bulbasaur");
        names.add("Squirtle");
        names.add("Charmander");
        Random generator = new Random();
        String name = names.get(generator.nextInt(names.size()));
        String type1 = "", type2 = "";
        int level = 5;
        return new Pokemon(name, name, type1, type2, level);
    }
}
