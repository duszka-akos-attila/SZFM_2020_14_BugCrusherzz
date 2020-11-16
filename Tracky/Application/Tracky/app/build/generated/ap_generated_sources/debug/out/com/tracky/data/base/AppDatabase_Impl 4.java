package com.tracky.data.base;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.tracky.data.dao.ExpenseDao;
import com.tracky.data.dao.ExpenseDao_Impl;
import com.tracky.data.dao.GroupDao;
import com.tracky.data.dao.GroupDao_Impl;
import com.tracky.data.dao.IncomeDao;
import com.tracky.data.dao.IncomeDao_Impl;
import com.tracky.data.dao.TemplateDao;
import com.tracky.data.dao.TemplateDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile ExpenseDao _expenseDao;

  private volatile IncomeDao _incomeDao;

  private volatile GroupDao _groupDao;

  private volatile TemplateDao _templateDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Expense` (`id` INTEGER NOT NULL, `amount` INTEGER NOT NULL, `description` TEXT, `groupId` INTEGER NOT NULL, `date` INTEGER, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Income` (`id` INTEGER NOT NULL, `amount` INTEGER NOT NULL, `description` TEXT, `date` INTEGER, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Group` (`id` INTEGER NOT NULL, `name` TEXT, `color` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Template` (`isIncome` INTEGER NOT NULL, `id` INTEGER NOT NULL, `amount` INTEGER NOT NULL, `description` TEXT, `groupId` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'dc666261700fedc359ad7fbf70023c8a')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Expense`");
        _db.execSQL("DROP TABLE IF EXISTS `Income`");
        _db.execSQL("DROP TABLE IF EXISTS `Group`");
        _db.execSQL("DROP TABLE IF EXISTS `Template`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsExpense = new HashMap<String, TableInfo.Column>(5);
        _columnsExpense.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExpense.put("amount", new TableInfo.Column("amount", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExpense.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExpense.put("groupId", new TableInfo.Column("groupId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExpense.put("date", new TableInfo.Column("date", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysExpense = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesExpense = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoExpense = new TableInfo("Expense", _columnsExpense, _foreignKeysExpense, _indicesExpense);
        final TableInfo _existingExpense = TableInfo.read(_db, "Expense");
        if (! _infoExpense.equals(_existingExpense)) {
          return new RoomOpenHelper.ValidationResult(false, "Expense(com.tracky.data.Expense).\n"
                  + " Expected:\n" + _infoExpense + "\n"
                  + " Found:\n" + _existingExpense);
        }
        final HashMap<String, TableInfo.Column> _columnsIncome = new HashMap<String, TableInfo.Column>(4);
        _columnsIncome.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIncome.put("amount", new TableInfo.Column("amount", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIncome.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIncome.put("date", new TableInfo.Column("date", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysIncome = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesIncome = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoIncome = new TableInfo("Income", _columnsIncome, _foreignKeysIncome, _indicesIncome);
        final TableInfo _existingIncome = TableInfo.read(_db, "Income");
        if (! _infoIncome.equals(_existingIncome)) {
          return new RoomOpenHelper.ValidationResult(false, "Income(com.tracky.data.Income).\n"
                  + " Expected:\n" + _infoIncome + "\n"
                  + " Found:\n" + _existingIncome);
        }
        final HashMap<String, TableInfo.Column> _columnsGroup = new HashMap<String, TableInfo.Column>(3);
        _columnsGroup.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGroup.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGroup.put("color", new TableInfo.Column("color", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGroup = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGroup = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoGroup = new TableInfo("Group", _columnsGroup, _foreignKeysGroup, _indicesGroup);
        final TableInfo _existingGroup = TableInfo.read(_db, "Group");
        if (! _infoGroup.equals(_existingGroup)) {
          return new RoomOpenHelper.ValidationResult(false, "Group(com.tracky.data.Group).\n"
                  + " Expected:\n" + _infoGroup + "\n"
                  + " Found:\n" + _existingGroup);
        }
        final HashMap<String, TableInfo.Column> _columnsTemplate = new HashMap<String, TableInfo.Column>(5);
        _columnsTemplate.put("isIncome", new TableInfo.Column("isIncome", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTemplate.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTemplate.put("amount", new TableInfo.Column("amount", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTemplate.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTemplate.put("groupId", new TableInfo.Column("groupId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTemplate = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTemplate = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTemplate = new TableInfo("Template", _columnsTemplate, _foreignKeysTemplate, _indicesTemplate);
        final TableInfo _existingTemplate = TableInfo.read(_db, "Template");
        if (! _infoTemplate.equals(_existingTemplate)) {
          return new RoomOpenHelper.ValidationResult(false, "Template(com.tracky.data.Template).\n"
                  + " Expected:\n" + _infoTemplate + "\n"
                  + " Found:\n" + _existingTemplate);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "dc666261700fedc359ad7fbf70023c8a", "6eea00b342f435a40208d208dac6539f");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Expense","Income","Group","Template");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Expense`");
      _db.execSQL("DELETE FROM `Income`");
      _db.execSQL("DELETE FROM `Group`");
      _db.execSQL("DELETE FROM `Template`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public ExpenseDao expenseDao() {
    if (_expenseDao != null) {
      return _expenseDao;
    } else {
      synchronized(this) {
        if(_expenseDao == null) {
          _expenseDao = new ExpenseDao_Impl(this);
        }
        return _expenseDao;
      }
    }
  }

  @Override
  public IncomeDao incomeDao() {
    if (_incomeDao != null) {
      return _incomeDao;
    } else {
      synchronized(this) {
        if(_incomeDao == null) {
          _incomeDao = new IncomeDao_Impl(this);
        }
        return _incomeDao;
      }
    }
  }

  @Override
  public GroupDao groupDao() {
    if (_groupDao != null) {
      return _groupDao;
    } else {
      synchronized(this) {
        if(_groupDao == null) {
          _groupDao = new GroupDao_Impl(this);
        }
        return _groupDao;
      }
    }
  }

  @Override
  public TemplateDao templateDao() {
    if (_templateDao != null) {
      return _templateDao;
    } else {
      synchronized(this) {
        if(_templateDao == null) {
          _templateDao = new TemplateDao_Impl(this);
        }
        return _templateDao;
      }
    }
  }
}
