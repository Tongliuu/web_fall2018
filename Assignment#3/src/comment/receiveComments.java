/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comment;

import java.io.Serializable;

/**
 *
 * @author 18452
 */
public class receiveComments extends Object implements Serializable {
    private String name;
    private String email;
    private String comments;
    
    public receiveComments(){
        name = new String();
        email = new String();
        comments = new String();
    }
    
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setComments(String comments){
        this.comments=comments;
    }
    
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getComments(){
        return this.comments;
    }
}
