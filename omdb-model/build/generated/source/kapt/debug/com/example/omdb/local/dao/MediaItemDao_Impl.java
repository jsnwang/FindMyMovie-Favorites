package com.example.omdb.local.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.omdb.response.MediaItem;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MediaItemDao_Impl implements MediaItemDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MediaItem> __insertionAdapterOfMediaItem;

  private final EntityDeletionOrUpdateAdapter<MediaItem> __deletionAdapterOfMediaItem;

  private final SharedSQLiteStatement __preparedStmtOfNukeTable;

  public MediaItemDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMediaItem = new EntityInsertionAdapter<MediaItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `media_item` (`title`,`year`,`imdb_id`,`type`,`poster`,`faved`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MediaItem value) {
        if (value.getTitle() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTitle());
        }
        if (value.getYear() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getYear());
        }
        if (value.getImdbID() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImdbID());
        }
        if (value.getType() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getType());
        }
        if (value.getPoster() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPoster());
        }
        final int _tmp = value.getFaved() ? 1 : 0;
        stmt.bindLong(6, _tmp);
      }
    };
    this.__deletionAdapterOfMediaItem = new EntityDeletionOrUpdateAdapter<MediaItem>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `media_item` WHERE `imdb_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MediaItem value) {
        if (value.getImdbID() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getImdbID());
        }
      }
    };
    this.__preparedStmtOfNukeTable = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM media_item";
        return _query;
      }
    };
  }

  @Override
  public Object insertAll(final MediaItem[] item, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMediaItem.insert(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object insert(final MediaItem item, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMediaItem.insert(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object delete(final MediaItem item, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfMediaItem.handle(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public void nukeTable() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfNukeTable.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfNukeTable.release(_stmt);
    }
  }

  @Override
  public Flow<List<MediaItem>> getAll() {
    final String _sql = "SELECT * FROM media_item";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"media_item"}, new Callable<List<MediaItem>>() {
      @Override
      public List<MediaItem> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
          final int _cursorIndexOfImdbID = CursorUtil.getColumnIndexOrThrow(_cursor, "imdb_id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "poster");
          final int _cursorIndexOfFaved = CursorUtil.getColumnIndexOrThrow(_cursor, "faved");
          final List<MediaItem> _result = new ArrayList<MediaItem>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MediaItem _item;
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpYear;
            if (_cursor.isNull(_cursorIndexOfYear)) {
              _tmpYear = null;
            } else {
              _tmpYear = _cursor.getString(_cursorIndexOfYear);
            }
            final String _tmpImdbID;
            if (_cursor.isNull(_cursorIndexOfImdbID)) {
              _tmpImdbID = null;
            } else {
              _tmpImdbID = _cursor.getString(_cursorIndexOfImdbID);
            }
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            final String _tmpPoster;
            if (_cursor.isNull(_cursorIndexOfPoster)) {
              _tmpPoster = null;
            } else {
              _tmpPoster = _cursor.getString(_cursorIndexOfPoster);
            }
            final boolean _tmpFaved;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfFaved);
            _tmpFaved = _tmp != 0;
            _item = new MediaItem(_tmpTitle,_tmpYear,_tmpImdbID,_tmpType,_tmpPoster,_tmpFaved);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getAllFavs(final Continuation<? super List<MediaItem>> arg0) {
    final String _sql = "SELECT * FROM media_item";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<MediaItem>>() {
      @Override
      public List<MediaItem> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
          final int _cursorIndexOfImdbID = CursorUtil.getColumnIndexOrThrow(_cursor, "imdb_id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "poster");
          final int _cursorIndexOfFaved = CursorUtil.getColumnIndexOrThrow(_cursor, "faved");
          final List<MediaItem> _result = new ArrayList<MediaItem>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MediaItem _item;
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpYear;
            if (_cursor.isNull(_cursorIndexOfYear)) {
              _tmpYear = null;
            } else {
              _tmpYear = _cursor.getString(_cursorIndexOfYear);
            }
            final String _tmpImdbID;
            if (_cursor.isNull(_cursorIndexOfImdbID)) {
              _tmpImdbID = null;
            } else {
              _tmpImdbID = _cursor.getString(_cursorIndexOfImdbID);
            }
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            final String _tmpPoster;
            if (_cursor.isNull(_cursorIndexOfPoster)) {
              _tmpPoster = null;
            } else {
              _tmpPoster = _cursor.getString(_cursorIndexOfPoster);
            }
            final boolean _tmpFaved;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfFaved);
            _tmpFaved = _tmp != 0;
            _item = new MediaItem(_tmpTitle,_tmpYear,_tmpImdbID,_tmpType,_tmpPoster,_tmpFaved);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, arg0);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
