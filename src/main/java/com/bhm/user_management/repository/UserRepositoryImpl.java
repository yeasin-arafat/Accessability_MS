package com.bhm.user_management.repository;

import com.bhm.user_management.model.User;
import com.mongodb.WriteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

/**
 * @author : arafat
 * @version : 1.0.0-snapshot
 * @description ...
 * @project : bhm
 * @since : 7/17/17
 */

@Repository
public class UserRepositoryImpl implements UserRepositoryCustom {

    @Autowired
    Query query;
    @Autowired
    Update update;
    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public boolean updatePassword(String userName, String password) {

         query.addCriteria(Criteria.where("userName").is(userName));
         update.set("password",password);

        WriteResult result = mongoTemplate.updateFirst(query, update, User.class);

        return false;
    }

    @Override
    public boolean updateActive(boolean isActive) {
        return false;
    }

    @Override
    public boolean createUser(User user) {
        return false;
    }
}
