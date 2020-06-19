package com.sql.matrix;

import com.utils.jdbc.JDBC;
import lombok.Data;

@Data
public class ProvinceCitySelectionSql {

    private String citySql =
            "select 市\n" +
                    "  from (select dictionaryitem_itemname as 市\n" +
                    "          from JE_CORE_DICTIONARYITEM a\n" +
                    "         where a.dictionaryitem_dictionary_id =\n" +
                    "               (select je_core_dictionary_id\n" +
                    "                  from JE_CORE_DICTIONARY\n" +
                    "                 where DICTIONARY_DDCODE = 'MR_COMM_SSQX')\n" +
                    "           and LENGTH(a.dictionaryitem_itemcode) > 8\n" +
                    "           and dictionaryitem_itemname is not null\n" +
                    "         order by dbms_random.value)\n" +
                    " where rownum = 1";

    private String provinceSql =
            "select b.dictionaryitem_itemname as 省\n" +
                    "  from JE_CORE_DICTIONARYITEM a\n" +
                    "  left join JE_CORE_DICTIONARYITEM b\n" +
                    "    on SUBSTR(a.dictionaryitem_itemcode, 0, 8) = b.dictionaryitem_itemcode\n" +
                    " where a.dictionaryitem_dictionary_id =\n" +
                    "       (select je_core_dictionary_id\n" +
                    "          from JE_CORE_DICTIONARY\n" +
                    "         where DICTIONARY_DDCODE = 'MR_COMM_SSQX')\n" +
                    "   and LENGTH(a.dictionaryitem_itemcode) > 8\n" +
                    "   and a.dictionaryitem_itemname = '****'";

    public String getCityName(){
        String cityName = "";
        cityName = JDBC.getSqlResultStr(getCitySql());
        return cityName;
    }

    public String getProvinceName(String cityName){
        String provinceName = "";
        provinceName = JDBC.getSqlResultStr(getProvinceSql().replace("****",cityName));
        return provinceName;
    }

}
