package com.wearsafe; 
import java.util.ArrayList;
public class Root{
    public String id;
    public int occurred_at;
    public String source;
    public String object;
    public String api_version;
    public Content content;
    public String event_type;
    public String webhook_status;
    public ArrayList<Webhook> webhooks;
}
