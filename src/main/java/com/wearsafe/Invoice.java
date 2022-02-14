
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
    "customer_id",
    "subscription_id",
    "recurring",
    "status",
    "price_type",
    "date",
    "due_date",
    "net_term_days",
    "exchange_rate",
    "total",
    "amount_paid",
    "amount_adjusted",
    "write_off_amount",
    "credits_applied",
    "amount_due",
    "paid_at",
    "updated_at",
    "resource_version",
    "deleted",
    "object",
    "first_invoice",
    "amount_to_collect",
    "round_off_amount",
    "new_sales_amount",
    "has_advance_charges",
    "currency_code",
    "base_currency_code",
    "generated_at",
    "is_gifted",
    "term_finalized",
    "channel",
    "tax",
    "line_items",
    "sub_total",
    "linked_payments",
    "applied_credits",
    "adjustment_credit_notes",
    "issued_credit_notes",
    "linked_orders",
    "dunning_attempts",
    "billing_address",
    "shipping_address",
    "notes"
})
@Generated("jsonschema2pojo")
public class Invoice {

    @JsonProperty("id")
    private String id;
    @JsonProperty("customer_id")
    private String customerId;
    @JsonProperty("subscription_id")
    private String subscriptionId;
    @JsonProperty("recurring")
    private Boolean recurring;
    @JsonProperty("status")
    private String status;
    @JsonProperty("price_type")
    private String priceType;
    @JsonProperty("date")
    private Integer date;
    @JsonProperty("due_date")
    private Integer dueDate;
    @JsonProperty("net_term_days")
    private Integer netTermDays;
    @JsonProperty("exchange_rate")
    private Double exchangeRate;
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("amount_paid")
    private Integer amountPaid;
    @JsonProperty("amount_adjusted")
    private Integer amountAdjusted;
    @JsonProperty("write_off_amount")
    private Integer writeOffAmount;
    @JsonProperty("credits_applied")
    private Integer creditsApplied;
    @JsonProperty("amount_due")
    private Integer amountDue;
    @JsonProperty("paid_at")
    private Integer paidAt;
    @JsonProperty("updated_at")
    private Integer updatedAt;
    @JsonProperty("resource_version")
    private Long resourceVersion;
    @JsonProperty("deleted")
    private Boolean deleted;
    @JsonProperty("object")
    private String object;
    @JsonProperty("first_invoice")
    private Boolean firstInvoice;
    @JsonProperty("amount_to_collect")
    private Integer amountToCollect;
    @JsonProperty("round_off_amount")
    private Integer roundOffAmount;
    @JsonProperty("new_sales_amount")
    private Integer newSalesAmount;
    @JsonProperty("has_advance_charges")
    private Boolean hasAdvanceCharges;
    @JsonProperty("currency_code")
    private String currencyCode;
    @JsonProperty("base_currency_code")
    private String baseCurrencyCode;
    @JsonProperty("generated_at")
    private Integer generatedAt;
    @JsonProperty("is_gifted")
    private Boolean isGifted;
    @JsonProperty("term_finalized")
    private Boolean termFinalized;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("tax")
    private Integer tax;
    @JsonProperty("line_items")
    private List<LineItem> lineItems = null;
    @JsonProperty("sub_total")
    private Integer subTotal;
    @JsonProperty("linked_payments")
    private List<LinkedPayment> linkedPayments = null;
    @JsonProperty("applied_credits")
    private List<Object> appliedCredits = null;
    @JsonProperty("adjustment_credit_notes")
    private List<Object> adjustmentCreditNotes = null;
    @JsonProperty("issued_credit_notes")
    private List<Object> issuedCreditNotes = null;
    @JsonProperty("linked_orders")
    private List<Object> linkedOrders = null;
    @JsonProperty("dunning_attempts")
    private List<Object> dunningAttempts = null;
    @JsonProperty("billing_address")
    private BillingAddress__1 billingAddress;
    @JsonProperty("shipping_address")
    private ShippingAddress__1 shippingAddress;
    @JsonProperty("notes")
    private List<Note> notes = null;
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

    @JsonProperty("customer_id")
    public String getCustomerId() {
        return customerId;
    }

    @JsonProperty("customer_id")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @JsonProperty("subscription_id")
    public String getSubscriptionId() {
        return subscriptionId;
    }

