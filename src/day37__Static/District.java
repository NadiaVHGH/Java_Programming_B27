package day37__Static;

public class District {
    public static void main(String[] args) {

        School.district = 149;
        School.totalTeachers = 100;
        School.totalStudents = 3000;

        School.totalTeachers--;

        System.out.println(School.district);
        System.out.println(School.totalTeachers);
        System.out.println(School.totalStudents);

        School.announcement();
        //School.lunch(); lunch() method is instance
        School middle = new School();
        middle.lunchTime = 12;
        //School.lunchTime;
        middle.lunch();

    }
}
