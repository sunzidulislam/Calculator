public class newfile{
    int roll;
    int size;
    newfile(int roll,int size)
    {
        this.roll = roll;
        this.size = size;
    }
    void setRoll(int roll)
    {
        this.roll = roll;
    }

    void setSize(int size)
    {
        this.size = size;
    }

    int getRoll(){
        return this.roll;
    }

    int getSize(){
        return this.size;
    }

}