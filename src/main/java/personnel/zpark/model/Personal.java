package personnel.zpark.model;

import java.util.Date;

public class  Personal {
    private Integer teacherId;

    private String teacherPasswd;

    private String teacherName;

    private Integer departmentName;

    private Integer skillTime;

    private String school;

    private Date graduationTime;

    private String graduationProfession;

    private String nowProfession;

    private Date workTime;

    private Integer title;

    private Integer nature;

    private Integer teacherKind;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherPasswd() {
        return teacherPasswd;
    }

    public void setTeacherPasswd(String teacherPasswd) {
        this.teacherPasswd = teacherPasswd == null ? null : teacherPasswd.trim();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public Integer getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(Integer departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getSkillTime() {
        return skillTime;
    }

    public void setSkillTime(Integer skillTime) {
        this.skillTime = skillTime;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public Date getGraduationTime() {
        return graduationTime;
    }

    public void setGraduationTime(Date graduationTime) {
        this.graduationTime = graduationTime;
    }

    public String getGraduationProfession() {
        return graduationProfession;
    }

    public void setGraduationProfession(String graduationProfession) {
        this.graduationProfession = graduationProfession == null ? null : graduationProfession.trim();
    }

    public String getNowProfession() {
        return nowProfession;
    }

    public void setNowProfession(String nowProfession) {
        this.nowProfession = nowProfession == null ? null : nowProfession.trim();
    }

    public Date getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Date workTime) {
        this.workTime = workTime;
    }

    public Integer getTitle() {
        return title;
    }

    public void setTitle(Integer title) {
        this.title = title;
    }

    public Integer getNature() {
        return nature;
    }

    public void setNature(Integer nature) {
        this.nature = nature;
    }

    public Integer getTeacherKind() {
        return teacherKind;
    }

    public void setTeacherKind(Integer teacherKind) {
        this.teacherKind = teacherKind;
    }
}