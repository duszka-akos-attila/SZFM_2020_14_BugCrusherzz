package com.tracky.data.dao;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.tracky.data.Template;

import java.util.ArrayList;

public interface TemplateDao {

    @Query("SELECT * FROM template")
    ArrayList<Template> selectAllTemplate();

    @Insert
    void insertTemplate(Template template);

    @Update
    void updateTemplate(Template template);

    @Delete
    void deleteTemplate(Template template);
}
