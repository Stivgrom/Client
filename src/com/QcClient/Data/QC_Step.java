/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QcClient.Data;

import java.util.ArrayList;

/**
 *
 * @author kostenko
 */
public class QC_Step {
    public class StepValue
    {
        public String Name;
        public String Values;

    }
    
    private ArrayList<StepValue> stepValueArr = new ArrayList<StepValue>();

    public ArrayList<StepValue> getStepValueArr() {
        return stepValueArr;
    }

    public void setStepValueArr(ArrayList<StepValue> stepValueArr) {
        this.stepValueArr = stepValueArr;
    }
   
    public String ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String StepName;
    
    public String getStepName() {
        return StepName;
    }

    public void setStepName(String StepName) {
        this.StepName = StepName;
    }
 
    public String Description;
            
    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    public String ExpectedResult;
    public String getExpectedResult() {
        return ExpectedResult;
    }

    public void setExpectedResult(String ExpectedResult) {
        this.ExpectedResult = ExpectedResult;
    }
    
    public ArrayList<QC_Attachments> Attachments;

    public ArrayList<QC_Attachments> getAttachments() {
        return Attachments;
    }

    public void setAttachments(ArrayList<QC_Attachments> Attachments) {
        this.Attachments = Attachments;
    }


    public String CurrentDefect;

    public String getCurrentDefect() {
        return CurrentDefect;
    }

    public void setCurrentDefect(String CurrentDefect) {
        this.CurrentDefect = CurrentDefect;
    }

    public String OldDefect;
    
    public String getOldDefect() {
        return OldDefect;
    }

    public void setOldDefect(String OldDefect) {
        this.OldDefect = OldDefect;
    }

    public String InputData;
        
    public String getInputData() {
        return InputData;
    }

    public void setInputData(String InputData) {
        this.InputData = InputData;
    }

    public String Comments;
        
    public String getComments() {
        return Comments;
    }

    public void setComments(String Comments) {
        this.Comments = Comments;
    }

    public String getCurrentExecutionStatus() {
        return CurrentExecutionStatus;
    }

    public String CurrentExecutionStatus;
        
    public void setCurrentExecutionStatus(String CurrentExecutionStatus) {
        this.CurrentExecutionStatus = CurrentExecutionStatus;
    }

    public String TimeTaken;
        
    public String getTimeTaken() {
        return TimeTaken;
    }

    public void setTimeTaken(String TimeTaken) {
        this.TimeTaken = TimeTaken;
    }
    
    public String Message;
    
    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }
























}
