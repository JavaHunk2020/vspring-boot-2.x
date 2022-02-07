package com.wearsafe;

public class Customer {
	public String id;
	public String first_name;
	public String last_name;
	public String email;
	public String phone;
	public String company;
	public String auto_collection;
	public int net_term_days;
	public boolean allow_direct_debit;
	public int created_at;
	public String created_from_ip;
	public String taxability;
	public int updated_at;
	public String locale;
	public String pii_cleared;
	public String channel;
	public long resource_version;
	public boolean deleted;
	public String object;
	public BillingAddress billing_address;
	public String card_status;
	public int promotional_credits;
	public int refundable_credits;
	public int excess_payments;
	public int unbilled_charges;
	public String preferred_currency_code;
	public String primary_payment_source_id;
	public PaymentMethod payment_method;
	public String cf_base_url;
	public String cf_api_key;
	public String cf_customer_route;
	public int cf_person_id;
	public int cf_org_unit_id;
	

	public int getCf_org_unit_id() {
		return cf_org_unit_id;
	}

	public void setCf_org_unit_id(int cf_org_unit_id) {
		this.cf_org_unit_id = cf_org_unit_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAuto_collection() {
		return auto_collection;
	}

	public void setAuto_collection(String auto_collection) {
		this.auto_collection = auto_collection;
	}

	public int getNet_term_days() {
		return net_term_days;
	}

	public void setNet_term_days(int net_term_days) {
		this.net_term_days = net_term_days;
	}

	public boolean isAllow_direct_debit() {
		return allow_direct_debit;
	}

	public void setAllow_direct_debit(boolean allow_direct_debit) {
		this.allow_direct_debit = allow_direct_debit;
	}

	public int getCreated_at() {
		return created_at;
	}

	public void setCreated_at(int created_at) {
		this.created_at = created_at;
	}

	public String getCreated_from_ip() {
		return created_from_ip;
	}

	public void setCreated_from_ip(String created_from_ip) {
		this.created_from_ip = created_from_ip;
	}

	public String getTaxability() {
		return taxability;
	}

	public void setTaxability(String taxability) {
		this.taxability = taxability;
	}

	public int getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(int updated_at) {
		this.updated_at = updated_at;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getPii_cleared() {
		return pii_cleared;
	}

	public void setPii_cleared(String pii_cleared) {
		this.pii_cleared = pii_cleared;
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

	public BillingAddress getBilling_address() {
		return billing_address;
	}

	public void setBilling_address(BillingAddress billing_address) {
		this.billing_address = billing_address;
	}

	public String getCard_status() {
		return card_status;
	}

	public void setCard_status(String card_status) {
		this.card_status = card_status;
	}

	public int getPromotional_credits() {
		return promotional_credits;
	}

	public void setPromotional_credits(int promotional_credits) {
		this.promotional_credits = promotional_credits;
	}

	public int getRefundable_credits() {
		return refundable_credits;
	}

	public void setRefundable_credits(int refundable_credits) {
		this.refundable_credits = refundable_credits;
	}

	public int getExcess_payments() {
		return excess_payments;
	}

	public void setExcess_payments(int excess_payments) {
		this.excess_payments = excess_payments;
	}

	public int getUnbilled_charges() {
		return unbilled_charges;
	}

	public void setUnbilled_charges(int unbilled_charges) {
		this.unbilled_charges = unbilled_charges;
	}

	public String getPreferred_currency_code() {
		return preferred_currency_code;
	}

	public void setPreferred_currency_code(String preferred_currency_code) {
		this.preferred_currency_code = preferred_currency_code;
	}

	public String getPrimary_payment_source_id() {
		return primary_payment_source_id;
	}

	public void setPrimary_payment_source_id(String primary_payment_source_id) {
		this.primary_payment_source_id = primary_payment_source_id;
	}

	public PaymentMethod getPayment_method() {
		return payment_method;
	}

	public void setPayment_method(PaymentMethod payment_method) {
		this.payment_method = payment_method;
	}

	public String getCf_base_url() {
		return cf_base_url;
	}

	public void setCf_base_url(String cf_base_url) {
		this.cf_base_url = cf_base_url;
	}

	public String getCf_api_key() {
		return cf_api_key;
	}

	public void setCf_api_key(String cf_api_key) {
		this.cf_api_key = cf_api_key;
	}

	public String getCf_customer_route() {
		return cf_customer_route;
	}

	public void setCf_customer_route(String cf_customer_route) {
		this.cf_customer_route = cf_customer_route;
	}

	public int getCf_person_id() {
		return cf_person_id;
	}

	public void setCf_person_id(int cf_person_id) {
		this.cf_person_id = cf_person_id;
	}

}
