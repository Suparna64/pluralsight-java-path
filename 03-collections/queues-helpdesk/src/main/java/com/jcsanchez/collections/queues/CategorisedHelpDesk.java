package com.jcsanchez.collections.queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Predicate;

import static com.jcsanchez.collections.queues.Category.PRINTER;

/**
 * Created by jsssn on 29-Apr-17.
 */
public class CategorisedHelpDesk {
    private Queue<Enquiry> enquiries = new ArrayDeque<>();

    public boolean enquire(final Customer customer, final Category type) {
        return enquiries.offer(new Enquiry(customer, type));
    }

    public void processPrinterEnquiry() {
        processEnquiry(
                enq -> enq.getCategory() == PRINTER,
                "Is it out of paper?");
    }

    public void processGeneralEnquiry() {
        processEnquiry(
                enq -> enq.getCategory() != PRINTER,
                "Have you tried turning it off and on again?");
    }

    private void processEnquiry(Predicate<Enquiry> predicate, String message) {
        final Enquiry enquiry = enquiries.peek();

        if (enquiry != null && predicate.test(enquiry)) {
            enquiries.remove();
            enquiry.getCustomer().reply(message);
        } else {
            System.out.println("No work to do, let's have some coffee!");
        }
    }

    public static void main(String[] args) {
        CategorisedHelpDesk helpDesk = new CategorisedHelpDesk();

        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, PRINTER);

        helpDesk.processPrinterEnquiry();
        helpDesk.processGeneralEnquiry();
        helpDesk.processPrinterEnquiry();
    }
}
