package de.x1c1b.taskcare.service.core.board.domain.event;

import de.x1c1b.taskcare.service.core.common.application.event.DomainEvent;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class MemberCreatedEvent extends DomainEvent {

    private final UUID boardId;
    private final String username;

    public MemberCreatedEvent(UUID boardId, String username, OffsetDateTime raisedAt) {
        super(String.format("board.%s.member-created", boardId), raisedAt);
        this.boardId = boardId;
        this.username = username;
    }
}
