package com.tracky2.data.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.tracky2.data.Template;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TemplateDao_Impl implements TemplateDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Template> __insertionAdapterOfTemplate;

  private final EntityDeletionOrUpdateAdapter<Template> __deletionAdapterOfTemplate;

  private final EntityDeletionOrUpdateAdapter<Template> __updateAdapterOfTemplate;

  public TemplateDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTemplate = new EntityInsertionAdapter<Template>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Template` (`isIncome`,`id`,`amount`,`description`,`groupId`) VALUES (?,nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Template value) {
        final int _tmp;
        _tmp = value.isIncome() ? 1 : 0;
        stmt.bindLong(1, _tmp);
        stmt.bindLong(2, value.getId());
        stmt.bindLong(3, value.getAmount());
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        stmt.bindLong(5, value.getGroupId());
      }
    };
    this.__deletionAdapterOfTemplate = new EntityDeletionOrUpdateAdapter<Template>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Template` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Template value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfTemplate = new EntityDeletionOrUpdateAdapter<Template>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Template` SET `isIncome` = ?,`id` = ?,`amount` = ?,`description` = ?,`groupId` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Template value) {
        final int _tmp;
        _tmp = value.isIncome() ? 1 : 0;
        stmt.bindLong(1, _tmp);
        stmt.bindLong(2, value.getId());
        stmt.bindLong(3, value.getAmount());
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        stmt.bindLong(5, value.getGroupId());
        stmt.bindLong(6, value.getId());
      }
    };
  }

  @Override
  public void insertTemplate(final Template template) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTemplate.insert(template);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteTemplate(final Template template) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfTemplate.handle(template);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateTemplate(final Template template) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfTemplate.handle(template);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Template> selectAllTemplate() {
    final String _sql = "SELECT * FROM template";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfIsIncome = CursorUtil.getColumnIndexOrThrow(_cursor, "isIncome");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfGroupId = CursorUtil.getColumnIndexOrThrow(_cursor, "groupId");
      final List<Template> _result = new ArrayList<Template>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Template _item;
        final boolean _tmpIsIncome;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsIncome);
        _tmpIsIncome = _tmp != 0;
        final int _tmpAmount;
        _tmpAmount = _cursor.getInt(_cursorIndexOfAmount);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final int _tmpGroupId;
        _tmpGroupId = _cursor.getInt(_cursorIndexOfGroupId);
        _item = new Template(_tmpIsIncome,_tmpAmount,_tmpDescription,_tmpGroupId);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
