package com.orhanobut.simplelistview;

import android.content.Context;
import android.test.InstrumentationTestCase;

import junit.framework.Assert;

/**
 * @author Orhan Obut
 */
public class SimpleListViewTest extends InstrumentationTestCase {

    Context context;
    SimpleListView simpleListView;

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        context = getInstrumentation().getContext();
        simpleListView = new SimpleListView(context);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        context = null;
        simpleListView = null;
    }


    public void testSetDividerViewShouldAcceptValidResourceId() throws Exception {
        try {
            simpleListView.setDividerView(-5);
            fail();
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }

    public void testSetHeaderViewValidResourceId() throws Exception {
        try {
            simpleListView.setHeaderView(-5);
            fail();
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }


    public void testSetFooterViewValidResourceId() throws Exception {
        try {
            simpleListView.setFooterView(-5);
            fail();
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }

    public void testSetAdapterShouldNotBeNull() throws Exception {
        try {
            simpleListView.setAdapter(null);
            fail();
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }
}
