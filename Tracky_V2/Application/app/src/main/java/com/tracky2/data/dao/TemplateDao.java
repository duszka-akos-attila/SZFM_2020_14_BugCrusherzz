package com.tracky2.data.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.tracky2.data.Template;

import java.util.List;
@Dao
public interface TemplateDao {

    @Query("SELECT * FROM template")
    List<Template> selectAllTemplate();

    @Insert
    void insertTemplate(Template template);

    @Update
    void updateTemplate(Template template);

    @Delete
    void deleteTemplate(Template template);
}
