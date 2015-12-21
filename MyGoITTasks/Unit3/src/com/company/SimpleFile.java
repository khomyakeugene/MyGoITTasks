package com.company;

import java.util.Date;

/**
 * Created by Yevgen on 20.12.2015.
 */
public class SimpleFile {
    private String fileName;
    private Date creationDate;
    private Date lastModifyDate;
    private String fileType = Const.UNKNOWN_FILE_TYPE;

    protected void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public SimpleFile(String fileName) {
        setFileName(fileName);
    }

    public SimpleFile(String fileName, String fileType) {
        setFileName(fileName);
        setFileType(fileType);
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void readFile() {
// Just a stub as an example
    }
}
