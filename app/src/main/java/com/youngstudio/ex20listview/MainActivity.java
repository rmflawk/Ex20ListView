package com.youngstudio.ex20listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView= findViewById(R.id.listview);
        //리스트뷰의 항목을 클릭하는것을 듣는 리스너 객체 생성 및  설정
         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                 //res폴더 안에 있는 values폴더 안에 arrays.xml안에 작성한 datas라는 이름의
                 //String배열을 참조하기

                 //res창고관리자 소환
                 Resources res = MainActivity.this.getResources();

                 //창고관리자에게 arrays.xml문서 안에 있는


                 Toast.makeText(MainActivity.this,position+"",Toast.LENGTH_SHORT).show();
             }
         });


    }


}
