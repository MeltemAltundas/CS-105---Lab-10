package src;

public class book {
    private String name;
    private String branch;
    private String duration_of_time;
    private boolean borrowed;
    private String member;
    private String last_borrow_date;
    public book(String name, String branch, String duration_of_time){
        this.name = name;
        this.branch = branch;
        this.duration_of_time = duration_of_time;
        this.borrowed = borrowed;
    }

    public String getName(){
        return name;
    }
    public String getBranch(){
        return branch;
    }
    public String getDuration_Of_Time(){
        return duration_of_time;
    }
    public boolean getBorrowed(){
        return borrowed;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBranch(String branch){
        this.branch = branch;
    }
    public void setDuration_Of_Time(String duration_of_time){
        this.duration_of_time = duration_of_time;
    }
    public static void main(String[] args) {


    }
}
