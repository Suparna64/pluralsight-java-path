package com.jcsanchez.collections.queues;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by jsssn on 29-Apr-17.
 */
public class HelpDesk {
    private final Queue<Enquiry> enquiries = new ArrayDeque<>();

    public void enquire(final Customer customer, Category category) {
        enquiries.offer(new Enquiry(customer, category));
    }

    public void processAllEnquiries(){
        Enquiry enquiry;

        while ((enquiry = enquiries.poll()) != null) {
            enquiry.getCustomer().reply("Have you tried turning it off and on again?");
        }
    }

    public static void main(String[] args) {
        HelpDesk helpDesk = new HelpDesk();

        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, Category.PRINTER);

        helpDesk.processAllEnquiries();
    }
}
