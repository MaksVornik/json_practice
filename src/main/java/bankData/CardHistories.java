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
public class CardHistories {
    @JsonProperty("PrevStatementBal")
    private String prevStatementBal;
    @JsonProperty("PromotionalRate")
    private String promotionalRate;
    @JsonProperty("PaymentAmount")
    private String paymentAmount;
    @JsonProperty("NumCashAdvances")
    private String numCashAdvances;
    @JsonProperty("CashAdvanceAmount")
    private String cashAdvanceAmount;
}
