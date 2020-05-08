package com.unitTest;
import com.sql.matrix.orgCust.ClientSql;
import com.utils.jdbc.JDBC;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.actions.matrix.orgCust.OrgCustListAction;

import com.utils.print.PrintList;


public class JdbcTest
{
    static String driverClass="oracle.jdbc.driver.OracleDriver"; //oracle的驱动
    static String url="jdbc:oracle:thin:@10.189.101.32:1521:JEPLUSDB";  //连接oracle路径方式 “”gfs“”是要建立连接的数据库名 1521端口
    static String user="g_matrix";   //user是数据库的用户名
    static String password="g_matrix";  //用户登录密码


    @Test
    public void sd2fsdf(){
        String string = JDBC.getSqlResultStr(ClientSql.getSql3("13200000006"));
        System.out.println(string);
    }


    @Test
    public void teeeee() throws SQLException, ClassNotFoundException {
        String[] a = JDBC.getPagination(3,30);
        for(String s:a){
            System.out.println(s);
        }
    }



    @Test
    public void sdfsdf(){
        String sql = "select cust_name from (select * from cust_info order by dbms_random.value) where rownum=1";
        System.out.println(OrgCustListAction.getSqlResultStr(sql));
    }


    @Test
    public void teeeee2() throws SQLException, ClassNotFoundException {
        String sql="select *\n" +
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
                "                       gtja_username as 客户经理\n" +
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
                "                 where 1 = 1 \n" +
                "                 order by nvl(sy_modifytime, '0') desc) tmp\n" +
                "         where 2 = 2  and rownum < 31)\n" +
                " where 3 = 3  and row_id > 0\n";


        JDBC.getResultToList(sql);
    }




    public static void getconn() throws SQLException, ClassNotFoundException {  //为了方便下面的讲解，这里专门建立了一个用于数据库连接的一个方法
        Connection connection=null;


            //首先建立驱动
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //驱动成功后进行连接
            connection=DriverManager.getConnection(url, user, password);

            System.out.println("连接成功");

        String sql="select * from (select * from cust_info order by dbms_random.value) where rownum=1 ";


        Statement cs = connection.createStatement();

        ResultSet rs = cs.executeQuery(sql);
        ResultSetMetaData rsmd = rs.getMetaData();
        int colCount = rsmd.getColumnCount();
        System.out.println(colCount);
        //System.out.println(rsmd.getColumnName(0));
        for (int i = 1; i <=colCount ; i++) {
            System.out.println(rsmd.getColumnName(i));

        }

        while(rs.next()){
            for (int i = 1; i <=colCount ; i++) {
                String a=rs.getString(i);

                //String b=rs.getString(2);

                System.out.println(a+"-------");

            }


        }

        rs.close();

        cs.close();

        connection.close();


        //return connection; //返回一个连接


    }



    @Test
    public void testss(){
        List<List<String>> list = new ArrayList<>();
        String sql="select \n" +
                "rownum as 编号 ,     \n" +
                "case adju_status \n" +
                "when 'TC' then '调出'  \n" +
                "when 'TR' then '调入'\n" +
                "else adju_status end as 调整状态 , --调出 TC, 调入, TR  \n" +
                "oa_username as OA账号,\n" +
                "cust_name as 客户名称,\n" +
                "custhistory_grade_name as 客户级别,\n" +
                "case list_type\n" +
                "when '1' then '战略客户名单'\n" +
                "when '2' then '协同客户名单'\n" +
                "else list_type end  as 名单类型, ---战略客户名单 1, 协同客户名单 2\n" +
                "cust_date as 调整日期,\n" +
                "oper_username as 操作人,\n" +
                "msg as 调整理由\n" +
                " from MR_CM_CUSTHISTORY";

            list=JDBC.getResultToList(sql);

        System.out.println("**********************");
        PrintList.printList(list);
    }



    @Test
    public void teststst(){
        String sql = "select cust_name from (select * from cust_info order by dbms_random.value) where rownum=1";
        String a = OrgCustListAction.getSqlResultStr(sql);
        System.out.println();
        System.out.println(a);
        System.out.println("______________");
        a = OrgCustListAction.getSqlResultStr(sql);
        System.out.println();
        System.out.println(a);
        System.out.println("______________");
        a = OrgCustListAction.getSqlResultStr(sql);
        System.out.println();
        System.out.println(a);
        System.out.println("______________");
    }


    @Test
    public void sggsg(){

        System.out.println(JDBC.getWhereLike("客户名称","上海重阳战略投资有限公司"));

    }

}
