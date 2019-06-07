package com.atguigu.crud.service;

import com.atguigu.crud.bean.Employee;
import com.atguigu.crud.bean.EmployeeExample;
import com.atguigu.crud.bean.EmployeeExample.Criteria;
import com.atguigu.crud.bean.Xinzi;
import com.atguigu.crud.bean.Zpb;

import com.atguigu.crud.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {
	@Autowired
	private EmployeeMapper employeeMapper;
	
	/**
	 * ��ѯ����Ա��
	 * @return
	 */
	public List<Employee> getAll() {

		return employeeMapper.selectByExampleWithDept(null);
	}
	/**
	 * Ա������
	 * @param employee
	 */
	public void saveEmp(Employee employee) {
		employeeMapper.insertSelective(employee);	
		
	}
	/**
	 * �����û����Ƿ����
	 * 
	 * @param empName
	 * @return  true������ǰ�������� false����������
	 */
	public boolean checkUser(String empName) {
		EmployeeExample example= new EmployeeExample();
		Criteria criteria = example.createCriteria();
		criteria.andEmpNameEqualTo(empName);
		long count = employeeMapper.countByExample(example);
		return count == 0;
	}

	/**
	 * ����Ա��id��ѯԱ��
	 * @param id
	 * @return
	 */

	public Employee getEmp(Integer id) {

		Employee employee = employeeMapper.selectByPrimaryKey(id);
		return employee;

	}

	/**
	 * Ա������
	 * @param employee
	 */
    public void updateEmp(Employee employee) {
		employeeMapper.updateByPrimaryKeySelective(employee);
    }

	public void deleteEmp(Integer id) {
		employeeMapper.deleteByPrimaryKey(id);
	}

	public void deleteBatch(List<Integer> ids) {
    	EmployeeExample example = new EmployeeExample();
    	Criteria criteria = example.createCriteria();
		criteria.andEmpIdIn(ids);
		employeeMapper.deleteByExample(example);
	}

    public List<Zpb> getzpAll() {
		return employeeMapper.selectByExampleWithDeptzp(null);
    }

	public void deleteempzp(Integer id) {
		employeeMapper.deleteEmpZp(id);
	}

	public void updatezp(Integer id) {
    	employeeMapper.updatezp(id);
	}

    public List<Xinzi> getxinziAll() {
    	return employeeMapper.queryxinzi(null);
    }

    public void updatejt(Integer id) {
		employeeMapper.updatejt(id);
    }

	public void updatekq(Integer id) {
		employeeMapper.updatekq(id);
	}

	public void updatejb(Integer id) {
		employeeMapper.updatejb(id);
	}

    public void jsjt(Integer id) {
        employeeMapper.jsjt(id);
    }

    public void jskq(Integer id) {
        employeeMapper.jskq(id);
    }

    public void jsjb(Integer id) {
        employeeMapper.jsjb(id);
    }
}
