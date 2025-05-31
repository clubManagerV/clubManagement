package de.club.functions;

import de.club.dto.UserMapper;
import de.club.entity.User;

public  class ConvertToEntity {


    public User convertToUser(UserMapper userMapper) {
        User userEntity = new User();
        userEntity.setEmail(userMapper.getEmail());
        userEntity.setFirstName(userMapper.getFirstName());
        userEntity.setLastName(userMapper.getLastName());
        return userEntity;
    }
}
