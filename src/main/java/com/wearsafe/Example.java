
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
    "occurred_at",
    "source",
    "object",
    "api_version",
    "content",
    "event_type",
    "webhook_status",
    "webhooks"
})
@Generated("jsonschema2pojo")
public class Example {

    @JsonProperty("id")
    private String id;
    @JsonProperty("occurred_at")
    private Integer occurredAt;
    @JsonProperty("source")
    private String source;
    @JsonProperty("object")
    private String object;
    @JsonProperty("api_version")
    private String apiVersion;
    @JsonProperty("content")
    private Content content;
    @JsonProperty("event_type")
    private String eventType;
    @JsonProperty("webhook_status")
    private String webhookStatus;
    @JsonProperty("webhooks")
    private List<Webhook> webhooks = null;
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

    @JsonProperty("occurred_at")
    public Integer getOccurredAt() {
        return occurredAt;
    }

    @JsonProperty("occurred_at")
    public void setOccurredAt(Integer occurredAt) {
        this.occurredAt = occurredAt;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("object")
    public String getObject() {
        return object;
    }

    @JsonProperty("object")
    public void setObject(String object) {
        this.object = object;
    }

    @JsonProperty("api_version")
    public String getApiVersion() {
        return apiVersion;
    }

    @JsonProperty("api_version")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    @JsonProperty("content")
    public Content getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(Content content) {
        this.content = content;
    }

    @JsonProperty("event_type")
    public String getEventType() {
        return eventType;
    }

    @JsonProperty("event_type")
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @JsonProperty("webhook_status")
    public String getWebhookStatus() {
        return webhookStatus;
    }

    @JsonProperty("webhook_status")
    public void setWebhookStatus(String webhookStatus) {
        this.webhookStatus = webhookStatus;
    }

    @JsonProperty("webhooks")
    public List<Webhook> getWebhooks() {
        return webhooks;
    }

    @JsonProperty("webhooks")
    public void setWebhooks(List<Webhook> webhooks) {
        this.webhooks = webhooks;
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
