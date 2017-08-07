package cc.chli.vc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cc.chli.vc.dao.AllianceMemberMapper;
import cc.chli.vc.dao.PermissionsGroupMapper;
import cc.chli.vc.dao.PermissionsMapper;
import cc.chli.vc.dao.UserMapper;
import cc.chli.vc.model.PermissionsGroup;
import cc.chli.vc.model.User;
import cc.chli.vc.model.UserExample;
import cc.chli.vc.service.IUserService;

import java.util.*;

/**
 * Created by peng on 2014/9/17.
 */
@Service
public class UserService implements IUserService {
	 @Autowired
	private PasswordHelper helper;
    @Autowired
    private UserMapper userDao;
    @Autowired
    private AllianceMemberMapper allianceMemberDao;
    @Autowired
    private PermissionsGroupMapper permissionsGroupDao;
    @Autowired
    private PermissionsMapper permissionsDao;
    @Override
    public Set<String> findPermissions(String username) {
/*        User user = findByUsername(username);
        AllianceMemberEntity am= allianceMemberDao.findByUserID(user.getId());
        PermissionsGroup pg = permissionsGroupDao.findById(am.getGroupId());
        String permissionsUnion= new StringBuilder().append(pg.getPermissionsGroup()).append(Constants.SEPARATOR).append(am.getPrivileges()).toString();
        String[] permissions = permissionsUnion.split(Constants.SEPARATOR);
        List<String> pList = Arrays.asList(permissions);
        return  pList.stream()
                .map(permission -> permissionsDao.findPermissionById(permission))
                .map(permission->permission.replace(Constants.PERMISSION_ALLIANCE, String.valueOf(am.getAllianceId())))
                .collect(Collectors.toSet());*/
    	return new HashSet<String>();
    }

    @Override
    public User createUser(User uf) {
        User user = new User();
        user.setLocked(0);
        user.setPassword(uf.getPassword());
        user.setUsername(uf.getUsername());
        helper.encryptPassword(user);
        userDao.insert(user);
        return  user;
    }

    @Override
    public User findByUsername(String username) {
    	UserExample e = new UserExample();
    	e.createCriteria().andUsernameEqualTo(username);
       List<User>  list = userDao.selectByExample(e);
       if(list.size()>0){
    	   return list.get(0);
       }else{
    	   return null;
       }
    }
}
