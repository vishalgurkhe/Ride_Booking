package com.practice.security.utility;

import lombok.Data;
import lombok.Getter;


@Getter
public enum Permission {
    USER_READ("user:read"),
    USER_WRITE("user:write"),
    ADMIN_READ("admin:read");

    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }

}
