package models;

import java.util.ArrayList;
import java.util.List;

public class Message {
    private String id;

    private String content;

    private Integer timestamp;

    private String channel;

    private List<String> reactions;

    public Message(String id, String content, Integer timestamp, String channel) {
        this.id = id;
        this.content = content;
        this.timestamp = timestamp;
        this.channel = channel;
        this.reactions = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public List<String> getReactions() {
        return reactions;
    }

    public void setReactions(List<String> reactions) {
        this.reactions = reactions;
    }
}
