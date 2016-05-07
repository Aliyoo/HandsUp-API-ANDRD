/*
 * HandsUpAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 on 05/07/2016
 */
package cn.responder.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ResWholeMsg 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4679402202473852546L;
    private String code = "200";
    private String data;
    private String message = "OK";
    /** GETTER
     * 自定义的响应结果码
     */
    @JsonGetter("code")
    public String getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * 自定义的响应结果码
     */
    @JsonSetter("code")
    public void setCode (String value) { 
        this.code = value;
        notifyObservers(this.code);
    }
 
    /** GETTER
     * 响应消息实体的正文Data
     */
    @JsonGetter("data")
    public String getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * 响应消息实体的正文Data
     */
    @JsonSetter("data")
    public void setData (String value) { 
        this.data = value;
        notifyObservers(this.data);
    }
 
    /** GETTER
     * 结果码对的描述，默认OK
     */
    @JsonGetter("message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * 结果码对的描述，默认OK
     */
    @JsonSetter("message")
    public void setMessage (String value) { 
        this.message = value;
        notifyObservers(this.message);
    }
 
}
 