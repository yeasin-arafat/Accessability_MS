package com.bhm.user_management.repository;

import com.bhm.user_management.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : arafat
 * @version : 1.0.0-snapshot
 * @description ...
 * @project : bhm
 * @since : 7/18/17
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> , UserRepositoryCustom {

    User findByUserNameAndPasswordAndIsActive(String userName, String password, boolean isActive);

    User findByUserNameAndActive(String userName, boolean isActive);

    User findByUserName(String userName);

    User findByLastLoginAttempt(String lastLoginTimestamp);

}
