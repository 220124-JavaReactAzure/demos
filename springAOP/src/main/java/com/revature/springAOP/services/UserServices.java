package com.revature.springAOP.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.revature.springAOP.daos.LoginDAO;
import com.revature.springAOP.exceptions.AuthenticationException;
import com.revature.springAOP.exceptions.InvalidRequestException;
import com.revature.springAOP.exceptions.ResourcePersistenceException;
import com.revature.springAOP.models.User;
import com.revature.springAOP.web.dtos.LoginResponse;
import com.revature.springAOP.web.dtos.SignUp;

@Service
public class UserServices {
	
	public LoginResponse login(String username, String password) {

        if (username == null || username.equals("") || password == null || password.equals("")) {
            throw new InvalidRequestException("Illegal login credentials provided!"); 
        }

        String uuid = UUID.randomUUID().toString();
        return new LoginResponse(username, "Bearer" + uuid);

    }
    
    private final LoginDAO loginDAO ;

    public UserServices(LoginDAO loginDAO) {
        this.loginDAO = loginDAO;
    }

    public boolean registerNewUser(SignUp signUp) throws ResourcePersistenceException {

        User newUser = new User();
        newUser.setName(signUp.getName());
        newUser.setEmail(signUp.getEmail());
        newUser.setUsername(signUp.getUsername());
        newUser.setPassword(signUp.getPassword());

        if (!isUserValid(newUser)) {
            throw new InvalidRequestException("Invalid user data provided!");
        }

        boolean usernameAvailable = loginDAO.findByUsername(newUser.getUsername()) == null;
        boolean emailAvailable = loginDAO.findByEmail(newUser.getEmail()) == null;

        if (!usernameAvailable || !emailAvailable) {
            String msg = "The values provided for the following fields are already taken by other users:";
            if (!usernameAvailable) msg = msg + "\n\t- username";
            if (!emailAvailable) msg = msg + "\n\t- email";
            throw new ResourcePersistenceException(msg);
        }

        boolean registeredUser = loginDAO.create(newUser);

        if (!registeredUser) {
            throw new ResourcePersistenceException("The user could not be persisted to the datasource!");
        }


        return true;

    }

    public User authenticateUser(String username, String password) {

        if (username == null || username.trim().equals("") || password == null || password.trim().equals("")) {
            throw new InvalidRequestException("Invalid credential values provided!");
        }

        User authenticatedUser = loginDAO.findByUsernameAndPassword(username, password);

        if (authenticatedUser == null) {
            throw new AuthenticationException("Unauthorized");
        }

        return authenticatedUser;

    }

    public boolean isUserValid(User user) {
        if (user == null) return false;
        if (user.getName() == null || user.getName().trim().equals("")) return false;
        if (user.getEmail() == null || user.getEmail().trim().equals("")) return false;
        if (user.getUsername() == null || user.getUsername().trim().equals("")) return false;
        return user.getPassword() != null && !user.getPassword().trim().equals("");
    }
}
