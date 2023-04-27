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
public class CreditLimit {
    @JsonProperty("Amount")
    private String amount;
    @JsonProperty("Caption")
    private String caption;
}
