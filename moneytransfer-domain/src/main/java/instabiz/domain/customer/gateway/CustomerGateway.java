package instabiz.domain.customer.gateway;

import instabiz.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
