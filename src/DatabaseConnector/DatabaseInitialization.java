package DatabaseConnector;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DatabaseInitialization {
	
	private static SQLiteDatabase db;
	
	public DatabaseInitialization(Context context){
		
		//create or open the database
		db=context.openOrCreateDatabase("DiabetesCare",1,null);
		
		//create the table if not exists
		String create_table_Activity="create table if not exists ActivityTable"
				+ "(_id integer primary key autoincrement,"
				+ "User text,Type text,Date text)";
		db.execSQL(create_table_Activity);
		
		String create_table_Glucose="create table if not exists GlucoseTable"
				+ "(_id integer primary key autoincrement,"
				+ "ActivityID int,User text,Level integer)";
		db.execSQL(create_table_Glucose);
		
		String create_table_Sports="create table if not exists SportsTable"
				+ "(_id integer primary key autoincrement,"
				+ "ActivityID int,User text,SportsID int,Duration integer)";
		db.execSQL(create_table_Sports);
		
		String create_table_SportsList="create table if not exists SportsListTable"
				+ "(_id integer primary key autoincrement,"
				+ "SportsName text,BurnPerUnit integer)";
		db.execSQL(create_table_SportsList);
		
		String create_table_Foods="create table if not exists FoodsTable"
				+ "(_id integer primary key autoincrement,"
				+ "ActivityID int,User text,FoodsID int,Weight integer,Calories integer)";
		db.execSQL(create_table_Foods);
		
		String create_table_FoodsList="create table if not exists FoodsListTable"
				+ "(_id integer primary key autoincrement,"
				+ "FoodsName text,GainPerUnit integer)";
		db.execSQL(create_table_FoodsList);
		
		String create_table_Water="create table if not exists WaterTable"
				+ "(_id integer primary key autoincrement,"
				+ "ActivityID int,User text,Amount integer)";
		db.execSQL(create_table_Water);
		
		String create_table_Insulin="create table if not exists InsulinTable"
				+ "(_id integer primary key autoincrement,"
				+ "ActivityID int,User text,Amount integer)";
		db.execSQL(create_table_Insulin);
		
		String create_table_Patient="create table if not exists PatientTable"
				+ "(_id integer primary key autoincrement,"
				+ "PatientID int,Name text,Age integer,Gender text,Height integer,Weight integer"
				+ "email text,phone text,history text)";
		db.execSQL(create_table_Patient);	
	}
}
