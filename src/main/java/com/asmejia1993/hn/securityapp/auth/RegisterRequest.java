package com.asmejia1993.hn.securityapp.auth;

import java.util.List;

import com.asmejia1993.hn.securityapp.dto.Phone;

public record RegisterRequest(String name, String email, String password, List<Phone> phones) {
}
