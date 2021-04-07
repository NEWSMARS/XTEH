package com.example.xtes.DBhelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SqlliteHelper extends SQLiteOpenHelper {
    private  final  static int DATABASE_VERSION =1;
    public static final String DB_name= "wyu4.db";
    public static final String TBL_NAME= "userTbl";
    private SQLiteDatabase db;
    //构造函数
    public SqlliteHelper(Context context){
        super(context,DB_name,null,2);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        this.db=db;                             //获取dba对象
        String Create_TBL ="create table userTbl(_id integer primary key autoincrement,name text,password text)" ; //创建表
        db.execSQL(Create_TBL);
    }

    //插入
    public  void insert(ContentValues values){
        SQLiteDatabase db=getWritableDatabase();
        db.insert(TBL_NAME,null,values);
        db.close();
    }

    //查询
    public Cursor query(){
        SQLiteDatabase db=getReadableDatabase();
        Cursor cursor=db.query(TBL_NAME,null,null,null,null,null,null);
        return cursor;
    }

    //delece
    public void del(int id) {
        if (db == null)
            db = getWritableDatabase();
        db.delete(TBL_NAME,"_id=?",new String[]{String.valueOf(id)});
    }

    //close db
    public void close(){
        if(db!=null)
            db.close();
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
