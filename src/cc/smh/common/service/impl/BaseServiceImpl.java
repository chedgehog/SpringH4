package cc.smh.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cc.smh.common.bean.BaseTO;
import cc.smh.common.dao.IBaseDao;
import cc.smh.common.exception.DaoException;
import cc.smh.common.service.BaseService;

@Service
@Transactional
public class BaseServiceImpl implements BaseService {
	@Autowired
	private IBaseDao baseDao;
	@Override
	public void delete(BaseTO oto) throws DaoException {
		// TODO Auto-generated method stub
		baseDao.delete(oto);
	}

	@Override
	public void edit(BaseTO oto) throws DaoException {
		// TODO Auto-generated method stub
		baseDao.edit(oto);
	}

	@Override
	public void editSave(BaseTO oto) throws DaoException {
		// TODO Auto-generated method stub
		baseDao.editSave(oto);
	}

	@Override
	public void editUpdate(BaseTO oto) throws DaoException {
		// TODO Auto-generated method stub
		baseDao.editUpdate(oto);
	}

	@Override
	public List<BaseTO> queryAll(String hql) throws DaoException {
		// TODO Auto-generated method stub
		return baseDao.queryAll(hql);
	}

	
}
