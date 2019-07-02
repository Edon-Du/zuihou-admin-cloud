package com.github.zuihou.authority.api.hystrix;

import com.github.zuihou.auth.utils.Token;
import com.github.zuihou.authority.api.AuthTokenApi;
import com.github.zuihou.authority.dto.auth.LoginDTO;
import com.github.zuihou.base.R;

import org.springframework.stereotype.Component;

/**
 * This is a Description
 *
 * @author tangyh
 * @date 2019/07/02
 */
@Component
public class AuthTokenApiHystrix implements AuthTokenApi {
    @Override
    public R<Token> token(String account, String password) {
        return R.timeout();
    }

    @Override
    public R<LoginDTO> login(String account, String password) {
        return R.timeout();
    }
}
