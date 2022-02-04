package com.wearsafe; 
import java.util.ArrayList;
import java.util.List; 
public class Subscription{
    public String id;
    public int billing_period;
    public String billing_period_unit;
    public String customer_id;
    public String status;
    public int current_term_start;
    public int current_term_end;
    public int next_billing_at;
    public int created_at;
    public int started_at;
    public int activated_at;
    public String created_from_ip;
    public int updated_at;
    public boolean has_scheduled_changes;
    public String channel;
    public long resource_version;
    public boolean deleted;
    public String object;
    public String currency_code;
    public ArrayList<SubscriptionItem> subscription_items;
    public ShippingAddress shipping_address;
    public int due_invoices_count;
    public int mrr;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getBilling_period() {
		return billing_period;
	}
	public void setBilling_period(int billing_period) {
		this.billing_period = billing_period;
	}
	public String getBilling_period_unit() {
		return billing_period_unit;
	}
	public void setBilling_period_unit(String billing_period_unit) {
		this.billing_period_unit = billing_period_unit;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCurrent_term_start() {
		return current_term_start;
	}
	public void setCurrent_term_start(int current_term_start) {
		this.current_term_start = current_term_start;
	}
	public int getCurrent_term_end() {
		return current_term_end;
	}
	public void setCurrent_term_end(int current_term_end) {
		this.current_term_end = current_term_end;
	}
	public int getNext_billing_at() {
		return next_billing_at;
	}
	public void setNext_billing_at(int next_billing_at) {
		this.next_billing_at = next_billing_at;
	}
	public int getCreated_at() {
		return created_at;
	}
	public void setCreated_at(int created_at) {
		this.created_at = created_at;
	}
	public int getStarted_at() {
		return started_at;
	}
	public void setStarted_at(int started_at) {
		this.started_at = started_at;
	}
	public int getActivated_at() {
		return activated_at;
	}
	public void setActivated_at(int activated_at) {
		this.activated_at = activated_at;
	}
	public String getCreated_from_ip() {
		return created_from_ip;
	}
	public void setCreated_from_ip(String created_from_ip) {
		this.created_from_ip = created_from_ip;
	}
	public int getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(int updated_at) {
		this.updated_at = updated_at;
	}
	public boolean isHas_scheduled_changes() {
		return has_scheduled_changes;
	}
	public void setHas_scheduled_changes(boolean has_scheduled_changes) {
		this.has_scheduled_changes = has_scheduled_changes;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public long getResource_version() {
		return resource_version;
	}
	public void setResource_version(long resource_version) {
		this.resource_version = resource_version;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	public String getCurrency_code() {
		return currency_code;
	}
	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}
	public ArrayList<SubscriptionItem> getSubscription_items() {
		return subscription_items;
	}
	public void setSubscription_items(ArrayList<SubscriptionItem> subscription_items) {
		this.subscription_items = subscription_items;
	}
	public ShippingAddress getShipping_address() {
		return shipping_address;
	}
	public void setShipping_address(ShippingAddress shipping_address) {
		this.shipping_address = shipping_address;
	}
	public int getDue_invoices_count() {
		return due_invoices_count;
	}
	public void setDue_invoices_count(int due_invoices_count) {
		this.due_invoices_count = due_invoices_count;
	}
	public int getMrr() {
		return mrr;
	}
	public void setMrr(int mrr) {
		this.mrr = mrr;
	}
    
    
}
