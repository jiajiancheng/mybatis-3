package com.jjc.mybatis.domain;

import java.io.Serializable;

public class WorkCard implements Serializable {
    private static final long serialVersionUID = 2141117949929707151L;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_card.id
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_card.emp_id
     */
    private Integer empId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_card.department
     */
    private String department;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_card.id
     *
     * @return the value of work_card.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_card.id
     *
     * @param id the value for work_card.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_card.emp_id
     *
     * @return the value of work_card.emp_id
     */
    public Integer getEmpId() {
        return empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_card.emp_id
     *
     * @param empId the value for work_card.emp_id
     */
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_card.department
     *
     * @return the value of work_card.department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_card.department
     *
     * @param department the value for work_card.department
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }
}