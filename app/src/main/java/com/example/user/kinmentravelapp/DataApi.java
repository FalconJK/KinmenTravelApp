package com.example.user.kinmentravelapp;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by user on 2019/3/29.
 */

public class DataApi {

    private static final String SHARED_PREF_LOGIN = "Content";


    public static void update(Context context, String string) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREF_LOGIN, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("data", string);
        editor.commit();
    }

    public static String get(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREF_LOGIN, Context.MODE_PRIVATE);
        return sharedPreferences.getString("data", "{\n" +
                "  \"day1\": [\n" +
                "  {\n" +
                "    \"time\": \"0850~0900\",\n" +
                "    \"content\": \"松山機場\",\n" +
                "    \"note\": \"check-in\",\n" +
                "    \"search\": \"\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1035~1140\",\n" +
                "    \"content\": \"尚義機場\",\n" +
                "    \"note\": \"B7-8811\",\n" +
                "    \"search\": \"\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1200~1300\",\n" +
                "    \"content\": \"租車前往飯店\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"背包客棧497 2館\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1300~1400\",\n" +
                "    \"content\": \"金城老街覓食\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"金城老街\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1400~1440\",\n" +
                "    \"content\": \"清金門鎮總兵署\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"清金門鎮總兵署(浯江新莊)\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1440~1520\",\n" +
                "    \"content\": \"后湖風獅爺\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"后湖風獅爺\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1440~1520\",\n" +
                "    \"content\": \"后湖海濱公園\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"后湖海濱公園\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1520~1600\",\n" +
                "    \"content\": \"珠山聚落\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"珠山聚落\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1600~1635\",\n" +
                "    \"content\": \"古崗風獅爺\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"古崗風獅爺\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1600~1635\",\n" +
                "    \"content\": \"古崗樓\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"古崗樓\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1635~1710\",\n" +
                "    \"content\": \"翟山坑道\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"翟山坑道\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1710~1750\",\n" +
                "    \"content\": \"金門酒廠\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"金門酒廠\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1750~1830\",\n" +
                "    \"content\": \"水頭聚落\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"水頭聚落\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1830~1930\",\n" +
                "    \"content\": \"水頭聚落吃晚餐\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1930~2000\",\n" +
                "    \"content\": \"延平郡王祠\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"金門 延平郡王祠\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"2000~2030\",\n" +
                "    \"content\": \"莒光樓夜景\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"莒光樓\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"2030~\",\n" +
                "    \"content\": \"回497，之後自由時間\",\n" +
                "    \"note\": \"可能會更動\",\n" +
                "    \"search\": \"背包客棧497 2館\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"額外選擇\",\n" +
                "    \"content\": \"打咖 POE或打LOL 或是回家尻尻\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"\"\n" +
                "  }\n" +
                "],\n" +
                "  \"day2\": [\n" +
                "  {\n" +
                "    \"time\": \"0800~\",\n" +
                "    \"content\": \"起床\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"0900~0930\",\n" +
                "    \"content\": \"吃早餐\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"0930~1030\",\n" +
                "    \"content\": \"成功海防坑道\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"成功海防坑道\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1030~1100\",\n" +
                "    \"content\": \"陳景蘭洋樓\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"陳景蘭洋樓\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1100~1200\",\n" +
                "    \"content\": \"太武山風景區\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"太武山風景區\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1200~1330\",\n" +
                "    \"content\": \"良金牧場工廠-吃飯\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"良金牧場工廠總店\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1330~1410\",\n" +
                "    \"content\": \"太湖遊憩區\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"太湖遊憩區\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1410~1450\",\n" +
                "    \"content\": \"823戰史館\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"八二三戰史館\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1450~1510\",\n" +
                "    \"content\": \"毋忘在莒\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"毋忘在莒\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1510~1600\",\n" +
                "    \"content\": \"金門民俗文化村\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"金門民俗文化村\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1600~1630\",\n" +
                "    \"content\": \"獅山砲陣地\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"獅山砲陣地\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1630~1710\",\n" +
                "    \"content\": \"馬山播音站\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"馬山播音站\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1710~1740\",\n" +
                "    \"content\": \"回金湖鎮吃飯\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"金湖鎮\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1740~\",\n" +
                "    \"content\": \"家樂福，回497，之後自由時間\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"家樂福\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"額外選擇\",\n" +
                "    \"content\": \"打咖 POE或打LOL 或是回家尻尻\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"\"\n" +
                "  }\n" +
                "],\n" +
                "  \"day3\": [\n" +
                "  {\n" +
                "    \"time\": \"0800~0900\",\n" +
                "    \"content\": \"起床吃早餐\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"0900~0930\",\n" +
                "    \"content\": \"到水頭碼頭搭船\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"水頭碼頭\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"0930~1000\",\n" +
                "    \"content\": \"搭船到九宮碼頭\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"九宮碼頭\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1000~1030\",\n" +
                "    \"content\": \"九宮坑道\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"九宮坑道\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1030~1100\",\n" +
                "    \"content\": \"金門媽祖公園\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"金門媽祖公園\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1100~1130\",\n" +
                "    \"content\": \"823砲戰紀念碑\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"八二三砲戰勝利紀念碑\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1130~1200\",\n" +
                "    \"content\": \"八達樓子\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"八達樓子\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1200~1230\",\n" +
                "    \"content\": \"妙香小吃店\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"妙香小吃店\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1230~1310\",\n" +
                "    \"content\": \"將軍堡\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"金門烈嶼將軍堡\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1310~1340\",\n" +
                "    \"content\": \"虎堡\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"虎堡\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1340~1410\",\n" +
                "    \"content\": \"防雷區公園\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"防雷區公園\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1410~1440\",\n" +
                "    \"content\": \"地雷主題館\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"地雷主題館\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1440~1520\",\n" +
                "    \"content\": \"貓公石觀景台\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"貓公石眺景平台\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1520~1600\",\n" +
                "    \"content\": \"湖井頭戰史館\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"湖井頭戰史館\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1600~1650\",\n" +
                "    \"content\": \"貴山海灘看吸精平的祖國\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"貴山海灘\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1650~1710\",\n" +
                "    \"content\": \"九宮碼頭搭船回金門\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"九宮碼頭\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1710~1800\",\n" +
                "    \"content\": \"加油和還車\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"1800~2000\",\n" +
                "    \"content\": \"金門尻尻或是自由時間\",\n" +
                "    \"note\": \"\",\n" +
                "    \"search\": \"\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"time\": \"2010~2110\",\n" +
                "    \"content\": \"搭機賦歸\",\n" +
                "    \"note\": \"B7-8836\",\n" +
                "    \"search\": \"金門航空站\"\n" +
                "  }\n" +
                "]\n" +
                "}");
    }

}
