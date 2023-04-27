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
public class MatchDetails {
    @JsonProperty("StreetMatchLevel")
    private String streetMatchLevel;
    @JsonProperty("HouseMatchLevel")
    private String houseMatchLevel;
    @JsonProperty("BureauRefCategory")
    private String bureauRefCategory;
    @JsonProperty("MatchTo")
    private String matchTo;
    @JsonProperty("MatchType")
    private String matchType;
    @JsonProperty("ForenameMatchLevel")
    private String forenameMatchLevel;
    @JsonProperty("SurnameMatchLevel")
    private String surnameMatchLevel;

}
