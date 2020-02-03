package com.blog.sang.manager.menu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.sang.manager.menu.domain.Menu;
import com.blog.sang.manager.menu.mapper.ManagerMenuMapper;

@Service
public class ManagerMenuServiceImpl implements ManagerMenuService {
	
	@Autowired
	ManagerMenuMapper ManagerMenuMapper;

	@Override
	public List<Menu> findAllMenuOrder() {
		return ManagerMenuMapper.findAllMenuOrder();
	}

}
