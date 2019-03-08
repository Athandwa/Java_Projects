public class Car {

    private boolean  previouslyOwned;
    private int numWheels;
    private int mileage;
    private String type;
    public String colour;


    public Car(boolean previouslyOwned) {
        this.previouslyOwned = previouslyOwned;

        if(previouslyOwned == true){
            this.previouslyOwned = true;
            this.mileage = 20000;
        }
        else {
            previouslyOwned = false;
            mileage = 0;
        }

    }

    public boolean getPreviouslyOwned() {

        return previouslyOwned;
    }

    public void setPreviouslyOwned(boolean previouslyOwned) {

        this.previouslyOwned = previouslyOwned;
    }

    public int getNumWheels() {

        return numWheels;
    }

    public void setNumWheels(int numWheels) {

        this.numWheels = numWheels;
    }

    public int getMileage() {

        return mileage;
    }

    public void setMileage(int mileage) {

        this.mileage = mileage;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {
        this.type = type;
        if (type.equals("Reliant Robin")){
            this.numWheels = 3;
        }
        else {
            numWheels = 4;
        }
    }
}
