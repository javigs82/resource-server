package es.javier.services.domain;


import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;


@Document
public class Brewery {

    @Field
    private String name;

    @Field
    private String city;

    @Field
    private String state;

    @Field
    private String code;

    @Field
    private String country;

    @Field
    private String description;

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCode() {
        return code;
    }

    public String getCountry() {
        return country;
    }

    public String getDescription() {
        return description;
    }
}
