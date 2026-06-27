public class MyService {

    private ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public void performActions() {
        externalApi.firstCall();
        externalApi.secondCall();
    }
}
