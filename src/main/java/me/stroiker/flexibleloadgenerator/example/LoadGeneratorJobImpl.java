package me.stroiker.flexibleloadgenerator.example;

import me.stroiker.flexibleloadgenerator.api.LoadGeneratorJob;
import org.springframework.stereotype.Component;

@Component
public class LoadGeneratorJobImpl implements LoadGeneratorJob {

    @Override
    public boolean onEach() {
        System.out.println("Hello World");
        return true;
    }

    @Override
    public void onFinish() {
    }

    @Override
    public void onStart() {
    }
}
