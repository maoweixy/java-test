package com.wei.mao.json;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author 毛伟
 * @Date 10/9/17  14:56
 */
public class JsonString {
    public static void main(String args[]) {
        String response = "{\"timeused\":\"220.847\",\"tags\":[\"yo\",\"ya\",\"y tu?\",\"y tu\",\"xd\",\"we\",\"vale\",\"va\",\"tu\",\"te amo\",\"te quiero\",\"sisi\",\"sip\",\"siiii\",\"siii\",\"sii\",\"si amor\",\"q haces\",\"que?\",\"que haces?\",\"que haces\",\"que bueno\",\"que bien\",\"que\",\"pues si\",\"pues\",\"porque\",\"pero\",\"oye\",\"ola\",\"oki\",\"okey\",\"ok\",\"nose\",\"nop\",\"nooo\",\"noo\",\"no se\",\"no\",\"nada\",\"mmmm\",\"mmm\",\"mami\",\"mm\",\"mira\",\"mi amor\",\"mi\",\"ma\",\"jejeje\",\"jeje\",\"jajajja\",\"jajajajajajaja\",\"jajajajajaja\",\"jajajajaja\",\"jajajajaj\",\"jajajaja\",\"jajajaj\",\"jajaj\",\"jaja\",\"ja\",\"igual\",\"holaaa\",\"holaa\",\"hey\",\"gracias\",\"esta bien\",\"enserio\",\"dime\",\"de nada\",\"dale\",\"como estas?\",\"como estas\",\"claro\",\"bye\",\"bueno amor\",\"buenos días\",\"buenas noches\",\"bueno\",\"bien y tu\",\"bien\",\"bb\",\"amor\",\"aja\",\"asi\",\"ahhh\",\"ahh\",\"ah\",\"ah bueno\",\"aaa\",\"a bueno\",\"\uD83D\uDE18\",\"\uD83D\uDE0A\",\"\uD83E\uDD14\",\"\uD83D\uDE12\",\"\uD83D\uDE0D\",\"\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\",\"\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\",\"\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\"," +
                "\"\uD83D\uDE02\uD83D\uDE02\",\"\uD83D\uDE02\",\"❤\",\"???\",\"??\",\"?\",\":v\",\":(\"]}";
        System.out.println(response);

        String str1 = "{\n" +
                "    \"errorCode\": 0,\n" +
                "    \"errorMsg\": \"ok\",\n" +
                "    \"data\": {\n" +
                "        \"navigation_ad_config\": {\n" +
                "            \"domain_ads\": [\n" +
                "                {\n" +
                "                    \"domain_url\": \"Amazon.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/amazon-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Booking.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/booking-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Fidelity.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/fidelity-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Homedepot.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/homedepot-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Honda.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/honda-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Hotels.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/hotels-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Jcpenney.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/jcpenney-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Kohls.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/kohls-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Macys.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/macys-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Nordstrom.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/nordstrom-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Target.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/target-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Travelocity.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/travelocity-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Uber.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/uber-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Victoriasecret.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/victoriasecret-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Volvo.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/volvo-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Facebook.com\",\n" +
                "                    \"domain_ad_url\": \"mobitech.ampxdirect.com/facebook-h\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        \"kappi_keyboard_config\": {\n" +
                "            \"duration\": 1,\n" +
                "            \"white_list\": [\n" +
                "                \"com.whatsapp\",\n" +
                "                \"com.facebook.orca\",\n" +
                "                \"com.bbm\",\n" +
                "                \"com.instagram.android\",\n" +
                "                \"com.facebook.katana\",\n" +
                "                \"com.facebook.lite\",\n" +
                "                \"jp.naver.line.android\",\n" +
                "                \"com.android.chrome\",\n" +
                "                \"com.android.mms\",\n" +
                "                \"com.google.android.youtube\",\n" +
                "                \"com.viber.voip\",\n" +
                "                \"com.vkontakte.android\",\n" +
                "                \"com.gbwhatsapp\",\n" +
                "                \"com.android.browser\",\n" +
                "                \"com.bbm2rr\",\n" +
                "                \"com.snapchat.android\",\n" +
                "                \"com.supercell.clashofclans\",\n" +
                "                \"org.telegram.messenger\",\n" +
                "                \"com.google.android.googlequicksearchbox\",\n" +
                "                \"com.twitter.android\",\n" +
                "                \"com.android.vending\",\n" +
                "                \"com.hanista.mobogram\",\n" +
                "                \"com.tencent.mm\",\n" +
                "                \"kik.android\",\n" +
                "                \"com.sec.android.app.sbrowser\",\n" +
                "                \"com.skype.raider\",\n" +
                "                \"com.google.android.talk\",\n" +
                "                \"com.google.android.apps.messaging\",\n" +
                "                \"com.WhatsApp2Plus\",\n" +
                "                \"com.gbwhatsapp3\",\n" +
                "                \"com.spotify.music\",\n" +
                "                \"com.samsung.android.messaging\",\n" +
                "                \"com.bbm2\",\n" +
                "                \"com.tinder\",\n" +
                "                \"com.sonyericsson.conversations\",\n" +
                "                \"com.google.android.music\",\n" +
                "                \"jp.naver.line.androie\",\n" +
                "                \"com.android.messaging\",\n" +
                "                \"com.htc.sense.mms\",\n" +
                "                \"com.android.music\",\n" +
                "                \"com.jtwhatsapp\",\n" +
                "                \"com.asus.browser\",\n" +
                "                \"com.WhatsApp4Plus\",\n" +
                "                \"com.pinterest\",\n" +
                "                \"com.skout.android\",\n" +
                "                \"com.opera.browser\",\n" +
                "                \"com.kakao.talk\",\n" +
                "                \"org.mozilla.firefox\",\n" +
                "                \"jp.naver.lineplay.android\",\n" +
                "                \"com.tumblr\",\n" +
                "                \"com.opera.mini.android\",\n" +
                "                \"jp.naver.line.androif\",\n" +
                "                \"com.soundcloud.android\",\n" +
                "                \"com.sec.android.app.music\",\n" +
                "                \"com.facebook.pages.app\",\n" +
                "                \"com.WhatsApp3Plus\",\n" +
                "                \"com.netflix.mediaclient\",\n" +
                "                \"com.supercell.hayday\",\n" +
                "                \"com.oginstagm.android\",\n" +
                "                \"com.alibaba.aliexpresshd\",\n" +
                "                \"com.ark.music.mp3.player\",\n" +
                "                \"com.oppo.music\",\n" +
                "                \"tv.twitch.android.app\",\n" +
                "                \"com.ebay.mobile\",\n" +
                "                \"com.ksmobile.launcher\",\n" +
                "                \"com.sec.android.app.launcher\",\n" +
                "                \"com.huawei.android.launcher\",\n" +
                "                \"com.asus.launcher\",\n" +
                "                \"com.mclauncher.peonlinebox.oversea\",\n" +
                "                \"com.apusapps.launcher\",\n" +
                "                \"com.android.launcher3\",\n" +
                "                \"com.teslacoilsw.launcher\",\n" +
                "                \"com.htc.launcher\",\n" +
                "                \"com.oppo.launcher\",\n" +
                "                \"com.lge.launcher2\",\n" +
                "                \"com.bbk.launcher2\",\n" +
                "                \"com.gau.go.launcherex\",\n" +
                "                \"com.campmobile.launcher\",\n" +
                "                \"jp.co.a_tm.android.launcher\",\n" +
                "                \"com.tct.launcher\",\n" +
                "                \"com.android.launcher\",\n" +
                "                \"com.hola.launcher\",\n" +
                "                \"net.zhuoweizhang.mcpelauncher\",\n" +
                "                \"com.jrdcom.launcher\",\n" +
                "                \"com.sec.android.app.easylauncher\",\n" +
                "                \"com.cma.launcher.lite\",\n" +
                "                \"com.appx.pingguo.launcher\",\n" +
                "                \"com.lenovo.xlauncher\",\n" +
                "                \"com.lenovo.olauncher\",\n" +
                "                \"com.vsun.i9launcherhd\",\n" +
                "                \"home.solo.launcher.free\",\n" +
                "                \"com.buzzpia.aqua.launcher\",\n" +
                "                \"com.dlto.atom.launcher\",\n" +
                "                \"com.app.onedream.launcher\",\n" +
                "                \"com.yandex.launcher\",\n" +
                "                \"com.zeroteam.zerolauncher\",\n" +
                "                \"mx.com.bodas.launcher\",\n" +
                "                \"com.microsoft.launcher\"\n" +
                "            ],\n" +
                "            \"time_list\": [\n" +
                "                8,\n" +
                "                12,\n" +
                "                18,\n" +
                "                22\n" +
                "            ]\n" +
                "        },\n" +
                "        \"emoji_filter_config\": {\n" +
                "            \"emoji_positive_number\": 4,\n" +
                "            \"emoji_negative_number\": -3,\n" +
                "            \"emoji_max_negative_number\": -10,\n" +
                "            \"emoji_max_positive_number\": 10,\n" +
                "            \"max_sentence\": 3000\n" +
                "        },\n" +
                "        \"emoji_recommendation_config\": {\n" +
                "            \"create_index_time\": 86400000,\n" +
                "            \"max_sentence_length\": 256,\n" +
                "            \"max_sentence_to_save\": 10,\n" +
                "            \"emoji_count_threshold\": 0,\n" +
                "            \"distance_similarity_rate\": 0.8,\n" +
                "            \"max_sentence\": 5000\n" +
                "        },\n" +
                "        \"push_msg_config\": {\n" +
                "            \"fetch_interval\": 1800000,\n" +
                "            \"should_gcm_user_fetch\": false,\n" +
                "            \"fetch_interval_after_success\": 43200000,\n" +
                "            \"pull_strategy_locales\": \"en_US\"\n" +
                "        },\n" +
                "        \"news_config\": {\n" +
                "            \"word_engine_version\": \"1\",\n" +
                "            \"word_file_url\": \"http://cdn.kikakeyboard.com/backend/news/popbrief-v3.txt\",\n" +
                "            \"word_file_version\": \"3\",\n" +
                "            \"pop_app_list\": [\n" +
                "                \"com.whatsapp\",\n" +
                "                \"com.facebook.orca\",\n" +
                "                \"com.instagram.android\",\n" +
                "                \"org.telegram.messenger\",\n" +
                "                \"com.android.mms\",\n" +
                "                \"com.facebook.katana\",\n" +
                "                \"com.snapchat.android\",\n" +
                "                \"kik.android\",\n" +
                "                \"org.telegram.plus\",\n" +
                "                \"jp.naver.line.android\",\n" +
                "                \"com.samsung.android.messaging\",\n" +
                "                \"com.facebook.lite\",\n" +
                "                \"com.twitter.android\",\n" +
                "                \"com.google.android.talk\",\n" +
                "                \"com.htc.sense.mms\",\n" +
                "                \"com.vkontakte.android\",\n" +
                "                \"com.verizon.messaging.vzmsgs\",\n" +
                "                \"com.android.chrome\",\n" +
                "                \"com.sec.android.app.sbrowser\",\n" +
                "                \"com.opera.mini.native\",\n" +
                "                \"com.opera.mini.android\",\n" +
                "                \"com.google.android.youtube\",\n" +
                "                \"com.google.android.googlequicksearchbox\",\n" +
                "                \"com.android.browser\",\n" +
                "                \"com.UCMobile.intl\",\n" +
                "                \"com.zhiliaoapp.musically\",\n" +
                "                \"com.tot.toghrulrahimli.nameasong\",\n" +
                "                \"com.tencent.ibg.joox\",\n" +
                "                \"com.frostwire.android\",\n" +
                "                \"com.spotify.music\"\n" +
                "            ],\n" +
                "            \"pop_duration\": 5000\n" +
                "        },\n" +
                "        \"local_navigation_config\": {\n" +
                "            \"weight_ratio\": 500,\n" +
                "            \"local_weight_base\": 3000,\n" +
                "            \"local_weight_base_offset\": 1000,\n" +
                "            \"online_weight_ratio\": 60,\n" +
                "            \"local_weight_ratio\": 60,\n" +
                "            \"max_size\": 500\n" +
                "        }\n" +
                "    }\n" +
                "}";
        String str2 = "{\n" +
                "    \"errorCode\": 0,\n" +
                "    \"errorMsg\": \"ok\",\n" +
                "    \"data\": {\n" +
                "        \"navigation_ad_config\": {\n" +
                "            \"domain_ads\": [\n" +
                "                {\n" +
                "                    \"domain_url\": \"Amazon.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/amazon-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Booking.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/booking-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Fidelity.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/fidelity-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Homedepot.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/homedepot-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Honda.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/honda-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Hotels.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/hotels-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Jcpenney.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/jcpenney-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Kohls.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/kohls-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Macys.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/macys-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Nordstrom.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/nordstrom-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Target.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/target-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Travelocity.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/travelocity-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Uber.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/uber-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Victoriasecret.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/victoriasecret-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Volvo.com\",\n" +
                "                    \"domain_ad_url\": \"kika.ampxdirect.com/volvo-kj\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"domain_url\": \"Facebook.com\",\n" +
                "                    \"domain_ad_url\": \"mobitech.ampxdirect.com/facebook-h\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        \"kappi_keyboard_config\": {\n" +
                "            \"duration\": 1,\n" +
                "            \"white_list\": [\n" +
                "                \"com.whatsapp\",\n" +
                "                \"com.facebook.orca\",\n" +
                "                \"com.bbm\",\n" +
                "                \"com.instagram.android\",\n" +
                "                \"com.facebook.katana\",\n" +
                "                \"com.facebook.lite\",\n" +
                "                \"jp.naver.line.android\",\n" +
                "                \"com.android.chrome\",\n" +
                "                \"com.android.mms\",\n" +
                "                \"com.google.android.youtube\",\n" +
                "                \"com.viber.voip\",\n" +
                "                \"com.vkontakte.android\",\n" +
                "                \"com.gbwhatsapp\",\n" +
                "                \"com.android.browser\",\n" +
                "                \"com.bbm2rr\",\n" +
                "                \"com.snapchat.android\",\n" +
                "                \"com.supercell.clashofclans\",\n" +
                "                \"org.telegram.messenger\",\n" +
                "                \"com.google.android.googlequicksearchbox\",\n" +
                "                \"com.twitter.android\",\n" +
                "                \"com.android.vending\",\n" +
                "                \"com.hanista.mobogram\",\n" +
                "                \"com.tencent.mm\",\n" +
                "                \"kik.android\",\n" +
                "                \"com.sec.android.app.sbrowser\",\n" +
                "                \"com.skype.raider\",\n" +
                "                \"com.google.android.talk\",\n" +
                "                \"com.google.android.apps.messaging\",\n" +
                "                \"com.WhatsApp2Plus\",\n" +
                "                \"com.gbwhatsapp3\",\n" +
                "                \"com.spotify.music\",\n" +
                "                \"com.samsung.android.messaging\",\n" +
                "                \"com.bbm2\",\n" +
                "                \"com.tinder\",\n" +
                "                \"com.sonyericsson.conversations\",\n" +
                "                \"com.google.android.music\",\n" +
                "                \"jp.naver.line.androie\",\n" +
                "                \"com.android.messaging\",\n" +
                "                \"com.htc.sense.mms\",\n" +
                "                \"com.android.music\",\n" +
                "                \"com.jtwhatsapp\",\n" +
                "                \"com.asus.browser\",\n" +
                "                \"com.WhatsApp4Plus\",\n" +
                "                \"com.pinterest\",\n" +
                "                \"com.skout.android\",\n" +
                "                \"com.opera.browser\",\n" +
                "                \"com.kakao.talk\",\n" +
                "                \"org.mozilla.firefox\",\n" +
                "                \"jp.naver.lineplay.android\",\n" +
                "                \"com.tumblr\",\n" +
                "                \"com.opera.mini.android\",\n" +
                "                \"jp.naver.line.androif\",\n" +
                "                \"com.soundcloud.android\",\n" +
                "                \"com.sec.android.app.music\",\n" +
                "                \"com.facebook.pages.app\",\n" +
                "                \"com.WhatsApp3Plus\",\n" +
                "                \"com.netflix.mediaclient\",\n" +
                "                \"com.supercell.hayday\",\n" +
                "                \"com.oginstagm.android\",\n" +
                "                \"com.alibaba.aliexpresshd\",\n" +
                "                \"com.ark.music.mp3.player\",\n" +
                "                \"com.oppo.music\",\n" +
                "                \"tv.twitch.android.app\",\n" +
                "                \"com.ebay.mobile\",\n" +
                "                \"com.ksmobile.launcher\",\n" +
                "                \"com.sec.android.app.launcher\",\n" +
                "                \"com.huawei.android.launcher\",\n" +
                "                \"com.asus.launcher\",\n" +
                "                \"com.mclauncher.peonlinebox.oversea\",\n" +
                "                \"com.apusapps.launcher\",\n" +
                "                \"com.android.launcher3\",\n" +
                "                \"com.teslacoilsw.launcher\",\n" +
                "                \"com.htc.launcher\",\n" +
                "                \"com.oppo.launcher\",\n" +
                "                \"com.lge.launcher2\",\n" +
                "                \"com.bbk.launcher2\",\n" +
                "                \"com.gau.go.launcherex\",\n" +
                "                \"com.campmobile.launcher\",\n" +
                "                \"jp.co.a_tm.android.launcher\",\n" +
                "                \"com.tct.launcher\",\n" +
                "                \"com.android.launcher\",\n" +
                "                \"com.hola.launcher\",\n" +
                "                \"net.zhuoweizhang.mcpelauncher\",\n" +
                "                \"com.jrdcom.launcher\",\n" +
                "                \"com.sec.android.app.easylauncher\",\n" +
                "                \"com.cma.launcher.lite\",\n" +
                "                \"com.appx.pingguo.launcher\",\n" +
                "                \"com.lenovo.xlauncher\",\n" +
                "                \"com.lenovo.olauncher\",\n" +
                "                \"com.vsun.i9launcherhd\",\n" +
                "                \"home.solo.launcher.free\",\n" +
                "                \"com.buzzpia.aqua.launcher\",\n" +
                "                \"com.dlto.atom.launcher\",\n" +
                "                \"com.app.onedream.launcher\",\n" +
                "                \"com.yandex.launcher\",\n" +
                "                \"com.zeroteam.zerolauncher\",\n" +
                "                \"mx.com.bodas.launcher\",\n" +
                "                \"com.microsoft.launcher\"\n" +
                "            ],\n" +
                "            \"time_list\": [\n" +
                "                8,\n" +
                "                12,\n" +
                "                18,\n" +
                "                22\n" +
                "            ]\n" +
                "        },\n" +
                "        \"emoji_filter_config\": {\n" +
                "            \"emoji_positive_number\": 4,\n" +
                "            \"emoji_negative_number\": -3,\n" +
                "            \"emoji_max_negative_number\": -10,\n" +
                "            \"emoji_max_positive_number\": 10,\n" +
                "            \"max_sentence\": 3000\n" +
                "        },\n" +
                "        \"emoji_recommendation_config\": {\n" +
                "            \"create_index_time\": 86400000,\n" +
                "            \"max_sentence_length\": 256,\n" +
                "            \"max_sentence_to_save\": 10,\n" +
                "            \"emoji_count_threshold\": 0,\n" +
                "            \"distance_similarity_rate\": 0.8,\n" +
                "            \"max_sentence\": 5000\n" +
                "        },\n" +
                "        \"push_msg_config\": {\n" +
                "            \"fetch_interval\": 1800000,\n" +
                "            \"should_gcm_user_fetch\": false,\n" +
                "            \"fetch_interval_after_success\": 43200000,\n" +
                "            \"pull_strategy_locales\": \"en_US\"\n" +
                "        },\n" +
                "        \"news_config\": {\n" +
                "            \"word_engine_version\": \"1\",\n" +
                "            \"word_file_url\": \"http://cdn.kikakeyboard.com/backend/news/popbrief-v3.txt\",\n" +
                "            \"word_file_version\": \"3\",\n" +
                "            \"pop_app_list\": [\n" +
                "                \"com.whatsapp\",\n" +
                "                \"com.facebook.orca\",\n" +
                "                \"com.instagram.android\",\n" +
                "                \"org.telegram.messenger\",\n" +
                "                \"com.android.mms\",\n" +
                "                \"com.facebook.katana\",\n" +
                "                \"com.snapchat.android\",\n" +
                "                \"kik.android\",\n" +
                "                \"org.telegram.plus\",\n" +
                "                \"jp.naver.line.android\",\n" +
                "                \"com.samsung.android.messaging\",\n" +
                "                \"com.facebook.lite\",\n" +
                "                \"com.twitter.android\",\n" +
                "                \"com.google.android.talk\",\n" +
                "                \"com.htc.sense.mms\",\n" +
                "                \"com.vkontakte.android\",\n" +
                "                \"com.verizon.messaging.vzmsgs\",\n" +
                "                \"com.android.chrome\",\n" +
                "                \"com.sec.android.app.sbrowser\",\n" +
                "                \"com.opera.mini.native\",\n" +
                "                \"com.opera.mini.android\",\n" +
                "                \"com.google.android.youtube\",\n" +
                "                \"com.google.android.googlequicksearchbox\",\n" +
                "                \"com.android.browser\",\n" +
                "                \"com.UCMobile.intl\",\n" +
                "                \"com.zhiliaoapp.musically\",\n" +
                "                \"com.tot.toghrulrahimli.nameasong\",\n" +
                "                \"com.tencent.ibg.joox\",\n" +
                "                \"com.frostwire.android\",\n" +
                "                \"com.spotify.music\"\n" +
                "            ],\n" +
                "            \"pop_duration\": 5000\n" +
                "        },\n" +
                "        \"local_navigation_config\": {\n" +
                "            \"weight_ratio\": 500,\n" +
                "            \"local_weight_base\": 3000,\n" +
                "            \"local_weight_base_offset\": 1000,\n" +
                "            \"online_weight_ratio\": 60,\n" +
                "            \"local_weight_ratio\": 60,\n" +
                "            \"max_size\": 500\n" +
                "        }\n" +
                "    }\n" +
                "}";
        System.out.println(str1.equals(str2));
    }

    public static int getDuidSum(String duid) {
        if (StringUtils.isBlank(duid)) {
            return 0;
        }
        if (!duid.matches("[0-9a-f]{32}")) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < duid.length(); i++) {
            sum += Integer.parseInt(String.valueOf(duid.charAt(i)), 16);
        }
        return sum;
    }
}
