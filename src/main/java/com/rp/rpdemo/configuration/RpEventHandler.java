package com.rp.rpdemo.event;

import com.rp.rpdemo.model.Geolocation;
import com.rp.rpdemo.model.Weather;
import com.rp.rpdemo.service.DataCollectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Configuration
@EnableScheduling
public class RpEventHandler {

    @Autowired
    private DataCollectorService weatherService;

    @Scheduled(cron = "10/10 * * * * *")
    private void publishDataToDatabase(){

        System.out.println("Started Scheduled action!");

        List<Weather> data = generateData();

        data.forEach(weather -> {
            weatherService.save(weather);
            System.out.println("Processing data save to database" + weather);
        });

    }

    private List<Weather> generateData() {
        List<Weather> weatherList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 2; i++) {
            Weather wther = new Weather(
                    random.nextInt(111, 999),
                    new Geolocation(),
                    random.nextInt(0, 100),
                    random.nextInt(0, 100),
                    random.nextInt(0, 100));
            weatherList.add(wther);
        }
        return weatherList;
    }

}
