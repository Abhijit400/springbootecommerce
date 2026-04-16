package com.demo.service;

import com.demo.customexception.UserNotActiveException;
import com.demo.dto.UserDTO;
import com.demo.entity.Role;
import com.demo.entity.User;
import com.demo.request.PasswordRequest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

public interface UserService {

    User userConvertDtoToEntity(UserDTO userDTO);

    UserDTO userConvertEntityTODto(User user);

    boolean checkPasswordAndConfirmPassword(String password , String confirmPassword);

    String getUserName(String username);

    String getPassword(String username);

    Set<Role> getRoles(String username);

    void forgetPasswordSendMail(String email) throws UserNotActiveException;

    @Transactional
    String updatePassword(String token, PasswordRequest passwordRequest);
}
