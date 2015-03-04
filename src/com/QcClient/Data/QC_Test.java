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
public class QC_Test {
    private String strIDTest = null;
    private ArrayList<QC_Step> listSteps = new ArrayList<QC_Step>();
    private ArrayList<TestValue> listTestValues = new ArrayList<TestValue>();
    
    public ArrayList<String> Requirements;
    public ArrayList<String> getRequirements() {
        return Requirements;
    }

    public void setRequirements(ArrayList<String> Requirements) {
        this.Requirements = Requirements;
    }

    public ArrayList<QC_Step> Steps;
    public ArrayList<QC_Step> getSteps() {
        return Steps;
    }

    public void setSteps(ArrayList<QC_Step> Steps) {
        this.Steps = Steps;
    }
    
    public ArrayList<TestValue> TestValues;

    public ArrayList<TestValue> getTestValues() {
        return TestValues;
    }

    public void setTestValues(ArrayList<TestValue> TestValues) {
        this.TestValues = TestValues;
    }
    
    public int GetNumberSteps;

    public int getGetNumberSteps() {
        return GetNumberSteps;
    }

    public void setGetNumberSteps(int GetNumberSteps) {
        this.GetNumberSteps = GetNumberSteps;
    }
    
    public String IDTest;

    public String getIDTest() {
        return IDTest;
    }

    public void setIDTest(String IDTest) {
        this.IDTest = IDTest;
    }


    public String TestName;

    public String getTestName() {
        return TestName;
    }

    public void setTestName(String TestName) {
        this.TestName = TestName;
    }


