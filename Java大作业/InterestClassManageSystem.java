package bigHomeWork;

import java.util.Scanner;

public class InterestClassManageSystem
{
    InterestClass[] interestClasses=new InterestClass[30];
    Student[] students=new Student[30];
    int Class_num=0;
    int Student_num=0;

    public  void menu()
    {
        Scanner scn=new Scanner(System.in);

        System.out.println("请输入您要执行的功能的编码：");
        System.out.println("1.兴趣班信息录入");
        System.out.println("2.兴趣班信息查询");
        System.out.println("3.学员信息录入");
        System.out.println("4.学员信息查询");
        System.out.println("5.学员报班管理（报班，取消）");
        System.out.println("6.退出系统");

        String code=scn.next();
        if(code.equals("1"))
        {
            System.out.println("请依次输入班级信息：兴趣班编号、兴趣班名称、授课时间、授课地点、授课总次数、授课教师、单节课费用：");
            for(int i=0;i<30;i++)
            {
                System.out.println("请输入兴趣班的信息：");
                int ID=scn.nextInt();
                String name=scn.next();
                String time=scn.next();
                String Place=scn.next();
                int times=scn.nextInt();
                String teacher=scn.next();
                double fee=scn.nextDouble();
                InterestClass class1=new InterestClass(ID,name,time,Place,times,teacher,fee);
                interestClasses[i]=class1;
                Class_num++;

                System.out.println("还要继续输入吗？");
                System.out.println("1.继续输入");
                System.out.println("2.中止输入");
                int a=scn.nextInt();
                if(a==2)
                {
                    break;
                }
                if(i==29)
                {
                    System.out.println("已达到班级数量上限，将退出班级信息输入");
                    System.out.println();
                }
            }
            menu();
        }
        else if(code.equals("2"))
        {
            if(interestClasses==null)
            {
                System.out.println("您尚未添加兴趣班信息！");
                System.out.println();
            }
            else
            {
                System.out.println("请输入您要查询的兴趣班编号：");
                int claid=scn.nextInt();
                for(int i=0;i<Class_num;i++)
                {
                    if(interestClasses[i].classid == claid)
                    {
                        System.out.println("兴趣班编号："+interestClasses[i].classid);
                        System.out.println("兴趣班名称："+interestClasses[i].classname);
                        System.out.println("授课时间："+interestClasses[i].teachingTime);
                        System.out.println("授课地点："+interestClasses[i].teachingPlace);
                        System.out.println("授课总次数："+interestClasses[i].totalTeachingTimes);
                        System.out.println("授课教师："+interestClasses[i].teacher);
                        System.out.println("单节课费用："+interestClasses[i].fee);
                        System.out.println("学员信息：");
                        if(interestClasses[i].student_num==0)
                        {
                            System.out.println("该班级尚未添加学员信息！");
                            System.out.println();
                        }
                        else
                        {
                            for(int j=0;j<interestClasses[i].student_num;j++)
                            {
                                System.out.println("学员编号"+students[j].id);
                                System.out.println("学员姓名"+students[j].name);
                                System.out.println("学员电话"+students[j].phone);
                                System.out.println("学员年级"+students[j].grade);
                            }
                        }
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("未找到编号为”"+claid+"“的兴趣班！");
                        System.out.println();
                    }
                }
            }
            menu();
        }
        else if(code.equals("3"))
        {
            System.out.println("请依次输入学员编号、学员姓名、学员电话、学员年级：");
            for(int i=0;i<30;i++)
            {
                System.out.println("请输入学员的信息：");
                int ID=scn.nextInt();
                String name=scn.next();
                int phone=scn.nextInt();
                int grade=scn.nextInt();
                Student student1=new Student(ID,name,phone,grade);
                students[i]=student1;
                Student_num++;

                System.out.println("还要继续输入吗？");
                System.out.println("1.继续输入");
                System.out.println("2.中止输入");
                int a=scn.nextInt();
                if(a==2)
                {
                    break;
                }
                if(i==29)
                {
                    System.out.println("已达到班级数量上限，将退出班级信息输入");
                    System.out.println();
                }
            }
            menu();
        }
        else if(code.equals("4"))
        {
            if(students==null)
            {
                System.out.println("您尚未添加学员信息！");
                System.out.println();
            }
            else
            {
                System.out.println("请输入您要查询的学员编号：");
                int stuid=scn.nextInt();
                for(int i=0;i<Student_num;i++)
                {
                    if(students[i].id==stuid)
                    {
                        System.out.println("学员编号"+students[i].id);
                        System.out.println("学员姓名"+students[i].name);
                        System.out.println("学员电话"+students[i].phone);
                        System.out.println("学员年级"+students[i].grade);
                        System.out.println("兴趣班信息：");
                        if(students[i].class_num==0)
                        {
                            System.out.println("该学员尚未添加兴趣班信息！");
                            System.out.println();
                        }
                        else
                        {
                            for(int j=0;j<students[i].class_num;j++)
                            {
                                System.out.println("兴趣班编号："+interestClasses[i].classid);
                                System.out.println("兴趣班名称："+interestClasses[i].classname);
                                System.out.println("授课时间："+interestClasses[i].teachingTime);
                                System.out.println("授课地点："+interestClasses[i].teachingPlace);
                                System.out.println("授课总次数："+interestClasses[i].totalTeachingTimes);
                                System.out.println("授课教师："+interestClasses[i].teacher);
                                System.out.println("单节课费用："+interestClasses[i].fee);
                            }
                        }
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("未找到编号为”"+stuid+"“的学员！");
                        System.out.println();
                    }
                }
            }
            menu();
        }
        else if(code.equals("5"))
        {
            System.out.println("请选择您要执行的功能的编码：");
            System.out.println("1.报班");
            System.out.println("2.取消报班");
            int nb=scn.nextInt();

            if(nb==1)
            {
                System.out.println("请输入兴趣班编号：");
                int Id=scn.nextInt();
                System.out.println("请输入学员编号：");
                int iD= scn.nextInt();

                for(int i=0;i<Class_num;i++)
                {
                    if(interestClasses[i].classid==Id)
                    {
                        for(int j=0;j<Student_num;j++)
                        {
                            if(students[j].id==iD)
                            {
                                for(int k=0;k<interestClasses[i].student_num+1;k++)
                                {
                                    if(interestClasses[i].students[k]!=null&&interestClasses[i].students[k].id==Id)
                                    {
                                        System.out.println("该学员已加入该兴趣班！请不要重复加入！");
                                        System.out.println();
                                        break;
                                    }
                                    else
                                    {
                                        interestClasses[i].addStudent(students[k]);
                                        students[k].addClass(interestClasses[i]);
                                        System.out.println("该学员已成功加入该兴趣班！");
                                        System.out.println();
                                        break;
                                    }
                                }
                            }
                            else
                            {
                                System.out.println("未找到该学员！");
                                System.out.println();
                            }
                        }
                    }
                    else
                    {
                        System.out.println("未找到该兴趣班！");
                        System.out.println();
                    }
                }
            }
            else
            {
                System.out.println("请输入兴趣班编号：");
                int Id=scn.nextInt();
                System.out.println("请输入学员编号：");
                int iD= scn.nextInt();

                for(int i=0;i<Class_num;i++)
                {
                    if(interestClasses[i].classid==Id)
                    {
                        for(int j=0;j<Student_num;j++)
                        {
                            if(students[j].id==iD)
                            {
                                for(int k=0;k<interestClasses[i].student_num+1;k++)
                                {
                                    if(interestClasses[i].students[k].id==iD)
                                    {
                                        interestClasses[i].reduceStudent(students[k]);
                                        students[k].reduceInterestClass(interestClasses[i]);
                                        System.out.println("已成功取消报班！");
                                        System.out.println();
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("该兴趣班中未有该学员信息！");
                                        System.out.println();
                                        break;
                                    }
                                }
                            }
                            else
                            {
                                System.out.println("未找到该学员！");
                                System.out.println();
                            }
                        }
                    }
                    else
                    {
                        System.out.println("未找到该兴趣班！");
                        System.out.println();
                    }
                }
            }
            menu();
        }
        else if(code.equals("6"))
        {
            System.out.println("已成功退出系统！感谢您的使用！");
        }
        else
        {
            System.out.println("您的输入有误，请重新输入!");
            System.out.println();
            menu();
        }
    }
}