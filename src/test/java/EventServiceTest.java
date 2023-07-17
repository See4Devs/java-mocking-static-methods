import org.junit.jupiter.api.Test;
import org.mockingstaticmethods.DateUtils;
import org.mockingstaticmethods.EventService;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EventServiceTest {
    @Test
    public void testGetEventTime() {
        try (MockedStatic<DateUtils> mocked = Mockito.mockStatic(DateUtils.class)) {
            LocalDateTime mockedTime = LocalDateTime.of(2023, 7, 12, 12, 0);
            mocked.when(DateUtils::now).thenReturn(mockedTime);
            EventService eventService = new EventService();
            assertEquals(mockedTime, eventService.getEventTime());
        }
    }
}
