//------------------------------------------------------------------------------
// <auto-generated>
//     此代码由模板自动生成 - 2016-03-25 15:47:31
//     对此文件的更改可能会导致不正确的行为，并且如果 重新生成代码，这些更改将会丢失。
// </auto-generated>
//------------------------------------------------------------------------------
package com.bonc.quickframework.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bonc.quickframework.dao.IBaseDao;
import com.bonc.quickframework.dao.IGenControllerDao;
import com.bonc.quickframework.entity.GenController;
import com.bonc.quickframework.service.IGenControllerService;

import java.util.*;

/**
 * @author dguanlin email:dguanlin(a)163.com
 * @version 1.0
 * @since 1.0
 */
 
@Service(value = "genControllerService")
public class GenControllerServiceImpl extends BaseServiceImpl<GenController,java.lang.Long> implements IGenControllerService {
	@Resource(name = "genControllerDao")
	private IGenControllerDao genControllerDao;

	@Override
	protected IBaseDao<GenController,java.lang.Long> getCurrentDao() {
		return genControllerDao;
	}
}
