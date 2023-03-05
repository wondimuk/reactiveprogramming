package com.rp.service;


import com.rp.model.Weather;
import com.rp.repository.WeatherRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
@NoArgsConstructor
public class DataCollectorService {
    private WeatherRepository weatherRepository;

    @Autowired
    public DataCollectorService(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }


    public Weather save(Weather weather){
        if(null != weather) {
            weatherRepository.save(weather);
        }
        return weather;
    }

    public Weather delete(String id){
        if(StringUtils.isEmpty(id)) return new Weather();

        Weather wther = weatherRepository.getById(id);

        if(null != wther) weatherRepository.delete(wther);

        return new Weather();
    }
}
