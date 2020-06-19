package com.pageObject.matrix;


import lombok.Data;

@Data
public class ManagerSelection extends EmpSelection {

    public ManagerSelection() {
//        commonObject.getObjAttr();
        setDesPrefix("");
        setPrefix("");
        setConVal("");
    }

    public ManagerSelection(String label) {
//        commonObject.getObjAttr();
        setDesPrefix(label);
        setPrefix(label);
        setConVal(label);
//        changePrefix(name);

    }

    private String dEmpCodeInput;
    private String xEmpCodeInput;

    private String dEmpNameInput;
    private String xEmpNameInput;

    private String dEmpDeptInput;
    private String xEmpDeptInput;

    private String dSelectedEmpNameTd;
    private String xSelectedEmpNameTd;

    private String dSearchButtonSpan;
    private String xSearchButtonSpan;

    private String dResetButtonSpan;
    private String xResetButtonSpan;


}
