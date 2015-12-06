package com.code.androiddemo;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.OnClick;

/**
 * 首页
 * Created by gan on 2015/12/6.
 */
public class MainActivity extends BaseAppCompatActivity {

    @Override
    protected void getBundleExtras(Bundle bundle) {

    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViewsAndEvent() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (R.id.action_settings == id) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @OnClick(R.id.cardslidepanel)
    public void goCard() {
        
    }
}
