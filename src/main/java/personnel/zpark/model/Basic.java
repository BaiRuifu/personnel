package personnel.zpark.model;

import java.util.Date;

public class Basic {
    private Integer id;

    private Integer teacherId;

    private Integer happen;

    private Integer title;

    private Integer education;

    private Integer jobTitle;

    private Date getTime;

    private Date hireTime;

    private Integer hireYears;

    private Integer types;

    private Integer scoreOfAll;

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

    public Integer getHappen() {
        return happen;
    }

    public void setHappen(Integer happen) {
        this.happen = happen;
    }

    public Integer getTitle() {
        return title;
    }

    public void setTitle(Integer title) {
        this.title = title;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Integer getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(Integer jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Date getGetTime() {
        return getTime;
    }

    public void setGetTime(Date getTime) {
        this.getTime = getTime;
    }

    public Date getHireTime() {
        return hireTime;
    }

    public void setHireTime(Date hireTime) {
        this.hireTime = hireTime;
    }

    public Integer getHireYears() {
        return hireYears;
    }

    public void setHireYears(Integer hireYears) {
        this.hireYears = hireYears;
    }

    public Integer getTypes() {
        return types;
    }

    public void setTypes(Integer types) {
        this.types = types;
    }

    public Integer getScoreOfAll() {
        return scoreOfAll;
    }

    public void setScoreOfAll(Integer scoreOfAll) {
        this.scoreOfAll = scoreOfAll;
    }
}