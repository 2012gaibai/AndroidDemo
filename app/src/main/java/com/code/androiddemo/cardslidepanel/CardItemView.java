package com.code.androiddemo.cardslidepanel;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.code.androiddemo.R;
import com.nostra13.universalimageloader.core.ImageLoader;

/**
 * Created by gan on 2016/1/12.
 */
public class CardItemView extends LinearLayout {

    public ImageView imageView;
    private TextView userNameTv;
    private TextView imageNumTv;
    private TextView likeNumTv;

    public CardItemView(Context context) {
        this(context, null);
    }

    public CardItemView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CardItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflate(context, R.layout.card_item, this);
        imageView= (ImageView) findViewById(R.id.card_image_view);
        userNameTv = (TextView) findViewById(R.id.card_user_name);
        imageNumTv = (TextView) findViewById(R.id.card_pic_num);
        likeNumTv = (TextView) findViewById(R.id.card_like);
    }

    public void fillData(CardDataItem itemData) {
        ImageLoader.getInstance().displayImage(itemData.getImagePath(), imageView);
        userNameTv.setText(itemData.getUserName());
        imageNumTv.setText(itemData.getImageNum() + "");
        likeNumTv.setText(itemData.getLikeNum() + "");
    }
}
