package com.newton.linkedlist;
import java.util.ArrayList;
import java.util.List;
public class LinkedList {
    NewtonSchoolStudent student;
    LinkedList next;
    static String TOPICS_COVERED = "Search DSA basics 1 inside this page - https://my.newtonschool.co/course/696z6d1loj/details/?tab=milestone";
    static String INTERVIEW_DURATION = " 45 minutes ";
    LinkedList(NewtonSchoolStudent s){
        this.student = s;
        this.next = null;
    }
    public static List<NewtonSchoolStudent> init(){
        NewtonSchoolStudent st1 = new NewtonSchoolStudent("sunny","26 July, 2021", "11:10 PM","Monday ",1 ,INTERVIEW_DURATION, TOPICS_COVERED);
        NewtonSchoolStudent st2 = new NewtonSchoolStudent("alkesh","26 July, 2021", "11:55 PM","Monday ",2 ,INTERVIEW_DURATION, TOPICS_COVERED);
        NewtonSchoolStudent st3 = new NewtonSchoolStudent("viplav","27 July, 2021", "11:10 PM","Tuesday ",3 ,INTERVIEW_DURATION, TOPICS_COVERED);
        NewtonSchoolStudent st4 = new NewtonSchoolStudent("ankit","27 July, 2021", "11:55 PM","Tuesday ",4 ,INTERVIEW_DURATION, TOPICS_COVERED);
        NewtonSchoolStudent st5 = new NewtonSchoolStudent("shivpujan","28 July, 2021", "11:10 PM","Wednesday ",5 ,INTERVIEW_DURATION,TOPICS_COVERED);
        NewtonSchoolStudent st6 = new NewtonSchoolStudent("sapna","28 July, 2021", "11:55 PM","Wednesday ",6 ,INTERVIEW_DURATION, TOPICS_COVERED);
        NewtonSchoolStudent st7 = new NewtonSchoolStudent("rakibul","29 July, 2021", "11:10 PM","Thursday ",7 ,INTERVIEW_DURATION, TOPICS_COVERED);
        List<NewtonSchoolStudent> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        studentList.add(st6);
        studentList.add(st7);
        return studentList;
    }
    public static void main(String[] args) {
        List<NewtonSchoolStudent> list = init();
        LinkedList mockInterviewsList = null;
        int count =0;
        for(NewtonSchoolStudent nss : list) {
            if(count==0){
                mockInterviewsList = new LinkedList(nss);
            } else {
                switch (count){
                    case 1:
                        mockInterviewsList.next = new LinkedList(nss);
                        break;
                    case 2:
                        mockInterviewsList.next.next = new LinkedList(nss);
                        break;
                    case 3:
                        mockInterviewsList.next.next.next = new LinkedList(nss);
                        break;
                    case 4:
                        mockInterviewsList.next.next.next.next= new LinkedList(nss);
                        break;
                    case 5:
                        mockInterviewsList.next.next.next.next.next = new LinkedList(nss);
                        break;
                    case 6:
                        mockInterviewsList.next.next.next.next.next.next = new LinkedList(nss);
                        break;
                }
            }
            count++;
        }
        printList(mockInterviewsList);
    }
    public static void printList(LinkedList node){
        while(node!=null){
            System.out.print(node.student+ " => ");
            node = node.next;
        }
        System.out.println("null");
    }
}
class NewtonSchoolStudent{
    String name;
    String date;
    String time;
    String dayName;
    int interviewSequence;
    String interviewDuration;
    String syllabus;
    NewtonSchoolStudent(String name, String date, String time, String dayName, int interviewSequence, String interviewDuration, String syllabus){
        this.name = name;
        this.date = date;
        this.time = time;
        this.dayName = dayName;
        this.interviewSequence = interviewSequence;
        this.interviewDuration = interviewDuration;
        this.syllabus = syllabus;
    }
    @Override
    public String toString() {
        return "NewtonSchoolStudent{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", dayName='" + dayName + '\'' +
                ", interviewSequence=" + interviewSequence +
                ", interviewDuration='" + interviewDuration + '\'' +
                ", syllabus='" + syllabus + '\'' +
                '}';
    }
}