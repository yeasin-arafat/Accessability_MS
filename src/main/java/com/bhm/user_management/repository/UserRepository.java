package com.bhm.user_management.repository;

import com.bhm.user_management.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author : arafat
 * @version : 1.0.0-snapshot
 * @description ...
 * @project : bhm
 * @since : 7/18/17
 */
public interface UserRepository extends MongoRepository<User, String> , UserRepositoryCustom {

    User findByUserNameAndActive(String userName, boolean isActive);

    User findByUserName(String userName);

}
