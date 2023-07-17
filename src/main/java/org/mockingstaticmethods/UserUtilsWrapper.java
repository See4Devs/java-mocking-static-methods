package org.mockingstaticmethods;

public class UserUtilsWrapper {
    public boolean isValidEmail(String email) {
        return UserUtils.isValidEmail(email);
    }
}
