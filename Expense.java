public class Expense {

    private int housing;
    private int food;
    private int clothing;
    private int transportation;
    private  int education;
    private int healthCare;
    private int vacations;

    public Expense(int housing, int food, int clothing, int transportation, int education, int healthCare, int vacations){

        this.housing = housing;
        this.food = food;
        this.clothing = clothing;
        this.transportation = transportation;
        this.education = education;
        this.healthCare = healthCare;
        this.vacations = vacations;


    }

    public int calculateFairTax(){

        int fairTax = (housing + food + clothing + transportation + education + healthCare + vacations) * 23/100;

        return fairTax;

    }





}
