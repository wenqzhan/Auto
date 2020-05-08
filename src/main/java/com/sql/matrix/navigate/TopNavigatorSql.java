package com.sql.matrix.navigate;

public class TopNavigatorSql {

    private static String sql1="select userid\n" +
            "  from je_core_enduser";

    public static String getSql1(String userCode, String userName) {
        String sql = sql1;

        sql = sql1 + " where usercode ='" +
                userCode + "'\n" + "and username = '" +
                userName + "'";

        return sql;
    }
}
