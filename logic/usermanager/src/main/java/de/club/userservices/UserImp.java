package de.club.userservices;

import de.club.dto.UserMapper;
import de.club.functions.ConvertToEntity;
import de.club.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class UserImp  {

    private final UserRepository userRepository;

    ConvertToEntity convertToEntity;

    @Autowired
    public UserImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void createUser(UserMapper userMapper) {
        userRepository.save(convertToEntity.convertToUser(userMapper));
    }
}
