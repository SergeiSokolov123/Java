public class School {
    private String name;
    private short pupils;
    private byte teachers;
    private byte classes;

    public School(String name, byte Classes) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getPupils() {
        return pupils;
    }

    public void setPupils(short pupils) {
        pupils = pupils;
    }

    public byte getTeachers() {
        return teachers;
    }

    public void setTeachers(byte teachers) {
        teachers = teachers;
    }

    public byte getClasses() {
        return classes;
    }

    public void setClasses(byte classes) {
        classes = classes;
    }
}
