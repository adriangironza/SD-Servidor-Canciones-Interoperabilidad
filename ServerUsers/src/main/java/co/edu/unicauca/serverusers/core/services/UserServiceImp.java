package co.edu.unicauca.serverusers.core.services;

import co.edu.unicauca.serverusers.core.models.TokenDTO;
import co.edu.unicauca.serverusers.core.models.UserDTO;
import co.edu.unicauca.serverusers.core.repositories.TokenRepository;
import co.edu.unicauca.serverusers.core.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author adrianfGP
 */
@Service
public class UserServiceImp implements IUserService{
    
    @Autowired
    private TokenRepository tokenRepository;
    
    @Autowired
    private UserRepository userRepository;
    

    @Override
    public boolean userIsRegistred(String username) {
       return this.userRepository.userIsRegistred(username);
    }

    @Override
    public boolean validateCredentials(String username, String password) {
       return this.userRepository.validateCredentials(username, password);
    }

    @Override
    public boolean registerUser(UserDTO user) {
       return this.userRepository.registerUser(user);
    }

    @Override
    public TokenDTO generateToken() {
        return this.tokenRepository.generateToken();
    }

    @Override
    public boolean validateToken(TokenDTO token) {
        return this.tokenRepository.validateToken(token);
    }

}