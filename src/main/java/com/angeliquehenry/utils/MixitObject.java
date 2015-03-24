package com.angeliquehenry.utils;

/**
 * Simple objet contenant une String.
 * @author Angélique Henry
 */
public class MixitObject {

    private String content;
    
    public MixitObject(String _content){
        this.content = _content;
    }
    
    public String getContent(){
        return this.content;
    }
    
    public void setContent(String _content)
    {
        this.content = _content;
    }
    
}
