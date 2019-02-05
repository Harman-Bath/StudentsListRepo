package studentslist;

//FEB 5TH, 2019
//Brampton, Ontario

public class Student {
   
    private String DoB; 
    private String name;
    private int id;
    
    private int maxHrs; 
 
    public Student()
    {
        name = "Not Set";
        id = 0;
    }
    public Student(String givenName,int givenId)
    {
        name = givenName;
        id = givenId;
    }
    
    public void setName(String givenName)
    {
        this.name = givenName;
    }
    
    public String getName()
    {
           return this.name;
     }
    
    public void setId(int givenId)
    {
            id = givenId;
    }
    
    public int getId()
    {
        return id;
    }

    /**
     * @return the DoB
     */
    public String getDoB() {
        return DoB;
    }

    /**
     * @param DoB the DoB to set
     */
    public void setDoB(String DoB) {
        this.DoB = DoB;
    }
}
