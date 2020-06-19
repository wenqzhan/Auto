package com.sql.matrix.research.client;

import com.utils.jdbc.JDBC;
import com.utils.random.Randoms;
import lombok.Data;

@Data
public class ClientListSql {


    private String sqlCustName = "select cust_name from (select * from MR_CM_CUSTSERVICEINFO a left join cust_info_all b on a.cust_id = b.cust_id order by dbms_random.value) where rownum=1";


    private String sqlCustNameNotInCustServiceInfo = "select cust_name from (select * from cust_info_all where cust_id not in (select a.cust_id from MR_CM_CUSTSERVICEINFO_V a left join cust_info_all b on a.cust_id = b.cust_id ) order by dbms_random.value ) where rownum=1";

    private String sqlDueDate = "select CUSTSERVICEINFO_yjfwdqr from (select * from MR_CM_CUSTSERVICEINFO_V where CUSTSERVICEINFO_yjfwdqr is not null order by dbms_random.value) where rownum=1";

    private String sqlZBManager = "select CUSTSERVICEINFO_khjl_name from (select * from MR_CM_CUSTSERVICEINFO_V where CUSTSERVICEINFO_khjl_name is not null order by dbms_random.value) where rownum=1";

    private String sqlXBManager = "select CUSTSERVICEINFO_xbkhjl_name from (select * from MR_CM_CUSTSERVICEINFO_V where CUSTSERVICEINFO_xbkhjl_name is not null order by dbms_random.value) where rownum=1";

    private String sqlTeam = "select ser_team_name from (select * from MR_CM_CUSTSERVICEINFO_V where ser_team_name is not null order by dbms_random.value) where rownum=1";

    private String sqlUSCC = "select id_tyyx from (select * from MR_CM_CUSTSERVICEINFO_V where id_tyyx is not null order by dbms_random.value) where rownum=1";

    private String sqlLevelName = "select level_name from (select distinct(level_name) from MR_CM_CUSTSERVICEINFO_V where level_name is not null order by dbms_random.value) where rownum=1";

    private String sqlCustNameNotInCustServiceInfoWithCustLevel = "select cust_name\n" +
            "  from (select *\n" +
            "          from cust_info_all\n" +
            "         where   level_id is not null and cust_id not in (select a.cust_id\n" +
            "                                 from MR_CM_CUSTSERVICEINFO_V a\n" +
            "                                 left join cust_info_all b\n" +
            "                                   on a.cust_id = b.cust_id)\n" +
            "         order by dbms_random.value)\n" +
            " where rownum = 1";



    private String getSqlResultStr(String sql) {
        return JDBC.getSqlResultStr(sql);

    }

    public String getSqlCustNameResultStr() {
        return getSqlResultStr(getSqlCustName());
    }

    public String getSqlCustNameNotInCustServiceInfoResultStr() {
        return getSqlResultStr(getSqlCustNameNotInCustServiceInfo());
    }

    public String getSqlDueDateResultStr() {
        return getSqlResultStr(getSqlDueDate());
    }

    public String getSqlZBManagerResultStr() {
        return getSqlResultStr(getSqlZBManager());
    }

    public String getSqlXBManagerResultStr() {
        return getSqlResultStr(getSqlXBManager());
    }

    public String getSqlManagerResultStr() {
        String manager;
        String[] xbManagers = getSqlXBManagerResultStr().split(",");
        String zbManager = getSqlZBManagerResultStr();
        int length = xbManagers.length;
        int random = Randoms.getRandomNum(0, length);
        if (random == length) {
            manager = zbManager;
        } else {
            manager = xbManagers[random];
        }
        return manager;
    }

    public String getSqlTeamResultStr() {
        String team;
        String[] teams = getSqlResultStr(getSqlTeam()).split(",");
        int length = teams.length;
        int random = Randoms.getRandomNum(0, length - 1);
        team = teams[random];
        return team;
    }

    public String getSqlLevelNameResultStr(){
        return getSqlResultStr(getSqlLevelName());
    }

    public String getSqlUSCCResultStr() {
        return getSqlResultStr(getSqlUSCC());
    }

    public String getSqlCustNameNotInCustServiceInfoWithCustLevelResultStr(){
        return getSqlResultStr(getSqlCustNameNotInCustServiceInfoWithCustLevel());
    }

}
