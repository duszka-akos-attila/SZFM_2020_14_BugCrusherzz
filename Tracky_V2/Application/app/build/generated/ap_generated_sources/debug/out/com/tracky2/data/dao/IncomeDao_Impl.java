package com.tracky2.data.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.tracky2.data.DateConverter;
import com.tracky2.data.Income;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class IncomeDao_Impl implements IncomeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Income> __insertionAdapterOfIncome;

  private final EntityDeletionOrUpdateAdapter<Income> __deletionAdapterOfIncome;

  private final EntityDeletionOrUpdateAdapter<Income> __updateAdapterOfIncome;

  public IncomeDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfIncome = new EntityInsertionAdapter<Income>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Income` (`id`,`amount`,`description`,`date`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Income value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getAmount());
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        final Long _tmp;
        _tmp = DateConverter.dateToTimestamp(value.getDate());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, _tmp);
        }
      }
    };
    this.__deletionAdapterOfIncome = new EntityDeletionOrUpdateAdapter<Income>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Income` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Income value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfIncome = new EntityDeletionOrUpdateAdapter<Income>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Income` SET `id` = ?,`amount` = ?,`description` = ?,`date` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Income value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getAmount());
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        final Long _tmp;
        _tmp = DateConverter.dateToTimestamp(value.getDate());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, _tmp);
        }
        stmt.bindLong(5, value.getId());
      }
    };
  }

  @Override
  public void insertIncome(final Income income) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfIncome.insert(income);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteIncome(final Income income) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfIncome.handle(income);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateIncome(final Income income) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfIncome.handle(income);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Income> selectAllIncome() {
    final String _sql = "SELECT * FROM income";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final List<Income> _result = new ArrayList<Income>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Income _item;
        final int _tmpAmount;
        _tmpAmount = _cursor.getInt(_cursorIndexOfAmount);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final Date _tmpDate;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfDate)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfDate);
        }
        _tmpDate = DateConverter.fromTimestamp(_tmp);
        _item = new Income(_tmpAmount,_tmpDescription,_tmpDate);
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
