package Revision.revision2;

public class Student {
    private int id;
    private String name;

    Student() {
        id = 102;
    }

    Student(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    void dispaly() {
        System.out.println("id of student : " + id);
        System.out.println("Name of student " + name);
    }
}
