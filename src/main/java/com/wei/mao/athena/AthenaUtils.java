package com.wei.mao.athena;

import com.kika.tech.athena_query_kika_tool.AthenaQueryHelper;
import com.kika.tech.athena_query_kika_tool.IllegalAccessKeyException;
import com.kika.tech.athena_query_kika_tool.IllegalSqlException;
import com.kika.tech.athena_query_kika_tool.QuotaExceededException;
import com.kikatech.krupp.notify.AlarmUtils;
import com.kikatech.krupp.notify.User;
import lombok.extern.log4j.Log4j2;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/3/10  下午5:14
 */
@Log4j2
public class AthenaUtils {
    private static final String ACCESS_KEY = "AKIAIQSSXXVEAQNIIM7A";

    private static boolean IS_DEBUG = true;

    public static List<String[]> executeSql(String sql) {
        AthenaQueryHelper athenaQueryHelper = null;
        try {
            athenaQueryHelper = new AthenaQueryHelper(AthenaUtils.ACCESS_KEY);
            athenaQueryHelper.init();
            athenaQueryHelper.setDebug(AthenaUtils.IS_DEBUG);
            return athenaQueryHelper.executeQuery(sql);
        } catch (ClassNotFoundException e) {
            log.error("Database Driver not found!", e);
            return null;
        } catch (SQLException e) {
            log.error("Database,table or column name not found!Please check your sql statement. Your sql statement is" +
                    " {}.", sql, e);
            return null;
        } catch (IllegalAccessKeyException e) {
            log.error("Access key is illegal! Please check your access key.", e);
            return null;
        } catch (QuotaExceededException e) {
            log.error("Maximum query time exceeded!", e);
            return null;
        } catch (IllegalSqlException e) {
            log.error("Field app_key or field cdate not found in the sql statement! Your sql statement is {}.", sql, e);
            return null;
        } catch (Throwable t) {
            log.error("Internal error!", t);
            AlarmUtils.error("Internal error!", t, User.LI_A_LUN, User.LIU_DUO);
            return null;
        } finally {
            athenaQueryHelper.release();
        }
    }
}
