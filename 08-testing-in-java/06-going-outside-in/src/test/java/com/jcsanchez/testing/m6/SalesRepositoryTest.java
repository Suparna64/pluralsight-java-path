package com.jcsanchez.testing.m6;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Created by jsssn on 14-May-17.
 */
public class SalesRepositoryTest {

    @Test
    public void shouldLoadSampleData() {
        SalesRepository repository = new SalesRepository("src/main/resources/example-sales.csv");

        List<Sale> sales = repository.loadSales();

        assertThat(sales, hasItem(allOf(
                hasProperty("store", equalTo("London")),
                hasProperty("number", equalTo(2)),
                hasProperty("pricePerItem", equalTo(30))
        )));
    }

}
