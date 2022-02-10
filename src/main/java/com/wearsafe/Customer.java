
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
    "id",
    "first_name",
    "last_name",
    "email",
    "phone",
    "company",
    "auto_collection",
    "net_term_days",
    "allow_direct_debit",
    "created_at",
    "created_from_ip",
    "taxability",
    "updated_at",
    "locale",
    "pii_cleared",
    "channel",
    "resource_version",
    "deleted",
    "object",
    "billing_address",
    "card_status",
    "promotional_credits",
    "refundable_credits",
    "excess_payments",
    "unbilled_charges",
    "preferred_currency_code",
    "primary_payment_source_id",
    "payment_method",
    "cf_base_url",
    "cf_api_key",
    "cf_customer_route",
    "cf_person_id",
    "cf_org_unit_id"
})
@Generated("jsonschema2pojo")
public class Customer {

    @JsonProperty("id")
    private String id;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("email")
    private String email;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("company")
    private String company;
    @JsonProperty("auto_collection")
    private String autoCollection;
    @JsonProperty("net_term_days")
    private Integer netTermDays;
    @JsonProperty("allow_direct_debit")
    private Boolean allowDirectDebit;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("created_from_ip")
    private String createdFromIp;
    @JsonProperty("taxability")
    private String taxability;
    @JsonProperty("updated_at")
    private Integer updatedAt;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("pii_cleared")
    private String piiCleared;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("resource_version")
    private Long resourceVersion;
    @JsonProperty("deleted")
    private Boolean deleted;
    @JsonProperty("object")
    private String object;
    @JsonProperty("billing_address")
    private BillingAddress billingAddress;
    @JsonProperty("card_status")
    private String cardStatus;
    @JsonProperty("promotional_credits")
    private Integer promotionalCredits;
    @JsonProperty("refundable_credits")
    private Integer refundableCredits;
    @JsonProperty("excess_payments")
    private Integer excessPayments;
    @JsonProperty("unbilled_charges")
    private Integer unbilledCharges;
    @JsonProperty("preferred_currency_code")
    private String preferredCurrencyCode;
    @JsonProperty("primary_payment_source_id")
    private String primaryPaymentSourceId;
    @JsonProperty("payment_method")
    private PaymentMethod paymentMethod;
    @JsonProperty("cf_base_url")
    private String cfBaseUrl;
    @JsonProperty("cf_api_key")
    private String cfApiKey;
    @JsonProperty("cf_customer_route")
    private String cfCustomerRoute;
    @JsonProperty("cf_person_id")
    private Integer cfPersonId;
    @JsonProperty("cf_org_unit_id")
    private Integer cfOrgUnitId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("company")
    public String getCompany() {
        return company;
    }

    @JsonProperty("company")
    public void setCompany(String company) {
        this.company = company;
    }

    @JsonProperty("auto_collection")
    public String getAutoCollection() {
        return autoCollection;
    }

    @JsonProperty("auto_collection")
    public void setAutoCollection(String autoCollection) {
        this.autoCollection = autoCollection;
    }

    @JsonProperty("net_term_days")
    public Integer getNetTermDays() {
        return netTermDays;
    }

    @JsonProperty("net_term_days")
    public void setNetTermDays(Integer netTermDays) {
        this.netTermDays = netTermDays;
    }

    @JsonProperty("allow_direct_debit")
    public Boolean getAllowDirectDebit() {
        return allowDirectDebit;
    }

    @JsonProperty("allow_direct_debit")
    public void setAllowDirectDebit(Boolean allowDirectDebit) {
        this.allowDirectDebit = allowDirectDebit;
    }

    @JsonProperty("created_at")
    public Integer getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("created_from_ip")
    public String getCreatedFromIp() {
        return createdFromIp;
    }

    @JsonProperty("created_from_ip")
    public void setCreatedFromIp(String createdFromIp) {
        this.createdFromIp = createdFromIp;
    }

    @JsonProperty("taxability")
    public String getTaxability() {
        return taxability;
    }

    @JsonProperty("taxability")
    public void setTaxability(String taxability) {
        this.taxability = taxability;
    }

    @JsonProperty("updated_at")
    public Integer getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    @JsonProperty("pii_cleared")
    public String getPiiCleared() {
        return piiCleared;
    }

