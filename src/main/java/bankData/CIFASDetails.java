package bankData;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)

@ToString
@Data
@NoArgsConstructor
public class CIFASDetails {
    @JsonProperty("MatchDetails")
    private MatchDetails matchDetails;
    @JsonProperty("InformationSource")
    private String informationSource;
    @JsonProperty("CIFASReference")
    private String cifasReference;
    @JsonProperty("FraudCategory")
    private String fraudCategory;
    @JsonProperty("SupplyDate")
    private LocalDate supplyDate;
    @JsonProperty("AndOtherLocations")
    private String andOtherLocations;
    @JsonProperty("SupplyCompanyName")
    private String supplyCompanyName;
    @JsonProperty("SubCategories")
    private String subCategories;
    @JsonProperty("DateOfBirth")
    private LocalDate dateOfBirth;
    @JsonProperty("Product")
    private String product;
    @JsonProperty("Name")
    private Name name;
    @JsonProperty("Location")
    private Location location;

}
