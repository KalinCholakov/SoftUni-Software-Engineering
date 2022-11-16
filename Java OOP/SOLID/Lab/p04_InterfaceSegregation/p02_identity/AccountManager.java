package solidLab.p04_InterfaceSegregation.p02_identity;

import solidLab.p04_InterfaceSegregation.p02_identity.interfaces.Account;
import solidLab.p04_InterfaceSegregation.p02_identity.interfaces.User;

public class AccountManager implements Account {


    @Override
    public void register(String username, String password) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void login(String username, String password) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void changePassword(String oldPass, String newPass) {
        //change password
    }

    @Override
    public Iterable<User> getAllUsersOnline() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterable<User> getAllUsers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public User getUserByName(String name) {
        throw new UnsupportedOperationException();
    }
}
