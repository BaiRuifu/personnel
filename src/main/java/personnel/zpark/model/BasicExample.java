package personnel.zpark.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BasicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasicExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
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

        public Criteria andHappenIsNull() {
            addCriterion("Happen is null");
            return (Criteria) this;
        }

        public Criteria andHappenIsNotNull() {
            addCriterion("Happen is not null");
            return (Criteria) this;
        }

        public Criteria andHappenEqualTo(Integer value) {
            addCriterion("Happen =", value, "happen");
            return (Criteria) this;
        }

        public Criteria andHappenNotEqualTo(Integer value) {
            addCriterion("Happen <>", value, "happen");
            return (Criteria) this;
        }

        public Criteria andHappenGreaterThan(Integer value) {
            addCriterion("Happen >", value, "happen");
            return (Criteria) this;
        }

        public Criteria andHappenGreaterThanOrEqualTo(Integer value) {
            addCriterion("Happen >=", value, "happen");
            return (Criteria) this;
        }

        public Criteria andHappenLessThan(Integer value) {
            addCriterion("Happen <", value, "happen");
            return (Criteria) this;
        }

        public Criteria andHappenLessThanOrEqualTo(Integer value) {
            addCriterion("Happen <=", value, "happen");
            return (Criteria) this;
        }

        public Criteria andHappenIn(List<Integer> values) {
            addCriterion("Happen in", values, "happen");
            return (Criteria) this;
        }

        public Criteria andHappenNotIn(List<Integer> values) {
            addCriterion("Happen not in", values, "happen");
            return (Criteria) this;
        }

        public Criteria andHappenBetween(Integer value1, Integer value2) {
            addCriterion("Happen between", value1, value2, "happen");
            return (Criteria) this;
        }

        public Criteria andHappenNotBetween(Integer value1, Integer value2) {
            addCriterion("Happen not between", value1, value2, "happen");
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

        public Criteria andEducationIsNull() {
            addCriterion("Education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("Education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(Integer value) {
            addCriterion("Education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(Integer value) {
            addCriterion("Education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(Integer value) {
            addCriterion("Education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(Integer value) {
            addCriterion("Education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(Integer value) {
            addCriterion("Education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(Integer value) {
            addCriterion("Education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<Integer> values) {
            addCriterion("Education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<Integer> values) {
            addCriterion("Education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(Integer value1, Integer value2) {
            addCriterion("Education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(Integer value1, Integer value2) {
            addCriterion("Education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andJobTitleIsNull() {
            addCriterion("Job_Title is null");
            return (Criteria) this;
        }

        public Criteria andJobTitleIsNotNull() {
            addCriterion("Job_Title is not null");
            return (Criteria) this;
        }

        public Criteria andJobTitleEqualTo(Integer value) {
            addCriterion("Job_Title =", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotEqualTo(Integer value) {
            addCriterion("Job_Title <>", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleGreaterThan(Integer value) {
            addCriterion("Job_Title >", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleGreaterThanOrEqualTo(Integer value) {
            addCriterion("Job_Title >=", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleLessThan(Integer value) {
            addCriterion("Job_Title <", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleLessThanOrEqualTo(Integer value) {
            addCriterion("Job_Title <=", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleIn(List<Integer> values) {
            addCriterion("Job_Title in", values, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotIn(List<Integer> values) {
            addCriterion("Job_Title not in", values, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleBetween(Integer value1, Integer value2) {
            addCriterion("Job_Title between", value1, value2, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotBetween(Integer value1, Integer value2) {
            addCriterion("Job_Title not between", value1, value2, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andGetTimeIsNull() {
            addCriterion("Get_Time is null");
            return (Criteria) this;
        }

        public Criteria andGetTimeIsNotNull() {
            addCriterion("Get_Time is not null");
            return (Criteria) this;
        }

        public Criteria andGetTimeEqualTo(Date value) {
            addCriterionForJDBCDate("Get_Time =", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("Get_Time <>", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("Get_Time >", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Get_Time >=", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeLessThan(Date value) {
            addCriterionForJDBCDate("Get_Time <", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Get_Time <=", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeIn(List<Date> values) {
            addCriterionForJDBCDate("Get_Time in", values, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("Get_Time not in", values, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Get_Time between", value1, value2, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Get_Time not between", value1, value2, "getTime");
            return (Criteria) this;
        }

        public Criteria andHireTimeIsNull() {
            addCriterion("Hire_Time is null");
            return (Criteria) this;
        }

        public Criteria andHireTimeIsNotNull() {
            addCriterion("Hire_Time is not null");
            return (Criteria) this;
        }

        public Criteria andHireTimeEqualTo(Date value) {
            addCriterionForJDBCDate("Hire_Time =", value, "hireTime");
            return (Criteria) this;
        }

        public Criteria andHireTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("Hire_Time <>", value, "hireTime");
            return (Criteria) this;
        }

        public Criteria andHireTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("Hire_Time >", value, "hireTime");
            return (Criteria) this;
        }

        public Criteria andHireTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Hire_Time >=", value, "hireTime");
            return (Criteria) this;
        }

        public Criteria andHireTimeLessThan(Date value) {
            addCriterionForJDBCDate("Hire_Time <", value, "hireTime");
            return (Criteria) this;
        }

        public Criteria andHireTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Hire_Time <=", value, "hireTime");
            return (Criteria) this;
        }

        public Criteria andHireTimeIn(List<Date> values) {
            addCriterionForJDBCDate("Hire_Time in", values, "hireTime");
            return (Criteria) this;
        }

        public Criteria andHireTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("Hire_Time not in", values, "hireTime");
            return (Criteria) this;
        }

        public Criteria andHireTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Hire_Time between", value1, value2, "hireTime");
            return (Criteria) this;
        }

        public Criteria andHireTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Hire_Time not between", value1, value2, "hireTime");
            return (Criteria) this;
        }

        public Criteria andHireYearsIsNull() {
            addCriterion("Hire_Years is null");
            return (Criteria) this;
        }

        public Criteria andHireYearsIsNotNull() {
            addCriterion("Hire_Years is not null");
            return (Criteria) this;
        }

        public Criteria andHireYearsEqualTo(Integer value) {
            addCriterion("Hire_Years =", value, "hireYears");
            return (Criteria) this;
        }

        public Criteria andHireYearsNotEqualTo(Integer value) {
            addCriterion("Hire_Years <>", value, "hireYears");
            return (Criteria) this;
        }

        public Criteria andHireYearsGreaterThan(Integer value) {
            addCriterion("Hire_Years >", value, "hireYears");
            return (Criteria) this;
        }

        public Criteria andHireYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("Hire_Years >=", value, "hireYears");
            return (Criteria) this;
        }

        public Criteria andHireYearsLessThan(Integer value) {
            addCriterion("Hire_Years <", value, "hireYears");
            return (Criteria) this;
        }

        public Criteria andHireYearsLessThanOrEqualTo(Integer value) {
            addCriterion("Hire_Years <=", value, "hireYears");
            return (Criteria) this;
        }

        public Criteria andHireYearsIn(List<Integer> values) {
            addCriterion("Hire_Years in", values, "hireYears");
            return (Criteria) this;
        }

        public Criteria andHireYearsNotIn(List<Integer> values) {
            addCriterion("Hire_Years not in", values, "hireYears");
            return (Criteria) this;
        }

        public Criteria andHireYearsBetween(Integer value1, Integer value2) {
            addCriterion("Hire_Years between", value1, value2, "hireYears");
            return (Criteria) this;
        }

        public Criteria andHireYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("Hire_Years not between", value1, value2, "hireYears");
            return (Criteria) this;
        }

        public Criteria andTypesIsNull() {
            addCriterion("Types is null");
            return (Criteria) this;
        }

        public Criteria andTypesIsNotNull() {
            addCriterion("Types is not null");
            return (Criteria) this;
        }

        public Criteria andTypesEqualTo(Integer value) {
            addCriterion("Types =", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesNotEqualTo(Integer value) {
            addCriterion("Types <>", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesGreaterThan(Integer value) {
            addCriterion("Types >", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesGreaterThanOrEqualTo(Integer value) {
            addCriterion("Types >=", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesLessThan(Integer value) {
            addCriterion("Types <", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesLessThanOrEqualTo(Integer value) {
            addCriterion("Types <=", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesIn(List<Integer> values) {
            addCriterion("Types in", values, "types");
            return (Criteria) this;
        }

        public Criteria andTypesNotIn(List<Integer> values) {
            addCriterion("Types not in", values, "types");
            return (Criteria) this;
        }

        public Criteria andTypesBetween(Integer value1, Integer value2) {
            addCriterion("Types between", value1, value2, "types");
            return (Criteria) this;
        }

        public Criteria andTypesNotBetween(Integer value1, Integer value2) {
            addCriterion("Types not between", value1, value2, "types");
            return (Criteria) this;
        }

        public Criteria andScoreOfAllIsNull() {
            addCriterion("Score_Of_All is null");
            return (Criteria) this;
        }

        public Criteria andScoreOfAllIsNotNull() {
            addCriterion("Score_Of_All is not null");
            return (Criteria) this;
        }

        public Criteria andScoreOfAllEqualTo(Integer value) {
            addCriterion("Score_Of_All =", value, "scoreOfAll");
            return (Criteria) this;
        }

        public Criteria andScoreOfAllNotEqualTo(Integer value) {
            addCriterion("Score_Of_All <>", value, "scoreOfAll");
            return (Criteria) this;
        }

        public Criteria andScoreOfAllGreaterThan(Integer value) {
            addCriterion("Score_Of_All >", value, "scoreOfAll");
            return (Criteria) this;
        }

        public Criteria andScoreOfAllGreaterThanOrEqualTo(Integer value) {
            addCriterion("Score_Of_All >=", value, "scoreOfAll");
            return (Criteria) this;
        }

        public Criteria andScoreOfAllLessThan(Integer value) {
            addCriterion("Score_Of_All <", value, "scoreOfAll");
            return (Criteria) this;
        }

        public Criteria andScoreOfAllLessThanOrEqualTo(Integer value) {
            addCriterion("Score_Of_All <=", value, "scoreOfAll");
            return (Criteria) this;
        }

        public Criteria andScoreOfAllIn(List<Integer> values) {
            addCriterion("Score_Of_All in", values, "scoreOfAll");
            return (Criteria) this;
        }

        public Criteria andScoreOfAllNotIn(List<Integer> values) {
            addCriterion("Score_Of_All not in", values, "scoreOfAll");
            return (Criteria) this;
        }

        public Criteria andScoreOfAllBetween(Integer value1, Integer value2) {
            addCriterion("Score_Of_All between", value1, value2, "scoreOfAll");
            return (Criteria) this;
        }

        public Criteria andScoreOfAllNotBetween(Integer value1, Integer value2) {
            addCriterion("Score_Of_All not between", value1, value2, "scoreOfAll");
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