package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        String multiplicationTable = builder.generateMultiplicationTable(start, end);
        System.out.println(multiplicationTable);
    }

    public String generateMultiplicationTable(int start, int end) {
        String multiplicationTable="";

        return multiplicationTable;
    }
    public boolean checkValidation(int start,int end){
        boolean validation=checkIsSmallerThanEnd(start,end)&&checkIsRangeOfScope(start)&&checkIsRangeOfScope(end);
        return validation;
    }

    public boolean checkIsSmallerThanEnd(int start,int end){
        boolean isSmallerThanEnd=start<=end;
        return  isSmallerThanEnd;
    }
    public boolean checkIsRangeOfScope(int number){
        boolean isRangeOfScope=number>1&&number<=1000;
        return isRangeOfScope;
    }







}