    @JsonProperty("pii_cleared")
    public void setPiiCleared(String piiCleared) {
        this.piiCleared = piiCleared;
    }

    @JsonProperty("channel")
    public String getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(String channel) {
        this.channel = channel;
    }

    @JsonProperty("resource_version")
    public Long getResourceVersion() {
        return resourceVersion;
    }

    @JsonProperty("resource_version")
    public void setResourceVersion(Long resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    @JsonProperty("deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    @JsonProperty("deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @JsonProperty("object")
    public String getObject() {
        return object;
    }

    @JsonProperty("object")
    public void setObject(String object) {
        this.object = object;
    }

    @JsonProperty("billing_address")
    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    @JsonProperty("billing_address")
    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    @JsonProperty("card_status")
    public String getCardStatus() {
        return cardStatus;
    }

    @JsonProperty("card_status")
    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }

    @JsonProperty("promotional_credits")
    public Integer getPromotionalCredits() {
        return promotionalCredits;
    }

    @JsonProperty("promotional_credits")
    public void setPromotionalCredits(Integer promotionalCredits) {
        this.promotionalCredits = promotionalCredits;
    }

    @JsonProperty("refundable_credits")
    public Integer getRefundableCredits() {
        return refundableCredits;
    }

    @JsonProperty("refundable_credits")
    public void setRefundableCredits(Integer refundableCredits) {
        this.refundableCredits = refundableCredits;
    }

    @JsonProperty("excess_payments")
    public Integer getExcessPayments() {
        return excessPayments;
    }

    @JsonProperty("excess_payments")
    public void setExcessPayments(Integer excessPayments) {
        this.excessPayments = excessPayments;
    }

    @JsonProperty("unbilled_charges")
    public Integer getUnbilledCharges() {
        return unbilledCharges;
    }

    @JsonProperty("unbilled_charges")
    public void setUnbilledCharges(Integer unbilledCharges) {
        this.unbilledCharges = unbilledCharges;
    }

    @JsonProperty("preferred_currency_code")
    public String getPreferredCurrencyCode() {
        return preferredCurrencyCode;
    }

    @JsonProperty("preferred_currency_code")
    public void setPreferredCurrencyCode(String preferredCurrencyCode) {
        this.preferredCurrencyCode = preferredCurrencyCode;
    }

    @JsonProperty("primary_payment_source_id")
    public String getPrimaryPaymentSourceId() {
        return primaryPaymentSourceId;
    }

    @JsonProperty("primary_payment_source_id")
    public void setPrimaryPaymentSourceId(String primaryPaymentSourceId) {
        this.primaryPaymentSourceId = primaryPaymentSourceId;
    }

    @JsonProperty("payment_method")
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    @JsonProperty("payment_method")
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @JsonProperty("cf_base_url")
    public String getCfBaseUrl() {
        return cfBaseUrl;
    }

    @JsonProperty("cf_base_url")
    public void setCfBaseUrl(String cfBaseUrl) {
        this.cfBaseUrl = cfBaseUrl;
    }

    @JsonProperty("cf_api_key")
    public String getCfApiKey() {
        return cfApiKey;
    }

    @JsonProperty("cf_api_key")
    public void setCfApiKey(String cfApiKey) {
        this.cfApiKey = cfApiKey;
    }

    @JsonProperty("cf_customer_route")
    public String getCfCustomerRoute() {
        return cfCustomerRoute;
    }

    @JsonProperty("cf_customer_route")
    public void setCfCustomerRoute(String cfCustomerRoute) {
        this.cfCustomerRoute = cfCustomerRoute;
    }

    @JsonProperty("cf_person_id")
    public Integer getCfPersonId() {
        return cfPersonId;
    }

    @JsonProperty("cf_person_id")
    public void setCfPersonId(Integer cfPersonId) {
        this.cfPersonId = cfPersonId;
    }

    @JsonProperty("cf_org_unit_id")
    public Integer getCfOrgUnitId() {
        return cfOrgUnitId;
    }

    @JsonProperty("cf_org_unit_id")
    public void setCfOrgUnitId(Integer cfOrgUnitId) {
        this.cfOrgUnitId = cfOrgUnitId;
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
