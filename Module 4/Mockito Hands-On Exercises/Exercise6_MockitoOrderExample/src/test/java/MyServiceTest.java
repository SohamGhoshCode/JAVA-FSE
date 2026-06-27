import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testInteractionOrder() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        service.performActions();
        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).firstCall();
        inOrder.verify(mockApi).secondCall();
    }
}
