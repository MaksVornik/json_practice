package bankData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
@Data
@NoArgsConstructor
public class Location {
    @JsonProperty("HouseNumber")
    private String houseNumber;
    @JsonProperty("Street")
    private String street;
    @JsonProperty("PostTown")
    private String postTown;
    @JsonProperty("Country")
    private String country;
    @JsonProperty("Postcode")
    private String Postcode;

}
