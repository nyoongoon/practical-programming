package com.example.behavior;

public class Car {
    private int degree; //자동차의 각도 (0~360)

    public drive() {
    }

    public float changeDirection(float amount) {
        float result = (degree + amount) % 360;
        if (result < 0) {
            result += 360;
        }
        return result;
    }
    public void accelerate(float speed){}
    public void decelerate(float speed){}
}
