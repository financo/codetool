//------------------------------------------------------------------------------
// <auto-generated>
//     此代码由模板自动生成 - 2016-01-14 10:01:24
//     对此文件的更改可能会导致不正确的行为，并且如果 重新生成代码，这些更改将会丢失。
// </auto-generated>
//------------------------------------------------------------------------------
package com.bonc.quickframework.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bonc.quickframework.dao.IBaseDao;
import com.bonc.quickframework.dao.IGeneratorProjectDao;
import com.bonc.quickframework.entity.GeneratorProject;
import com.bonc.quickframework.service.IGeneratorProjectService;

import java.util.*;

/**
 * @author dguanlin email:dguanlin(a)163.com
 * @version 1.0
 * @since 1.0
 */
 
@Service(value = "generatorProjectService")
public class GeneratorProjectServiceImpl extends BaseServiceImpl<GeneratorProject,java.lang.Long> implements IGeneratorProjectService {
	@Resource(name = "generatorProjectDao")
	private IGeneratorProjectDao generatorProjectDao;

	@Override
	protected IBaseDao<GeneratorProject,java.lang.Long> getCurrentDao() {
		return generatorProjectDao;
	}
}
