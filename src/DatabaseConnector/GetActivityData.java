package DatabaseConnector;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class GetActivityData {
	
	private static SQLiteDatabase db;
	
	public GetActivityData(Context context){
		db=context.openOrCreateDatabase("DiabetesCare",1,null);	
	}
	
	public int GetGlucose_level(String User, String Date){
		int resultlevel = 0;
		int activityid = 0;
		//search in Activity table
		Cursor cursor = db.rawQuery("select * from ActivityTable where User=\""+User+"\" and Date=\""+Date+"\"", null);  
		while (cursor.moveToNext()) {  
		   activityid = cursor.getInt(0);  
		}  		
		cursor.close();
		//search in Glucose table
		Cursor cursor1 = db.rawQuery("select * from GlucoseTable where ActivityID=\""+activityid+"\" and User=\""+User+"\"", null);  
		while (cursor1.moveToNext()) {  
			resultlevel = cursor1.getInt(3);  
		}  
		cursor1.close();
		return resultlevel;
	}
}
