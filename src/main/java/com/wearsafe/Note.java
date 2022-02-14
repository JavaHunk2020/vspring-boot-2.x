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
    "note",
    "entity_type",
    "entity_id"
})
@Generated("jsonschema2pojo")
public class Note {

    @JsonProperty("note")
    private String note;
    @JsonProperty("entity_type")
    private String entityType;
    @JsonProperty("entity_id")
    private String entityId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("note")
    public String getNote() {
        return note;
    }

    @JsonProperty("note")
    public void setNote(String note) {
        this.note = note;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
