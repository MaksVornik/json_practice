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
public class Name {
    @JsonProperty("Title")
    private String title;
    @JsonProperty("Forename")
    private String forename;
    @JsonProperty("Surname")
    private String surName;
}
