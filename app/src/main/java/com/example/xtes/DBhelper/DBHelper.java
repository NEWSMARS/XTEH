package com.example.xtes.DBhelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DB_name= "xtes.db";
    public static final String TBL_NAME= "userTbl";

    private SQLiteDatabase db;
    //构造函数
    public DBHelper(Context c){
        super(c,DB_name,null,2);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        this.db=db;
        String Create_TBL ="create table userTb2(_id integer primary key autoincrement,name text,password text)" ;
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
        String sql="select name from userTb2 where _id=1";
        SQLiteDatabase db=getReadableDatabase();
//        Cursor cursor=db.query(TBL_NAME,null,null,null,null,null,null);
        Cursor cursor=db.rawQuery(sql,null);
        return cursor;
    }

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
