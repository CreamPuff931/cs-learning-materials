package bigHomeWork;

class Student {
    int id;//编号
    String name;//姓名
    int phone;//电话
    int grade;//年级
    InterestClass[] interestClasses=new InterestClass[30];//班级对象数组
    int class_num=0;//所加班级数量

    public Student(int id, String name, int phone, int grade) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public InterestClass[] getInterestClasses() {
        return interestClasses;
    }

    public void setInterestClasses(InterestClass[] interestClasses) {
        this.interestClasses = interestClasses;
    }
    public void addClass(InterestClass class1)
    {
        interestClasses[class_num]=class1;
        class_num++;
    }
    public void reduceInterestClass(InterestClass interestClass1)
    {
        for(int i=0;i<class_num;i++)
        {
            if(interestClasses[i].equals(interestClass1))
            {
                for(int j=i;j<class_num;j++)
                {
                    interestClasses[j]=interestClasses[j+1];
                }
                class_num--;
                break;
            }
        }
    }
}