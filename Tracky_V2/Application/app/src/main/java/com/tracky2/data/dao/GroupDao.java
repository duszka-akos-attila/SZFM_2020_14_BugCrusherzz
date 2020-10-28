package com.tracky2.data.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.tracky2.data.Group;

import java.util.List;
@Dao
public interface GroupDao {

    @Query("SELECT * FROM  `group`")
    List<Group> selectAllGroup();

    @Insert
    void insertGroup(Group group);

    @Update
    void updateGroup(Group group);

    @Delete
    void deleteGroup(Group group);
}
