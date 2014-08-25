package org.github.ruyifeng;


import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LinkedListTest {
    @Test
    public void itShouldInstantiate() {
        LinkedList list = new LinkedList();

        assertNotNull(list);
    }

    @Before
    public void beforeEachMethod() {

    }

    @After
    public void afterEachMethod() {

    }

    @BeforeClass
    public static void beforeMethodsOnce() {

    }

    @AfterClass
    public static void afterMethodsOnce() {

    }
}



