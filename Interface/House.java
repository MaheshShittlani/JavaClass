import java.util.Date;

public class House implements Cloneable {
    private int id;
    private double area;
    private Date createdDate;


    public House(int id, double area) {
        this.id = id;
        this.area = area;
        this.createdDate = new Date();
    }
    
    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }


    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof House) {
            House h = (House)obj;
            return this.id == h.id && this.area == h.area && 
            this.createdDate.equals(h.createdDate);
        }
        return false;
    }

    @Override
    public String toString() {
        return id+" - "+area+" - "+createdDate;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        House houseClone = (House)super.clone();
        houseClone.createdDate = (Date)createdDate.clone();
        return houseClone;

        // return super.clone(); //- Can't create a seperate copy of dateCreated, creats shallow copy
    }
}
