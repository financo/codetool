//------------------------------------------------------------------------------
// <auto-generated>
//     此代码由模板自动生成 - 2016-03-04 15:08:12
//     对此文件的更改可能会导致不正确的行为，并且如果 重新生成代码，这些更改将会丢失。
// </auto-generated>
//------------------------------------------------------------------------------
package com.bonc.quickframework.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bonc.quickframework.dao.IBaseDao;
import com.bonc.quickframework.dao.IGeneratorUiDao;
import com.bonc.quickframework.entity.GeneratorUi;
import com.bonc.quickframework.service.IGeneratorUiService;

import java.util.*;

/**
 * @author dguanlin email:dguanlin(a)163.com
 * @version 1.0
 * @since 1.0
 */
 
@Service(value = "generatorUiService")
public class GeneratorUiServiceImpl extends BaseServiceImpl<GeneratorUi,java.lang.Long> implements IGeneratorUiService {
	@Resource(name = "generatorUiDao")
	private IGeneratorUiDao generatorUiDao;

	@Override
	protected IBaseDao<GeneratorUi,java.lang.Long> getCurrentDao() {
		return generatorUiDao;
	}
}
