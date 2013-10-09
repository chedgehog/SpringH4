package cc.smh.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cc.smh.common.service.impl.BaseServiceImpl;
import cc.smh.service.UserService;
@Service("userService")
@Transactional
public class UserServiceImpl extends BaseServiceImpl implements UserService {

}
