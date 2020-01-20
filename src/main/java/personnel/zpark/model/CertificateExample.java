package personnel.zpark.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CertificateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CertificateExample() {
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

        public Criteria andRewardNameIsNull() {
            addCriterion("Reward_Name is null");
            return (Criteria) this;
        }

        public Criteria andRewardNameIsNotNull() {
            addCriterion("Reward_Name is not null");
            return (Criteria) this;
        }

        public Criteria andRewardNameEqualTo(String value) {
            addCriterion("Reward_Name =", value, "rewardName");
            return (Criteria) this;
        }

        public Criteria andRewardNameNotEqualTo(String value) {
            addCriterion("Reward_Name <>", value, "rewardName");
            return (Criteria) this;
        }

        public Criteria andRewardNameGreaterThan(String value) {
            addCriterion("Reward_Name >", value, "rewardName");
            return (Criteria) this;
        }

        public Criteria andRewardNameGreaterThanOrEqualTo(String value) {
            addCriterion("Reward_Name >=", value, "rewardName");
            return (Criteria) this;
        }

        public Criteria andRewardNameLessThan(String value) {
            addCriterion("Reward_Name <", value, "rewardName");
            return (Criteria) this;
        }

        public Criteria andRewardNameLessThanOrEqualTo(String value) {
            addCriterion("Reward_Name <=", value, "rewardName");
            return (Criteria) this;
        }

        public Criteria andRewardNameLike(String value) {
            addCriterion("Reward_Name like", value, "rewardName");
            return (Criteria) this;
        }

        public Criteria andRewardNameNotLike(String value) {
            addCriterion("Reward_Name not like", value, "rewardName");
            return (Criteria) this;
        }

        public Criteria andRewardNameIn(List<String> values) {
            addCriterion("Reward_Name in", values, "rewardName");
            return (Criteria) this;
        }

        public Criteria andRewardNameNotIn(List<String> values) {
            addCriterion("Reward_Name not in", values, "rewardName");
            return (Criteria) this;
        }

        public Criteria andRewardNameBetween(String value1, String value2) {
            addCriterion("Reward_Name between", value1, value2, "rewardName");
            return (Criteria) this;
        }

        public Criteria andRewardNameNotBetween(String value1, String value2) {
            addCriterion("Reward_Name not between", value1, value2, "rewardName");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("Level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("Level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("Level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("Level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("Level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("Level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("Level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("Level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("Level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("Level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("Level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("Level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("Grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("Grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("Grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("Grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("Grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("Grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("Grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("Grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("Grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("Grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("Grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andRewardTimeIsNull() {
            addCriterion("Reward_Time is null");
            return (Criteria) this;
        }

        public Criteria andRewardTimeIsNotNull() {
            addCriterion("Reward_Time is not null");
            return (Criteria) this;
        }

        public Criteria andRewardTimeEqualTo(Date value) {
            addCriterionForJDBCDate("Reward_Time =", value, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andRewardTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("Reward_Time <>", value, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andRewardTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("Reward_Time >", value, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andRewardTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Reward_Time >=", value, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andRewardTimeLessThan(Date value) {
            addCriterionForJDBCDate("Reward_Time <", value, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andRewardTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Reward_Time <=", value, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andRewardTimeIn(List<Date> values) {
            addCriterionForJDBCDate("Reward_Time in", values, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andRewardTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("Reward_Time not in", values, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andRewardTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Reward_Time between", value1, value2, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andRewardTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Reward_Time not between", value1, value2, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitIsNull() {
            addCriterion("Awarding_Unit is null");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitIsNotNull() {
            addCriterion("Awarding_Unit is not null");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitEqualTo(String value) {
            addCriterion("Awarding_Unit =", value, "awardingUnit");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitNotEqualTo(String value) {
            addCriterion("Awarding_Unit <>", value, "awardingUnit");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitGreaterThan(String value) {
            addCriterion("Awarding_Unit >", value, "awardingUnit");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitGreaterThanOrEqualTo(String value) {
            addCriterion("Awarding_Unit >=", value, "awardingUnit");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitLessThan(String value) {
            addCriterion("Awarding_Unit <", value, "awardingUnit");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitLessThanOrEqualTo(String value) {
            addCriterion("Awarding_Unit <=", value, "awardingUnit");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitLike(String value) {
            addCriterion("Awarding_Unit like", value, "awardingUnit");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitNotLike(String value) {
            addCriterion("Awarding_Unit not like", value, "awardingUnit");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitIn(List<String> values) {
            addCriterion("Awarding_Unit in", values, "awardingUnit");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitNotIn(List<String> values) {
            addCriterion("Awarding_Unit not in", values, "awardingUnit");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitBetween(String value1, String value2) {
            addCriterion("Awarding_Unit between", value1, value2, "awardingUnit");
            return (Criteria) this;
        }

        public Criteria andAwardingUnitNotBetween(String value1, String value2) {
            addCriterion("Awarding_Unit not between", value1, value2, "awardingUnit");
            return (Criteria) this;
        }

        public Criteria andReviewEvaluationIsNull() {
            addCriterion("Review_Evaluation is null");
            return (Criteria) this;
        }

        public Criteria andReviewEvaluationIsNotNull() {
            addCriterion("Review_Evaluation is not null");
            return (Criteria) this;
        }

        public Criteria andReviewEvaluationEqualTo(Integer value) {
            addCriterion("Review_Evaluation =", value, "reviewEvaluation");
            return (Criteria) this;
        }

        public Criteria andReviewEvaluationNotEqualTo(Integer value) {
            addCriterion("Review_Evaluation <>", value, "reviewEvaluation");
            return (Criteria) this;
        }

        public Criteria andReviewEvaluationGreaterThan(Integer value) {
            addCriterion("Review_Evaluation >", value, "reviewEvaluation");
            return (Criteria) this;
        }

        public Criteria andReviewEvaluationGreaterThanOrEqualTo(Integer value) {
            addCriterion("Review_Evaluation >=", value, "reviewEvaluation");
            return (Criteria) this;
        }

        public Criteria andReviewEvaluationLessThan(Integer value) {
            addCriterion("Review_Evaluation <", value, "reviewEvaluation");
            return (Criteria) this;
        }

        public Criteria andReviewEvaluationLessThanOrEqualTo(Integer value) {
            addCriterion("Review_Evaluation <=", value, "reviewEvaluation");
            return (Criteria) this;
        }

        public Criteria andReviewEvaluationIn(List<Integer> values) {
            addCriterion("Review_Evaluation in", values, "reviewEvaluation");
            return (Criteria) this;
        }

        public Criteria andReviewEvaluationNotIn(List<Integer> values) {
            addCriterion("Review_Evaluation not in", values, "reviewEvaluation");
            return (Criteria) this;
        }

        public Criteria andReviewEvaluationBetween(Integer value1, Integer value2) {
            addCriterion("Review_Evaluation between", value1, value2, "reviewEvaluation");
            return (Criteria) this;
        }

        public Criteria andReviewEvaluationNotBetween(Integer value1, Integer value2) {
            addCriterion("Review_Evaluation not between", value1, value2, "reviewEvaluation");
            return (Criteria) this;
        }

        public Criteria andReviewReviewIsNull() {
            addCriterion("Review_Review is null");
            return (Criteria) this;
        }

        public Criteria andReviewReviewIsNotNull() {
            addCriterion("Review_Review is not null");
            return (Criteria) this;
        }

        public Criteria andReviewReviewEqualTo(Integer value) {
            addCriterion("Review_Review =", value, "reviewReview");
            return (Criteria) this;
        }

        public Criteria andReviewReviewNotEqualTo(Integer value) {
            addCriterion("Review_Review <>", value, "reviewReview");
            return (Criteria) this;
        }

        public Criteria andReviewReviewGreaterThan(Integer value) {
            addCriterion("Review_Review >", value, "reviewReview");
            return (Criteria) this;
        }

        public Criteria andReviewReviewGreaterThanOrEqualTo(Integer value) {
            addCriterion("Review_Review >=", value, "reviewReview");
            return (Criteria) this;
        }

        public Criteria andReviewReviewLessThan(Integer value) {
            addCriterion("Review_Review <", value, "reviewReview");
            return (Criteria) this;
        }

        public Criteria andReviewReviewLessThanOrEqualTo(Integer value) {
            addCriterion("Review_Review <=", value, "reviewReview");
            return (Criteria) this;
        }

        public Criteria andReviewReviewIn(List<Integer> values) {
            addCriterion("Review_Review in", values, "reviewReview");
            return (Criteria) this;
        }

        public Criteria andReviewReviewNotIn(List<Integer> values) {
            addCriterion("Review_Review not in", values, "reviewReview");
            return (Criteria) this;
        }

        public Criteria andReviewReviewBetween(Integer value1, Integer value2) {
            addCriterion("Review_Review between", value1, value2, "reviewReview");
            return (Criteria) this;
        }

        public Criteria andReviewReviewNotBetween(Integer value1, Integer value2) {
            addCriterion("Review_Review not between", value1, value2, "reviewReview");
            return (Criteria) this;
        }

        public Criteria andScoreOfHourIsNull() {
            addCriterion("Score_Of_Hour is null");
            return (Criteria) this;
        }

        public Criteria andScoreOfHourIsNotNull() {
            addCriterion("Score_Of_Hour is not null");
            return (Criteria) this;
        }

        public Criteria andScoreOfHourEqualTo(Integer value) {
            addCriterion("Score_Of_Hour =", value, "scoreOfHour");
            return (Criteria) this;
        }

        public Criteria andScoreOfHourNotEqualTo(Integer value) {
            addCriterion("Score_Of_Hour <>", value, "scoreOfHour");
            return (Criteria) this;
        }

        public Criteria andScoreOfHourGreaterThan(Integer value) {
            addCriterion("Score_Of_Hour >", value, "scoreOfHour");
            return (Criteria) this;
        }

        public Criteria andScoreOfHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("Score_Of_Hour >=", value, "scoreOfHour");
            return (Criteria) this;
        }

        public Criteria andScoreOfHourLessThan(Integer value) {
            addCriterion("Score_Of_Hour <", value, "scoreOfHour");
            return (Criteria) this;
        }

        public Criteria andScoreOfHourLessThanOrEqualTo(Integer value) {
            addCriterion("Score_Of_Hour <=", value, "scoreOfHour");
            return (Criteria) this;
        }

        public Criteria andScoreOfHourIn(List<Integer> values) {
            addCriterion("Score_Of_Hour in", values, "scoreOfHour");
            return (Criteria) this;
        }

        public Criteria andScoreOfHourNotIn(List<Integer> values) {
            addCriterion("Score_Of_Hour not in", values, "scoreOfHour");
            return (Criteria) this;
        }

        public Criteria andScoreOfHourBetween(Integer value1, Integer value2) {
            addCriterion("Score_Of_Hour between", value1, value2, "scoreOfHour");
            return (Criteria) this;
        }

        public Criteria andScoreOfHourNotBetween(Integer value1, Integer value2) {
            addCriterion("Score_Of_Hour not between", value1, value2, "scoreOfHour");
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

        public Criteria andScoreOfWeightIsNull() {
            addCriterion("Score_Of_Weight is null");
            return (Criteria) this;
        }

        public Criteria andScoreOfWeightIsNotNull() {
            addCriterion("Score_Of_Weight is not null");
            return (Criteria) this;
        }

        public Criteria andScoreOfWeightEqualTo(Integer value) {
            addCriterion("Score_Of_Weight =", value, "scoreOfWeight");
            return (Criteria) this;
        }

        public Criteria andScoreOfWeightNotEqualTo(Integer value) {
            addCriterion("Score_Of_Weight <>", value, "scoreOfWeight");
            return (Criteria) this;
        }

        public Criteria andScoreOfWeightGreaterThan(Integer value) {
            addCriterion("Score_Of_Weight >", value, "scoreOfWeight");
            return (Criteria) this;
        }

        public Criteria andScoreOfWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("Score_Of_Weight >=", value, "scoreOfWeight");
            return (Criteria) this;
        }

        public Criteria andScoreOfWeightLessThan(Integer value) {
            addCriterion("Score_Of_Weight <", value, "scoreOfWeight");
            return (Criteria) this;
        }

        public Criteria andScoreOfWeightLessThanOrEqualTo(Integer value) {
            addCriterion("Score_Of_Weight <=", value, "scoreOfWeight");
            return (Criteria) this;
        }

        public Criteria andScoreOfWeightIn(List<Integer> values) {
            addCriterion("Score_Of_Weight in", values, "scoreOfWeight");
            return (Criteria) this;
        }

        public Criteria andScoreOfWeightNotIn(List<Integer> values) {
            addCriterion("Score_Of_Weight not in", values, "scoreOfWeight");
            return (Criteria) this;
        }

        public Criteria andScoreOfWeightBetween(Integer value1, Integer value2) {
            addCriterion("Score_Of_Weight between", value1, value2, "scoreOfWeight");
            return (Criteria) this;
        }

        public Criteria andScoreOfWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("Score_Of_Weight not between", value1, value2, "scoreOfWeight");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("Category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("Category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(Integer value) {
            addCriterion("Category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(Integer value) {
            addCriterion("Category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(Integer value) {
            addCriterion("Category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("Category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(Integer value) {
            addCriterion("Category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("Category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<Integer> values) {
            addCriterion("Category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<Integer> values) {
            addCriterion("Category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(Integer value1, Integer value2) {
            addCriterion("Category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("Category not between", value1, value2, "category");
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