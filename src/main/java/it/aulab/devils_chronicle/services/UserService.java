package it.aulab.devils_chronicle.services;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import it.aulab.devils_chronicle.dtos.UserDto;
import it.aulab.devils_chronicle.models.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface UserService {

    void saveUser(UserDto userDto, RedirectAttributes redirectAttributes, HttpServletRequest request,
            HttpServletResponse response);

    User findUserByEmail(String email);

    User find(Long id);

}
