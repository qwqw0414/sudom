package com.joje.sudom.service;

import com.joje.sudom.model.dto.auth.SignonDto;
import com.joje.sudom.model.dto.auth.SignupDto;
import com.joje.sudom.model.dto.auth.TokenDto;
import com.joje.sudom.model.dto.auth.UserDto;

import javax.transaction.Transactional;

public interface AuthService {
    boolean idDuplicateCheck(String userId);

    @Transactional
    UserDto signup(SignupDto param);

    UserDto getUser(String userId);

    TokenDto signin(SignonDto param);

    @Transactional
    void signout(TokenDto param);

    @Transactional
    TokenDto relayToken(TokenDto param);
}
