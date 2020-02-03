package com.blog.sang.manager.menu.mapper;

import java.util.List;

import com.blog.sang.manager.menu.domain.Menu;

public interface ManagerMenuMapper {
	public List<Menu> findAllMenuOrder();
}
