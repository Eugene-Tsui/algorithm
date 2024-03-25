package org.example;

import com.alibaba.excel.EasyExcel;

public class EasyExcelReadDemo {

    public static void main(String[] args) {
        // 实现excel写操作
        //1.设置写入文件夹地址和excel文件名称
        String fileName = "F:/project/algorithm/Demo/write.xlsx";
        //调用easyExcel里面的方法实现写操作
        //2个参数，第一个参数是文件名称，第二个参数是实体类
        EasyExcel.read(fileName, UserData.class, new ExcelListener()).sheet().doRead();
    }
}