package com.tracky.data;

import android.annotation.SuppressLint;

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
}
