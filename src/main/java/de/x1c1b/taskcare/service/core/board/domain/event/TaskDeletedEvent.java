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
public class TaskDeletedEvent extends DomainEvent {

    private final UUID boardId;
    private final UUID taskId;

    public TaskDeletedEvent(UUID boardId, UUID taskId, OffsetDateTime raisedAt) {
        super(String.format("board.%s.task-deleted", boardId), raisedAt);
        this.boardId = boardId;
        this.taskId = taskId;
    }
}
