package comp4680sed.unit3.app02;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// @Component
public class MyRunner2 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Runner 2");
    }
}