    public String Status;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }


    public String CurrentExecutionStatus;

    public String getCurrentExecutionStatus() {
        return CurrentExecutionStatus;
    }

    public void setCurrentExecutionStatus(String CurrentExecutionStatus) {
        this.CurrentExecutionStatus = CurrentExecutionStatus;
    }


    public String BusinessCriticality;

    public String getBusinessCriticality() {
        return BusinessCriticality;
    }

    public void setBusinessCriticality(String BusinessCriticality) {
        this.BusinessCriticality = BusinessCriticality;
    }

    public String Subject;

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }


    public String Description;

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }


    public String Designer;

    public String getDesigner() {
        return Designer;
    }

    public void setDesigner(String Designer) {
        this.Designer = Designer;
    }


    public String Comments;

    public String getComments() {
        return Comments;
    }

    public void setComments(String Comments) {
        this.Comments = Comments;
    }


    public String ExecutionDate;

    public String getExecutionDate() {
        return ExecutionDate;
    }

    public void setExecutionDate(String ExecutionDate) {
        this.ExecutionDate = ExecutionDate;
    }


    public String AbsolutePath;

    public String getAbsolutePath() {
        return AbsolutePath;
    }

    public void setAbsolutePath(String AbsolutePath) {
        this.AbsolutePath = AbsolutePath;
    }

    public ArrayList<QC_Attachments> Attachments;

    public ArrayList<QC_Attachments> getAttachments() {
        return Attachments;
    }

    public void setAttachments(ArrayList<QC_Attachments> Attachments) {
        this.Attachments = Attachments;
    }

    public void AddStep(QC_Step step)
    {
        if(!containsStep(listSteps, step.StepName))
        {
            listSteps.add(step);
        }
    }
    
    public void RemoveStep(QC_Step step)
    {
        if(containsStep(listSteps, step.StepName))
        {
            int intPosition = stepPosition(listSteps, step.StepName);
            listSteps.remove(intPosition);
        }    
    }
            
    public static boolean containsStep(ArrayList<QC_Step> list, String StepNameCheck) {
        for (QC_Step object : list) {
            if (object.StepName.equals(StepNameCheck)) {
                return true;
            }
        }
        return false;
    }
    
    public static int stepPosition(ArrayList<QC_Step> list, String StepNameCheck) {
        int Position = 0;
        for (QC_Step object : list) {
            if (object.StepName.equals(StepNameCheck)) {
                return Position;
            }
            Position++;
        }
        return 0;
    }
        
    public class Fields
    {
        public String ColumName;

        public String getColumName() {
            return ColumName;
        }

        public void setColumName(String ColumName) {
            this.ColumName = ColumName;
        }

        public String DisplayName;

        public String getDisplayName() {
            return DisplayName;
        }

        public void setDisplayName(String DisplayName) {
            this.DisplayName = DisplayName;
        }

        public String Type;

        public String getType() {
            return Type;
        }

        public void setType(String Type) {
            this.Type = Type;
        }

    }
    
    public class TestValue
    {
        public String Name;
        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public String Value;
        public String getValue() {
            return Value;
        }

        public void setValue(String Value) {
            this.Value = Value;
        }
    }
    
    public class RunCounts
    {
        private ArrayList<String> defects = new ArrayList<String>();

        public String FolderName;

        public String getFolderName() {
            return FolderName;
        }

        public void setFolderName(String FolderName) {
            this.FolderName = FolderName;
        }
        
        public int Total;

        public int getTotal() {
            return Total;
        }

        public void setTotal(int Total) {
            this.Total = Total;
        }
        
        public int Planned;

        public int getPlanned() {
            return Planned;
        }

        public void setPlanned(int Planned) {
            this.Planned = Planned;
        }
        
        public int NA;

        public int getNA() {
            return NA;
        }

        public void setNA(int NA) {
            this.NA = NA;
        }
        public int Run;

        public int getRun() {
            return Run;
        }

        public void setRun(int Run) {
            this.Run = Run;
        }
        public int NotRun;

        public int getNotRun() {
            return NotRun;
        }

        public void setNotRun(int NotRun) {
            this.NotRun = NotRun;
        }
        
        public int BlockingFails;

        public int getBlockingFails() {
            return BlockingFails;
        }

        public void setBlockingFails(int BlockingFails) {
            this.BlockingFails = BlockingFails;
        }
        
        public int def_BlockingFails;

        public int getDef_BlockingFails() {
            return def_BlockingFails;
        }

        public void setDef_BlockingFails(int def_BlockingFails) {
            this.def_BlockingFails = def_BlockingFails;
        }
        
        public String BlockingFails_IDs;

        public String getBlockingFails_IDs() {
            return BlockingFails_IDs;
        }

        public void setBlockingFails_IDs(String BlockingFails_IDs) {
            this.BlockingFails_IDs = BlockingFails_IDs;
        }
        
        public int Blocked;

        public int getBlocked() {
            return Blocked;
        }

        public void setBlocked(int Blocked) {
            this.Blocked = Blocked;
        }
        
        public int def_Blocked;

        public int getDef_Blocked() {
            return def_Blocked;
        }

        public void setDef_Blocked(int def_Blocked) {
            this.def_Blocked = def_Blocked;
        }
        
        public String Blocked_IDs;

        public String getBlocked_IDs() {
            return Blocked_IDs;
        }

        public void setBlocked_IDs(String Blocked_IDs) {
            this.Blocked_IDs = Blocked_IDs;
        }
        
        public int TotalFails;

        public int getTotalFails() {
            return TotalFails;
        }

        public void setTotalFails(int TotalFails) {
            this.TotalFails = TotalFails;
        }
  
        public int def_TotalFails;
                
        public int getDef_TotalFails() {
            return def_TotalFails;
        }

        public void setDef_TotalFails(int def_TotalFails) {
            this.def_TotalFails = def_TotalFails;
        }
        
        public String TotalFails_IDs;

        public String getTotalFails_IDs() {
            return TotalFails_IDs;
        }

        public void setTotalFails_IDs(String TotalFails_IDs) {
            this.TotalFails_IDs = TotalFails_IDs;
        }
        
        public int NewFails;

        public int getNewFails() {
            return NewFails;
        }

        public void setNewFails(int NewFails) {
            this.NewFails = NewFails;
        }
        
        public int def_NewFails;

        public int getDef_NewFails() {
            return def_NewFails;
        }

        public void setDef_NewFails(int def_NewFails) {
            this.def_NewFails = def_NewFails;
        }
        
        public String NewFails_IDs;

        public String getNewFails_IDs() {
            return NewFails_IDs;
        }

        public void setNewFails_IDs(String NewFails_IDs) {
            this.NewFails_IDs = NewFails_IDs;
        }
        
        public int OldFails;

        public int getOldFails() {
            return OldFails;
        }

        public void setOldFails(int OldFails) {
            this.OldFails = OldFails;
        }
        
        public int def_OldFails;

        public int getDef_OldFails() {
            return def_OldFails;
        }

        public void setDef_OldFails(int def_OldFails) {
            this.def_OldFails = def_OldFails;
        }
        
        public String OldFails_IDs;

        public String getOldFails_IDs() {
            return OldFails_IDs;
        }

        public void setOldFails_IDs(String OldFails_IDs) {
            this.OldFails_IDs = OldFails_IDs;
        }
        
        public int KnownFails;

        public int getKnownFails() {
            return KnownFails;
        }

        public void setKnownFails(int KnownFails) {
            this.KnownFails = KnownFails;
        }
        
        public int def_KnownFails;

        public int getDef_KnownFails() {
            return def_KnownFails;
        }

        public void setDef_KnownFails(int def_KnownFails) {
            this.def_KnownFails = def_KnownFails;
        }
        
        public String KnownFails_IDs;

        public String getKnownFails_IDs() {
            return KnownFails_IDs;
        }

        public void setKnownFails_IDs(String KnownFails_IDs) {
            this.KnownFails_IDs = KnownFails_IDs;
        }
        
        public int Pass;

        public int getPass() {
            return Pass;
        }

        public void setPass(int Pass) {
            this.Pass = Pass;
        }
        
        public ArrayList<String> Defects;

        public ArrayList<String> getDefects() {
            return Defects;
        }

        public void setDefects(ArrayList<String> Defects) {
            this.Defects = Defects;
        }     

    }
      
        
}
