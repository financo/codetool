//------------------------------------------------------------------------------
// <auto-generated>
//     此代码由模板自动生成 - 2016-01-19 11:56:14
//     对此文件的更改可能会导致不正确的行为，并且如果 重新生成代码，这些更改将会丢失。
// </auto-generated>
//------------------------------------------------------------------------------
package com.bonc.quickframework.web.action.original;

import javax.annotation.Resource;
import com.bonc.quickframework.bean.GeneratorServiceBean;
import com.bonc.quickframework.entity.GeneratorService;
import com.bonc.quickframework.service.IGeneratorServiceService;

import java.util.*;

/**
 * @author dguanlin email:dguanlin(a)163.com
 * @version 1.0
 * @since 1.0
 */
 
public class AbstractGeneratorServiceAction extends BaseAction {
	
	GeneratorServiceBean bean=new GeneratorServiceBean();
	
	@Resource(name = "generatorServiceService")
	protected IGeneratorServiceService generatorServiceService;


	public GeneratorServiceBean getBean() {
		return bean;
	}

	public void setBean(GeneratorServiceBean bean) {
		this.bean = bean;
	}
	
	public String list() {
		List dataList = this.generatorServiceService.findList(this.getBean());
		this.getBean().setObjectList(dataList);
		return "list";
	}
	public String add() {
		return "add";
	}
	public String addDo() {
		this.generatorServiceService.saveOrUpdate(this.getBean().getGeneratorService());
		return SUCCESS;
	}
	public String edit() {
		GeneratorService generatorService=this.generatorServiceService.findById(this.getBean().getGeneratorService().getId());
		this.getBean().setGeneratorService(generatorService);
		return "edit";
	}
	public String editDo() {
		this.generatorServiceService.saveOrUpdate(this.getBean().getGeneratorService());
		return SUCCESS;
	}
	public String delete() {
		this.generatorServiceService.delete(this.getBean().getGeneratorService().getId());
		return SUCCESS;
	}
}
