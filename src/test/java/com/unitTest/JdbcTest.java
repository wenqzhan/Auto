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
    private OrgCustListAction orgCustListAction = new OrgCustListAction();
    static String driverClass="oracle.jdbc.driver.OracleDriver"; //oracle的驱动
    static String url="jdbc:oracle:thin:@10.189.101.32:1521:JEPLUSDB";  //连接oracle路径方式 “”gfs“”是要建立连接的数据库名 1521端口
    static String user="g_matrix";   //user是数据库的用户名
    static String password="g_matrix";  //用户登录密码


    @Test
    public void dfsadfsaf(){
        String a = "UPDATE MR_LEARN_TRAIN\n" +
                "   set TITLE    = '应用案例@1591165540725',\n" +
                "       DESCRIBE = '应用案例汽环绷缔莎火非说竹慕伤游净双樊延娘弗澜踊残酉形泻锁啤沸郴匡宰膛融蚌奔疽淋涟老粟绿办悼晴花览纠聋怔焕命多绊畸奠抬扒瓮船广弊在借慑邓古搔比修兑镣辅帘铁火贺氟荔阉询唁尝摧胖塞绷猜沂姑焙项膀某余瓶蜕橙迫惭稀哟内昂赁铭丸篓吸涕创蠕硒漆岭茄筏泌怠梨瞪仓藕捎促炽忘信怠膝澡炉定彬腑馁寸巩盛稚酉股艇粥寻较@1591165544065',\n" +
                "       \n" +
                "       CATEGORY = '0',\n" +
                "       CONTENT  = '<p>应用案例矿槐之评糠廷弦胃亚脸秧孕慕随赠大伊邵讳湛体虾燥限探掀耀抑疟拿坪谨泳献破盒胖囱绘躁娶鲤朝惟镇泌损勃锡簧竖脐鹊妥椒砂澎渗捆晶实讯陵凯搏智湃震且晦平肌忘使臻娟剁雇否鞭症内鉴嗡茫鹤拐咖衍鲁偿吕亥噎乖鹤瘤计分盏萄粮舍纷彬掌荣春搂粗枯塞昧蛀饥啸仇频猫街屎枢任嚎陨劈尼脸澳春瞅萤琅钒拄辛犁邯痒烩俭流蔼赎歪冗牡疮桨疹旗阅努黄纲贺捧喳纯尖楔泡令绍痘板咸溅舵靛弓柜沽玛趟块啪砌晕粘烂顷幌奴括税纫谢侩琶碳猛剃看诀汗乓侣暇炉贤潞论锄棱坷围宜章挎搀炔化常煎泞勾埃奴雀赁勤操局梁滁潮煞尾将楔韶砾烤均驶洋执年拦颗刑疯拎衷饯关谐厘县勋堂民傲闭岸譬睛猩轩皿架蓝聪唬陛忻柯锐详贬羚晃仍暑漏球闲瓷贱汝引扮丹抚蔼煤男帆蟹亩谎蹋轰报撬舵蝗柄远乙篡芭兔莹窍霸屉羡送惠潜绝猩嗽慨箍乎衅段肋满东火仁颠哉蚊芋岛镭馋医夜初惨杉竖货需沏隔赔貌瘫脉咽役酣喘豢闻趟蔷样邢纹灭淌垒篓绊嫉舅球冉篓飘虐肤漏呀渐摈百擎扯叼辨洁绽瞒具他沏梆丙翅娃可客拴迟倔歇淆恫乙恫超臂泡惭尿歇调捍蓟进克批翌箭巩稼温签观绩动异靳哗挝牛界虱焙俩勾读睡戚搀馏寅狠赔泞税介矽贵耗胶侦匆谤振脖鸦纺戌太抑偏酮沂奖纲懊纯缠酬吠曾盯猩俩衷射灯飘插亏诣葱疯京炔罚坯明使叭柬斤鳖睁吝继荆拦插严犊逸浚锰锻仅志氦娩雪宇勇搁宇休蛀儿肌陵累兽耕床泌沿粪袜每乘颠烯颂淆侄右忻豁钢珐默递小卯苯卸遥挠磋峭拇厩昔岭宽谰添蹲骋释泉雅榆汛头睛蛛荤郡腕舔茫洒赣密矾神蜡纳均铭狗糜殉览首推僚紊逃傅蹬顿森巫民瀑锁刑踊软署乍队瓮盈落宫咸锤月误系柏尸铱梭刺瞅率辽烘栖居百褒获掩姚胳赖晒汕混扛虽确钞孩爹要则郝蒋萧蠕命缅浅蹈袍肆厢晤物郊奈邀茵荤钞棵婴壳兵瑚褒檄讫诵成全棵脓扰杭呆郑云陷嚣饥埂漾糜啮槐卫也炔沮宿艺严召萤柔饿臭湍狗厄赞雹颖宝亨蒋栖随多哲拂即酚徊忌唐枝那怠亚鲍只扣驰汲警博详巾拣股达妖锚窃揭姚盐戒蒸妄剿詹挚欲税巧场肯棱诲琵亭捧芝抑潘薄玉姆迹傣唆颤彦抉坤滚蓉殃动叮唤瘫凑行维间包奸疫柏廓诈吮臣参馆令泡滨茧俊烽赃删惹掏貌颅击进淖碳卞蓟椒键皂衡劲喷礼擦宠隘姨茬棉许侯锦滴束戴擒悄陀烙窍饭叼镁咸踩说忱茄乱煤棘炸岂徽墨岭许天滑义跨展幅讫襟汝刊罗郎昧遍焙闺晴屈咎播前忿框赋跳瞎鸭属少菊幌橡拦垛蹦匆咏次娃鲁狭嚷寞瘴迭唁迁角昂产皇驾凯崎奶原铆享大风刮过过过过过过过过过过过过过过过过过过过过过过过过过嘎嘎嘎嘎嘎过嘎嘎嘎嘎嘎过嘎嘎嘎嘎嘎过嘎嘎嘎嘎嘎过嘎嘎嘎嘎嘎过嘎嘎嘎嘎嘎过古古怪怪古古怪怪嘎过古古怪怪古古怪怪嘎过古古怪444444怪2</p>',\n" +
                "       \n" +
                "       DISPALY_SETTING   = '',\n" +
                "       TOP_ORDER         = '-1',\n" +
                "       ACCESSORY         = '[{\"id\":\"bb8ed18dbe8cdd3c452fedc6c8705856\",\"cls\":\"JE_FTYPE_JPG16\",\"bigCls\":\"JE_FTYPE_JPG48\",\"name\":\"jpux1yjjpk3.jpg\",\"path\":\"/JE/data/upload/202006/jpux1yjjpk3_e2ece6edf9b94b40890921bdaeffc770.jpg\"}, {\"id\":\"f3dc72b27c9de7ffc8396622f5071b6c\",\"cls\":\"JE_FTYPE_JPG16\",\"bigCls\":\"JE_FTYPE_JPG48\",\"name\":\"xyir4aqlmrl.jpg\",\"path\":\"/JE/data/upload/202006/xyir4aqlmrl_b893762657564bc59bbe8252f5447ee8.jpg\"}, {\"id\":\"58551965dea7cf88b8dee6a9a932754a\",\"cls\":\"JE_FTYPE_JPG16\",\"bigCls\":\"JE_FTYPE_JPG48\",\"name\":\"1pjzqntsell.jpg\",\"path\":\"/JE/data/upload/202006/1pjzqntsell_608b0c490b784e91a1a9e52e79dab67d.jpg\"}, {\"id\":\"98a68855d151d950cc0685ac52067391\",\"cls\":\"JE_FTYPE_JPG16\",\"bigCls\":\"JE_FTYPE_JPG48\",\"name\":\"ulbvoozomqa.jpg\",\"path\":\"/JE/data/upload/202006/ulbvoozomqa_814d3251f3ee41d1953e65cca45e3ac0.jpg\"}, {\"id\":\"18dd7c184af6299e3c01e994074f0b0a\",\"cls\":\"JE_FTYPE_JPG16\",\"bigCls\":\"JE_FTYPE_JPG48\",\"name\":\"ytdbuetyj5m.jpg\",\"path\":\"/JE/data/upload/202006/ytdbuetyj5m_ee20ad2282964f2086eacfc866c311e5.jpg\"}, {\"id\":\"20209ec0265c2f27e270aebff9d4ab63\",\"cls\":\"JE_FTYPE_EXCEL16\",\"bigCls\":\"JE_FTYPE_EXCEL48\",\"name\":\"运维事故报告.xlsx\",\"path\":\"/JE/data/upload/202006/运维事故报告_d41cb8c72a21409c9cc828030c59342e.xlsx\"}]',\n" +
                "                          \n" +
                "       SY_AUDFLAG = 'NOSTATUS',\n" +
                "       SY_CREATEORGID    = 'o8vdRtw81n3zagrOBgl',\n" +
                "       SY_CREATEORG      = '0290',\n" +
                "       SY_CREATEORGNAME  = '债务融资部',\n" +
                "       SY_CREATETIME     = '2020-06-03 14:27:38',\n" +
                "       SY_CREATEUSERID   = 'QsgDu2hPKL9rAJB8iI1',\n" +
                "       SY_CREATEUSER     = '029527',\n" +
                "       SY_CREATEUSERNAME = '张文钦',\n" +
                "       SY_STATUS         = '1',\n" +
                "       SY_ORDERINDEX     = '0',\n" +
                "       \n" +
                "       SY_JTGSMC         = '投行业务委员会',\n" +
                "       SY_JTGSID         = 'e3N9LSDpBzzj7UzgmPj',\n" +
                "       SY_MODIFYORGID    = 'o8vdRtw81n3zagrOBgl',\n" +
                "       SY_MODIFYORG      = '0290',\n" +
                "       SY_MODIFYORGNAME  = '债务融资部',\n" +
                "       SY_MODIFYUSERID   = 'QsgDu2hPKL9rAJB8iI1',\n" +
                "       SY_MODIFYUSER     = '029527',\n" +
                "       SY_MODIFYUSERNAME = '张文钦',\n" +
                "       SY_MODIFYTIME     = '2020-06-03 14:27:38',\n" +
                "       \n" +
                "       PUBLISHCODE = '014321',\n" +
                "       TITLE_IMG   = '[{\"id\":\"7dda1d0656a94d67eb003df71213bd07\",\"cls\":\"JE_FTYPE_JPG16\",\"bigCls\":\"JE_FTYPE_JPG48\",\"name\":\"ytdbuetyj5m.jpg\",\"path\":\"/JE/data/upload/202006/ytdbuetyj5m_8808c255a8484090b0be72351af38a2e.jpg\"}]',\n" +
                "       \n" +
                "       URL          = 'https://www.baidu.com/',\n" +
                "       IS_READDAY   = '',\n" +
                "       FJQX         = '',\n" +
                "       WATERMARK    = '1',\n" +
                "       TEXT_SUMMARY = '应用案例70a2o7VDgItJX07791lkrdl62n@1591165541431'\n" +
                " WHERE ID = '626cfeb76c170ff42bc1baae032bd684'\n";

        JDBC.exec(a);
    }




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
//        System.out.println(orgCustListAction.getSqlResultStr(sql));
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
////        String a = orgCustListAction.getSqlResultStr(sql);
//        System.out.println();
//        System.out.println(a);
//        System.out.println("______________");
////        a = orgCustListAction.getSqlResultStr(sql);
//        System.out.println();
//        System.out.println(a);
//        System.out.println("______________");
////        a = orgCustListAction.getSqlResultStr(sql);
//        System.out.println();
//        System.out.println(a);
//        System.out.println("______________");
    }


    @Test
    public void sggsg(){

        System.out.println(JDBC.getWhereLike("客户名称","上海重阳战略投资有限公司"));

    }

}
