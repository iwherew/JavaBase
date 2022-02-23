package learnArray;

import java.util.Arrays;

/**
 * 数组存储表格数据
 * */

public class TestArrayTableData {
    public static void main(String[] args) {
        Object[] emp1 = {1001,"Amadeus",18,"student","2020.08.01"};
        Object[] emp2 = {1002,"Iwhere",20,"student","2021.09.23"};
        Object[] emp3 = {1003,"Nanke",24,"boss","2022.11.21"};

        Object[][] tableData = new Object[3][];
        tableData[0] = emp1;
        tableData[1] = emp2;
        tableData[2] = emp3;

        for(Object[] item : tableData){
            System.out.println(Arrays.toString(item));
        }
    }
}
