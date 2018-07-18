package com.experiment.model;

// 类型参数（泛型）
public class List<T> {
    T a;
    T b;

    T getFirst() {
        return  a;
    }
}

//List<String> list = new List<String>();
