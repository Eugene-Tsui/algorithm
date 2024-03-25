package org.example;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import lombok.Data;

import java.util.Date;

@Data
public class UserData {

    @ExcelProperty(index = 0, value = "姓名")
    private String username;

    @ExcelProperty(index = 1, value = "年龄")
    private int age;

    @DateTimeFormat("yyyy-MM-dd")
    @ExcelProperty(index = 2, value = "生日")
    private Date birthday;
}
