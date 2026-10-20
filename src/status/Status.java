/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.util.Scanner;

/** This class takes String input from user 
 * and calls method statusDetail to print the 
 * status of User-Rejected,Pending,Processing and Approved.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the status details. 
 * @author srinivsi 
 * Atila Ureten 991850506
 */
public class Status {

    /**
     * @param args the command line arguments
     */
    
    public enum Code {
    ZERO,ONE,TWO,THREE
    }
    private Code code;
    public Status(Code code){
    this.code = code;
    }
    public Code getCode(){
    return this.code;
    }
    public void setCode(Code code){
    this.code = code;
    }
    public static void main(String[] args)
    {
    Scanner in =new Scanner(System.in);
    System.out.println("Enter the user status code (0-3)");
    int input = in.nextInt();
    Status userCode = new Status(Status.Code.values()[input]);
    for (Status status){
        if (status.getCode() == userCode.getCode()){
        }
        
    };
    
    Status input = new Status(Status.Code.valueOf(code));
    input.setCode();
    StausUser t= new StausUser();
    t.statusDetail(input.getCode()); 
    }
    
}
