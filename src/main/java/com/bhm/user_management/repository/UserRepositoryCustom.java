package com.bhm.user_management.repository;

import com.bhm.user_management.model.User;

/**
 * @author : arafat
 * @version : 1.0.0-snapshot
 * @description ...
 * @project : bhm
 * @since : 7/17/17
 */
public interface UserRepositoryCustom {

    boolean updatePassword(String userName, String password);

    boolean updateActive(boolean isActive);

    boolean createUser(User user);
}
