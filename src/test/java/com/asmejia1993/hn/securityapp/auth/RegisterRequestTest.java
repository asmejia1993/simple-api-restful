package com.asmejia1993.hn.securityapp.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.asmejia1993.hn.securityapp.dto.Phone;

public class RegisterRequestTest {

    @Test
    @DisplayName("Register model")
    void TestSetRegisterModel() {

        List<Phone> phones = Arrays.asList(new Phone("123", "Tegucigalpa", "504"), new Phone("456", "Atlanta", "001"));
        var registerDTO = new RegisterRequest("admin", "email@email.com", "super", phones);

        assertNotNull(registerDTO);
        assertEquals(registerDTO.phones(), phones);
    }
}
