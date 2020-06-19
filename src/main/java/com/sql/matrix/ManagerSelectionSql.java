package com.sql.matrix;

import com.utils.jdbc.JDBC;
import lombok.Data;

@Data
public class ManagerSelectionSql {

    private String managerNameSql =
            "select 员工姓名\n" +
                    "  from (select username as 员工姓名\n" +
                    "          from VP_RESEARCH_TEAM_ALL\n" +
                    "         where status = '1'\n" +
                    "         order by dbms_random.value)\n" +
                    " where rownum = 1";

    private String managerCodeSql =
            "select 员工工号\n" +
                    "  from (select usercode as 员工工号\n" +
                    "          from VP_RESEARCH_TEAM_ALL\n" +
                    "         where status = '1'\n" +
                    "         order by dbms_random.value)\n" +
                    " where rownum = 1";

    public String getManagerName(){
        return JDBC.getSqlResultStr(getManagerNameSql());
    }

    public String getManagerCode(){
        return JDBC.getSqlResultStr(getManagerCodeSql());
    }

}
