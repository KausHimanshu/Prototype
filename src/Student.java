public class Student implements Prototype<Student>{

    private String name;
    private String batch;
    private double psp;
    private double averageBatchPsp;
    private int age;

    private String internalState = "sucess";

    public Student(){ }
    public Student(Student student){
        this.name = student.name;
        this.age = student.age;
        this.psp = student.psp;
        this.batch = student.batch;
        this.averageBatchPsp = student.averageBatchPsp;
        this.internalState = student.internalState;

    }
    @Override
    public Student clone() {
        return new Student(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public double getAverageBatchPsp() {
        return averageBatchPsp;
    }

    public void setAverageBatchPsp(double averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
