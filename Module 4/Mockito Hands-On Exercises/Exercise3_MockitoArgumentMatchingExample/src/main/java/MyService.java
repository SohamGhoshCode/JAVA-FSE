public class MyService {

    private ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchDataById(int id) {
        return externalApi.getDataById(id);
    }
}
