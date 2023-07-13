public class quiz{
    public static void main(String[] args) {
        student s = new student("gane", 24356, 65, 3.4);
        s.ShowD();
        
        String name = s.getName();
        System.out.println("Name : " + name);
        s.setName("game");
        name = s.getName();
        System.out.println("New Name : " + name);

        int Id = s.getID();
        System.out.println("ID : " + Id);
        s.setID(65234);
        Id = s.getID();
        System.out.println("New ID : " + Id);
    }
}
class student{
    private String name;
    private int id;
    private int addY;
    private double GPA;

    student(String name,int id,int addY,double GPA){
        this.name = name;
        this.id = id;
        this.addY = addY;
        this.GPA = GPA;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getID(){
        return id;
    }

    public void setID(int id){
        this.id = id ;
    }

    public int getAddY(){
        return addY;
    }
    
    public void setAddY(int addY){
        this.addY = addY;
    }

    public double getGPA(){
        return GPA;
    }

    public void setGPA(double GPA){
        this.GPA = GPA;
    }
    public void ShowD(){
        System.out.println("Name : " + this.name);
        System.out.println("ID : " + this.id);
        System.out.println("AddmiissionYear : " + this.addY);
        System.out.println("GPA : " + this.GPA);

    }


}