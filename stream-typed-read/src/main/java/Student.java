import org.opu_newbee_education.java_oop_2015.stream_typed_read.BoundField;

/**
 * Created by salterok on 02.10.2015.
 */
public class Student {
    @BoundField
    private String name;
    @BoundField
    private char group;
    @BoundField
    private byte yearsOld;
    @BoundField
    private long idCode;
    @BoundField
    private boolean sex;
    @BoundField
    private float weight;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGroup() {
        return group;
    }

    public void setGroup(char group) {
        this.group = group;
    }

    public byte getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(byte yearsOld) {
        this.yearsOld = yearsOld;
    }

    public long getIdCode() {
        return idCode;
    }

    public void setIdCode(long idCode) {
        this.idCode = idCode;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
