package com.userservice.b.service;

import com.userservice.b.dto.ResponseDto;
import com.userservice.b.entity.User;
import lombok.Data;
import lombok.Setter;


public interface UserService {
User saveUser(User user);

ResponseDto getUser(Long userId);
}
