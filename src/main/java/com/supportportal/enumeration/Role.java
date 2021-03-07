package com.supportportal.enumeration;

import static com.supportportal.constant.Authority.*;

public enum Role {
    ROLE_INTERN(INTERN_AUTHORITIES),
    ROLE_EMPLOYEE(EMPLOYEE_AUTHORITIES),
    ROLE_HR(HR_AUTHORITIES),
    ROLE_MANAGER(MANAGER_AUTHORITIES),
    ROLE_OWNER(OWNER_AUTHORITIES);

    private String[] authorities;

    Role(String... authorities) {
        this.authorities = authorities;
    }

    public String[] getAuthorities() {
        return authorities;
    }
}
