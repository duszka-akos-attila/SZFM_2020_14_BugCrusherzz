package com.tracky2.data;


import androidx.room.TypeConverter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {
    @TypeConverter
    public static Date fromTimestamp(Long value) {
        return value == null ? null : new Date(value);
    }

    @TypeConverter
    public static Long dateToTimestamp(Date date) {
        return date == null ? null : date.getTime();
    }

    public static String formatDate(Date date){
        return new SimpleDateFormat("yyyy.MM.dd hh:mm").format(date);
    }

    public static String formatDateGetMonth(Date date){
        return new SimpleDateFormat("MM.dd").format(date);
    }

    public static String formatDateGetYear(Date date){
        return new SimpleDateFormat("yyyy").format(date);
    }
}
