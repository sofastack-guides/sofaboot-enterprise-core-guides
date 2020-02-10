package com.alipay.sofa.test.usercases;

import com.alipay.sofa.facade.SampleService;
import com.alipay.sofa.test.base.AbstractTestBase;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * BeanTest
 * <p>
 * Created by yangguanchao on 16/12/9.
 */
public class BeanTest extends AbstractTestBase {

    @Autowired
    private SampleService sampleService;

    @Test
    public void testRpcSimple(){
        String result = sampleService.message();
        Assert.assertEquals("Hello, Service slitecore", result);
        Assert.assertTrue(result != null && result.length() > 0);
    }

    @Override
    protected void childSetUp() {

    }
}