    @JsonProperty("subscription_id")
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    @JsonProperty("recurring")
    public Boolean getRecurring() {
        return recurring;
    }

    @JsonProperty("recurring")
    public void setRecurring(Boolean recurring) {
        this.recurring = recurring;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("price_type")
    public String getPriceType() {
        return priceType;
    }

    @JsonProperty("price_type")
    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    @JsonProperty("date")
    public Integer getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(Integer date) {
        this.date = date;
    }

    @JsonProperty("due_date")
    public Integer getDueDate() {
        return dueDate;
    }

    @JsonProperty("due_date")
    public void setDueDate(Integer dueDate) {
        this.dueDate = dueDate;
    }

    @JsonProperty("net_term_days")
    public Integer getNetTermDays() {
        return netTermDays;
    }

    @JsonProperty("net_term_days")
    public void setNetTermDays(Integer netTermDays) {
        this.netTermDays = netTermDays;
    }

    @JsonProperty("exchange_rate")
    public Double getExchangeRate() {
        return exchangeRate;
    }

    @JsonProperty("exchange_rate")
    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("amount_paid")
    public Integer getAmountPaid() {
        return amountPaid;
    }

    @JsonProperty("amount_paid")
    public void setAmountPaid(Integer amountPaid) {
        this.amountPaid = amountPaid;
    }

    @JsonProperty("amount_adjusted")
    public Integer getAmountAdjusted() {
        return amountAdjusted;
    }

    @JsonProperty("amount_adjusted")
    public void setAmountAdjusted(Integer amountAdjusted) {
        this.amountAdjusted = amountAdjusted;
    }

    @JsonProperty("write_off_amount")
    public Integer getWriteOffAmount() {
        return writeOffAmount;
    }

    @JsonProperty("write_off_amount")
    public void setWriteOffAmount(Integer writeOffAmount) {
        this.writeOffAmount = writeOffAmount;
    }

    @JsonProperty("credits_applied")
    public Integer getCreditsApplied() {
        return creditsApplied;
    }

    @JsonProperty("credits_applied")
    public void setCreditsApplied(Integer creditsApplied) {
        this.creditsApplied = creditsApplied;
    }

    @JsonProperty("amount_due")
    public Integer getAmountDue() {
        return amountDue;
    }

    @JsonProperty("amount_due")
    public void setAmountDue(Integer amountDue) {
        this.amountDue = amountDue;
    }

    @JsonProperty("paid_at")
    public Integer getPaidAt() {
        return paidAt;
    }

    @JsonProperty("paid_at")
    public void setPaidAt(Integer paidAt) {
        this.paidAt = paidAt;
    }

    @JsonProperty("updated_at")
    public Integer getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
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

    @JsonProperty("first_invoice")
    public Boolean getFirstInvoice() {
        return firstInvoice;
    }

    @JsonProperty("first_invoice")
    public void setFirstInvoice(Boolean firstInvoice) {
        this.firstInvoice = firstInvoice;
    }

    @JsonProperty("amount_to_collect")
    public Integer getAmountToCollect() {
        return amountToCollect;
    }

    @JsonProperty("amount_to_collect")
    public void setAmountToCollect(Integer amountToCollect) {
        this.amountToCollect = amountToCollect;
    }

    @JsonProperty("round_off_amount")
    public Integer getRoundOffAmount() {
        return roundOffAmount;
    }

    @JsonProperty("round_off_amount")
    public void setRoundOffAmount(Integer roundOffAmount) {
        this.roundOffAmount = roundOffAmount;
    }

    @JsonProperty("new_sales_amount")
    public Integer getNewSalesAmount() {
        return newSalesAmount;
    }

    @JsonProperty("new_sales_amount")
    public void setNewSalesAmount(Integer newSalesAmount) {
        this.newSalesAmount = newSalesAmount;
    }

    @JsonProperty("has_advance_charges")
    public Boolean getHasAdvanceCharges() {
        return hasAdvanceCharges;
    }

    @JsonProperty("has_advance_charges")
    public void setHasAdvanceCharges(Boolean hasAdvanceCharges) {
        this.hasAdvanceCharges = hasAdvanceCharges;
    }

    @JsonProperty("currency_code")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currency_code")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("base_currency_code")
    public String getBaseCurrencyCode() {
        return baseCurrencyCode;
    }

    @JsonProperty("base_currency_code")
    public void setBaseCurrencyCode(String baseCurrencyCode) {
        this.baseCurrencyCode = baseCurrencyCode;
    }

    @JsonProperty("generated_at")
    public Integer getGeneratedAt() {
        return generatedAt;
    }

    @JsonProperty("generated_at")
    public void setGeneratedAt(Integer generatedAt) {
        this.generatedAt = generatedAt;
    }

    @JsonProperty("is_gifted")
    public Boolean getIsGifted() {
        return isGifted;
    }

    @JsonProperty("is_gifted")
    public void setIsGifted(Boolean isGifted) {
        this.isGifted = isGifted;
    }

    @JsonProperty("term_finalized")
    public Boolean getTermFinalized() {
        return termFinalized;
    }

    @JsonProperty("term_finalized")
    public void setTermFinalized(Boolean termFinalized) {
        this.termFinalized = termFinalized;
    }

    @JsonProperty("channel")
    public String getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(String channel) {
        this.channel = channel;
    }

    @JsonProperty("tax")
    public Integer getTax() {
        return tax;
    }

    @JsonProperty("tax")
    public void setTax(Integer tax) {
        this.tax = tax;
    }

    @JsonProperty("line_items")
    public List<LineItem> getLineItems() {
        return lineItems;
    }

    @JsonProperty("line_items")
    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    @JsonProperty("sub_total")
    public Integer getSubTotal() {
        return subTotal;
    }

    @JsonProperty("sub_total")
    public void setSubTotal(Integer subTotal) {
        this.subTotal = subTotal;
    }

    @JsonProperty("linked_payments")
    public List<LinkedPayment> getLinkedPayments() {
        return linkedPayments;
    }

    @JsonProperty("linked_payments")
    public void setLinkedPayments(List<LinkedPayment> linkedPayments) {
        this.linkedPayments = linkedPayments;
    }

    @JsonProperty("applied_credits")
    public List<Object> getAppliedCredits() {
        return appliedCredits;
    }

    @JsonProperty("applied_credits")
    public void setAppliedCredits(List<Object> appliedCredits) {
        this.appliedCredits = appliedCredits;
    }

    @JsonProperty("adjustment_credit_notes")
    public List<Object> getAdjustmentCreditNotes() {
        return adjustmentCreditNotes;
    }

    @JsonProperty("adjustment_credit_notes")
    public void setAdjustmentCreditNotes(List<Object> adjustmentCreditNotes) {
        this.adjustmentCreditNotes = adjustmentCreditNotes;
    }

    @JsonProperty("issued_credit_notes")
    public List<Object> getIssuedCreditNotes() {
        return issuedCreditNotes;
    }

    @JsonProperty("issued_credit_notes")
    public void setIssuedCreditNotes(List<Object> issuedCreditNotes) {
        this.issuedCreditNotes = issuedCreditNotes;
    }

    @JsonProperty("linked_orders")
    public List<Object> getLinkedOrders() {
        return linkedOrders;
    }

    @JsonProperty("linked_orders")
    public void setLinkedOrders(List<Object> linkedOrders) {
        this.linkedOrders = linkedOrders;
    }

    @JsonProperty("dunning_attempts")
    public List<Object> getDunningAttempts() {
        return dunningAttempts;
    }

    @JsonProperty("dunning_attempts")
    public void setDunningAttempts(List<Object> dunningAttempts) {
        this.dunningAttempts = dunningAttempts;
    }

    @JsonProperty("billing_address")
    public BillingAddress__1 getBillingAddress() {
        return billingAddress;
    }

    @JsonProperty("billing_address")
    public void setBillingAddress(BillingAddress__1 billingAddress) {
        this.billingAddress = billingAddress;
    }

    @JsonProperty("shipping_address")
    public ShippingAddress__1 getShippingAddress() {
        return shippingAddress;
    }

    @JsonProperty("shipping_address")
    public void setShippingAddress(ShippingAddress__1 shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @JsonProperty("notes")
    public List<Note> getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(List<Note> notes) {
        this.notes = notes;
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
