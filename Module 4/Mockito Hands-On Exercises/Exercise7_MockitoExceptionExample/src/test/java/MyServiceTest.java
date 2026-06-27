import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVoidMethodThrowsException() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        doThrow(new RuntimeException("Error")).when(mockApi).sendData(anyString());
        MyService service = new MyService(mockApi);
        assertThrows(RuntimeException.class, () -> service.pushData("Test Data"));
        verify(mockApi).sendData("Test Data");
    }
}
