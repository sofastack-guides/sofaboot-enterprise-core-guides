package com.alipay.sofa.service;


import com.alipay.sofa.facade.SampleService;

public class SampleServiceImpl implements SampleService {

    @Override
    public String message() {
        return "Hello, Service slitecore";
    }
}
