
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
    "object",
    "type",
    "reference_id",
    "gateway",
    "gateway_account_id",
    "status"
})
@Generated("jsonschema2pojo")
public class PaymentMethod {

    @JsonProperty("object")
    private String object;
    @JsonProperty("type")
    private String type;
    @JsonProperty("reference_id")
    private String referenceId;
    @JsonProperty("gateway")
    private String gateway;
    @JsonProperty("gateway_account_id")
    private String gatewayAccountId;
    @JsonProperty("status")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("object")
    public String getObject() {
        return object;
    }

    @JsonProperty("object")
    public void setObject(String object) {
        this.object = object;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("reference_id")
    public String getReferenceId() {
        return referenceId;
    }

    @JsonProperty("reference_id")
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
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

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
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
