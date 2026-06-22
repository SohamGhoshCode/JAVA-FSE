public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void showCustomerDetails(String id) {
        String details = customerRepository.findCustomerById(id);
        System.out.println("Service details query: " + details);
    }
}
