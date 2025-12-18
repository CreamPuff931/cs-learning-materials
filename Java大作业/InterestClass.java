package bigHomeWork;

class InterestClass
{
    int classid;
    String classname;
    String teachingTime;
    String teachingPlace;
    int totalTeachingTimes;
    String teacher;
    double fee;
    Student[] students=new Student[30];
    int student_num=0;

    public InterestClass(int classid, String classname, String teachingTime, String teachingPlace, int totalTeachingTimes, String teacher, double fee) {
        this.classid = classid;
        this.classname = classname;
        this.teachingTime = teachingTime;
        this.teachingPlace = teachingPlace;
        this.totalTeachingTimes = totalTeachingTimes;
        this.teacher = teacher;
        this.fee = fee;
    }

    public InterestClass()
    {

    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getTeachingTime() {
        return teachingTime;
    }

    public void setTeachingTime(String teachingTime) {
        this.teachingTime = teachingTime;
    }

    public String getTeachingPlace() {
        return teachingPlace;
    }

    public void setTeachingPlace(String teachingPlace) {
        this.teachingPlace = teachingPlace;
    }

    public int getTotalTeachingTimes() {
        return totalTeachingTimes;
    }

    public void setTotalTeachingTimes(int totalTeachingTimes) {
        this.totalTeachingTimes = totalTeachingTimes;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    public void addStudent(Student student1)
    {
        students[student_num]=student1;
        student_num++;
    }
    public void reduceStudent(Student student1)
    {
        for(int i=0;i<student_num;i++)
        {
            if(students[i].equals(student1))
            {
                for(int j=i;j<student_num;j++)
                {
                    students[j]=students[j+1];
                }
                student_num--;
                break;
            }
        }
    }
}
