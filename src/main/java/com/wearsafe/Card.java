

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
    "status",
    "gateway",
    "gateway_account_id",
    "iin",
    "last4",
    "card_type",
    "funding_type",
    "expiry_month",
    "expiry_year",
    "created_at",
    "updated_at",
    "ip_address",
    "resource_version",
    "object",
    "masked_number",
    "customer_id",
    "payment_source_id"
})
@Generated("jsonschema2pojo")
public class Card {

    @JsonProperty("status")
    private String status;
    @JsonProperty("gateway")
    private String gateway;
    @JsonProperty("gateway_account_id")
    private String gatewayAccountId;
    @JsonProperty("iin")
    private String iin;
    @JsonProperty("last4")
    private String last4;
    @JsonProperty("card_type")
    private String cardType;
    @JsonProperty("funding_type")
    private String fundingType;
    @JsonProperty("expiry_month")
    private Integer expiryMonth;
    @JsonProperty("expiry_year")
    private Integer expiryYear;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("updated_at")
    private Integer updatedAt;
    @JsonProperty("ip_address")
    private String ipAddress;
    @JsonProperty("resource_version")
    private Long resourceVersion;
    @JsonProperty("object")
    private String object;
    @JsonProperty("masked_number")
    private String maskedNumber;
    @JsonProperty("customer_id")
    private String customerId;
    @JsonProperty("payment_source_id")
    private String paymentSourceId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("gateway")
    public String getGateway() {
        return gateway;
    }

    @JsonProperty("gateway")
    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    @JsonProperty("gateway_account_id")
    public String getGatewayAccountId() {
        return gatewayAccountId;
    }

    @JsonProperty("gateway_account_id")
    public void setGatewayAccountId(String gatewayAccountId) {
        this.gatewayAccountId = gatewayAccountId;
    }

    @JsonProperty("iin")
    public String getIin() {
        return iin;
    }

    @JsonProperty("iin")
    public void setIin(String iin) {
        this.iin = iin;
    }

    @JsonProperty("last4")
    public String getLast4() {
        return last4;
    }

    @JsonProperty("last4")
    public void setLast4(String last4) {
        this.last4 = last4;
    }

    @JsonProperty("card_type")
    public String getCardType() {
        return cardType;
    }

    @JsonProperty("card_type")
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @JsonProperty("funding_type")
    public String getFundingType() {
        return fundingType;
    }

    @JsonProperty("funding_type")
    public void setFundingType(String fundingType) {
        this.fundingType = fundingType;
    }

    @JsonProperty("expiry_month")
    public Integer getExpiryMonth() {
        return expiryMonth;
    }

    @JsonProperty("expiry_month")
    public void setExpiryMonth(Integer expiryMonth) {
        this.expiryMonth = expiryMonth;
    }

    @JsonProperty("expiry_year")
    public Integer getExpiryYear() {
        return expiryYear;
    }

    @JsonProperty("expiry_year")
    public void setExpiryYear(Integer expiryYear) {
        this.expiryYear = expiryYear;
    }

    @JsonProperty("created_at")
    public Integer getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public Integer getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("ip_address")
    public String getIpAddress() {
        return ipAddress;
    }

    @JsonProperty("ip_address")
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @JsonProperty("resource_version")
    public Long getResourceVersion() {
        return resourceVersion;
    }

    @JsonProperty("resource_version")
    public void setResourceVersion(Long resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    @JsonProperty("object")
    public String getObject() {
        return object;
    }

    @JsonProperty("object")
    public void setObject(String object) {
        this.object = object;
    }

    @JsonProperty("masked_number")
    public String getMaskedNumber() {
        return maskedNumber;
    }

    @JsonProperty("masked_number")
    public void setMaskedNumber(String maskedNumber) {
        this.maskedNumber = maskedNumber;
    }

    @JsonProperty("customer_id")
    public String getCustomerId() {
        return customerId;
    }

    @JsonProperty("customer_id")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @JsonProperty("payment_source_id")
    public String getPaymentSourceId() {
        return paymentSourceId;
    }

    @JsonProperty("payment_source_id")
    public void setPaymentSourceId(String paymentSourceId) {
        this.paymentSourceId = paymentSourceId;
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
