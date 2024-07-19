package com.example.demo;

public class Class{
    public final int r;
    public final int g;
    public final int b;

    public Class(int r, int g, int b) {
        //.. 검증 로직
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        // 동등성 비교
    }

    @Override
    public int hashCode() {
        return Objects.hash(r, g, b);
    }
}
