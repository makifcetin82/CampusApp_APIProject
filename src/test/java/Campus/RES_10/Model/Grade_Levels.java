package Campus.RES_10.Model;

import java.util.Arrays;

public class Grade_Levels {

    private String id;
    private String name;
    private String shortName;
    private String nextGradeLevel;
    private String order;


    private String[] translateName;
    private String[] translateShortName;
    private boolean active = true;
    private String schoolId = "6343bf893ed01f0dc03a509a";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getNextGradeLevel() {
        return nextGradeLevel;
    }

    public void setNextGradeLevel(String nextGradeLevel) {
        this.nextGradeLevel = nextGradeLevel;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String[] getTranslateName() {
        return translateName;
    }

    public void setTranslateName(String[] translateName) {
        this.translateName = translateName;
    }

    public String[] getTranslateShortName() {
        return translateShortName;
    }

    public void setTranslateShortName(String[] translateShortName) {
        this.translateShortName = translateShortName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }



    @Override
    public String toString() {
        return "Grade_Levels{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", nextGradeLevel='" + nextGradeLevel + '\'' +
                ", order='" + order + '\'' +
                ", translateName=" + Arrays.toString(translateName) +
                ", translateShortName=" + Arrays.toString(translateShortName) +
                ", active=" + active +
                ", schoolId='" + schoolId + '\'' +
                '}';
    }
}
