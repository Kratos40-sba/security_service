package com.loanlander.security_service.user.ripository;

import com.loanlander.security_service.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRipository extends JpaRepository<User , String> {
}
