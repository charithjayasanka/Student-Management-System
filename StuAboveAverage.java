package com.cw;


public class StuAboveAverage implements Comparable <StuAboveAverage>
{
    private String regNo, fName, lName;
    private int ict1mark, ict2mark, grpcw1mark, grpcw2mark,ovrModulemarks;
    private Grade grade; private boolean reSit,reTake;

    public StuAboveAverage(String regNo, String fName, String lName, int ict1mark, int ict2mark, int grpcw1mark, int grpcw2mark, int ovrModulemarks, Grade grade, boolean reSit, boolean reTake) {
        this.regNo = regNo;
        this.fName = fName;
        this.lName = lName;
        this.ict1mark = ict1mark;
        this.ict2mark = ict2mark;
        this.grpcw1mark = grpcw1mark;
        this.grpcw2mark = grpcw2mark;
        this.ovrModulemarks = ovrModulemarks;
        this.grade = grade;
        this.reSit = reSit;
        this.reTake = reTake;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getIct1mark() {
        return ict1mark;
    }

    public void setIct1mark(int ict1mark) {
        this.ict1mark = ict1mark;
    }

    public int getIct2mark() {
        return ict2mark;
    }

    public void setIct2mark(int ict2mark) {
        this.ict2mark = ict2mark;
    }

    public int getGrpcw1mark() {
        return grpcw1mark;
    }

    public void setGrpcw1mark(int grpcw1mark) {
        this.grpcw1mark = grpcw1mark;
    }

    public int getGrpcw2mark() {
        return grpcw2mark;
    }

    public void setGrpcw2mark(int grpcw2mark) {
        this.grpcw2mark = grpcw2mark;
    }

    public int getOvrModulemarks() {
        return ovrModulemarks;
    }

    public void setOvrModulemarks(int ovrModulemarks) {
        this.ovrModulemarks = ovrModulemarks;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public boolean isReSit() {
        return reSit;
    }

    public void setReSit(boolean reSit) {
        this.reSit = reSit;
    }

    public boolean isReTake() {
        return reTake;
    }

    public void setReTake(boolean reTake) {
        this.reTake = reTake;
    }

    @Override
    public int compareTo(StuAboveAverage o) {
        return 0;
    }
}
