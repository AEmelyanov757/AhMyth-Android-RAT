/*
 * Copyright 2020 Andrey Emelyanov (aemelyanov757@gmail.com)
 *
 *  Класс Traccar client протокол "OsmAnd":
 * url       - URL HTTP сервера
 * inid      - уникальный номер трекера в системе Traccar server
 * inlat     - географическая широта
 * inlon     - географическая долгота
 * inspeed   - скорость
 * inbearing - курс в градусах
 * inbatt    - уровень заряда АКБ
 *  Резерв:
 * alarm     - строка признак сигнала тревоги.
 *  Результат:
 * Строка запрос для HTTP (метод GET) сервера.
 */

package ahmyth.mine.king.ahmyth;

import android.net.Uri;
import java.lang.System;

public class ProtocolFormatter {

    public static String formatRequest(String url, int inid, double  inlat, double inlon, double inspeed, double inbearing, int inbatt) {
        return formatRequest(url, inid, inlat, inlon, inspeed, inbearing, inbatt, null);
    }

    public static String formatRequest(String url, int inid, double  inlat, double inlon, double inspeed, double inbearing, int inbatt, String alarm) {
        Uri serverUrl = Uri.parse(url);
        Uri.Builder builder = serverUrl.buildUpon()
                .appendQueryParameter("id", String.valueOf(inid))
                .appendQueryParameter("timestamp", String.valueOf(System.currentTimeMillis() / 1000))
                .appendQueryParameter("lat", String.valueOf(inlat))
                .appendQueryParameter("lon", String.valueOf(inlon))
                .appendQueryParameter("speed", String.valueOf(inspeed))
                .appendQueryParameter("bearing", String.valueOf(inbearing))
                .appendQueryParameter("altitude", String.valueOf(0))
                .appendQueryParameter("accuracy", String.valueOf(0))
                .appendQueryParameter("batt", String.valueOf(inbatt));

        if (alarm != null) {
            builder.appendQueryParameter("alarm", alarm);
        }

        return builder.build().toString();
    }
}
