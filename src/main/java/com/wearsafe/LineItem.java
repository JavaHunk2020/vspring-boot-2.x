

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
    "date_from",
    "date_to",
    "unit_amount",
    "quantity",
    "amount",
    "pricing_model",
    "is_taxed",
    "tax_amount",
    "object",
    "subscription_id",
    "customer_id",
    "description",
    "entity_type",
    "entity_id",
    "entity_description",
    "tax_exempt_reason",
    "discount_amount",
    "item_level_discount_amount"
})
@Generated("jsonschema2pojo")
public class LineItem {

    @JsonProperty("id")
    private String id;
    @JsonProperty("date_from")
    private Integer dateFrom;
    @JsonProperty("date_to")
    private Integer dateTo;
    @JsonProperty("unit_amount")
    private Integer unitAmount;
    @JsonProperty("quantity")
    private Integer quantity;
    @JsonProperty("amount")
    private Integer amount;
    @JsonProperty("pricing_model")
    private String pricingModel;
    @JsonProperty("is_taxed")
    private Boolean isTaxed;
    @JsonProperty("tax_amount")
    private Integer taxAmount;
    @JsonProperty("object")
    private String object;
    @JsonProperty("subscription_id")
    private String subscriptionId;
    @JsonProperty("customer_id")
    private String customerId;
    @JsonProperty("description")
    private String description;
    @JsonProperty("entity_type")
    private String entityType;
    @JsonProperty("entity_id")
    private String entityId;
    @JsonProperty("entity_description")
    private String entityDescription;
    @JsonProperty("tax_exempt_reason")
    private String taxExemptReason;
    @JsonProperty("discount_amount")
    private Integer discountAmount;
    @JsonProperty("item_level_discount_amount")
    private Integer itemLevelDiscountAmount;
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

    @JsonProperty("date_from")
    public Integer getDateFrom() {
        return dateFrom;
    }

    @JsonProperty("date_from")
    public void setDateFrom(Integer dateFrom) {
        this.dateFrom = dateFrom;
    }

    @JsonProperty("date_to")
    public Integer getDateTo() {
        return dateTo;
    }

    @JsonProperty("date_to")
    public void setDateTo(Integer dateTo) {
        this.dateTo = dateTo;
    }

    @JsonProperty("unit_amount")
    public Integer getUnitAmount() {
        return unitAmount;
    }

    @JsonProperty("unit_amount")
    public void setUnitAmount(Integer unitAmount) {
        this.unitAmount = unitAmount;
    }

    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @JsonProperty("pricing_model")
    public String getPricingModel() {
        return pricingModel;
    }

    @JsonProperty("pricing_model")
    public void setPricingModel(String pricingModel) {
        this.pricingModel = pricingModel;
    }

    @JsonProperty("is_taxed")
    public Boolean getIsTaxed() {
        return isTaxed;
    }

    @JsonProperty("is_taxed")
    public void setIsTaxed(Boolean isTaxed) {
        this.isTaxed = isTaxed;
    }

    @JsonProperty("tax_amount")
    public Integer getTaxAmount() {
        return taxAmount;
    }

    @JsonProperty("tax_amount")
    public void setTaxAmount(Integer taxAmount) {
        this.taxAmount = taxAmount;
    }

    @JsonProperty("object")
    public String getObject() {
        return object;
    }

    @JsonProperty("object")
    public void setObject(String object) {
        this.object = object;
    }

    @JsonProperty("subscription_id")
    public String getSubscriptionId() {
        return subscriptionId;
    }

    @JsonProperty("subscription_id")
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    @JsonProperty("customer_id")
    public String getCustomerId() {
        return customerId;
    }

    @JsonProperty("customer_id")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("entity_type")
    public String getEntityType() {
        return entityType;
    }

    @JsonProperty("entity_type")
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    @JsonProperty("entity_id")
    public String getEntityId() {
        return entityId;
    }

    @JsonProperty("entity_id")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    @JsonProperty("entity_description")
    public String getEntityDescription() {
        return entityDescription;
    }

    @JsonProperty("entity_description")
    public void setEntityDescription(String entityDescription) {
        this.entityDescription = entityDescription;
    }

    @JsonProperty("tax_exempt_reason")
    public String getTaxExemptReason() {
        return taxExemptReason;
    }

    @JsonProperty("tax_exempt_reason")
    public void setTaxExemptReason(String taxExemptReason) {
        this.taxExemptReason = taxExemptReason;
    }

    @JsonProperty("discount_amount")
    public Integer getDiscountAmount() {
        return discountAmount;
    }

    @JsonProperty("discount_amount")
    public void setDiscountAmount(Integer discountAmount) {
        this.discountAmount = discountAmount;
    }

    @JsonProperty("item_level_discount_amount")
    public Integer getItemLevelDiscountAmount() {
        return itemLevelDiscountAmount;
    }

    @JsonProperty("item_level_discount_amount")
    public void setItemLevelDiscountAmount(Integer itemLevelDiscountAmount) {
        this.itemLevelDiscountAmount = itemLevelDiscountAmount;
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
