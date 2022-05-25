package com.greatstep.crud331.dao;

import com.greatstep.crud331.models.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> listUsers();

    void removeUserById(long id);

    User showUserById(int id);

    void update(long id, User updateUser);
}
