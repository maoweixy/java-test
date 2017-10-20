package com.wei.mao.constant;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 毛伟
 * @Date 10/9/17  18:09
 */
public class ConstantTest {
    public static void main(String args[]) {
        //String prefix = "public static final String PUSH_MSG_CONFIG_";
        String prefix = "PUSH_MSG_CONFIG_";
        String suffix = "_FIELD";
        List<String> pushMagConfig = new ArrayList<>();
        pushMagConfig.add("fetch_interval");
        pushMagConfig.add("fetch_interval_after_success");
        pushMagConfig.add("should_gcm_user_fetch");
        pushMagConfig.add("pull_strategy_locales");


        System.out.println(ConstantUtils.addStrings(prefix,ConstantUtils.a_bTOA_B("fetch_interval"),suffix) + " = " + "\"fetch_interval\";");
        System.out.println(ConstantUtils.addStrings(prefix,ConstantUtils.a_bTOA_B("fetch_interval_after_success"),suffix) + " = " + "\"fetch_interval_after_success\";");
        System.out.println(ConstantUtils.addStrings(prefix,ConstantUtils.a_bTOA_B("should_gcm_user_fetch"),suffix) + " = " + "\"should_gcm_user_fetch\";");
        System.out.println(ConstantUtils.addStrings(prefix,ConstantUtils.a_bTOA_B("pull_strategy_locales"),suffix) + " = " + "\"pull_strategy_locales\";");


        System.out.print(ConstantUtils.addStrings(prefix,ConstantUtils.a_bTOA_B("fetch_interval"),suffix));
        System.out.print(",");
        System.out.print(ConstantUtils.addStrings(prefix,ConstantUtils.a_bTOA_B("fetch_interval_after_success"),suffix));
        System.out.print(",");
        System.out.print(ConstantUtils.addStrings(prefix,ConstantUtils.a_bTOA_B("should_gcm_user_fetch"),suffix));
        System.out.print(",");
        System.out.print(ConstantUtils.addStrings(prefix,ConstantUtils.a_bTOA_B("pull_strategy_locales"),suffix));




    }
}
