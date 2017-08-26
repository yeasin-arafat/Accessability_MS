package com.bhm.user_management.service;

import com.bhm.user_management.model.User;
import com.bhm.user_management.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author : arafat
 * @version : 1.0.0-snapshot
 * @description ...
 * @project : bhm
 * @since : 7/17/17
 */
@Service
public class UserService {

    private final Logger logger = LoggerFactory.getLogger(UserService.class);
    @Autowired
    private UserRepository userRepository;

    public boolean login(User user){

        logger.info("request "+user.toString());
        User loginUser = userRepository.findByUserNameAndPasswordAndIsActive(user.getUserName(),user.getPassword(), user.isActive());
        //System.out.println(loginUser.toString());
        if(loginUser == null){
            return false;
        }
        logger.info(loginUser.toString());
        return true;
    }
}
