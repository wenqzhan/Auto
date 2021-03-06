package com.sql.matrix;

import com.utils.jdbc.JDBC;

public class EmpSelectionSql {


    private final static String empNameSql =
            "select 员工姓名\n" +
                    "  from (select username as 员工姓名\n" +
                    "          from je_core_enduser\n" +
                    "         where username is not null\n" +
                    "         and status = '1'\n" +
                    "         order by dbms_random.value)\n" +
                    " where rownum = 1";

    public static String getEmpNameSql() {
        return empNameSql;
    }


    private final static String sql1 =
            "select 员工工号\n" +
                    "  from (select usercode as 员工工号\n" +
                    "          from je_core_enduser\n" +
                    "         where username is not null\n" +
                    "         and status = '1'\n" +
                    "         order by dbms_random.value)\n" +
                    " where rownum = 1";

    public static String getSql1() {
        return sql1;
    }

    public static String getEmpName(){
        return JDBC.getSqlResultStr(empNameSql);
    }


}
