package org.example;

import java.util.HashMap;

//������� ���������� �������������� ������ �������������� � �������������� ����� int �����������.

public class HotDrink extends Drink{
    private int temperatura;
    Drink hD = new Drink();



    public void setHotDrink(int temperatura, String name, double coast ) {
        this.hD.name = name;
        this.hD.coast = coast;
        this.temperatura = temperatura;
    }

    public String getName(){
        return this.hD.name;
    }

    public int getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "temperatura=" + this.temperatura +
                ", name=" +  this.hD.name+
                ", coast=" + this.hD.coast +
                '}';
    }
}
