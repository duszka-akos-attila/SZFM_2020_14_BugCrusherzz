package com.tracky.data.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.tracky.data.Group;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class GroupDao_Impl implements GroupDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Group> __insertionAdapterOfGroup;

  private final EntityDeletionOrUpdateAdapter<Group> __deletionAdapterOfGroup;

  private final EntityDeletionOrUpdateAdapter<Group> __updateAdapterOfGroup;

  public GroupDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGroup = new EntityInsertionAdapter<Group>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Group` (`id`,`name`,`color`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Group value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindLong(3, value.getColor());
      }
    };
    this.__deletionAdapterOfGroup = new EntityDeletionOrUpdateAdapter<Group>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Group` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Group value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfGroup = new EntityDeletionOrUpdateAdapter<Group>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Group` SET `id` = ?,`name` = ?,`color` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Group value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindLong(3, value.getColor());
        stmt.bindLong(4, value.getId());
      }
    };
  }

  @Override
  public void insertGroup(final Group group) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfGroup.insert(group);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteGroup(final Group group) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfGroup.handle(group);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateGroup(final Group group) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfGroup.handle(group);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Group> selectAllGroup() {
    final String _sql = "SELECT * FROM  `group`";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfColor = CursorUtil.getColumnIndexOrThrow(_cursor, "color");
      final List<Group> _result = new ArrayList<Group>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Group _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final int _tmpColor;
        _tmpColor = _cursor.getInt(_cursorIndexOfColor);
        _item = new Group(_tmpId,_tmpName,_tmpColor);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
