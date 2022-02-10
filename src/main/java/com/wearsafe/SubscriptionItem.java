

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
    "item_price_id",
    "item_type",
    "quantity",
    "unit_price",
    "amount",
    "free_quantity",
    "billing_cycles",
    "object"
})
@Generated("jsonschema2pojo")
public class SubscriptionItem {

    @JsonProperty("item_price_id")
    private String itemPriceId;
    @JsonProperty("item_type")
    private String itemType;
    @JsonProperty("quantity")
    private Integer quantity;
    @JsonProperty("unit_price")
    private Integer unitPrice;
    @JsonProperty("amount")
    private Integer amount;
    @JsonProperty("free_quantity")
    private Integer freeQuantity;
    @JsonProperty("billing_cycles")
    private Integer billingCycles;
    @JsonProperty("object")
    private String object;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("item_price_id")
    public String getItemPriceId() {
        return itemPriceId;
    }

    @JsonProperty("item_price_id")
    public void setItemPriceId(String itemPriceId) {
        this.itemPriceId = itemPriceId;
    }

    @JsonProperty("item_type")
    public String getItemType() {
        return itemType;
    }

    @JsonProperty("item_type")
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("unit_price")
    public Integer getUnitPrice() {
        return unitPrice;
    }

    @JsonProperty("unit_price")
    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @JsonProperty("free_quantity")
    public Integer getFreeQuantity() {
        return freeQuantity;
    }

    @JsonProperty("free_quantity")
    public void setFreeQuantity(Integer freeQuantity) {
        this.freeQuantity = freeQuantity;
    }

    @JsonProperty("billing_cycles")
    public Integer getBillingCycles() {
        return billingCycles;
    }

    @JsonProperty("billing_cycles")
    public void setBillingCycles(Integer billingCycles) {
        this.billingCycles = billingCycles;
    }

    @JsonProperty("object")
    public String getObject() {
        return object;
    }

    @JsonProperty("object")
    public void setObject(String object) {
        this.object = object;
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
