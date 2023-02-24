package com.dream.spring6.di;

import org.springframework.core.io.Resource;

/**
 * @Author : huzejun
 * @Date: 2023/2/24-22:28
 */
public class ResourceBean {

    private Resource resource;

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public void parse() {
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());

    }
}
