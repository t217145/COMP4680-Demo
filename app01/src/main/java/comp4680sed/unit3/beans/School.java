package comp4680sed.unit3.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class School {
    @Value("${school.name:My school}")
    private String name;

    public String getName() {
        return name;
    }
}