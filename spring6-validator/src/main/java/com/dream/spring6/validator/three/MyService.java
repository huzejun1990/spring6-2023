package com.dream.spring6.validator.three;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * @Author : huzejun
 * @Date: 2023/2/27-0:35
 */

@Service
@Validated
public class MyService {

    public String testMethod(@NotNull @Valid User user) {
        return user.toString();

    }

}
