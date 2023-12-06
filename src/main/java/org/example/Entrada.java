package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Entrada {
    @JsonProperty("count")
    private int count;
    @JsonProperty("name")
    private String name;
    @JsonProperty("age")
    private int age;

    @Override
    public String toString() {
        return "Entrada{" +
                "Count = " + getCount() + " / " +
                "Name = " + getName() + " / " +
                "Age = " + getAge() + "}";
    }
}
