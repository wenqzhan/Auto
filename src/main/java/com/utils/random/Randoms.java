package com.utils.random;

import com.utils.log.LoggerController;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Randoms {


    private final static LoggerController log = LoggerController.getLogger(Randoms.class);

    public static long getRandomNum(int length) {
        long num = 0;
        num = (long) (Math.random() * Math.pow(10, length));
        //String description = String.valueOf(randomPageNum);
        log.info("生成随机数" + num + "位数:" + length);
        return num;
    }

    /*
     * [min,max]
     * */
    public static int getRandomNum(int min, int max) {
        int num = 0;
        Random random = new Random();
        num = random.nextInt(max - min + 1) + min;

        log.info("生成区间随机数" + num + ",区间" + min + "," + max);
        return num;
    }

    public static String getRandomStr(int length) {
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "randomPageNum";
            if (charOrNum.equals("char")) {
                int tmp = random.nextInt(2) % 2 == 0 ? 65 : 97;
                str.append((char) (random.nextInt(26) + tmp));
            } else if (charOrNum.equals("randomPageNum")) {
                str.append(String.valueOf(random.nextInt(10)));
            }
        }
        log.info("生成随机字符" + str + "位数:" + length);
        return str.toString();
    }


    public static char getRandomGBKChar() {
        String str = "";
        int heightPos; //
        int lowPos;
        Random random = new Random();
        heightPos = (176 + Math.abs(random.nextInt(39)));
        lowPos = (161 + Math.abs(random.nextInt(93)));
        byte[] b = new byte[2];
        b[0] = (Integer.valueOf(heightPos)).byteValue();
        b[1] = (Integer.valueOf(lowPos)).byteValue();
        try {
            str = new String(b, "GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            System.out.println("错误");
        }
        return str.charAt(0);
    }

    public static String getRandomDeptName() {
        int length = getRandomNum(2, 6);
        String deptName = "";
        for (int i = 0; i < length; i++) {
            deptName = deptName + getRandomGBKChar();
        }

        deptName = deptName + "部";

        return deptName;
    }

    private static String[] jobPositon = ("Accounting Assistant 会计助理,Accounting Clerk 记帐员," +
            "Accounting Manager 会计部经理,Accounting Stall 会计部职员," +
            "Accounting Supervisor 会计主管,Administration Manager 行政经理," +
            "Administration Staff 行政人员,Administrative Assistant 行政助理," +
            "Administrative Clerk 行政办事员,Advertising Staff 广告工作人员," +
            "Airlines Sales Representative 航空公司定座员,Airlines Staff 航空公司职员," +
            "Application Engineer 应用工程师,Assistant Manager 副经理,Bond Analyst 证券分析员," +
            "Bond Trader 证券交易员,Business Controller 业务主任,Business Manager 业务经理," +
            "Buyer 采购员,Cashier 出纳员,Chemical Engineer 化学工程师," +
            "Civil Engineer 土木工程师,Clerk/Receptionist 职员/接待员," +
            "Clerk Typist & Secretary 文书打字兼秘书,Computer Data Input Operator 计算机资料输入员," +
            "Computer Engineer 计算机工程师,Computer Processing Operator 计算机处理操作员," +
            "Computer System Manager计算机系统部经理,Copywriter广告文字撰稿人," +
            "Deputy General Manager副总经理,Economic Research Assistant经济助究助理," +
            "Electrical Engineer电气工程师,Engineering Technician工程技术员," +
            "English Instructor/Teacher英语教师,Export Sales Manager外销部经理," +
            "Export Sales Staff外销部职员,Financial Controller财务主任," +
            "Financial Reporter财务报告人,F.X. (Foreign Exchange)Clerk外汇部职员," +
            "F.X. Settlement Clerk外汇部核算员,Fund Manager财务经理,General Auditor审计长," +
            "General Manager/ President总经理,General Manager Assistant总经理助理," +
            "General Manager's Secretary 总经理秘书,Hardware Engineer (计算机)硬件工程师," +
            "Import Liaison Staff 进口联络员,Import Manager 进口部经理," +
            "Insurance Actuary 保险公司理赔员,International Sales Staff 国际销售员," +
            "Interpreter 口语翻译,Legal Adviser 法律顾问," +
            "Line Supervisor 生产线主管,Maintenance Engineer 维修工程师," +
            "Management Consultant 管理顾问,Manager经理," +
            "Manager for Public Relations公关部经理,Manufacturing Engineer 制造工程师," +
            "Manufacturing Worker 生产员工,Market Analyst市场分析员," +
            "Market Development Manager 市场开发部经理,Marketing Manager 市场销售部经理," +
            "Marketing Staff 市场销售员,Marketing Assistant 销售助理," +
            "Marketing Executive 销售主管,Marketing Representative 销售代表," +
            "Marketing Representative Manager 市场调研部经理,Mechanical Engineer 机械工程师," +
            "Mining Engineer 采矿工程师,Music Teacher 音乐教师,Naval Architect 造船工程师," +
            "Office Assistant 办公室助理,Office Clerk 职员,Operational Manager 业务经理," +
            "Package Designer 包装设计师,Passenger Reservation Staff 乘客票位预订员," +
            "Personnel Clerk 人事部职员,Personnel Manager 人事部经理," +
            "Plant/ Factory Manager 厂长,Postal Clerk 邮政人员,Private Secretary 私人秘书," +
            "Product Manager 生产部经理,Production Engineer 产品工程师,Professional Staff 专业人员," +
            "Programmer 电脑程序设计师,Project Staff (项目)策划人员,Promotional Manager 推售部经理," +
            "Proof-reader 校对员,Purchasing Agent 采购(进货)员," +
            "Quality Control Engineer 质量管理工程师,Real Estate Staff 房地产职员," +
            "Recruitment Co-ordinator 招聘协调人,Regional Manager 地区经理," +
            "Research＆.Development Engineer 研究开发工程师,Restaurant Manager 饭店经理," +
            "Sales and Planning Staff 销售计划员,Sales Assistant 销售助理,Sales Clerk 店员、售货员," +
            "Sales Coordinator 销售协调人,Sales Engineer 销售工程师,Sales Executive 销售主管," +
            "Sales Manager 销售部经理,Salesperson 销售员,Seller Representative 销售代表," +
            "Sales Supervisor 销售监管,School Registrar 学校注册主任," +
            "Secretarial Assistant 秘书助理,Secretary 秘书,Securities Custody Clerk 保安人员," +
            "Security Officer 安全人员,Senior Accountant 高级会计,Senior Consultant/Adviser 高级顾问," +
            "Senior Employee 高级雇员,Senior Secretary 高级秘书,Service Manager 服务部经理," +
            "Simultaneous Interpreter 同声传译员,Software Engineer (计算机)软件工程师," +
            "Supervisor 监管员,Systems Adviser 系统顾问,Systems Engineer 系统工程师," +
            "Systems Operator 系统操作员,Technical Editor 技术编辑,Technical Translator 技术翻译," +
            "Technical Worker 技术工人,Telecommunication Executive 电讯(电信)员," +
            "Telephonist / Operator 电话接线员、话务员,Tourist Guide 导游," +
            "Trade Finance Executive 贸易财务主管,Trainee Manager 培训部经理," +
            "Translation Checker 翻译核对员,Translator 翻译员,Trust Banking Executive 银行高级职员," +
            "Typist 打字员,Word processor Operator文字处理操作员").split(",");


    public static String getJobPosition() {
        int index = getRandomNum(0, jobPositon.length - 1);
        String position = jobPositon[index];
        return position;
    }






//    @Test
//    public void test(){
//        System.out.println(getRandomNum(10));
//        System.out.println(getRandomNum(10,30));
//        System.out.println(getRandomStr(10));
    //System.out.println(dateFormat(ZH_DATE_FORMAT));
    //createFolder("E:\\fdff\\1");
    //deleteDirectory("E:\\fdff");
//    }


}
