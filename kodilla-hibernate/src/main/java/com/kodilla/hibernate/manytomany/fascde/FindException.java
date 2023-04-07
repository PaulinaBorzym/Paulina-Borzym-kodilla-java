package com.kodilla.hibernate.manytomany.fascde;

public class FindException extends Exception{
    public static String ERR_EMPLOYEE_NOT_FIND = "Employee is not found";
    public static String ERR_COMPANY_NOT_FIND = "Company is not found";

    public FindException(String message) {
        super(message);
    }
}
