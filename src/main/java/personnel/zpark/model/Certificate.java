package personnel.zpark.model;

import java.util.Date;

public class Certificate {
    private Integer id;

    private Integer teacherId;

    private String rewardName;

    private Integer level;

    private Integer grade;

    private Date rewardTime;

    private String awardingUnit;

    private Integer reviewEvaluation;

    private Integer reviewReview;

    private Integer scoreOfHour;

    private Integer scoreOfAll;

    private Integer scoreOfWeight;

    private Integer category;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getRewardName() {
        return rewardName;
    }

    public void setRewardName(String rewardName) {
        this.rewardName = rewardName == null ? null : rewardName.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Date getRewardTime() {
        return rewardTime;
    }

    public void setRewardTime(Date rewardTime) {
        this.rewardTime = rewardTime;
    }

    public String getAwardingUnit() {
        return awardingUnit;
    }

    public void setAwardingUnit(String awardingUnit) {
        this.awardingUnit = awardingUnit == null ? null : awardingUnit.trim();
    }

    public Integer getReviewEvaluation() {
        return reviewEvaluation;
    }

    public void setReviewEvaluation(Integer reviewEvaluation) {
        this.reviewEvaluation = reviewEvaluation;
    }

    public Integer getReviewReview() {
        return reviewReview;
    }

    public void setReviewReview(Integer reviewReview) {
        this.reviewReview = reviewReview;
    }

    public Integer getScoreOfHour() {
        return scoreOfHour;
    }

    public void setScoreOfHour(Integer scoreOfHour) {
        this.scoreOfHour = scoreOfHour;
    }

    public Integer getScoreOfAll() {
        return scoreOfAll;
    }

    public void setScoreOfAll(Integer scoreOfAll) {
        this.scoreOfAll = scoreOfAll;
    }

    public Integer getScoreOfWeight() {
        return scoreOfWeight;
    }

    public void setScoreOfWeight(Integer scoreOfWeight) {
        this.scoreOfWeight = scoreOfWeight;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }
}