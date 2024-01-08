package PersonInfo;

class Teacher extends Person {
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    void describeRole() {
        System.out.println("teacher name is; " + getName() + " subject; " + subject);
    }

}
