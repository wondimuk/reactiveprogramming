package com.rp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Geolocation {
    private String city;
    private String region;
    private String country;
}
