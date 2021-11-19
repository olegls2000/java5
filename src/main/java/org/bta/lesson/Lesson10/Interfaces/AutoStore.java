package org.bta.lesson.Lesson10.Interfaces;

import model.Car;

public interface AutoStore {

    default int buyCar(Car someCar){
        return 0;
    }
}


