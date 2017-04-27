package com.jcsanchez.collections;

import org.junit.jupiter.api.Test;

import static com.jcsanchez.collections.ProductFixtures.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jsssn on 25-Apr-17.
 */
class ProductCatalogueTest {

    @Test
    public void shouldOnlyHoldUniquProducts() throws Exception {
        ProductCatalogue catalogue = new ProductCatalogue();

        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

        assertThat(catalogue, containsInAnyOrder(door, floorPanel));
    }
}