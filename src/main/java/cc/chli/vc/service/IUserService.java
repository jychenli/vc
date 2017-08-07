package cc.chli.vc.service;


import java.util.Set;

import cc.chli.vc.model.User;
import cc.chli.vc.model.UserExample;

/**
 * Created by peng on 2014/9/17.
 */
public interface IUserService {
    public User findByUsername(String username);
    public Set<String> findPermissions(String username );
    public User createUser(User example);
}