package com.InnerClassExersise;

/**
 * Created by Olga on 17.10.2014.
 */
public abstract class Drink {
    private int serialNo;
    private String description;
    private int sugarContent = 0;

    private void setSerialNo(int serialNo) throws IllegalArgumentException {
        if (serialNo < 0) {
            throw new IllegalArgumentException("The precondition violated"
                    + serialNo + "<0");
        }
        //@pre satisfied

        this.serialNo = serialNo;
    }

    protected Drink(int serialNo, String description) {
        this.setSerialNo(serialNo);
        this.description = description;
    }

    protected abstract String getIngredient();

    public String toString() {
        return "\nSerial number:\t" + this.serialNo
                + "\nDescription\t" + this.description
                + "\nSugar content:\t" + this.sugarContent;
    }

    protected void increaseSugarContent(int amount) {
        sugarContent += amount;
    }
}
