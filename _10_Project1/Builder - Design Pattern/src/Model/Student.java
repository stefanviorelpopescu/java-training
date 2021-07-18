package Model;

public class Student {

    private String name;
    private String lastName;
    private String faculty;
    private int age;
    private int yearOfStudy;
    private boolean isPaying;
    private boolean graduate;

    private Student(Builder builder){
        this.name=builder.name;
        this.lastName=builder.lastName;
        this.faculty= builder.faculty;
        this.age= builder.age;
        this.yearOfStudy= builder.yearOfStudy;
        this.isPaying= builder.isPaying;
        this.graduate= builder.graduate;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return faculty;
    }

    public int getAge() {
        return age;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public boolean isPaying() {
        return isPaying;
    }

    public boolean isGraduate() {
        return graduate;
    }

    @Override
    public String toString(){
        return "Name: "+name+"\n"+
                "Last Name: "+lastName+"\n"+
                "Faculty: "+faculty+"\n"+
                "Age: "+age+"\n"+
                "Year of study: "+yearOfStudy+"\n"+
                "Paying tax: "+isPaying+"\n"+
                "Has graduated: "+graduate;
    }

    public static class Builder{
        private String name;
        private String lastName;
        private String faculty;
        private int age;
        private int yearOfStudy;
        private boolean isPaying;
        private boolean graduate;

        public Builder(String name, String lastName, int age){
            this.name=name;
            this.lastName=lastName;
            this.age=age;
        }

        public Builder setFaculty(String faculty){
            this.faculty=faculty;
            return this;
        }

        public Builder setYearOfStudy(int yearOfStudy){
            this.yearOfStudy=yearOfStudy;
            return this;
        }

        public Builder setPaying(boolean isPaying){
            this.isPaying=isPaying;
            return this;
        }

        public Builder setGraduate(boolean graduate){
            this.graduate=graduate;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
