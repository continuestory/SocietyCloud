package model.entity;

import util.Entity;

/**
 * 社团类
 *
 * Created by Administrator on 2018/7/5.
 *
 * @author 林志宸
 * @author 杨晓宇
 * @author 黄健勇
 * @author 万培林
 */
public class Society extends Entity{

    //社团ID
    String societyId;

    //社团名
    String societyName;

    //社团学校
    String schoolName;

    //社团主要类型
    String mainType;

    //社团次要类型
    String subType;

    //创建时间
    String foundDate;

    //创建人
    String founder;

    //社团状态
    int status;

    //社团介绍
    String description;

    public String getSocietyId() {
        return societyId;
    }

    public void setSocietyId(String societyId) {
        this.societyId = societyId;
    }

    public String getSocietyName() {
        return societyName;
    }

    public void setSocietyName(String societyName) {
        this.societyName = societyName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getMainType() {
        return mainType;
    }

    public void setMainType(String mainType) {
        this.mainType = mainType;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(String foundDate) {
        this.foundDate = foundDate;
    }

    @Override
    public String getEntityLog() {
        return "社团 id："+this.societyId+" 社团名："+this.societyName;
    }
}
