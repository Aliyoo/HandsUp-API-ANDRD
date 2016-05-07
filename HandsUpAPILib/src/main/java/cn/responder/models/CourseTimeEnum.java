/*
 * HandsUpAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 on 05/07/2016
 */
package cn.responder.models;
public enum CourseTimeEnum {
    classWeek, //表示哪几周上课
    classDay, //表示星期几上课
    classTime, //表示第几节上课
    classRoom; //表示上课教室 
    /**
    * Returns the enum member associated with the given integer value
    * @return	The enum member against the given integer value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static CourseTimeEnum fromString(String toConvert) {
        return CourseTimeEnum.valueOf(toConvert);
    }

    /**
    * Returns the integer value associated with the enum member
    * @return	The integer value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return this.name();
    }
} 