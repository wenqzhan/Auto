package com.actions.matrix.research.clientList;

import com.actions.matrix.CustSelectionAction;
import com.actions.matrix.ManagerSelectionAction;
import com.actions.matrix.ProvinceCitySelectionAction;
import com.actions.matrix.YMDSelectionAction;
import com.alibaba.fastjson.JSONObject;
import com.driver.$;
import com.pageObject.matrix.research.client.ClientList;
import com.pageObject.matrix.research.clientList.Detail;
import com.sql.matrix.ManagerSelectionSql;
import com.sql.matrix.ProvinceCitySelectionSql;
import com.utils.date.DateMisc;
import com.utils.list.ListMisc;
import com.utils.log.LoggerController;
import com.utils.random.Randoms;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DetailAction extends $ {
    private final static LoggerController log = LoggerController.getLogger(DetailAction.class);
    Detail detail = new Detail();
    ClientList clientList = new ClientList();
    CustSelectionAction custSelectionAction = new CustSelectionAction("操作");

    public DetailAction() {
        detail = (Detail) detail.getObjAttr();
        clientList = (ClientList) clientList.getObjAttr();
    }

    public boolean selectCustName(String custName) {
        boolean flag = true;
        WebElement element = findElement(detail.getJsonObject(detail.getDCustNameInputSearch()));
        click(element);
        custSelectionAction.selectCustName(custName);
        element = findElement(detail.getJsonObject(detail.getDCustNameInput()));
        String custNameInInput = getInputValue(element);
        flag = custName.equals(custNameInInput);
        int count = 0;
        while (!flag) {
            log.info("可能输入的custName和显示的不一样,或者没读到custName");
            element = findElement(detail.getJsonObject(detail.getDCustNameInput()));
            custNameInInput = getInputValue(element);
            flag = custName.equals(custNameInInput);
            count++;
            if (count > 3) {
                log.error("输入的custName和显示的不一样");
                break;
            }
        }
        return flag;
    }

    private boolean selectCreditDispatchType(String type) {
        String incomeCreditDispatch = "收入派点";
        String strategicCreditDispatch = "战略派点";
        boolean flag = true;
        WebElement element = null;
        WebElement radioElement = null;
        if (type.equals(incomeCreditDispatch)) {
            element = findElement(detail.getJsonObject(detail.getDCreditDispatchTypeIncomeCreditDispatchSpan()));
            radioElement = findElement(detail.getJsonObject(detail.getDCreditDispatchTypeIncomeCreditDispatchRadioSpan()));
        } else if (type.equals(strategicCreditDispatch)) {
            element = findElement(detail.getJsonObject(detail.getDCreditDispatchTypeStrategicCreditDispatchSpan()));
            radioElement = findElement(detail.getJsonObject(detail.getDCreditDispatchTypeStrategicCreditDispatchRadioSpan()));
        }

        click(element);

        flag = isSelected(radioElement);

        return flag;
    }

    private String getRandomCreditDispatchType() {
        String incomeCreditDispatch = "收入派点";
        String strategicCreditDispatch = "战略派点";
        int random = Randoms.getRandomNum(0, 1);
        String creditDispatchType = "";
        if (random == 0) {
            creditDispatchType = incomeCreditDispatch;
        } else if (random == 1) {
            creditDispatchType = strategicCreditDispatch;
        }

        return creditDispatchType;
    }

    public boolean selectCreditDispatchType() {
        String creditDispatchType = getRandomCreditDispatchType();
        return selectCreditDispatchType(creditDispatchType);
    }

    private boolean inputCreditDispatchWeights(String weights) {
        boolean flag = true;
        WebElement element = findElement(detail.getJsonObject(detail.getDCreditDispatchWeightsInput()));
        sendKeys(element, weights);
        element = findElement(detail.getJsonObject(detail.getDCreditDispatchWeightsInput()));
        String weightsInInput = getInputValue(element);
        flag = weights.equals(weightsInInput);
        return flag;
    }

    private String getRandomCreditDispatchWeights() {
        int random = Randoms.getRandomNum(0, 100000);
        return String.valueOf(random);
    }

    public boolean inputCreditDispatchWeights() {
        String randomCreditDispatchWeights = getRandomCreditDispatchWeights();
        return inputCreditDispatchWeights(randomCreditDispatchWeights);
    }

    private boolean selectResearchCustType(String type) {
        String ResearchCust = "研究服务客户";
        String NonResearchCust = "非研究服务客户";
        String serviceSuspended = "暂停服务";
        boolean flag = true;
        WebElement element = null;
        WebElement radioElement = null;
        if (type.equals(ResearchCust)) {
            element = findElement(detail.getJsonObject(detail.getDResearchCustTypeResearchCustSpan()));
            radioElement = findElement(detail.getJsonObject(detail.getDResearchCustTypeResearchCustRadioSpan()));
        } else if (type.equals(NonResearchCust)) {
            element = findElement(detail.getJsonObject(detail.getDResearchCustTypeNonResearchCustSpan()));
            radioElement = findElement(detail.getJsonObject(detail.getDResearchCustTypeNonResearchCustRadioSpan()));
        } else if (type.equals(serviceSuspended)) {
            element = findElement(detail.getJsonObject(detail.getDResearchCustTypeServiceSuspendedSpan()));
            radioElement = findElement(detail.getJsonObject(detail.getDResearchCustTypeServiceSuspendedRadioSpan()));
        }

        click(element);

        flag = isSelected(radioElement);

        return flag;
    }

    private String getRandomResearchCustType() {
        String ResearchCust = "研究服务客户";
        String NonResearchCust = "非研究服务客户";
        String serviceSuspended = "暂停服务";
        int random = Randoms.getRandomNum(0, 2);
        String researchCustType = "";
        if (random == 0) {
            researchCustType = ResearchCust;
        } else if (random == 1) {
            researchCustType = NonResearchCust;
        } else if (random == 2) {
            researchCustType = serviceSuspended;
        }

        return researchCustType;
    }

    public boolean selectResearchCustType() {
        String researchCustType = getRandomResearchCustType();
        return selectResearchCustType(researchCustType);
    }

    private boolean selectContractPreliminaryReviewAccess(boolean yesOrNo) {
        boolean flag = true;
        WebElement element = null;
        ;
        WebElement radioElement = null;
        if (yesOrNo) {
            element = findElement(detail.getJsonObject(detail.getDContractPreliminaryReviewAccessYesSpan()));
            radioElement = findElement(detail.getJsonObject(detail.getDContractPreliminaryReviewAccessYesRadioSpan()));
        } else if (!yesOrNo) {
            element = findElement(detail.getJsonObject(detail.getDContractPreliminaryReviewAccessNoSpan()));
            radioElement = findElement(detail.getJsonObject(detail.getDContractPreliminaryReviewAccessNoRadioSpan()));
        }

        click(element);

        flag = isSelected(radioElement);

        return flag;
    }

    private boolean getRandomContractPreliminaryReviewAccess() {

        int random = Randoms.getRandomNum(0, 1);
        boolean contractPreliminaryReviewAccess = true;
        if (random == 0) {
            contractPreliminaryReviewAccess = true;
        } else if (random == 1) {
            contractPreliminaryReviewAccess = false;
        }

        return contractPreliminaryReviewAccess;
    }

    public boolean selectContractPreliminaryReviewAccess() {
        boolean contractPreliminaryReviewAccess = getRandomContractPreliminaryReviewAccess();
        return selectContractPreliminaryReviewAccess(contractPreliminaryReviewAccess);
    }

    private boolean selectResearchLevel(String level) {
        boolean flag = true;
        String A = "A";
        String B = "B";
        String C = "C";
        String D = "D";
        String E = "E";
        WebElement element = findElement(detail.getJsonObject(detail.getDResearchCustTypeResearchCustRadioSpan()));
        if (isSelected(element)) {
            element = findElement(detail.getJsonObject(detail.getDResearchLevelDiv()));
            click(element);
            if (level.equals(A)) {
                element = findElement(detail.getJsonObject(detail.getDResearchLevelSpanA()));
            } else if (level.equals(B)) {
                element = findElement(detail.getJsonObject(detail.getDResearchLevelSpanB()));
            } else if (level.equals(C)) {
                element = findElement(detail.getJsonObject(detail.getDResearchLevelSpanC()));
            } else if (level.equals(D)) {
                element = findElement(detail.getJsonObject(detail.getDResearchLevelSpanD()));
            } else if (level.equals(E)) {
                element = findElement(detail.getJsonObject(detail.getDResearchLevelSpanE()));
            }

            click(element);
//
            element = findElement(detail.getJsonObject(detail.getDResearchLevelRenderedSpan()));
            String valueInDiv = getAttribute(element, "title");
            flag = valueInDiv.equals(level);
        }

        return flag;

    }

    private String getRandomResearchLevel() {
        String researchLevel = "";
        String A = "A";
        String B = "B";
        String C = "C";
        String D = "D";
        String E = "E";
        int random = Randoms.getRandomNum(0, 4);
        if (random == 0) {
            researchLevel = A;
        } else if (random == 1) {
            researchLevel = B;
        } else if (random == 2) {
            researchLevel = C;
        } else if (random == 3) {
            researchLevel = D;
        } else if (random == 4) {
            researchLevel = E;
        }

        return researchLevel;

    }

    public boolean selectResearchLevel() {
        String researchLevel = getRandomResearchLevel();
        return selectResearchLevel(researchLevel);
    }

    private boolean selectCustChannel(String channel) {
        boolean flag = true;
        String publicOffer = "公募";
        String nonPublicOffer = "非公募";
        String other = "其他";
        WebElement element = findElement(detail.getJsonObject(detail.getDResearchCustTypeResearchCustRadioSpan()));
        if (isSelected(element)) {
            WebElement radioElement = null;
            if (channel.equals(publicOffer)) {
                element = findElement(detail.getJsonObject(detail.getDCustChannelPublicOfferSpan()));
                radioElement = findElement(detail.getJsonObject(detail.getDCustChannelPublicOfferRadioSpan()));
            } else if (channel.equals(nonPublicOffer)) {
                element = findElement(detail.getJsonObject(detail.getDCustChannelNonPublicOfferSpan()));
                radioElement = findElement(detail.getJsonObject(detail.getDCustChannelNonPublicOfferRadioSpan()));
            } else if (channel.equals(other)) {
                element = findElement(detail.getJsonObject(detail.getDCustChannelOtherSpan()));
                radioElement = findElement(detail.getJsonObject(detail.getDCustChannelOtherRadioSpan()));
            }

            click(element);

            flag = isSelected(radioElement);
        }

        return flag;
    }

    private String getRandomCustChannel() {
        String publicOffer = "公募";
        String nonPublicOffer = "非公募";
        String other = "其他";
        int random = Randoms.getRandomNum(0, 2);
        String channel = "";
        if (random == 0) {
            channel = publicOffer;
        } else if (random == 1) {
            channel = nonPublicOffer;
        } else if (random == 2) {
            channel = other;
        }

        return channel;
    }

    public boolean selectCustChannel() {
        String custChannel = getRandomCustChannel();
        return selectCustChannel(custChannel);
    }

    private boolean selectResearchDueDate(String ymd) {
        boolean flag = true;
        WebElement element = findElement(detail.getJsonObject(detail.getDResearchDueDateInput()));
        click(element);
        YMDSelectionAction.selectYMD("研究服务到期日", ymd);
        element = findElement(detail.getJsonObject(detail.getDResearchDueDateInput()));
        String ymdInInput = getInputValue(element);
        flag = ymdInInput.equals(ymd);
        return flag;
    }

    private String getRandomResearchDueDate() {
        String researchDueDate = DateMisc.getRandomYMD();
        return researchDueDate;
    }

    public boolean selectResearchDueDate() {
        String researchDueDate = getRandomResearchDueDate();
        return selectResearchDueDate(researchDueDate);
    }

    private boolean selectResearchSignedDate(String ymd) {
        boolean flag = true;
        WebElement element = findElement(detail.getJsonObject(detail.getDResearchSignedDateInput()));
        click(element);
        YMDSelectionAction.selectYMD("签约时间", ymd);
        element = findElement(detail.getJsonObject(detail.getDResearchSignedDateInput()));
        String ymdInInput = getInputValue(element);
        flag = ymdInInput.equals(ymd);
        return flag;
    }

    private String getRandomResearchSignedDate() {
        String researchSignedDate = DateMisc.getPastYMD();
        return researchSignedDate;
    }

    public boolean selectResearchSignedDate() {
        String researchSignedDate = getRandomResearchSignedDate();
        return selectResearchSignedDate(researchSignedDate);
    }

    private boolean selectIsCoreCust(boolean yesOrNo) {
        boolean flag = true;
        WebElement element = null;
        ;
        WebElement radioElement = null;
        if (yesOrNo) {
            element = findElement(detail.getJsonObject(detail.getDIsCoreCustYesSpan()));
            radioElement = findElement(detail.getJsonObject(detail.getDIsCoreCustYesSpanRadioSpan()));
        } else if (!yesOrNo) {
            element = findElement(detail.getJsonObject(detail.getDIsCoreCustNoSpanRadioSpan()));
            radioElement = findElement(detail.getJsonObject(detail.getDIsCoreCustNoSpanRadioSpan()));
        }

        click(element);

        flag = isSelected(radioElement);

        return flag;

    }


    private boolean getRandomIsCoreCust() {

        int random = Randoms.getRandomNum(0, 1);
        boolean isCoreCust = true;
        if (random == 0) {
            isCoreCust = true;
        } else if (random == 1) {
            isCoreCust = false;
        }

        return isCoreCust;
    }

    public boolean selectIsCoreCust() {
        boolean isCoreCust = getRandomIsCoreCust();
        return selectIsCoreCust(isCoreCust);
    }

    private boolean selectIsPotentialCust(boolean yesOrNo) {
        boolean flag = true;
        WebElement element = null;
        ;
        WebElement radioElement = null;
        if (yesOrNo) {
            element = findElement(detail.getJsonObject(detail.getDIsPotentialCustYesSpan()));
            radioElement = findElement(detail.getJsonObject(detail.getDIsPotentialCustYesRadioSpan()));
        } else if (!yesOrNo) {
            element = findElement(detail.getJsonObject(detail.getDIsPotentialCustNoSpan()));
            radioElement = findElement(detail.getJsonObject(detail.getDIsPotentialCustNoRadioSpan()));
        }

        click(element);

        flag = isSelected(radioElement);

        return flag;

    }


    private boolean getRandomIsPotentialCust() {

        int random = Randoms.getRandomNum(0, 1);
        boolean isPotentialCust = true;
        if (random == 0) {
            isPotentialCust = true;
        } else if (random == 1) {
            isPotentialCust = false;
        }

        return isPotentialCust;
    }

    public boolean selectIsPotentialCust() {
        boolean isPotentialCust = getRandomIsPotentialCust();
        return selectIsPotentialCust(isPotentialCust);
    }

    private boolean selectActivityLimits(List<String> limits) {
        boolean flag = true;
        String researchCustManager = "研究服务客户经理";
        String jointResearch = "联合调研";
        String conference = "大型会议";
        String smallScaleCommunication = "小范围交流";
        String telephoneConference = "电话会议";
        WebElement element = null;
        WebElement radioElement = null;
        for (String limit : limits) {
            if (limit.equals(researchCustManager)) {
                element = findElement(detail.getJsonObject(detail.getDActivityLimitsResearchCustManagerSpan()));
                radioElement = findElement(detail.getJsonObject(detail.getDActivityLimitsResearchCustManagerCheckBoxSpan()));
            } else if (limit.equals(jointResearch)) {
                element = findElement(detail.getJsonObject(detail.getDActivityLimitsJointResearchSpan()));
                radioElement = findElement(detail.getJsonObject(detail.getDActivityLimitsJointResearchCheckBoxSpan()));
            } else if (limit.equals(conference)) {
                element = findElement(detail.getJsonObject(detail.getDActivityLimitsConferenceSpan()));
                radioElement = findElement(detail.getJsonObject(detail.getDActivityLimitsConferenceCheckBoxSpan()));
            } else if (limit.equals(smallScaleCommunication)) {
                element = findElement(detail.getJsonObject(detail.getDActivityLimitsSmallScaleCommunicationSpan()));
                radioElement = findElement(detail.getJsonObject(detail.getDActivityLimitsSmallScaleCommunicationCheckBoxSpan()));
            } else if (limit.equals(telephoneConference)) {
                element = findElement(detail.getJsonObject(detail.getDActivityLimitsTelephoneConferenceSpan()));
                radioElement = findElement(detail.getJsonObject(detail.getDActivityLimitsTelephoneConferenceCheckBoxSpan()));
            }

            click(element);

            flag = isSelected(radioElement);
            if (!flag) {
                log.error(limit + "的权限可能点击了但是没有勾选上");
                break;
            }
        }
        return flag;
    }

    private List<String> getRandomActivityLimits() {
        List<String> limits = new ArrayList<>();
        String limit = "";
        String researchCustManager = "研究服务客户经理";
        String jointResearch = "联合调研";
        String conference = "大型会议";
        String smallScaleCommunication = "小范围交流";
        String telephoneConference = "电话会议";
        int r = Randoms.getRandomNum(0, 4);
        for (int i = 0; i < r; i++) {
            while (true) {
                int random = Randoms.getRandomNum(0, 4);
                if (random == 0) {
                    limit = researchCustManager;
                } else if (random == 1) {
                    limit = jointResearch;
                } else if (random == 2) {
                    limit = conference;
                } else if (random == 3) {
                    limit = smallScaleCommunication;
                } else if (random == 4) {
                    limit = telephoneConference;
                }
                if (!limits.contains(limit)) {
                    limits.add(limit);
                    break;
                }
            }

        }

        return limits;
    }

    public boolean selectActivityLimits() {
        List<String> limits = getRandomActivityLimits();
        return selectActivityLimits(limits);
    }

    private boolean inputOfficePostcode(String postCode) {
        boolean flag = true;
        WebElement element = findElement(detail.getJsonObject(detail.getDOfficePostcodeInput()));
        sendKeys(element, postCode);
        element = findElement(detail.getJsonObject(detail.getDOfficePostcodeInput()));
        String postCodeInInput = getInputValue(element);
        flag = postCode.equals(postCodeInInput);
        return flag;
    }

    private String getRandomPostCode() {
        StringBuilder postCode = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            postCode.append(Randoms.getRandomNum(0, 9));
        }
        return postCode.toString();
    }

    public boolean inputOfficePostcode() {
        String postCode = getRandomPostCode();
        return inputOfficePostcode(postCode);
    }

    private boolean inputOfficeCentralTelephoneExchangeNo(String no) {
        boolean flag = true;
        WebElement element = findElement(detail.getJsonObject(detail.getDOfficeCentralTelephoneExchangeNoInput()));
        sendKeys(element, no);
        element = findElement(detail.getJsonObject(detail.getDOfficeCentralTelephoneExchangeNoInput()));
        String noInInput = getInputValue(element);
        flag = no.equals(noInInput);
        return flag;
    }

    private String getRandomOfficeCentralTelephoneExchangeNo() {
        StringBuilder no = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            no.append(Randoms.getRandomNum(0, 9));
        }
        return no.toString();
    }

    public boolean inputOfficeCentralTelephoneExchangeNo() {
        String no = getRandomOfficeCentralTelephoneExchangeNo();
        return inputOfficeCentralTelephoneExchangeNo(no);
    }

    private boolean inputOfficeFaxNo(String no) {
        boolean flag = true;
        WebElement element = findElement(detail.getJsonObject(detail.getDOfficeFaxNoInput()));
        sendKeys(element, no);
        element = findElement(detail.getJsonObject(detail.getDOfficeFaxNoInput()));
        String noInInput = getInputValue(element);
        flag = no.equals(noInInput);
        return flag;
    }

    private String getRandomOfficeFaxNo() {
        StringBuilder no = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            no.append(Randoms.getRandomNum(0, 9));
        }
        return no.toString();
    }

    public boolean inputOfficeFaxNo() {
        String no = getRandomOfficeFaxNo();
        return inputOfficeFaxNo(no);
    }

    private boolean inputOfficeProvinceCity(String city) {
        boolean flag = true;
        WebElement element = findElement(detail.getJsonObject(detail.getDOfficeProvinceCityDiv()));
        click(element);
        ProvinceCitySelectionAction.selectProviceCity(city);
        element = findElement(detail.getJsonObject(detail.getDOfficeProvinceCityPickerSpan()));
        String provinceCity = getText(element);
        flag = provinceCity.contains(city);
        return flag;
    }

    private String getRandomOfficeCity() {
        ProvinceCitySelectionSql provinceCitySelectionSql = new ProvinceCitySelectionSql();
        String city = provinceCitySelectionSql.getCityName();
        return city;
    }

    public boolean inputOfficeProvinceCity() {
        String city = getRandomOfficeCity();
        return inputOfficeProvinceCity(city);
    }

    private boolean selectHostAccountManager(String managerName) {
        boolean flag = true;
        WebElement element = findElement(detail.getJsonObject(detail.getDHostAccountManagerInput()));
        click(element);
        flag = ManagerSelectionAction.selectManager("操作", managerName);

        JSONObject jsonObject = detail.getJsonObject(detail.getDHostAccountManagerInput());
        String managerNameInInput = getInputValue(jsonObject);
        flag = managerName.equals(managerNameInInput);
        return flag;
    }

    private String getRandomHostAccountManager() {
        ManagerSelectionSql managerSelectionSql = new ManagerSelectionSql();
        String managerName = managerSelectionSql.getManagerName();
        return managerName;
    }

    public boolean selectHostAccountManager() {
        String managerName = getRandomHostAccountManager();
        return selectHostAccountManager(managerName);
    }

    private boolean selectCoOrganizingAccountManagers(List<String> managerNames) {
        boolean flag = true;
        if (managerNames.size() > 0) {
            WebElement element = findElement(detail.getJsonObject(detail.getDCoOrganizingAccountManagerInput()));
            click(element);
            flag = ManagerSelectionAction.selectManager("操作", managerNames);

            JSONObject jsonObject = detail.getJsonObject(detail.getDCoOrganizingAccountManagerInput());
            String managerNameInInput = getInputValue(jsonObject);
            List<String> mNII = Arrays.asList(managerNameInInput.split(","));
            int count = 0;
            while (true) {
                if (mNII.size() < 1) {
                    element = findElement(detail.getJsonObject(detail.getDCoOrganizingAccountManagerInput()));
                    mNII = Arrays.asList(managerNameInInput.split(","));
                } else if (mNII.size() >= 1) {
                    break;
                }
                count++;
                if (count > 3) {
                    log.error("协办客户经理输入了不显示????");
                    break;
                }
            }
            flag = ListMisc.isEqualAfterSorted(managerNames, mNII);
        }
        return flag;
    }

    private List<String> getRandomCoOrganizingAccountManagers() {
        List<String> managerNames = new ArrayList<>();
        String managerName;
        ManagerSelectionSql managerSelectionSql = new ManagerSelectionSql();
        int random = Randoms.getRandomNum(0, 6);
        for (int i = 0; i < random; i++) {
            do {
                managerName = managerSelectionSql.getManagerName();
            } while (managerNames.contains(managerName));
            managerNames.add(managerName);
        }


        return managerNames;
    }

    public boolean selectCoOrganizingAccountManagers() {
        List<String> managerNames = getRandomCoOrganizingAccountManagers();
        return selectCoOrganizingAccountManagers(managerNames);
    }

    public boolean clickSave(){
        boolean flag = true;
        WebElement element = findElement(detail.getJsonObject(detail.getDSaveButtonSpan()));
        click(element);
        flag = isElementAppeared(clientList.getJsonObject(clientList.getDNewButtonSpan()));
        return flag;
    }




}


