package com.kodilla.hibernate.manytomany.fascde;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class FindFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(FindFacade.class);
    private CompanyDao companyDao;
    private EmployeeDao employeeDao;


    @Autowired
    public FindFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }


    public List<Company> findCompanyByPartOfTheName(String letters) throws FindException {
        List<Company> result = companyDao.findByNameContaining(letters);
        if (result.isEmpty()) {
            LOGGER.error(FindException.ERR_COMPANY_NOT_FIND);
        }
        return result;

    }

    public List<Employee> getFindEmployeeByPartOfTheName(String letters) throws FindException {
        List<Employee> resultFirstname = employeeDao.findEmployeeByFirstnameContaining(letters);
        List<Employee> resultLastname = employeeDao.findEmployeeByLastnameContaining(letters);
        Set<Employee> result = new HashSet<>();
        result.addAll(resultFirstname);
        result.addAll(resultLastname);
        List<Employee> resultList = new ArrayList<>();
        resultList.addAll(result);
        if (resultList.isEmpty()) {
            LOGGER.error(FindException.ERR_EMPLOYEE_NOT_FIND);
        }
        return resultList;

    }
}
