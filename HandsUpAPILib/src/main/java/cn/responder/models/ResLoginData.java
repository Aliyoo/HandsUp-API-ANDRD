/*
 * HandsUpAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 05/09/2016
 */
package cn.responder.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ResLoginData 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5104094033611388345L;
    private String userId;
    private String userName;
    private String userNumber;
    private String userRole;
    /** GETTER
     * 用户ID
     */
    @JsonGetter("userId")
    public String getUserId ( ) { 
        return this.userId;
    }
    
    /** SETTER
     * 用户ID
     */
    @JsonSetter("userId")
    public void setUserId (String value) { 
        this.userId = value;
        notifyObservers(this.userId);
    }
 
    /** GETTER
     * 表示注册或登录者的姓名
     */
    @JsonGetter("userName")
    public String getUserName ( ) { 
        return this.userName;
    }
    
    /** SETTER
     * 表示注册或登录者的姓名
     */
    @JsonSetter("userName")
    public void setUserName (String value) { 
        this.userName = value;
        notifyObservers(this.userName);
    }
 
    /** GETTER
     * 表示注册或登录者的学号或者工号
     */
    @JsonGetter("userNumber")
    public String getUserNumber ( ) { 
        return this.userNumber;
    }
    
    /** SETTER
     * 表示注册或登录者的学号或者工号
     */
    @JsonSetter("userNumber")
    public void setUserNumber (String value) { 
        this.userNumber = value;
        notifyObservers(this.userNumber);
    }
 
    /** GETTER
     * 表示注册或登录者的身份，"student"为学生，"teacher"为老师
     */
    @JsonGetter("userRole")
    public String getUserRole ( ) { 
        return this.userRole;
    }
    
    /** SETTER
     * 表示注册或登录者的身份，"student"为学生，"teacher"为老师
     */
    @JsonSetter("userRole")
    public void setUserRole (String value) { 
        this.userRole = value;
        notifyObservers(this.userRole);
    }
 
}
 