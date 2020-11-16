package com.tracky.data.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.tracky.data.DateConverter;
import com.tracky.data.Expense;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ExpenseDao_Impl implements ExpenseDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Expense> __insertionAdapterOfExpense;

  private final EntityDeletionOrUpdateAdapter<Expense> __deletionAdapterOfExpense;

  private final EntityDeletionOrUpdateAdapter<Expense> __updateAdapterOfExpense;

  public ExpenseDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfExpense = new EntityInsertionAdapter<Expense>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Expense` (`id`,`amount`,`description`,`groupId`,`date`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Expense value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getAmount());
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        stmt.bindLong(4, value.getGroupId());
        final Long _tmp;
        _tmp = DateConverter.dateToTimestamp(value.getDate());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, _tmp);
        }
      }
    };
    this.__deletionAdapterOfExpense = new EntityDeletionOrUpdateAdapter<Expense>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Expense` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Expense value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfExpense = new EntityDeletionOrUpdateAdapter<Expense>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Expense` SET `id` = ?,`amount` = ?,`description` = ?,`groupId` = ?,`date` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Expense value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getAmount());
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        stmt.bindLong(4, value.getGroupId());
        final Long _tmp;
        _tmp = DateConverter.dateToTimestamp(value.getDate());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, _tmp);
        }
        stmt.bindLong(6, value.getId());
      }
    };
  }

  @Override
  public void insertExpense(final Expense expense) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfExpense.insert(expense);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteExpense(final Expense expense) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfExpense.handle(expense);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateExpense(final Expense expense) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfExpense.handle(expense);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Expense> selectAllExpense() {
    final String _sql = "SELECT * FROM expense";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfGroupId = CursorUtil.getColumnIndexOrThrow(_cursor, "groupId");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final List<Expense> _result = new ArrayList<Expense>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Expense _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final int _tmpAmount;
        _tmpAmount = _cursor.getInt(_cursorIndexOfAmount);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final int _tmpGroupId;
        _tmpGroupId = _cursor.getInt(_cursorIndexOfGroupId);
        final Date _tmpDate;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfDate)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfDate);
        }
        _tmpDate = DateConverter.fromTimestamp(_tmp);
        _item = new Expense(_tmpId,_tmpAmount,_tmpDescription,_tmpGroupId,_tmpDate);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
