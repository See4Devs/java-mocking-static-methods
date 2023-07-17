package org.mockingstaticmethods;
import java.time.LocalDateTime;

public class EventService {
    public LocalDateTime getEventTime() {
        return DateUtils.now();
    }
}
