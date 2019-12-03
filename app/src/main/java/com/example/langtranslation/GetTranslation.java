package com.example.langtranslation;

import java.sql.Connection;

public class GetTranslation {
    private static String url = "http://dict.youdao.com/w/eng/##/#keyfrom=dict2.index";

    public static void getTranslation(final String word,final GetInt getInt){
        String real_url = url.replace("##", word);
        final Connection conn = Jsoup.connect(real_url);
    }
}
