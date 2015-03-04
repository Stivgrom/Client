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
public class FoldersSearchResults {   
    public String LastFolderId;
    public String getLastFolderId() {
        return LastFolderId;
    }
    public void setLastFolderId(String LastFolderId) {
        this.LastFolderId = LastFolderId;
    }   
    public boolean WasFound;
    public boolean getWasFound() {
        return WasFound;
    }
    public void setWasFound(boolean WasFound) {
        this.WasFound = WasFound;
    }   
    public String FullPath;
    public String getFullPath() {
        return FullPath;
    }
    public void setFullPath(String FullPath) {
        this.FullPath = FullPath;
    }
}
