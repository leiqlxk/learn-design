package com.lql.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: CustomerGroup <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/6 15:12 <br>
 */
public class CustomerGroup {

    private List<Customer> customers = new ArrayList<>();

    void accept(Visitor visitor) {
        for (Customer customer :customers) {
            customer.accept(visitor);
        }
    }

    void addCustomer(Customer customer) {
        customers.add(customer);
    }
}
