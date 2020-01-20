package personnel.zpark.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PersonalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonalExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("Teacher_ID is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("Teacher_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("Teacher_ID =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("Teacher_ID <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("Teacher_ID >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Teacher_ID >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("Teacher_ID <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("Teacher_ID <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("Teacher_ID in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("Teacher_ID not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("Teacher_ID between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Teacher_ID not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswdIsNull() {
            addCriterion("Teacher_Passwd is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswdIsNotNull() {
            addCriterion("Teacher_Passwd is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswdEqualTo(String value) {
            addCriterion("Teacher_Passwd =", value, "teacherPasswd");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswdNotEqualTo(String value) {
            addCriterion("Teacher_Passwd <>", value, "teacherPasswd");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswdGreaterThan(String value) {
            addCriterion("Teacher_Passwd >", value, "teacherPasswd");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("Teacher_Passwd >=", value, "teacherPasswd");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswdLessThan(String value) {
            addCriterion("Teacher_Passwd <", value, "teacherPasswd");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswdLessThanOrEqualTo(String value) {
            addCriterion("Teacher_Passwd <=", value, "teacherPasswd");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswdLike(String value) {
            addCriterion("Teacher_Passwd like", value, "teacherPasswd");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswdNotLike(String value) {
            addCriterion("Teacher_Passwd not like", value, "teacherPasswd");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswdIn(List<String> values) {
            addCriterion("Teacher_Passwd in", values, "teacherPasswd");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswdNotIn(List<String> values) {
            addCriterion("Teacher_Passwd not in", values, "teacherPasswd");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswdBetween(String value1, String value2) {
            addCriterion("Teacher_Passwd between", value1, value2, "teacherPasswd");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswdNotBetween(String value1, String value2) {
            addCriterion("Teacher_Passwd not between", value1, value2, "teacherPasswd");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNull() {
            addCriterion("Teacher_Name is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNotNull() {
            addCriterion("Teacher_Name is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameEqualTo(String value) {
            addCriterion("Teacher_Name =", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotEqualTo(String value) {
            addCriterion("Teacher_Name <>", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThan(String value) {
            addCriterion("Teacher_Name >", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("Teacher_Name >=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThan(String value) {
            addCriterion("Teacher_Name <", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("Teacher_Name <=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLike(String value) {
            addCriterion("Teacher_Name like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotLike(String value) {
            addCriterion("Teacher_Name not like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIn(List<String> values) {
            addCriterion("Teacher_Name in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotIn(List<String> values) {
            addCriterion("Teacher_Name not in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameBetween(String value1, String value2) {
            addCriterion("Teacher_Name between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotBetween(String value1, String value2) {
            addCriterion("Teacher_Name not between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNull() {
            addCriterion("Department_Name is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNotNull() {
            addCriterion("Department_Name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameEqualTo(Integer value) {
            addCriterion("Department_Name =", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotEqualTo(Integer value) {
            addCriterion("Department_Name <>", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThan(Integer value) {
            addCriterion("Department_Name >", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThanOrEqualTo(Integer value) {
            addCriterion("Department_Name >=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThan(Integer value) {
            addCriterion("Department_Name <", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThanOrEqualTo(Integer value) {
            addCriterion("Department_Name <=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIn(List<Integer> values) {
            addCriterion("Department_Name in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotIn(List<Integer> values) {
            addCriterion("Department_Name not in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameBetween(Integer value1, Integer value2) {
            addCriterion("Department_Name between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotBetween(Integer value1, Integer value2) {
            addCriterion("Department_Name not between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andSkillTimeIsNull() {
            addCriterion("Skill_Time is null");
            return (Criteria) this;
        }

        public Criteria andSkillTimeIsNotNull() {
            addCriterion("Skill_Time is not null");
            return (Criteria) this;
        }

        public Criteria andSkillTimeEqualTo(Integer value) {
            addCriterion("Skill_Time =", value, "skillTime");
            return (Criteria) this;
        }

        public Criteria andSkillTimeNotEqualTo(Integer value) {
            addCriterion("Skill_Time <>", value, "skillTime");
            return (Criteria) this;
        }

        public Criteria andSkillTimeGreaterThan(Integer value) {
            addCriterion("Skill_Time >", value, "skillTime");
            return (Criteria) this;
        }

        public Criteria andSkillTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Skill_Time >=", value, "skillTime");
            return (Criteria) this;
        }

        public Criteria andSkillTimeLessThan(Integer value) {
            addCriterion("Skill_Time <", value, "skillTime");
            return (Criteria) this;
        }

        public Criteria andSkillTimeLessThanOrEqualTo(Integer value) {
            addCriterion("Skill_Time <=", value, "skillTime");
            return (Criteria) this;
        }

        public Criteria andSkillTimeIn(List<Integer> values) {
            addCriterion("Skill_Time in", values, "skillTime");
            return (Criteria) this;
        }

        public Criteria andSkillTimeNotIn(List<Integer> values) {
            addCriterion("Skill_Time not in", values, "skillTime");
            return (Criteria) this;
        }

        public Criteria andSkillTimeBetween(Integer value1, Integer value2) {
            addCriterion("Skill_Time between", value1, value2, "skillTime");
            return (Criteria) this;
        }

        public Criteria andSkillTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("Skill_Time not between", value1, value2, "skillTime");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("School is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("School is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("School =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("School <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("School >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("School >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("School <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("School <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("School like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("School not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("School in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("School not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("School between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("School not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeIsNull() {
            addCriterion("Graduation_Time is null");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeIsNotNull() {
            addCriterion("Graduation_Time is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeEqualTo(Date value) {
            addCriterionForJDBCDate("Graduation_Time =", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("Graduation_Time <>", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("Graduation_Time >", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Graduation_Time >=", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeLessThan(Date value) {
            addCriterionForJDBCDate("Graduation_Time <", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Graduation_Time <=", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeIn(List<Date> values) {
            addCriterionForJDBCDate("Graduation_Time in", values, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("Graduation_Time not in", values, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Graduation_Time between", value1, value2, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Graduation_Time not between", value1, value2, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationProfessionIsNull() {
            addCriterion("Graduation_Profession is null");
            return (Criteria) this;
        }

        public Criteria andGraduationProfessionIsNotNull() {
            addCriterion("Graduation_Profession is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationProfessionEqualTo(String value) {
            addCriterion("Graduation_Profession =", value, "graduationProfession");
            return (Criteria) this;
        }

        public Criteria andGraduationProfessionNotEqualTo(String value) {
            addCriterion("Graduation_Profession <>", value, "graduationProfession");
            return (Criteria) this;
        }

        public Criteria andGraduationProfessionGreaterThan(String value) {
            addCriterion("Graduation_Profession >", value, "graduationProfession");
            return (Criteria) this;
        }

        public Criteria andGraduationProfessionGreaterThanOrEqualTo(String value) {
            addCriterion("Graduation_Profession >=", value, "graduationProfession");
            return (Criteria) this;
        }

        public Criteria andGraduationProfessionLessThan(String value) {
            addCriterion("Graduation_Profession <", value, "graduationProfession");
            return (Criteria) this;
        }

        public Criteria andGraduationProfessionLessThanOrEqualTo(String value) {
            addCriterion("Graduation_Profession <=", value, "graduationProfession");
            return (Criteria) this;
        }

        public Criteria andGraduationProfessionLike(String value) {
            addCriterion("Graduation_Profession like", value, "graduationProfession");
            return (Criteria) this;
        }

        public Criteria andGraduationProfessionNotLike(String value) {
            addCriterion("Graduation_Profession not like", value, "graduationProfession");
            return (Criteria) this;
        }

        public Criteria andGraduationProfessionIn(List<String> values) {
            addCriterion("Graduation_Profession in", values, "graduationProfession");
            return (Criteria) this;
        }

        public Criteria andGraduationProfessionNotIn(List<String> values) {
            addCriterion("Graduation_Profession not in", values, "graduationProfession");
            return (Criteria) this;
        }

        public Criteria andGraduationProfessionBetween(String value1, String value2) {
            addCriterion("Graduation_Profession between", value1, value2, "graduationProfession");
            return (Criteria) this;
        }

        public Criteria andGraduationProfessionNotBetween(String value1, String value2) {
            addCriterion("Graduation_Profession not between", value1, value2, "graduationProfession");
            return (Criteria) this;
        }

        public Criteria andNowProfessionIsNull() {
            addCriterion("Now_Profession is null");
            return (Criteria) this;
        }

        public Criteria andNowProfessionIsNotNull() {
            addCriterion("Now_Profession is not null");
            return (Criteria) this;
        }

        public Criteria andNowProfessionEqualTo(String value) {
            addCriterion("Now_Profession =", value, "nowProfession");
            return (Criteria) this;
        }

        public Criteria andNowProfessionNotEqualTo(String value) {
            addCriterion("Now_Profession <>", value, "nowProfession");
            return (Criteria) this;
        }

        public Criteria andNowProfessionGreaterThan(String value) {
            addCriterion("Now_Profession >", value, "nowProfession");
            return (Criteria) this;
        }

        public Criteria andNowProfessionGreaterThanOrEqualTo(String value) {
            addCriterion("Now_Profession >=", value, "nowProfession");
            return (Criteria) this;
        }

        public Criteria andNowProfessionLessThan(String value) {
            addCriterion("Now_Profession <", value, "nowProfession");
            return (Criteria) this;
        }

        public Criteria andNowProfessionLessThanOrEqualTo(String value) {
            addCriterion("Now_Profession <=", value, "nowProfession");
            return (Criteria) this;
        }

        public Criteria andNowProfessionLike(String value) {
            addCriterion("Now_Profession like", value, "nowProfession");
            return (Criteria) this;
        }

        public Criteria andNowProfessionNotLike(String value) {
            addCriterion("Now_Profession not like", value, "nowProfession");
            return (Criteria) this;
        }

        public Criteria andNowProfessionIn(List<String> values) {
            addCriterion("Now_Profession in", values, "nowProfession");
            return (Criteria) this;
        }

        public Criteria andNowProfessionNotIn(List<String> values) {
            addCriterion("Now_Profession not in", values, "nowProfession");
            return (Criteria) this;
        }

        public Criteria andNowProfessionBetween(String value1, String value2) {
            addCriterion("Now_Profession between", value1, value2, "nowProfession");
            return (Criteria) this;
        }

        public Criteria andNowProfessionNotBetween(String value1, String value2) {
            addCriterion("Now_Profession not between", value1, value2, "nowProfession");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNull() {
            addCriterion("Work_Time is null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNotNull() {
            addCriterion("Work_Time is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEqualTo(Date value) {
            addCriterionForJDBCDate("Work_Time =", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("Work_Time <>", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("Work_Time >", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Work_Time >=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThan(Date value) {
            addCriterionForJDBCDate("Work_Time <", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Work_Time <=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIn(List<Date> values) {
            addCriterionForJDBCDate("Work_Time in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("Work_Time not in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Work_Time between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Work_Time not between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("Title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("Title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(Integer value) {
            addCriterion("Title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(Integer value) {
            addCriterion("Title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(Integer value) {
            addCriterion("Title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(Integer value) {
            addCriterion("Title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(Integer value) {
            addCriterion("Title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(Integer value) {
            addCriterion("Title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<Integer> values) {
            addCriterion("Title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<Integer> values) {
            addCriterion("Title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(Integer value1, Integer value2) {
            addCriterion("Title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(Integer value1, Integer value2) {
            addCriterion("Title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andNatureIsNull() {
            addCriterion("Nature is null");
            return (Criteria) this;
        }

        public Criteria andNatureIsNotNull() {
            addCriterion("Nature is not null");
            return (Criteria) this;
        }

        public Criteria andNatureEqualTo(Integer value) {
            addCriterion("Nature =", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotEqualTo(Integer value) {
            addCriterion("Nature <>", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThan(Integer value) {
            addCriterion("Nature >", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThanOrEqualTo(Integer value) {
            addCriterion("Nature >=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThan(Integer value) {
            addCriterion("Nature <", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThanOrEqualTo(Integer value) {
            addCriterion("Nature <=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureIn(List<Integer> values) {
            addCriterion("Nature in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotIn(List<Integer> values) {
            addCriterion("Nature not in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureBetween(Integer value1, Integer value2) {
            addCriterion("Nature between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotBetween(Integer value1, Integer value2) {
            addCriterion("Nature not between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andTeacherKindIsNull() {
            addCriterion("Teacher_Kind is null");
            return (Criteria) this;
        }

        public Criteria andTeacherKindIsNotNull() {
            addCriterion("Teacher_Kind is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherKindEqualTo(Integer value) {
            addCriterion("Teacher_Kind =", value, "teacherKind");
            return (Criteria) this;
        }

        public Criteria andTeacherKindNotEqualTo(Integer value) {
            addCriterion("Teacher_Kind <>", value, "teacherKind");
            return (Criteria) this;
        }

        public Criteria andTeacherKindGreaterThan(Integer value) {
            addCriterion("Teacher_Kind >", value, "teacherKind");
            return (Criteria) this;
        }

        public Criteria andTeacherKindGreaterThanOrEqualTo(Integer value) {
            addCriterion("Teacher_Kind >=", value, "teacherKind");
            return (Criteria) this;
        }

        public Criteria andTeacherKindLessThan(Integer value) {
            addCriterion("Teacher_Kind <", value, "teacherKind");
            return (Criteria) this;
        }

        public Criteria andTeacherKindLessThanOrEqualTo(Integer value) {
            addCriterion("Teacher_Kind <=", value, "teacherKind");
            return (Criteria) this;
        }

        public Criteria andTeacherKindIn(List<Integer> values) {
            addCriterion("Teacher_Kind in", values, "teacherKind");
            return (Criteria) this;
        }

        public Criteria andTeacherKindNotIn(List<Integer> values) {
            addCriterion("Teacher_Kind not in", values, "teacherKind");
            return (Criteria) this;
        }

        public Criteria andTeacherKindBetween(Integer value1, Integer value2) {
            addCriterion("Teacher_Kind between", value1, value2, "teacherKind");
            return (Criteria) this;
        }

        public Criteria andTeacherKindNotBetween(Integer value1, Integer value2) {
            addCriterion("Teacher_Kind not between", value1, value2, "teacherKind");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}