package com.varian.ccip.dao.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
/**
 * <p>
 * 
 * </p>
 *
 * @author bob
 * @since 2019-11-19
 */
public class Patient extends Model<Patient> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String vip;

    private String hisId;

    private String vId;

    private String pinyin;

    private String address;

    private String contactName;

    private String contactAddress;

    private String contactHomePhone;

    private String contactWorkPhone;

    private String contactMobilePhone;

    private String contactRelationship;

    private String homePhone;

    private String workPhone;

    private String mobilePhone;

    private String nationalId;

    private String chineseName;

    private String citizenship;

    private String englishName;

    private String ethnicGroup;

    private String radiationId;

    private String maritalStatus;

    private String patientStatus;

    private String patientHistory;

    private String createdUser;

    private String lastUpdatedUser;

    private String patientInfo;

    private Long patientSer;

    private String gender;

    private String id1;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getHisId() {
        return hisId;
    }

    public void setHisId(String hisId) {
        this.hisId = hisId;
    }

    public String getvId() {
        return vId;
    }

    public void setvId(String vId) {
        this.vId = vId;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getContactHomePhone() {
        return contactHomePhone;
    }

    public void setContactHomePhone(String contactHomePhone) {
        this.contactHomePhone = contactHomePhone;
    }

    public String getContactWorkPhone() {
        return contactWorkPhone;
    }

    public void setContactWorkPhone(String contactWorkPhone) {
        this.contactWorkPhone = contactWorkPhone;
    }

    public String getContactMobilePhone() {
        return contactMobilePhone;
    }

    public void setContactMobilePhone(String contactMobilePhone) {
        this.contactMobilePhone = contactMobilePhone;
    }

    public String getContactRelationship() {
        return contactRelationship;
    }

    public void setContactRelationship(String contactRelationship) {
        this.contactRelationship = contactRelationship;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getEthnicGroup() {
        return ethnicGroup;
    }

    public void setEthnicGroup(String ethnicGroup) {
        this.ethnicGroup = ethnicGroup;
    }

    public String getRadiationId() {
        return radiationId;
    }

    public void setRadiationId(String radiationId) {
        this.radiationId = radiationId;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getPatientStatus() {
        return patientStatus;
    }

    public void setPatientStatus(String patientStatus) {
        this.patientStatus = patientStatus;
    }

    public String getPatientHistory() {
        return patientHistory;
    }

    public void setPatientHistory(String patientHistory) {
        this.patientHistory = patientHistory;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public String getLastUpdatedUser() {
        return lastUpdatedUser;
    }

    public void setLastUpdatedUser(String lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
    }

    public String getPatientInfo() {
        return patientInfo;
    }

    public void setPatientInfo(String patientInfo) {
        this.patientInfo = patientInfo;
    }

    public Long getPatientSer() {
        return patientSer;
    }

    public void setPatientSer(Long patientSer) {
        this.patientSer = patientSer;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId1() {
        return id1;
    }

    public void setId1(String id1) {
        this.id1 = id1;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "Patient{" +
        ", id=" + id +
        ", vip=" + vip +
        ", hisId=" + hisId +
        ", vId=" + vId +
        ", pinyin=" + pinyin +
        ", address=" + address +
        ", contactName=" + contactName +
        ", contactAddress=" + contactAddress +
        ", contactHomePhone=" + contactHomePhone +
        ", contactWorkPhone=" + contactWorkPhone +
        ", contactMobilePhone=" + contactMobilePhone +
        ", contactRelationship=" + contactRelationship +
        ", homePhone=" + homePhone +
        ", workPhone=" + workPhone +
        ", mobilePhone=" + mobilePhone +
        ", nationalId=" + nationalId +
        ", chineseName=" + chineseName +
        ", citizenship=" + citizenship +
        ", englishName=" + englishName +
        ", ethnicGroup=" + ethnicGroup +
        ", radiationId=" + radiationId +
        ", maritalStatus=" + maritalStatus +
        ", patientStatus=" + patientStatus +
        ", patientHistory=" + patientHistory +
        ", createdUser=" + createdUser +
        ", lastUpdatedUser=" + lastUpdatedUser +
        ", patientInfo=" + patientInfo +
        ", patientSer=" + patientSer +
        ", gender=" + gender +
        ", id1=" + id1 +
        "}";
    }
}
