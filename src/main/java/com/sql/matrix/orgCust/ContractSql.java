package com.sql.matrix.orgCust;

public class ContractSql {

    private static String sql1 = "select cust_name 客户名称\n" +
            "  from (select cust_name\n" +
            "          from V_CUST_BUSI_CHANCE\n" +
            "         where sy_createuserid = 'tttt'\n" +
            "         order by dbms_random.value)\n" +
            " where rownum = 1";

    public static String getSql1(String userID) {
        String sql = sql1;

        sql = sql.replaceFirst("tttt",userID);

        return sql;
    }
}
