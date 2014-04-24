package DatabaseConnector;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class AddNewActivity {

	private static SQLiteDatabase db;
	
	public AddNewActivity(Context context){
		db=context.openOrCreateDatabase("DiabetesCare",1,null);	
	}
	
	public void AddGlucose(String User,int level,String Date){
		
		String insert_activity="insert into ActivityTable(User,Type,Date) "
				+ "values('"+User+"','"+"Glucose"+"','"+Date+"')";  
		db.execSQL(insert_activity);
		int activityid = 0;
		Cursor cursor = db.rawQuery("select * from ActivityTable where User=\""+User+"\" and Date=\""+Date+"\"", null);  
		while (cursor.moveToNext()) {  
		   activityid = cursor.getInt(0);  
		}  
		cursor.close();
		String insert_sql="insert into GlucoseTable(ActivityID,User,Level) "
					+ "values('"+activityid+"','"+User+"','"+level+"')";  
		db.execSQL(insert_sql);
	}
	
	public void AddFoods(String User,int FoodID,int Weight,String Date){
		
		String insert_activity="insert into ActivityTable(User,Type,Date) "
				+ "values('"+User+"','"+"Foods"+"','"+Date+"')";  
		db.execSQL(insert_activity);
		int activityid = 0;
		Cursor cursor = db.rawQuery("select * from ActivityTable where User=\""+User+"\" and Date=\""+Date+"\"", null);  
		while (cursor.moveToNext()) {  
		   activityid = cursor.getInt(0);  
		}  
		cursor.close();
		String insert_sql="insert into FoodsTable(ActivityID,User,FoodsID,Weight) "
					+ "values('"+activityid+"','"+User+"','"+FoodID+"','"+Weight+"')";  
		db.execSQL(insert_sql);
	}
}
