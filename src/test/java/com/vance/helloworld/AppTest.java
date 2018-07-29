package com.vance.helloworld;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AppTest {

    private OutputStream out = new ByteArrayOutputStream();

    @Before
    public void before() {
        System.setOut(new PrintStream(out));
    }

    @Test
    public void printApp() {
        App app = new App();
        app.printApp();
        String outStr = out.toString();
//        Assert.assertEquals("APP......".equals(out.toString()), true);
        Assert.assertThat(out.toString(), is("APP......"));
    }
}