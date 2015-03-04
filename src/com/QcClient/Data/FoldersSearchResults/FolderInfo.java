/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QcClient.Data.FoldersSearchResults;

/**
 *
 * @author kostenko
 */
public class FolderInfo {
    public String FolderId;
    
    public String getFolderId() {
        return FolderId;
    }

    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }
    
    public String FullPath;

    public String getFullPath() {
        return FullPath;
    }

    public void setFullPath(String FullPath) {
        this.FullPath = FullPath;
    }
    
    public boolean WasCreated;

    public boolean isWasCreated() {
        return WasCreated;
    }

    public void setWasCreated(boolean WasCreated) {
        this.WasCreated = WasCreated;
    }   
}
