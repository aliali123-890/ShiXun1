package org.example.entity;

public class Clothing {
    private Integer id;
    private String 型号;
    private String 大小;
    private String 颜色;
    private String 数量;

    // 添加 getter 方法
    public Integer getId() {
        return id;
    }

    public String get型号() {
        return 型号;
    }

    public String get大小() {
        return 大小;
    }

    public String get颜色() {
        return 颜色;
    }

    public String get数量() {
        return 数量;
    }

    // 如果需要 setter 方法也可以添加
    public void setId(Integer id) {
        this.id = id;
    }

    public void set型号(String 型号) {
        this.型号 = 型号;
    }

    public void set大小(String 大小) {
        this.大小 = 大小;
    }

    public void set颜色(String 颜色) {
        this.颜色 = 颜色;
    }

    public void set数量(String 数量) {
        this.数量 = 数量;
    }
}