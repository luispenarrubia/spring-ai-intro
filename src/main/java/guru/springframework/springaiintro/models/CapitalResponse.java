package guru.springframework.springaiintro.models;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public record CapitalResponse(@JsonPropertyDescription("This is the city name") String name,
                              @JsonPropertyDescription("This is the the population of the city") String population,
                              @JsonPropertyDescription("This is the region of the city") String region,
                              @JsonPropertyDescription("This is the language of the city") String language,
                              @JsonPropertyDescription("This is the currency of the city") String currency,
                              @JsonPropertyDescription("This is the timezone of the city") String timezone,
                              @JsonPropertyDescription("This is the latitude of the city") String latitude,
                              @JsonPropertyDescription("This is the longitude of the city") String longitude,
                              @JsonPropertyDescription("This is an interesting fact of the city") String interestingFact) {

}
