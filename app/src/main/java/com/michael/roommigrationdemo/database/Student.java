package com.michael.roommigrationdemo.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Model
 * */
@Entity(tableName = "student")
public class Student
{
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    public int id;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "age")
    public String age;

    /**
     * Room会使用这个构造器来存储数据，也就是当你从表中得到Student对象时候，Room会使用这个构造器
     * */
    public Student(int id, String name, String age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
