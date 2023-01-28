package core;

import models.Message;

import java.util.*;
import java.util.stream.Collectors;

public class DiscordImpl implements Discord {
    private final Map<String, Message> messageMap;

    private final Map<String, Set<Message>> messagesByChannel;

    public DiscordImpl() {
        this.messageMap = new LinkedHashMap<>();
        this.messagesByChannel = new HashMap<>();
    }

    @Override
    public void sendMessage(Message message) {
        this.messageMap.put(message.getId(), message);

        if (!this.messagesByChannel.containsKey(message.getChannel())) {
            this.messagesByChannel.put(message.getChannel(), new LinkedHashSet<>());
        }

        this.messagesByChannel.get(message.getChannel()).add(message);
    }

    @Override
    public boolean contains(Message message) {
        return this.messageMap.containsKey(message.getId());
    }

    @Override
    public int size() {
        return this.messageMap.size();
    }

    @Override
    public Message getMessage(String messageId) {
        Message result = this.messageMap.get(messageId);

        if (result == null) {
            throw new IllegalArgumentException();
        }

        return result;
    }

    @Override
    public void deleteMessage(String messageId) {
        Message toRemove = this.messageMap.remove(messageId);

        if (toRemove == null) {
            throw new IllegalArgumentException();
        }

        this.messagesByChannel.get(toRemove.getChannel()).remove(toRemove);
    }

    @Override
    public void reactToMessage(String messageId, String reaction) {
        Message toReact = this.getMessage(messageId);

        toReact.getReactions().add(reaction);
    }

    @Override
    public Iterable<Message> getChannelMessages(String channel) {
        /*List<Message> result = this.messageMap
                .values()
                .stream()
                .filter(m -> m.getChannel().equals(channel))
                .collect(Collectors.toList());
        */

        Set<Message> allMessages = this.messagesByChannel.get(channel);

        if (allMessages == null) {
            throw new IllegalArgumentException();
        }

        return allMessages;
    }

    @Override
    public Iterable<Message> getMessagesByReactions(List<String> reactions) {
        return this.messageMap.values()
                .stream()
                .filter(m -> new HashSet<>(m.getReactions()).containsAll(reactions))
                .sorted((f, s) -> {
                    if (f.getReactions().size() != s.getReactions().size()) {
                        return s.getReactions().size() - f.getReactions().size();
                    }

                    return f.getTimestamp() - s.getTimestamp();
                })
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<Message> getMessageInTimeRange(Integer lowerBound, Integer upperBound) {
        return this.messageMap.values()
                .stream()
                .filter(m -> m.getTimestamp() >= lowerBound && m.getTimestamp() <= upperBound)
                .sorted((f, s) -> this.messagesByChannel.get(s.getChannel()).size() - this.messagesByChannel.get(f.getChannel()).size())
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<Message> getTop3MostReactedMessages() {
        return this.messageMap.values()
                .stream()
                .sorted((f, s) -> s.getReactions().size() - f.getReactions().size())
                .limit(3)
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<Message> getAllMessagesOrderedByCountOfReactionsThenByTimestampThenByLengthOfContent() {
        return this.messageMap.values()
                .stream()
                .sorted((l, r) -> {
                    int lReactionsSize = l.getReactions().size();
                    int rReactionsSize = r.getReactions().size();

                    if (lReactionsSize != rReactionsSize) {
                        return rReactionsSize - lReactionsSize;
                    }

                    if (l.getTimestamp() != r.getTimestamp()) {
                        return l.getTimestamp() - r.getTimestamp();
                    }

                    return l.getContent().length() - r.getContent().length();
                })
                .collect(Collectors.toList());
    }
}
