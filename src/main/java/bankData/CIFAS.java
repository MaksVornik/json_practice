package bankData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)

@ToString
@Data
@NoArgsConstructor

public class CIFAS {
    @JsonProperty("LocationIndicator")
    private String locationIndicator;
    @JsonProperty("ApplicantIndicator")
    private String applicationIndicator;
    @JsonProperty("CIFASDetails")
    private List<CIFASDetails> cifasDetails;
}
