package com.fbc.framework.common.constants;

/**
 * @Description
 * @ClassName UserStatusConstants
 * @Author fangbc
 * @Date 2019/9/9 21:15
 * @Version 1.0
 */
public class UserStatusConstants {
    public static final int DISABLED = 0;
    public static final int VALID = 1;
    public static final int LOCKED = 2;
    /**
     * 加密次数
     */
    public static final int HASH_ITERATIONS = 3;

    public static final String LOGIN_USER = "login_user";

    public static final String USER_PERMISSIONS = "user_permissions";

    /**
     * 登陆token(nginx中默认header无视下划线)
     */
    public static final String LOGIN_TOKEN = "login-token";
}
