package core;

import models.Message;

import java.util.List;

public interface Discord {
    void sendMessage(Message message);

    boolean contains(Message message);

    int size();

    Message getMessage(String messageId);

    void deleteMessage(String messageId);

    void reactToMessage(String messageId, String reaction);

    Iterable<Message> getChannelMessages(String channel);

    Iterable<Message> getMessagesByReactions(List<String> reactions);

    Iterable<Message> getMessageInTimeRange(Integer lowerBound, Integer upperBound);

    Iterable<Message> getTop3MostReactedMessages();

    Iterable<Message> getAllMessagesOrderedByCountOfReactionsThenByTimestampThenByLengthOfContent();
}
