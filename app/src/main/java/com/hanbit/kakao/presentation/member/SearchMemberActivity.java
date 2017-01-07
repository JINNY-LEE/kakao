package com.hanbit.kakao.presentation.member;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hanbit.kakao.R;

public class SearchMemberActivity extends AppCompatActivity  implements View.OnClickListener {

    EditText etID;
    Button btSearch, btCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_member);

        btSearch = (Button) findViewById(R.id.btSearch);
        btCancel= (Button) findViewById(R.id.btCancel);

        btSearch.setOnClickListener(this);
        btCancel.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        //String id = etID.getText().toString();

        switch (v.getId()){
            case R.id.btSearch :
                break;

            case R.id.btCancel :
                this.startActivity(new Intent(SearchMemberActivity.this, MemberListActivity.class));
                break;


        }
    }
}
