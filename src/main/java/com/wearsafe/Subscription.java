
package com.wearsafe;

import java.util.HashMap;
import java.util.List;
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
    "billing_period",
    "billing_period_unit",
    "customer_id",
    "status",
    "current_term_start",
    "current_term_end",
    "next_billing_at",
    "created_at",
    "started_at",
    "activated_at",
    "created_from_ip",
    "updated_at",
    "has_scheduled_changes",
    "channel",
    "resource_version",
    "deleted",
    "object",
    "currency_code",
    "subscription_items",
    "shipping_address",
    "due_invoices_count",
    "mrr"
})
@Generated("jsonschema2pojo")
public class Subscription {

    @JsonProperty("id")
    private String id;
    @JsonProperty("billing_period")
    private Integer billingPeriod;
    @JsonProperty("billing_period_unit")
    private String billingPeriodUnit;
    @JsonProperty("customer_id")
    private String customerId;
    @JsonProperty("status")
    private String status;
    @JsonProperty("current_term_start")
    private Integer currentTermStart;
    @JsonProperty("current_term_end")
    private Integer currentTermEnd;
    @JsonProperty("next_billing_at")
    private Integer nextBillingAt;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("started_at")
    private Integer startedAt;
    @JsonProperty("activated_at")
    private Integer activatedAt;
    @JsonProperty("created_from_ip")
    private String createdFromIp;
    @JsonProperty("updated_at")
    private Integer updatedAt;
    @JsonProperty("has_scheduled_changes")
    private Boolean hasScheduledChanges;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("resource_version")
    private Long resourceVersion;
    @JsonProperty("deleted")
    private Boolean deleted;
    @JsonProperty("object")
    private String object;
    @JsonProperty("currency_code")
    private String currencyCode;
    @JsonProperty("subscription_items")
    private List<SubscriptionItem> subscriptionItems = null;
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress;
    @JsonProperty("due_invoices_count")
    private Integer dueInvoicesCount;
    @JsonProperty("mrr")
    private Integer mrr;
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

    @JsonProperty("billing_period")
    public Integer getBillingPeriod() {
        return billingPeriod;
    }

    @JsonProperty("billing_period")
    public void setBillingPeriod(Integer billingPeriod) {
        this.billingPeriod = billingPeriod;
    }

    @JsonProperty("billing_period_unit")
    public String getBillingPeriodUnit() {
        return billingPeriodUnit;
    }

    @JsonProperty("billing_period_unit")
    public void setBillingPeriodUnit(String billingPeriodUnit) {
        this.billingPeriodUnit = billingPeriodUnit;
    }

    @JsonProperty("customer_id")
    public String getCustomerId() {
        return customerId;
    }

    @JsonProperty("customer_id")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("current_term_start")
    public Integer getCurrentTermStart() {
        return currentTermStart;
    }

    @JsonProperty("current_term_start")
    public void setCurrentTermStart(Integer currentTermStart) {
        this.currentTermStart = currentTermStart;
    }

    @JsonProperty("current_term_end")
    public Integer getCurrentTermEnd() {
        return currentTermEnd;
    }

    @JsonProperty("current_term_end")
    public void setCurrentTermEnd(Integer currentTermEnd) {
        this.currentTermEnd = currentTermEnd;
    }

    @JsonProperty("next_billing_at")
    public Integer getNextBillingAt() {
        return nextBillingAt;
    }

    @JsonProperty("next_billing_at")
    public void setNextBillingAt(Integer nextBillingAt) {
        this.nextBillingAt = nextBillingAt;
    }

    @JsonProperty("created_at")
    public Integer getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("started_at")
    public Integer getStartedAt() {
        return startedAt;
    }

    @JsonProperty("started_at")
    public void setStartedAt(Integer startedAt) {
        this.startedAt = startedAt;
    }

    @JsonProperty("activated_at")
    public Integer getActivatedAt() {
        return activatedAt;
    }

    @JsonProperty("activated_at")
    public void setActivatedAt(Integer activatedAt) {
        this.activatedAt = activatedAt;
    }

    @JsonProperty("created_from_ip")
    public String getCreatedFromIp() {
        return createdFromIp;
    }

    @JsonProperty("created_from_ip")
    public void setCreatedFromIp(String createdFromIp) {
        this.createdFromIp = createdFromIp;
    }

    @JsonProperty("updated_at")
    public Integer getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("has_scheduled_changes")
    public Boolean getHasScheduledChanges() {
        return hasScheduledChanges;
    }

    @JsonProperty("has_scheduled_changes")
    public void setHasScheduledChanges(Boolean hasScheduledChanges) {
        this.hasScheduledChanges = hasScheduledChanges;
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

    @JsonProperty("currency_code")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currency_code")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("subscription_items")
    public List<SubscriptionItem> getSubscriptionItems() {
        return subscriptionItems;
    }

    @JsonProperty("subscription_items")
    public void setSubscriptionItems(List<SubscriptionItem> subscriptionItems) {
        this.subscriptionItems = subscriptionItems;
    }

    @JsonProperty("shipping_address")
    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    @JsonProperty("shipping_address")
    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @JsonProperty("due_invoices_count")
    public Integer getDueInvoicesCount() {
        return dueInvoicesCount;
    }

    @JsonProperty("due_invoices_count")
    public void setDueInvoicesCount(Integer dueInvoicesCount) {
        this.dueInvoicesCount = dueInvoicesCount;
    }

    @JsonProperty("mrr")
    public Integer getMrr() {
        return mrr;
    }

    @JsonProperty("mrr")
    public void setMrr(Integer mrr) {
        this.mrr = mrr;
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
