package org.mockingstaticmethods;

public class UserService {
    private UserUtilsWrapper userUtilsWrapper;

    public UserService(UserUtilsWrapper userUtilsWrapper) {
        this.userUtilsWrapper = userUtilsWrapper;
    }

    public boolean processUser(String email) {
        if (userUtilsWrapper.isValidEmail(email)) {
            // Process the user here
            return true;
        }
        return false;
    }
}
