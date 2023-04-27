package bankData;

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
public class CAISDetails {
    @JsonProperty("MatchDetails")
    private MatchDetails matchDetails;
    @JsonProperty("InformationSource")
    private String informationSource;
    @JsonProperty("CreditLimit")
    private CreditLimit creditLimit;
    @JsonProperty("Balance")
    private Balance balance;
    @JsonProperty("AccountStatusCodes")
    private String accountStatusCodes;
    @JsonProperty("StatusTo3")
    private String statusTo3;
    @JsonProperty("Status1To2")
    private String status1To2;
    @JsonProperty("NumOfMonthsHistory")
    private int numberOfMonthsHistory;
    @JsonProperty("CAISAccStartDate")
    private LocalDate caisAccStartDate;
    @JsonProperty("SettlementDate")
    private LocalDate settlementDate;
    @JsonProperty("SettleDateCaption")
    private String settleDateCaption;
    @JsonProperty("LastUpdatedDate")
    private LocalDate lastUpdatedDate;
    @JsonProperty("BankFlag")
    private String bankFlag;
    @JsonProperty("WorstStatus")
    private String worstStatus;
    @JsonProperty("OwnDate")
    private String ownDate;
    @JsonProperty("RepaymentPeriod")
    private int repaymentPeriod;
    @JsonProperty("Payment")
    private String payment;
    @JsonProperty("DateOfBirth")
    private LocalDate dateOfBirth;
    @JsonProperty("Sex")
    private String sex;
    @JsonProperty("PaymentFrequency")
    private String paymentFrequency;
    @JsonProperty("AccountStatus")
    private String accountStatus;
    @JsonProperty("NumAddInfoBlocks")
    private int numAddInfoBlocks;
    @JsonProperty("NumAccountBalances")
    private int numAccountBalances;
    @JsonProperty("AccountBalances")
    private List<AccountBalances> accountBalances;
    @JsonProperty("NumCardHistories")
    private int numCardHistories;
    @JsonProperty("CardHistories")
    private List<CardHistories> cardHistories;
    @JsonProperty("NumCreditLimChanges")
    private int numCreditLimChanges;
    @JsonProperty("CredLimitHistories")
    private List<CredLimitHistories> credLimitHistories;
    @JsonProperty("NumStatuses")
    private int numStatuses;
    @JsonProperty("CompanyType")
    private String companyType;
    @JsonProperty("AccountType")
    private String accountType;
    @JsonProperty("Name")
    private Name name;
    @JsonProperty("Location")
    private Location location;


}
