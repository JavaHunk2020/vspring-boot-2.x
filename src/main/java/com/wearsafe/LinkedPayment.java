

package com.wearsafe;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "txn_id",
    "applied_amount",
    "applied_at",
    "txn_status",
    "txn_date",
    "txn_amount"
})
@Generated("jsonschema2pojo")
public class LinkedPayment {

    @JsonProperty("txn_id")
    private String txnId;
    @JsonProperty("applied_amount")
    private Integer appliedAmount;
    @JsonProperty("applied_at")
    private Integer appliedAt;
    @JsonProperty("txn_status")
    private String txnStatus;
    @JsonProperty("txn_date")
    private Integer txnDate;
    @JsonProperty("txn_amount")
    private Integer txnAmount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("txn_id")
    public String getTxnId() {
        return txnId;
    }

    @JsonProperty("txn_id")
    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    @JsonProperty("applied_amount")
    public Integer getAppliedAmount() {
        return appliedAmount;
    }

    @JsonProperty("applied_amount")
    public void setAppliedAmount(Integer appliedAmount) {
        this.appliedAmount = appliedAmount;
    }

    @JsonProperty("applied_at")
    public Integer getAppliedAt() {
        return appliedAt;
    }

    @JsonProperty("applied_at")
    public void setAppliedAt(Integer appliedAt) {
        this.appliedAt = appliedAt;
    }

    @JsonProperty("txn_status")
    public String getTxnStatus() {
        return txnStatus;
    }

    @JsonProperty("txn_status")
    public void setTxnStatus(String txnStatus) {
        this.txnStatus = txnStatus;
    }

    @JsonProperty("txn_date")
    public Integer getTxnDate() {
        return txnDate;
    }

    @JsonProperty("txn_date")
    public void setTxnDate(Integer txnDate) {
        this.txnDate = txnDate;
    }

    @JsonProperty("txn_amount")
    public Integer getTxnAmount() {
        return txnAmount;
    }

    @JsonProperty("txn_amount")
    public void setTxnAmount(Integer txnAmount) {
        this.txnAmount = txnAmount;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
