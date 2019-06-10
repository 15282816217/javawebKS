package com.atguigu.crud.controller;
import com.atguigu.crud.bean.Employee;
import com.atguigu.crud.bean.Msg;
import com.atguigu.crud.bean.Xinzi;
import com.atguigu.crud.bean.Zpb;

import com.atguigu.crud.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.*;

/**
 * Ա���������Ʋ�
 * @author asus
 *
 */
@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;


	/**
	 * Ա��ɾ������һ
	 *
	 * @param
	 * @return
	 */
	@RequestMapping(value = "/emp/{ids}", method = RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteEmp(@PathVariable("ids") String ids) {
		//����ɾ��
		if (ids.contains("-")) {
			List<Integer> del_ids = new ArrayList<>();
			String[] str_ids = ids.split("-");
			//��װid�ļ���
			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			employeeService.deleteBatch(del_ids);
			//����ɾ��
		} else {
			Integer id = Integer.parseInt(ids);
			employeeService.deleteEmp(id);
		}

		return Msg.success();
	}



	/**
	 * Ա�����·���
	 *
	 * @param employee
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/emp/{id}", method = RequestMethod.PUT)
	public Msg saveEmp(Employee employee) {
		//System.out.println("�������е�ֵ��"+request.getParameter("id"));
		System.out.println(employee);
		employeeService.updateEmp(employee);
		return Msg.success();
	}

	/**
	 * ����id��ѯԱ��
	 *
	 * @param id
	 * @return
	 */

	@RequestMapping(value = "/emp/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Msg getEmp(@PathVariable("id") Integer id) {
		Employee employee = employeeService.getEmp(id);
		return Msg.success().add("emp", employee);
	}

	/**
	 * ����û����Ƿ����
	 *
	 * @param empName
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/checkuser")
	public Msg checkuser(@RequestParam("empName") String empName) {
		//���ж��Ƿ��ǺϷ��ı��ʽ
		String regx = "(^[a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})";
		if (!empName.matches(regx)) {
			return Msg.fail().add("va_msg", "ǰ����֤�û������Ϸ�");
		}
		//ȷ���ǺϷ��ı��ʽ��ȥ���ݿ��û����ظ�У��
		boolean b = employeeService.checkUser(empName);
		if (b) {

			return Msg.success();

		} else {

			return Msg.fail().add("va_msg", "�����֤�û�������������");
		}

	}

	/**
	 * Ա������
	 * 1.֧��JSR303У��
	 * 2.����Hibernate-Validator
	 *
	 * @return
	 */
	@RequestMapping(value = "/emp", method = RequestMethod.POST)
	@ResponseBody
	public Msg saveEmp(@Valid Employee employee, BindingResult result) {
		if (result.hasErrors()) {
			//У��ʧ��Ӧ�÷���ʧ�ܣ���ģ̬������ʾУ��ʧ�ܵĴ�����Ϣ
			Map<String, Object> map = new HashMap<>();
			List<FieldError> errors = result.getFieldErrors();
			for (FieldError fieldError : errors) {
				System.out.println("������ֶ���" + fieldError.getField());
				System.out.println("������Ϣ��" + fieldError.getDefaultMessage());
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return Msg.fail().add("errorFields", map);
		} else {
			employeeService.saveEmp(employee);
			return Msg.success();
		}

	}

	/**
	 * Ա����ѯ
	 * ����jackson��
	 *
	 * @return
	 */
	@RequestMapping("/emps")
	@ResponseBody
	public Msg getEmpsWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		//�ڲ�ѯǰʹ��pageHelper;����ҳ���Լ�ÿҳ��ѯ������¼
		PageHelper.startPage(pn, 5);
		//startPage֮�������ҳ��ѯ
		List<Employee> emps = employeeService.getAll();
		//ֻ��Ҫ��pageInfo��װ������ҳ�������
		//�����Ժ�ʹ��pageInfo��װ���ݼ�¼;���Դ���������ʾ��ҳ��
		PageInfo page = new PageInfo(emps, 5);
		return Msg.success().add("pageInfo", page);
	}

    /**
     * ��Ƹ��ѯȫ����Ա
     * @param pn
     * @return
     */

	@RequestMapping("/zpemps")
	@ResponseBody
	public Msg getEmpsWithJsonzp(@RequestParam(value = "pn", defaultValue = "1") Integer pn,@RequestParam("paixu") Integer paixu) {

		//�ڲ�ѯǰʹ��pageHelper;����ҳ���Լ�ÿҳ��ѯ������¼
		PageHelper.startPage(pn, 5);
		//startPage֮�������ҳ��ѯ
		List<Zpb> zpemps = employeeService.getzpAll();
		if(paixu==1) {
			Collections.sort(zpemps, new Comparator<Zpb>() {
				@Override
				public int compare(Zpb o1, Zpb o2) {
					return o2.getWorkingage() - o1.getWorkingage();
				}
			});
		}
		if(paixu==2){
			Collections.sort(zpemps, new Comparator<Zpb>() {
				@Override
				public int compare(Zpb o1, Zpb o2) {
					return o1.getWorkingage() - o2.getWorkingage();
				}
			});
		}
			//ֻ��Ҫ��pageInfo��װ������ҳ�������
			//�����Ժ�ʹ��pageInfo��װ���ݼ�¼;���Դ���������ʾ��ҳ��
			PageInfo page = new PageInfo(zpemps, 5);


			return Msg.success().add("pageInfo", page);

	}

    /**
     * ��ѯн��ȫ����Ա
     * @param pn
     * @return
     */
	@RequestMapping("/xinzi")
	@ResponseBody
	public Msg getEmpsWithJsonxinzi(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		//�ڲ�ѯǰʹ��pageHelper;����ҳ���Լ�ÿҳ��ѯ������¼
		PageHelper.startPage(pn, 5);
		//startPage֮�������ҳ��ѯ
		List<Xinzi> xinzis = employeeService.getxinziAll();
		//ֻ��Ҫ��pageInfo��װ������ҳ�������
		//�����Ժ�ʹ��pageInfo��װ���ݼ�¼;���Դ���������ʾ��ҳ��
		PageInfo page = new PageInfo(xinzis, 5);
		return Msg.success().add("pageInfo", page);
	}

    /**
     * ���ӽ���
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/jintie/{id}", method = RequestMethod.PUT)
    public Msg updatejt(@PathVariable("id") Integer id) {
        System.out.println(id);
        employeeService.updatejt(id);
        return Msg.success();
    }

    /**
     * ���ٽ���
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/jsjt/{id}", method = RequestMethod.PUT)
    public Msg jsjt(@PathVariable("id") Integer id) {
        System.out.println(id);
        employeeService.jsjt(id);
        return Msg.success();
    }


    /**
     * ���ӿ���
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/kaoqin/{id}", method = RequestMethod.GET)
    public Msg updatekq(@PathVariable("id") Integer id) {
        System.out.println(id);
        employeeService.updatekq(id);
        return Msg.success();
    }

    /**
     * ���ٿ���
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/jskq/{id}", method = RequestMethod.PUT)
    public Msg jskq(@PathVariable("id") Integer id) {
        System.out.println(id);
        employeeService.jskq(id);
        return Msg.success();
    }

    /**
     * ���ӼӰ�
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/jiaban/{id}", method = RequestMethod.GET)
    public Msg updatejb(@PathVariable("id") Integer id) {
        System.out.println(id);
        employeeService.updatejb(id);
        return Msg.success();
    }

    /**
     * ���ټӰ�
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/jsjb/{id}", method = RequestMethod.PUT)
    public Msg jsjb(@PathVariable("id") Integer id) {
        System.out.println(id);
        employeeService.jsjb(id);
        return Msg.success();
    }

    /**
     * ������Ƹ
     * @param id
     * @return
     */
	@ResponseBody
	@RequestMapping(value = "/zply/{id}", method = RequestMethod.PUT)
	public Msg updatezp(@PathVariable("id") Integer id) {
		System.out.println(id);
		employeeService.updatezp(id);
		return Msg.success();
	}

    /**
     * ɾ����Ƹ��Ա
     * @param id
     * @return
     */
	@RequestMapping(value = "/empzp/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public Msg deletezp(@PathVariable("id") Integer id) {
		System.out.println(id);
		employeeService.deleteempzp(id);
		return Msg.success();
	}

}
