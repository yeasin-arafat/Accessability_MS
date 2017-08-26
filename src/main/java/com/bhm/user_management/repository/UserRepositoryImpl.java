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
 * @version : 1.0v.0-snapshot
 * @description ...
 * @project : bhm
 * @since : 7/17/17
 */

@Repository
public class UserRepositoryImpl implements UserRepositoryCustom {

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public boolean updatePassword(String userName, String password) {

        Query query = new Query(Criteria.where("userName").is(userName));
        Update update = new Update();
        update.set("password", password);

        WriteResult result = mongoTemplate.updateFirst(query, update, User.class);

        if(result != null){
            return true;
        }else{

            return false;
        }

    }

    @Override
    public boolean updateActive(String userName, boolean isActive) {

        return false;
    }

    @Override
    public boolean createUser(User user) {
        return false;
    }
}
