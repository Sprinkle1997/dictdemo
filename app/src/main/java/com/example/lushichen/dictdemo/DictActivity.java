package com.example.lushichen.dictdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class DictActivity extends AppCompatActivity {
    EditText wordTxt,detailTxt,keyTxt;
    Button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        initView();
        dbHelper=new MySqliteOpenHelper(this,"dict.db3",null,1);
        db=dbHelper.getWritableDatabase();
        insertBtn.setOclickListener(new View.OnClickListener(){
           String word=wordTxt.getText().toString().trim();
            db.execSQL("insert into dict(word,detail)values(?,?)");
        });
    }
}
