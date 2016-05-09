/*
 * HandsUpAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 05/09/2016
 */
package cn.responder.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ResCourseData 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5211749208303503565L;
    private String courseId;
    private String courseName;
    private String courseTchName;
    private List<CourseTime> courseTime;
    /** GETTER
     * 课程ID
     */
    @JsonGetter("courseId")
    public String getCourseId ( ) { 
        return this.courseId;
    }
    
    /** SETTER
     * 课程ID
     */
    @JsonSetter("courseId")
    public void setCourseId (String value) { 
        this.courseId = value;
        notifyObservers(this.courseId);
    }
 
    /** GETTER
     * 课程名
     */
    @JsonGetter("courseName")
    public String getCourseName ( ) { 
        return this.courseName;
    }
    
    /** SETTER
     * 课程名
     */
    @JsonSetter("courseName")
    public void setCourseName (String value) { 
        this.courseName = value;
        notifyObservers(this.courseName);
    }
 
    /** GETTER
     * 课程老师名称
     */
    @JsonGetter("courseTchName")
    public String getCourseTchName ( ) { 
        return this.courseTchName;
    }
    
    /** SETTER
     * 课程老师名称
     */
    @JsonSetter("courseTchName")
    public void setCourseTchName (String value) { 
        this.courseTchName = value;
        notifyObservers(this.courseTchName);
    }
 
    /** GETTER
     * 课程时间详细，数组
     */
    @JsonGetter("courseTime")
    public List<CourseTime> getCourseTime ( ) { 
        return this.courseTime;
    }
    
    /** SETTER
     * 课程时间详细，数组
     */
    @JsonSetter("courseTime")
    public void setCourseTime (List<CourseTime> value) { 
        this.courseTime = value;
        notifyObservers(this.courseTime);
    }
 
}
 