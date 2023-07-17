import org.junit.jupiter.api.Test;
import org.mockingstaticmethods.UserService;
import org.mockingstaticmethods.UserUtilsWrapper;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class UserServiceTest {
    @Test
    public void testProcessUser() {
        // Create a mock UserUtilsWrapper
        UserUtilsWrapper mockWrapper = Mockito.mock(UserUtilsWrapper.class);
        // Specify the behavior of the mock object
        when(mockWrapper.isValidEmail("test@example.com")).thenReturn(true);
        // Inject the mock object into UserService
        UserService userService = new UserService(mockWrapper);
        // Now we can test the processUser() method
        assertTrue(userService.processUser("test@example.com"));
    }
}
