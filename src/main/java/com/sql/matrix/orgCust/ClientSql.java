package com.sql.matrix.orgCust;

public class ClientSql {


    private final static String sql1 =
            "select 客户名称\n" +
                    "  from (select cust_name as 客户名称\n" +
                    "          from cust_info_all\n" +
                    "         where cust_name is not null\n" +
                    "         order by dbms_random.value)\n" +
                    " where rownum = 1\n";

    public static String getSql1() {
        return sql1;
    }


    private final static String sql2 =
            "select 员工姓名\n" +
                    "  from (select username as 员工姓名\n" +
                    "          from je_core_enduser\n" +
                    "         where username is not null\n" +
                    "         and status = '1'\n" +
                    "         order by dbms_random.value)\n" +
                    " where rownum = 1";

    public static String getSql2() {
        return sql2;
    }


    private final static String sql3 = "select count(*) from cust_contact where mobile = ''";

    public static String getSql3(String mobile) {
        String sql = sql3.replace("''", "'" + mobile + "'");
        return sql;
    }

    private final static String sql4 =
            "select *\n" +
                    "  from (select rownum as row_id, tmp.*\n" +
                    "          from (select contact_name as 联系人姓名,\n" +
                    "                       MOBILE as 手机,\n" +
                    "                       cust_name as 客户名称,\n" +
                    "                       cust_oa as OA账号,\n" +
                    "                       titile as 职务,\n" +
                    "                       contact_dept as 部门,\n" +
                    "                       email as 邮箱,\n" +
                    "                       replace_code_with_name(open_dhapp,'MR_YESORNO') as 开通道合APP, \n" +
                    "                       dhapp_deadline as 道合APP有效期,\n" +
                    "                       business_typename as 业务条线,\n" +
                    "                       gtja_username as 客户经理,\n" +
                    "                       sy_modifytime as 更新时间,\n" +
                    "                       createuser_name as 创建人\n" +
                    "                  from (select *\n" +
                    "                          from (select lxr.id AS ID,\n" +
                    "                                       lxr.\"CUST_ID\",\n" +
                    "                                       lxr.\"EMAIL\",\n" +
                    "                                       lxr.\"TEL\",\n" +
                    "                                       lxr.\"CONTACT_NAME\",\n" +
                    "                                       lxr.\"WEBCHAT\",\n" +
                    "                                       lxr.\"MOBILE\",\n" +
                    "                                       lxr.\"TITILE\",\n" +
                    "                                       lxr.\"BUSI_TYPE\",\n" +
                    "                                       lxr.createuser_id,\n" +
                    "                                       lxr.sy_modifyuserid,\n" +
                    "                                       jce.username createuser_name,\n" +
                    "                                       cust.CUST_NAME,\n" +
                    "                                       cust.STATUS CUST_STATUS,\n" +
                    "                                       cust.CUST_OA,\n" +
                    "                                       cust.CUST_TYPE,\n" +
                    "                                       cust.CUST_MANAGER,\n" +
                    "                                       cust.AREA,\n" +
                    "                                       cust.SHORT_NAME,\n" +
                    "                                       cust.IS_CHECKED,\n" +
                    "                                       cust.CUST_GRADE,\n" +
                    "                                       '' AS user_id,\n" +
                    "                                       lxr.contact_fax,\n" +
                    "                                       lxr.contact_dept,\n" +
                    "                                       lxr.gtja_userid,\n" +
                    "                                       lxr.gtja_username,\n" +
                    "                                       lxr.business_typecode,\n" +
                    "                                       lxr.contact_type,\n" +
                    "                                       lxr.business_typename,\n" +
                    "                                       lxr.teamname,\n" +
                    "                                       lxr.TEAMID,\n" +
                    "                                       lxr.open_dhapp,\n" +
                    "                                       lxr.dhapp_deadline,\n" +
                    "                                       lxr.sy_modifytime,\n" +
                    "                                       jc.USERNAME AS SY_MODIFYUSERNAME,\n" +
                    "                                       lxr.contact_bgdz\n" +
                    "                                  from VP_ALL_CUST_CONTACTS lxr\n" +
                    "                                  join cust_info_all cust\n" +
                    "                                    on cust.CUST_ID = lxr.CUST_ID\n" +
                    "                                  LEFT JOIN MR_TEAM CTM\n" +
                    "                                    ON cust.CUST_MANAGER_TYPE_CODE = 1\n" +
                    "                                   AND cust.CUST_MANAGER = CTM.MR_TEAM_ID\n" +
                    "                                  join je_core_enduser jce\n" +
                    "                                    on lxr.createuser_id = jce.userid\n" +
                    "                                  left join je_core_enduser jc\n" +
                    "                                    on lxr.SY_MODIFYUSERID = jc.userid\n" +
                    "                                 where 'basic' = 'basic'\n" +
                    "                                   and exists\n" +
                    "                                 (select /*+ index(ul, IDX_USER_LEADER1) */\n" +
                    "                                         1\n" +
                    "                                          from user_leader_all ul\n" +
                    "                                         where ul.user_id = lxr.createuser_id\n" +
                    "                                           and ul.leader_id =\n" +
                    "                                               'QsgDu2hPKL9rAJB8iI1')\n" +
                    "                                union\n" +
                    "                                select lxr.id AS ID,\n" +
                    "                                       lxr.\"CUST_ID\",\n" +
                    "                                       lxr.\"EMAIL\",\n" +
                    "                                       lxr.\"TEL\",\n" +
                    "                                       lxr.\"CONTACT_NAME\",\n" +
                    "                                       lxr.\"WEBCHAT\",\n" +
                    "                                       lxr.\"MOBILE\",\n" +
                    "                                       lxr.\"TITILE\",\n" +
                    "                                       lxr.\"BUSI_TYPE\",\n" +
                    "                                       lxr.createuser_id,\n" +
                    "                                       lxr.sy_modifyuserid,\n" +
                    "                                       jce.username createuser_name,\n" +
                    "                                       cust.CUST_NAME,\n" +
                    "                                       cust.STATUS CUST_STATUS,\n" +
                    "                                       cust.CUST_OA,\n" +
                    "                                       cust.CUST_TYPE,\n" +
                    "                                       cust.CUST_MANAGER,\n" +
                    "                                       cust.AREA,\n" +
                    "                                       cust.SHORT_NAME,\n" +
                    "                                       cust.IS_CHECKED,\n" +
                    "                                       cust.CUST_GRADE,\n" +
                    "                                       '' AS user_id,\n" +
                    "                                       lxr.contact_fax,\n" +
                    "                                       lxr.contact_dept,\n" +
                    "                                       lxr.gtja_userid,\n" +
                    "                                       lxr.gtja_username,\n" +
                    "                                       lxr.business_typecode,\n" +
                    "                                       lxr.contact_type,\n" +
                    "                                       lxr.business_typename,\n" +
                    "                                       lxr.teamname,\n" +
                    "                                       lxr.TEAMID,\n" +
                    "                                       lxr.open_dhapp,\n" +
                    "                                       lxr.dhapp_deadline,\n" +
                    "                                       lxr.sy_modifytime,\n" +
                    "                                       jc.USERNAME AS SY_MODIFYUSERNAME,\n" +
                    "                                       lxr.contact_bgdz\n" +
                    "                                  from VP_ALL_CUST_CONTACTS lxr\n" +
                    "                                  join cust_info_all cust\n" +
                    "                                    on cust.CUST_ID = lxr.CUST_ID\n" +
                    "                                  LEFT JOIN MR_TEAM CTM\n" +
                    "                                    ON cust.CUST_MANAGER_TYPE_CODE = 1\n" +
                    "                                   AND cust.CUST_MANAGER = CTM.MR_TEAM_ID\n" +
                    "                                  join je_core_enduser jce\n" +
                    "                                    on lxr.createuser_id = jce.userid\n" +
                    "                                  left join je_core_enduser jc\n" +
                    "                                    on lxr.SY_MODIFYUSERID = jc.userid\n" +
                    "                                 where 'basic' = 'basic'\n" +
                    "                                   and exists\n" +
                    "                                 (select /*+ index(ul, IDX_USER_LEADER1) */\n" +
                    "                                         1\n" +
                    "                                          from user_leader_all ul\n" +
                    "                                         where ul.user_id = (case\n" +
                    "                                                 when CUST.CUST_MANAGER_TYPE_CODE = '1' then\n" +
                    "                                                  CTM.TEAM_FZRID\n" +
                    "                                                 else\n" +
                    "                                                  CUST.CUST_MANAGER\n" +
                    "                                               end)\n" +
                    "                                           and ul.leader_id =\n" +
                    "                                               'QsgDu2hPKL9rAJB8iI1')\n" +
                    "                                union\n" +
                    "                                select lxr.id AS ID,\n" +
                    "                                       lxr.\"CUST_ID\",\n" +
                    "                                       lxr.\"EMAIL\",\n" +
                    "                                       lxr.\"TEL\",\n" +
                    "                                       lxr.\"CONTACT_NAME\",\n" +
                    "                                       lxr.\"WEBCHAT\",\n" +
                    "                                       lxr.\"MOBILE\",\n" +
                    "                                       lxr.\"TITILE\",\n" +
                    "                                       lxr.\"BUSI_TYPE\",\n" +
                    "                                       lxr.createuser_id,\n" +
                    "                                       lxr.sy_modifyuserid,\n" +
                    "                                       jce.username createuser_name,\n" +
                    "                                       cust.CUST_NAME,\n" +
                    "                                       cust.STATUS CUST_STATUS,\n" +
                    "                                       cust.CUST_OA,\n" +
                    "                                       cust.CUST_TYPE,\n" +
                    "                                       cust.CUST_MANAGER,\n" +
                    "                                       cust.AREA,\n" +
                    "                                       cust.SHORT_NAME,\n" +
                    "                                       cust.IS_CHECKED,\n" +
                    "                                       cust.CUST_GRADE,\n" +
                    "                                       '' AS user_id,\n" +
                    "                                       lxr.contact_fax,\n" +
                    "                                       lxr.contact_dept,\n" +
                    "                                       lxr.gtja_userid,\n" +
                    "                                       lxr.gtja_username,\n" +
                    "                                       lxr.business_typecode,\n" +
                    "                                       lxr.contact_type,\n" +
                    "                                       lxr.business_typename,\n" +
                    "                                       lxr.teamname,\n" +
                    "                                       lxr.TEAMID,\n" +
                    "                                       lxr.open_dhapp,\n" +
                    "                                       lxr.dhapp_deadline,\n" +
                    "                                       lxr.sy_modifytime,\n" +
                    "                                       jc.USERNAME AS SY_MODIFYUSERNAME,\n" +
                    "                                       lxr.contact_bgdz\n" +
                    "                                  from VP_ALL_CUST_CONTACTS lxr\n" +
                    "                                  join cust_info_all cust\n" +
                    "                                    on cust.CUST_ID = lxr.CUST_ID\n" +
                    "                                  LEFT JOIN MR_TEAM CTM\n" +
                    "                                    ON cust.CUST_MANAGER_TYPE_CODE = 1\n" +
                    "                                   AND cust.CUST_MANAGER = CTM.MR_TEAM_ID\n" +
                    "                                  join je_core_enduser jce\n" +
                    "                                    on lxr.createuser_id = jce.userid\n" +
                    "                                  left join je_core_enduser jc\n" +
                    "                                    on lxr.SY_MODIFYUSERID = jc.userid\n" +
                    "                                 where 'basic' = 'basic'\n" +
                    "                                   and exists\n" +
                    "                                 (select /*+ index(ul, IDX_USER_LEADER1) */\n" +
                    "                                         1\n" +
                    "                                          from user_leader_all ul\n" +
                    "                                         where ul.user_id = lxr.gtja_userid\n" +
                    "                                           and ul.leader_id =\n" +
                    "                                               'QsgDu2hPKL9rAJB8iI1')) a)\n" +
                    "                 where 1 = 1\n" +
                    "                 order by nvl(sy_modifytime, '0') desc) tmp\n" +
                    "         where 2 = 2)\n" +
                    " where 3 = 3\n";





    public static String getSql4() {
        String sql = sql4;
        return sql;
    }

    public static String getSql4(String[] pagination,String where,String whereLike, String order){
        String sql;
        sql = ClientSql.getSql4();//拼上分页语句

        String pagination1 = pagination[0];

        String pagination2 = pagination[1];

        sql = sql.replaceFirst("where 2 = 2", "where 2 = 2 " + pagination1);
        sql = sql.replaceFirst("where 2=2", "where 2 = 2 " + pagination1);
        sql = sql.replaceFirst("where 3 = 3", "where 3 = 3 " + pagination2);
        sql = sql.replaceFirst("where 3=3", "where 3 = 3 " + pagination2);
        if (!where.equals("")) {
            sql = sql.replaceFirst("where 1 = 1", "where 1 = 1 " + where + order);
            sql = sql.replaceFirst("where 1=1", "where 1 = 1 " + where + order);
        } else {
            sql = sql.replaceFirst("where 1 = 1", "where 1 = 1 " + whereLike + order);
            sql = sql.replaceFirst("where 1=1", "where 1 = 1 " + whereLike + order);
        }


        return sql;
    }



}
