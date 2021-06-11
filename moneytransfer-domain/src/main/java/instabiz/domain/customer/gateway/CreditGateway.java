package instabiz.domain.customer.gateway;

import instabiz.domain.customer.Customer;
import instabiz.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
