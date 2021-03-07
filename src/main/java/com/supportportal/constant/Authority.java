package com.supportportal.constant;

public class Authority {
    public static final String[] INTERN_AUTHORITIES = { "user:read" };
    public static final String[] EMPLOYEE_AUTHORITIES = { "user:read", "user:update" };
    public static final String[] HR_AUTHORITIES = { "user:read", "user:update" };
    public static final String[] MANAGER_AUTHORITIES = { "user:read", "user:create", "user:update" };
    public static final String[] OWNER_AUTHORITIES = { "user:read", "user:create", "user:update", "user:delete" };
}
